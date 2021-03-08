package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println(expStr + " calculate result is : " + calculator.run(var));

    }

    private static HashMap<String, Integer> getValue(String expStr) {
        char[] charArr = expStr.toCharArray();
        HashMap<String, Integer> var = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (char c : charArr) {
            switch (c) {
                case '+':
                    break;
                case '-':
                    break;
                default:
                    if (!var.containsKey(String.valueOf(c))) {
                        System.out.println("请输入" + c + "的值: ");
                        var.put(String.valueOf(c), scanner.nextInt());
                    }
                    break;
            }
        }
        return var;
    }

    private static String getExpStr() throws IOException {
        System.out.println("请输入表达式: ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}
