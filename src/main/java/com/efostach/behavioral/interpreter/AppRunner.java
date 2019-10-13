package com.efostach.behavioral.interpreter;

public class AppRunner {
    public static void main(String[] args) {

        Expression exp1 = getExpr();

        System.out.println(exp1.interpret("Variable"));

    }

    public static Expression getExpr() {
        Expression expr1 = new VariableExpression("Variable1");
        Expression expr2 = new VariableExpression("Variable2");

        return new EqualExpression(expr1, expr2);
    }
}
