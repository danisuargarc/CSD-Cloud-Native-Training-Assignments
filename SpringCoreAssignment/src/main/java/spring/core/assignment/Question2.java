package spring.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create a class Question with following attributes: questionId, question, answers.
 * There are 3 cases for above program.
 * a. Write a program where answers is of type List<String> or String[]
 * b. Write a program where answers is of type Set<String>
 * c. Write a program where answers is of type Map<Integer, String>. Integer value represents answer's
 * sequence number.
 * d. Create a Question2 class with main() method, get Question bean from ApplicationContext object and
 * print question and its answers.
 * 
 * @author dgarci11
 *
 */
public class Question2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("q2.xml");
		
		Question questionList = (Question) context.getBean("questionList");
		questionList.printList();

		Question questionSet = (Question) context.getBean("questionSet");
		questionSet.printSet();

		Question questionMap = (Question) context.getBean("questionMap");
		questionMap.printMap();
	}

}
