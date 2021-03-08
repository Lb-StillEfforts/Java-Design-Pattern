package interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    // 定义表达式
    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();
        Expression left = null;
        Expression right = null;

        // 遍历字符数组，处理不同情况
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }

        this.expression = stack.pop();

    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
