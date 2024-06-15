package procthree;

import java.util.Stack;

public class ParenthesisCheck {
	public static void main(String[] args) {
		String expression = "((a+b)*(c-d))"; // Example expression
		if (isBalanced(expression)) {
			System.out.println("The parentheses are balanced.");
		} else {
			System.out.println("The parentheses are not balanced.");
		}
	}

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();

		for (char ch : expression.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}

		return stack.isEmpty();
	}
}
