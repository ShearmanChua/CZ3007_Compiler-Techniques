package backend;

import java.util.HashMap;

import soot.Unit;
import soot.Value;
import soot.jimple.IntConstant;
import soot.jimple.Jimple;
import soot.jimple.NopStmt;
import soot.util.Chain;
import ast.Block;
import ast.BreakStmt;
import ast.ExprStmt;
import ast.IfStmt;
import ast.ReturnStmt;
import ast.Stmt;
import ast.Visitor;
import ast.WhileStmt;

/**
 * This class is in charge of creating Jimple code for a given statement (and its nested
 * statements, if applicable).
 */
public class StmtCodeGenerator extends Visitor<Void> {
	/** Cache Jimple singleton for convenience. */
	private final Jimple j = Jimple.v();
	
	/** The {@link FunctionCodeGenerator} that created this object. */
	private final FunctionCodeGenerator fcg;
	
	/** The statement list of the enclosing function body. */
	private final Chain<Unit> units;
	
	/** A map from while statements to their break target. */
	private final HashMap<WhileStmt, Unit> breakTargets = new HashMap<WhileStmt, Unit>();
	
	public StmtCodeGenerator(FunctionCodeGenerator fcg) {
		this.fcg = fcg;
		this.units = fcg.getBody().getUnits();
	}
	
	/** Generates code for an expression statement. */
	@Override
	public Void visitExprStmt(ExprStmt nd) {
		ExprCodeGenerator.generate(nd.getExpr(), fcg);
		return null;
	}
	
	/** Generates code for a break statement. */
	@Override
	public Void visitBreakStmt(BreakStmt nd) {
		/* TODO: generate code for break statement (hint: use ASTNode.getEnclosingLoop and breakTargets;
		 *       use units.add() to insert the statement into the surrounding method) */
		
		Unit breakStatement = breakTargets.get(nd.getEnclosingLoop());
		units.add(j.newGotoStmt(breakStatement));
		
		return null;
	}

	/** Generates code for a block of statements. */
	@Override
	public Void visitBlock(Block nd) {
		for(Stmt stmt : nd.getStmts())
			stmt.accept(this);
		return null;
	}
	
	/** Generates code for a return statement. */
	@Override
	public Void visitReturnStmt(ReturnStmt nd) {
		Unit stmt;
		if(nd.hasExpr())
			stmt = j.newReturnStmt(ExprCodeGenerator.generate(nd.getExpr(), fcg));
		else
			stmt = j.newReturnVoidStmt();
		units.add(stmt);
		return null;
	}
	
	/** Generates code for an if statement. */
	@Override
	public Void visitIfStmt(IfStmt nd) {
		Value cond = ExprCodeGenerator.generate(nd.getExpr(), fcg); //condition
		NopStmt join = j.newNopStmt();  //
		units.add(j.newIfStmt(j.newEqExpr(cond, IntConstant.v(0)), join)); // if cond goto join
		nd.getThen().accept(this);  //then branch
		if(nd.hasElse()) {  //if there is else statement
			NopStmt els = join;  
			join = j.newNopStmt();
			units.add(j.newGotoStmt(join));
			units.add(els);
			nd.getElse().accept(this);
		}
		units.add(join);
		return null;
	}
		
	/** Generates code for a while statement. */
	@Override
	public Void visitWhileStmt(WhileStmt nd) {
		/* TODO: generate code for while statement as discussed in lecture; add the NOP statement you
		 *       generate as the break target to the breakTargets map
		 */
		NopStmt check = j.newNopStmt(); //check condition point
		NopStmt exit = j.newNopStmt(); //exit while loop
		
		breakTargets.put(nd, exit); //break statement
		
		units.add(check);  //back to check while condition
		
		Value cond = ExprCodeGenerator.generate(nd.getExpr(), fcg);
		units.add(j.newIfStmt(j.newEqExpr(cond, IntConstant.v(0)), exit));
		
		nd.getBody().accept(this); //while loop body
		
		units.add(j.newGotoStmt(check)); //go back to check while condition
		
		units.add(exit);  //exit while loop
		
		return null;
	}
}