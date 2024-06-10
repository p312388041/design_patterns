package com.chong.designs.interpreter;

public interface Expression {
    public int interpret();

    static Expression create(String str) {
        String[] elements = str.split(" ");
        // for(String s: elements) {
        // System.out.println(s);
        // }
        if (elements.length % 2 == 0) {
            throw new RuntimeException("表达式错误");
        }
        Expression expression = new NumberExpression(Integer.parseInt(elements[0]));
        for (int i = 1; i < elements.length - 1; i += 2) {
            String symbol = elements[i];
            int num;
            try {
                num = Integer.parseInt(elements[i + 1]);
            } catch (NumberFormatException e) {
                throw new RuntimeException("表达式错误");
            }
            if (symbol.equals("+")) {
                expression = new AddExpression(expression, new NumberExpression(num));
            } else if (symbol.equals("-")) {
                expression = new SubExpression(expression, new NumberExpression(num));
            } else if (symbol.equals("*")) {
                expression = new MulExpression(expression, new NumberExpression(num));
            } else if (symbol.equals("/")) {
                expression = new DivExpression(expression, new NumberExpression(num));
            } else {
                System.out.println("无效的符号");
            }
        }
        // 每个表达式内部有递归
        return expression;
    }
}
