package Arrays;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TestExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no of students");
		StudentExams[] s = new StudentExams[scn.nextInt()];
		for (int i = 0; i < s.length; i++) {
			System.out.println("enter details of students" + (i + 1));
			s[i] = new StudentExams();
			System.out.println("enter student id");
			s[i].setId(scn.nextInt());
			System.out.println("enter student name");
			s[i].setName(scn.next());
			System.out.println("enter no of exams");
			Exam[] e = new Exam[scn.nextInt()];
			for (int j = 0; j < e.length; j++) {
				System.out.println("enter details of exam" + (j + 1));
				Exam em = new Exam();
				System.out.println("enter exam name");
				em.setExamName(scn.next());
				System.out.println("enter obtained marks");
				em.setObtainedmarks(scn.nextDouble());
				System.out.println("enter total marks");
				em.setTotalmarks(scn.nextDouble());
				e[j] = em;
			}
            s[i].setE(e);
			s[i].setR(new Report());
			s[i].calper();

		}
		for (StudentExams se : s)
			se.printStudent();

	}

}
