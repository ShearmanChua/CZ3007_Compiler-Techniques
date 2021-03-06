package parser;

import java.util.ArrayList;
import beaver.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class Parser extends beaver.Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LBRACKET = 2;
		static public final short LPAREN = 3;
		static public final short MINUS = 4;
		static public final short STRING_LITERAL = 5;
		static public final short INT_LITERAL = 6;
		static public final short TRUE = 7;
		static public final short FALSE = 8;
		static public final short RPAREN = 9;
		static public final short RCURLY = 10;
		static public final short RBRACKET = 11;
		static public final short VOID = 12;
		static public final short BOOLEAN = 13;
		static public final short INT = 14;
		static public final short LCURLY = 15;
		static public final short SEMICOLON = 16;
		static public final short IF = 17;
		static public final short WHILE = 18;
		static public final short BREAK = 19;
		static public final short RETURN = 20;
		static public final short COMMA = 21;
		static public final short EQL = 22;
		static public final short IMPORT = 23;
		static public final short PUBLIC = 24;
		static public final short PLUS = 25;
		static public final short TIMES = 26;
		static public final short DIV = 27;
		static public final short MOD = 28;
		static public final short TYPE = 29;
		static public final short MODULE = 30;
		static public final short ELSE = 31;
		static public final short EQEQ = 32;
		static public final short NEQ = 33;
		static public final short LT = 34;
		static public final short LEQ = 35;
		static public final short GT = 36;
		static public final short GEQ = 37;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9p5M0cSJLKS$kuTJ3CFCvAj8klOPWoo6vCnZ6KOIsEPIALIMgJ5j5fA96KfqcQT5eKsH4b" +
		"5A55498FiImQLKDh#VVUyyvuxzzqxOp9#pVrzvxzzvznpp$O$Ru0me3sknVNeZdJqH2$qGM" +
		"iaO0HQe2Mgu54yZhAu59VXSbH49Lo1oZ1nIRvroZlgj4Tl1$ygj48YofrtIyaegNWL2leTC" +
		"XqrygrJD#JjUVFh5P1$fOF$16x2O7J5rUY1Et0dYifUJCSuF8MdKHtHg8buD4AJ4DvKsSsf" +
		"3F2AUF9ca7UslPcUl73PAnBWoP#Ul6VLLmJQY$BabSOaN1pabV7aTKONf0NVko$8Snl7vce" +
		"StIAtU4RkKv47yH0UnYCOXk6o1qrTcRKLiofkHaRkFieSj44Ixd6jrS3ppNqz8zTvHWPuHc" +
		"xpZDpb6Ra$dxvbkCs5$8Ink1lLP4D8l0tQuiaGx$dQdHpxsndlba$yGjibq14TL9cA61H3B" +
		"Lo424nX6IT$818#5DVb5BsE$NjacXp253BylXG#rt1SdqUizZJ6D8n7VPdDvpK#l#0nb983" +
		"QCTd40R9pnYDJ6JA0Sx8SvY8PgY3XkWltw0VRi2jzDo8WV8ARfSi3C6z62flu05v7QCm0MC" +
		"mKWxZ6Jc8oNY1S$OIPk5b02zYDi#06EwoMbplTNZQnIAEPrWywdCbD#Jfr8ZzQi8TqapljW" +
		"IUsfLuTXUqZXk$1yUqKo6qvESLlANUXVGTXSatc5t3U7uNvSeAvvfgoxMKmhLKWbakYf5IF" +
		"4LBC$ywUT7a6K5Ub2SlTtlbF7cHV13aHNho$5yHu1cUl2ZkcOXpQC#V3KDvtkFuNoALcNsh" +
		"eXepKGs#8pqFfi4pnjd729wPIJnz2hTF$t$4VIxytcW#phWr2huGx$dQpluLD7wXxKJclMH" +
		"THl9i3cD6RKTMUzxV8jNjfQik0$lHlqVASzqOPFXzHVXOxLPa9lDxeideG8#FJuJYcinr4R" +
		"pNLk1zgOooBHcXjMZ5AalfezsP7fzwEklwgHe#PYgVOdTKTGrQHLb6ytvdrIx7VPuraeK8i" +
		"nEmZyWc3W8cSuH1rIXEVJvbkCKBWBxPz5MdiedwFEfrYMgqLrF6#pdOHZsPyXZbK7jz9nWV" +
		"ptPChVF5vcJzdcb49U9R#ijGZjQSsZg#aeWXDjFNIliMQiaVEEOwhM#mlIj3##ffkLZB9iG" +
		"IHxzYTIoH#edGVfjfUNsNZRUKw4ziqVOQOg3MTn63YMtQpYIojRwCs4uC9pucTjhQ74Firl" +
		"sSI7sFzYydE9Vc1685SI2FVktLSYsnN#lMd1xKUacYj4izphDvX5X4h2UE4gTqR2jnJEkdY" +
		"KF4IIB7Ll#mbcU8usVzg67Jnp6MOQlJBxGVYBF5XmLqhkTictvISojuZOFxs20njstqrVu#" +
		"rdnfVOWjdgbzOntrOjtQPx#EQ7vnpTFhaYSoZ1svsp1xQLd5FYQsU8Dp$ovZbCEUPDEds$J" +
		"cjlQdQjzSwsnmr5zYqrDiTMPftohgMUVQlppwlT7bk#Vu9NAiSwZWRMA1YoyB#a$#bXDAif" +
		"Gpyhly1iUVd0vgk#G7sIaxPBjaopRb#LwLMuECpV8Toor1csUQR5BQHk9h#KfMoUVKLij7m" +
		"htESfaibGzbiNn0Qx4iaVTbaIoala3UatVb7NbRtfBvCa$cobhLpXhXMIphv4jbVQ7ALssz" +
		"dIKpbPoXoZTjaPNocQoGvVAfV49hlV8TKMMErRRyACVbc1pDzUtxLNagQ9#KNpbY$oZzBnO" +
		"3UCykndkdIO1tpp1cIvEm$kza1D65kIcDER4hkOcqUT8oRnf1DBAXCTi8e9lAac1k2oF036" +
		"hoLcy1$4LW4k0Ts$14KzPhHZJdUxkJtvty5ioFBQadq9zEJZfzhMZNfswX8VqrAItKOfyjD" +
		"62yXmBugyPmHJpZIQoRH4vhsXRgqPTCdvKXsz0E88R#6ChQUQ0EtzkJl9wicyesKYdhKlPI" +
		"zu4m0hmX6GfnjFly2zK8wFy=");

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN9 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 9];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	// turn off automated error recovery
	@Override
	protected void recoverFromError(Symbol token, TokenStream in) throws java.io.IOException, Exception {
		super.recoverFromError(new Symbol(0), in);
	}

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			RETURN6,	// [0] Module = MODULE ID LCURLY Imports Declarations RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [1] Imports = Import Imports; returns 'Imports' although none is marked
			Action.NONE,  	// [2] Imports = 
			RETURN3,	// [3] Import = IMPORT ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [4] Declarations = Declaration Declarations; returns 'Declarations' although none is marked
			Action.NONE,  	// [5] Declarations = 
			Action.RETURN,	// [6] Declaration = FunctionDecl
			Action.RETURN,	// [7] Declaration = FieldDecl
			Action.RETURN,	// [8] Declaration = TypeDecl
			RETURN9,	// [9] FunctionDecl = Accessibility TypeName ID LPAREN ParameterList RPAREN LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN4,	// [10] FieldDecl = Accessibility TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN6,	// [11] TypeDecl = Accessibility TYPE ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [12] Accessibility = PUBLIC
			Action.NONE,  	// [13] Accessibility = 
			Action.RETURN,	// [14] TypeName = Primitive
			Action.RETURN,	// [15] TypeName = Array
			Action.RETURN,	// [16] TypeName = ID
			Action.RETURN,	// [17] Primitive = VOID
			Action.RETURN,	// [18] Primitive = BOOLEAN
			Action.RETURN,	// [19] Primitive = INT
			RETURN3,	// [20] Array = Array LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [21] Array = Primitive LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [22] Array = ID LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN2,	// [23] ParameterList = Parameter ParameterListTail; returns 'ParameterListTail' although none is marked
			Action.NONE,  	// [24] ParameterList = 
			RETURN3,	// [25] ParameterListTail = COMMA Parameter ParameterListTail; returns 'ParameterListTail' although none is marked
			Action.NONE,  	// [26] ParameterListTail = 
			RETURN2,	// [27] Parameter = TypeName ID; returns 'ID' although none is marked
			RETURN2,	// [28] StatementList = Statement StatementListTail; returns 'StatementListTail' although none is marked
			Action.NONE,  	// [29] StatementList = 
			RETURN2,	// [30] StatementListTail = Statement StatementListTail; returns 'StatementListTail' although none is marked
			Action.NONE,  	// [31] StatementListTail = 
			Action.RETURN,	// [32] Statement = LocalVarDecl
			Action.RETURN,	// [33] Statement = StatementBlock
			Action.RETURN,	// [34] Statement = IfStatement
			Action.RETURN,	// [35] Statement = WhileStatement
			Action.RETURN,	// [36] Statement = BreakStatement
			Action.RETURN,	// [37] Statement = ReturnStatement
			Action.RETURN,	// [38] Statement = ExprStatement
			RETURN3,	// [39] LocalVarDecl = TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [40] StatementBlock = LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN6,	// [41] IfStatement = IF LPAREN Expression RPAREN Statement OptionalElseStatement; returns 'OptionalElseStatement' although none is marked
			RETURN2,	// [42] OptionalElseStatement = ELSE Statement; returns 'Statement' although none is marked
			Action.NONE,  	// [43] OptionalElseStatement = 
			RETURN5,	// [44] WhileStatement = WHILE LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN2,	// [45] BreakStatement = BREAK SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [46] ReturnStatement = RETURN OptionalExpr SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [47] OptionalExpr = Expression
			Action.NONE,  	// [48] OptionalExpr = 
			RETURN2,	// [49] ExprStatement = Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [50] Expression = RHSExpr
			Action.RETURN,	// [51] Expression = Assignment
			RETURN3,	// [52] Assignment = LHSExpr EQL Expression; returns 'Expression' although none is marked
			Action.RETURN,	// [53] LHSExpr = ID
			Action.RETURN,	// [54] LHSExpr = ArrayAccess
			RETURN4,	// [55] ArrayAccess = ID LBRACKET Expression RBRACKET; returns 'RBRACKET' although none is marked
			RETURN4,	// [56] ArrayAccess = ArrayAccess LBRACKET Expression RBRACKET; returns 'RBRACKET' although none is marked
			RETURN2,	// [57] RHSExpr = ArithmeticExpr OptionalArithmeticExpr; returns 'OptionalArithmeticExpr' although none is marked
			RETURN2,	// [58] OptionalArithmeticExpr = ComparisonOp ArithmeticExpr; returns 'ArithmeticExpr' although none is marked
			Action.NONE,  	// [59] OptionalArithmeticExpr = 
			Action.RETURN,	// [60] ComparisonOp = EQEQ
			Action.RETURN,	// [61] ComparisonOp = NEQ
			Action.RETURN,	// [62] ComparisonOp = LT
			Action.RETURN,	// [63] ComparisonOp = LEQ
			Action.RETURN,	// [64] ComparisonOp = GT
			Action.RETURN,	// [65] ComparisonOp = GEQ
			RETURN2,	// [66] ArithmeticExpr = Term ArithmeticExprTail; returns 'ArithmeticExprTail' although none is marked
			RETURN3,	// [67] ArithmeticExprTail = AdditiveOp Term ArithmeticExprTail; returns 'ArithmeticExprTail' although none is marked
			Action.NONE,  	// [68] ArithmeticExprTail = 
			Action.RETURN,	// [69] AdditiveOp = PLUS
			Action.RETURN,	// [70] AdditiveOp = MINUS
			RETURN2,	// [71] Term = Factor TermTail; returns 'TermTail' although none is marked
			RETURN3,	// [72] TermTail = MultiplicativeOp Factor TermTail; returns 'TermTail' although none is marked
			Action.NONE,  	// [73] TermTail = 
			Action.RETURN,	// [74] MultiplicativeOp = TIMES
			Action.RETURN,	// [75] MultiplicativeOp = DIV
			Action.RETURN,	// [76] MultiplicativeOp = MOD
			RETURN2,	// [77] Factor = MINUS Factor; returns 'Factor' although none is marked
			Action.RETURN,	// [78] Factor = PrimaryExpr
			Action.RETURN,	// [79] PrimaryExpr = INT_LITERAL
			Action.RETURN,	// [80] PrimaryExpr = STRING_LITERAL
			Action.RETURN,	// [81] PrimaryExpr = FunctionCall
			Action.RETURN,	// [82] PrimaryExpr = ArrayExpr
			Action.RETURN,	// [83] PrimaryExpr = BooleanLiteral
			Action.RETURN,	// [84] PrimaryExpr = LHSExpr
			Action.RETURN,	// [85] PrimaryExpr = ParenthesisedExpr
			RETURN4,	// [86] FunctionCall = ID LPAREN ExpressionList RPAREN; returns 'RPAREN' although none is marked
			RETURN2,	// [87] ExpressionList = Expression ExpressionListTail; returns 'ExpressionListTail' although none is marked
			Action.NONE,  	// [88] ExpressionList = 
			RETURN3,	// [89] ExpressionListTail = COMMA Expression ExpressionListTail; returns 'ExpressionListTail' although none is marked
			Action.NONE,  	// [90] ExpressionListTail = 
			RETURN3,	// [91] ArrayExpr = LBRACKET ExpressionListNonEmpty RBRACKET; returns 'RBRACKET' although none is marked
			RETURN2,	// [92] ExpressionListNonEmpty = Expression ExpressionListNonEmptyTail; returns 'ExpressionListNonEmptyTail' although none is marked
			RETURN3,	// [93] ExpressionListNonEmptyTail = COMMA Expression ExpressionListNonEmptyTail; returns 'ExpressionListNonEmptyTail' although none is marked
			Action.NONE,  	// [94] ExpressionListNonEmptyTail = 
			Action.RETURN,	// [95] BooleanLiteral = TRUE
			Action.RETURN,	// [96] BooleanLiteral = FALSE
			RETURN3	// [97] ParenthesisedExpr = LPAREN Expression RPAREN; returns 'RPAREN' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
