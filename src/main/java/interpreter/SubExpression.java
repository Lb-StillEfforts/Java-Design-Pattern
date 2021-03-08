package interpreter;

import java.util.HashMap;

// 减法解释器
public class SubExpression extends SymbolExpression {


    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 处理相减
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // super.left.interpreter(var) 返回left表达式所对应的值
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
