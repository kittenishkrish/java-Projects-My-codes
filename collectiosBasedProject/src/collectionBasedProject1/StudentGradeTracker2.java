package collectionBasedProject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeTracker2 {

	private Map<Integer, List<Integer>> studentGrades;

	public StudentGradeTracker2() {
		this.studentGrades = new HashMap<>();
	}

	public void addStudent(int studentID) {
		if (!studentGrades.containsKey(studentID)) {
			studentGrades.put(studentID, new ArrayList<>());
			System.out.println("Student wit ID " + studentID + " added.");
		} else {

			System.out.println("student with ID " + studentID + " already exists.");
		}

	}

	public void addGrade(int studentID, String subject, int grade) {
		List<Integer> gradesList = studentGrades.get(studentID);
		if (gradesList != null) {
			gradesList.add(grade);
			System.out.println("Grade added for Student ID " + studentID + " in subject " + subject + " : " + grade);
		} else {

			System.out.println("student with ID" + studentID + " not found.");
		}

	}

	public void calculateAverage(int studentID) {
		List<Integer> gradesList = studentGrades.get(studentID);
		if (gradesList != null && !gradesList.isEmpty()) {
			int sum = 0;
			for (int grade : gradesList) {
				sum += grade;
			}
			double average = (double) sum / gradesList.size();
			System.out.println("Average grade for Student ID " + studentID + " : " + average);
		} else {
			System.out.println("Student with ID " + studentID + " not found or has no grades.");
		}
	}

	public void calculateTotal(int studentID) {
		List<Integer> gradesList = studentGrades.get(studentID);
		if (gradesList != null && !gradesList.isEmpty()) {
			int total = 0;
			for (int grade : gradesList) {
				total += grade;
			}
			System.out.println("Student with ID " + studentID + " gained a total marks: " + total);
		} else {
			System.out.println("Student with ID " + studentID + " not found or has no grades.");
		}
	}

	public void displayAllStudents() {
		System.out.println("Student Grades:");
		for (Map.Entry<Integer, List<Integer>> entry : studentGrades.entrySet()) {
			int studentID = entry.getKey();
			List<Integer> gradesList = entry.getValue();
			System.out.println("Student ID: " + studentID + ", Grades: " + gradesList);
		}
	}

	public static void main(String[] args) {

		StudentGradeTracker2 gradeTracker = new StudentGradeTracker2();
		Scanner scanner = new Scanner(System.in);

		gradeTracker.addStudent(101);
		gradeTracker.addStudent(102);

		gradeTracker.addGrade(101, "Tamil", 92);
		gradeTracker.addGrade(101, "English", 93);
		gradeTracker.addGrade(101, "Maths", 95);
		gradeTracker.addGrade(101, "Science", 95);
		gradeTracker.addGrade(101, "Social Science", 94);

		gradeTracker.addGrade(102, "Tamil", 98);
		gradeTracker.addGrade(102, "English", 97);
		gradeTracker.addGrade(102, "Maths", 99);
		gradeTracker.addGrade(102, "Science", 99);
		gradeTracker.addGrade(102, "Social Science", 96);

		gradeTracker.displayAllStudents();

		System.out.println("Enter Student ID to calculate average grade:");
		int studentID = scanner.nextInt();
		gradeTracker.calculateAverage(studentID);
		gradeTracker.calculateTotal(studentID);
		scanner.close();

	}

}
