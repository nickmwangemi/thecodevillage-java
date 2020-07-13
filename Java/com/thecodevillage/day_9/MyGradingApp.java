import java.util.Scanner;

public class MyGradingApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int noOfStudents = 0;
        int totalMarks=0;
        double meanScore=0;
        String meanGrade="";
        String studentName="";
        String regNo="";

        System.out.println("Enter number of students: ");
        noOfStudents = scanner.nextInt();

        if (noOfStudents > 0){
            int noOfSubjects = 0;
            int counter = 1;

            int studentTotalMarks=0;
            double studentMeanScore=0;
            String studentMeanGrade="";

            while(counter <= noOfStudents){ //gets students
                System.out.println("Enter name of Student ");
                studentName = scanner.next();

                System.out.println("Enter Reg No ");
                regNo = scanner.next();

                System.out.println("Enter number of subjects ");
                noOfSubjects = scanner.nextInt();
                if (noOfSubjects > 0){
                    String subjectName="";
                    int marks= 0;

                    for (int i=0; i<noOfSubjects; i++){ //gets the subjects
                        System.out.println("Enter subject name: ");
                        subjectName = scanner.next();
                        System.out.println("Enter the score: ");
                        marks = scanner.nextInt();
                        studentTotalMarks += marks;
                    }
                }

                System.out.println("\nName : "+studentName);
                System.out.println("RegNo : "+regNo);
                System.out.println("Subject: "+subject);
                System.out.println("Total Marks : "+studentTotalMarks);
                System.out.println("Mean Score: "+meanScore);

                counter++;
            }
        } else{
            System.out.println(" Enter number greater than 0");
        }

}
}