/**
 * Write an application to perform basic arithmetic operations like add,
 * subtract, multiply & divide. You need to define a functional interface first.
 * 
 * @author dgarci11
 *
 */
public class Question1 {

	public static void main(String[] args) {
		MyLambda add = (x, y) -> x + y;
		MyLambda subtract = (x, y) -> x - y;
		MyLambda multiply = (x, y) -> x * y;
		MyLambda divide = (x, y) -> {
			if (y == 0) {
				return 0;
			}
			else {
				return x / y;
			}
		};
		
		System.out.println(add.foo(12, 3));
		System.out.println(subtract.foo(12, 3));
		System.out.println(multiply.foo(12, 3));
		System.out.println(divide.foo(12, 3));
	}

}

interface MyLambda {
	double foo(double x, double y);
}
