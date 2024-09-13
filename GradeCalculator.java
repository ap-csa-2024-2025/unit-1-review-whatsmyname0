public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "Ap Comp Sci A";
    System.out.println("Course Name: " + course);
    int avgtimespent = 200;
    System.out.println("Average time spent in awee for this course in minutes: " + avgtimespent);
    int hw1 = 80;
    int hw2 = 100;
    int hw3 = 92;
    int hw4 = 97;
    double quiz1 = 92.8;
    double quiz2 = 96.7;
    double exam = 99.2;
    System.out.println("Homework grades for this course: ");
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println("Quiz grades for this course: ");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println("Final exam grade for this course: ");
    System.out.println(exam);
    int timehour = (int) (avgtimespent / 60);
    int timemin = (int) (avgtimespent % 60);
    System.out.println("Weekly time spent: " + timehour + "h" + timemin);
    double avghw = (double) (hw1 + hw2 + hw3 + hw4) / 4;
    double avgquiz = (double) (quiz1 + quiz2) / 2;
    System.out.println("Average Homework grade for this course: " + avghw);
    System.out.println("Average Quiz grade for this course: " + avgquiz);
    System.out.println("Average exam grade for this course: " + exam);
    double finalgrade = (avghw * 0.35) + (avgquiz * 0.15) + (exam * 0.50);
    int roundedgrade = (int) (finalgrade + 0.5);
    System.out.println("Overall Grade: " + roundedgrade);
  }
}
