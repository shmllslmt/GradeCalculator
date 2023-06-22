import java.util.Date;

public class Student {
    private String name;
    private String id;
    private int[] marks;
    private java.util.Date registerDate;
    private static int numOfStudents = 0;
    protected Student (String name, String id, int[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;

        registerDate = new Date();
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int[] getMarks() {
        return marks;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double calcAverageMark() {
        double average = 0.0;
        double total = 0.0;

        for(int mark: marks) {
            total += mark;
        }

        average = total / marks.length;

        return average;
    }

    public String findGrade() {
        String grade = "";
        double mark = calcAverageMark();

        if(mark >= 80)
            grade = "A";
        else if(mark >= 75)
            grade = "A-";
        else if(mark >= 70)
            grade = "B+";
        else if(mark >= 65)
            grade = "B";
        else if(mark >= 60)
            grade = "B-";
        else if(mark >= 55)
            grade = "C+";
        else if(mark >= 50)
            grade = "C";
        else if(mark >= 40)
            grade = "D";
        else if(mark >= 30)
            grade = "D-";
        else
            grade = "F";

        return grade;
    }
    public void printInfo() {
        System.out.println("Name: "+name);
        System.out.println("ID: " + id);
        System.out.println("Marks: ");
        for(int mark: marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + calcAverageMark());
        System.out.println("Grade: "+findGrade());
        System.out.println("Register at "+registerDate);
    }
}
