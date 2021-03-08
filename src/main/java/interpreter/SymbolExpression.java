package interpreter;

import java.util.HashMap;

// 运算符号解释器，这里，每个运算符都只和自己左右两个数字有关
// 但左右两个数字也有可能是解析的结果
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // 由子类实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
