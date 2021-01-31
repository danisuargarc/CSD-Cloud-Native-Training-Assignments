package spring.core.assignment;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Write a Java program to demonstrate SPEL (Spring Expression language)
 * 
 * @author dgarci11
 *
 */
public class Question7 {
	
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'");
		System.out.println(exp.getValue());

		Expression exp2 = parser.parseExpression("'Hello World'.concat('!')");
		System.out.println(exp2.getValue());

		Expression exp3 = parser.parseExpression("'Hello World'.bytes.length");
		System.out.println(exp3.getValue());

		Expression exp4 = parser.parseExpression("new String('Hello World').toUpperCase()");
		System.out.println(exp4.getValue());
		
		Expression exp5 = parser.parseExpression("5 * 10");
		System.out.println(exp5.getValue());
		
		Expression exp6 = parser.parseExpression("20 < 20");
		System.out.println(exp6.getValue());
		
		Expression exp7 = parser.parseExpression("2 > 1 ? 'a' : 'b'");
		System.out.println(exp7.getValue());
		
		BankAccount acc = new BankAccount(703, "Elon Musk", "Checkings", 900000000.01);
		Expression exp8 = parser.parseExpression("accountHolderName");
		System.out.println(exp8.getValue(acc));
	}
}
