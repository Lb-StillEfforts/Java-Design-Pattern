package interpreter;

import java.util.HashMap;

public abstract class Expression {
    // 解释公式和数值，key就是表达式, value 就是其具体数值
    // a+b {a,10}, {b,20}
    public abstract int interpreter(HashMap<String, Integer> var);

}
