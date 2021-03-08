package interpreter;

import java.util.HashMap;

// 加法解释器
public class AddExpression extends SymbolExpression {


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 处理相加
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // super.left.interpreter(var) 返回left表达式所对应的值
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
