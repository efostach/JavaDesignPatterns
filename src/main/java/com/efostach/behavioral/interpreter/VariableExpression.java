package com.efostach.behavioral.interpreter;

public class VariableExpression implements Expression{

    private String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(variable)) {
            return true;
        }
        return false;
    }
}
