package spring.core.assignment;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	
	private List<String> answersList;
	private Set<String> answersSet;
	private Map<Integer, String> answersMap;
	
	public Question(int questionId, String question, List<String> answersList) {
		this.questionId = questionId;
		this.question = question;
		this.answersList = answersList;
	}

	public Question(int questionId, String question, Set<String> answersSet) {
		this.questionId = questionId;
		this.question = question;
		this.answersSet = answersSet;
	}

	public Question(int questionId, String question, Map<Integer, String> answersMap) {
		this.questionId = questionId;
		this.question = question;
		this.answersMap = answersMap;
	}
	
	public void printList() {
		System.out.println("\n" + questionId + " - " + question);
		System.out.println("Printing answers as List<String>:");
		
		for(String answer : answersList) {
            System.out.println(answer);
        }
	}
	
	public void printSet() {
		System.out.println("\n" + questionId + " - " + question);
		System.out.println("Printing answers as Set<String>:");
		
		for(String answer : answersSet) {
            System.out.println(answer);
        }
	}
	
	public void printMap() {
		System.out.println("\n" + questionId + " - " + question);
		System.out.println("Printing answers as Map<Integer, String>:");
		
		for (Map.Entry<Integer, String> entry : answersMap.entrySet()) {
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
