package com.consultadd.exercise5;
/*7. Write a JAVA program that gives boolean values; true, if the string has balanced braces and false, if the string has unbalanced braces:
        For eg, => “({{)}[}]()” //output => true //valid parentheses
        {{( [ ) ] }} => “[})(” //output => false.*/
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBraces {
    Map<Character, Character> map = new HashMap<>();

    public boolean braces(String s) {
        System.out.println("String : "+ s);
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    System.out.println("Output : "+ false);
                    return false;
                }
                char k = st.pop();
                if (map.get(k) != c) {
                    System.out.println("Output : "+ false);
                    return false;
                }
            }
        }
        System.out.println("Output : "+ true);
        return true;
    }

    public static void main(String[] args) {
        String k = "{[[]{}]}()()";
        BalancedBraces obj = new BalancedBraces();
        obj.braces(k);
        String o = "{}[)";
        obj.braces(o);
    }
}
