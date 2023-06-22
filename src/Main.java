public class Main {
    public static void main(String[] args) {
        int[] studMarks = {40, 40, 35, 50, 30};
        Student student = new Student("Alex", "S001", studMarks);
        Student student1 = new Student("Cortana", "S002", studMarks);
        Student student2 = new Student("Corbie", "S003", studMarks);

        Student[] students = {student, student1, student2};
        for(int i = 0; i<students.length; i++) {
            students[i].printInfo();
        }

        int[] undergraduateMarks = {70, 60, 50, 60, 50};
        Undergraduate undergraduate = new Undergraduate("Alexa", "UG001", undergraduateMarks, 1, "Software Engineering", 3.95);

        int[] postgraduateMarks = {90, 100, 70, 80, 80};
        Postgraduate postgraduate = new Postgraduate("Siri", "PG001", postgraduateMarks, "Computer Vision", "Campus Management System using Computer Vision Technology");

        System.out.println("Student");
        student.printInfo();
        System.out.println("----------------------------------");
        System.out.println("Undergraduate Student");
        undergraduate.printInfo();
        System.out.println("Year: "+undergraduate.getYearLevel());
        System.out.println("Major: "+undergraduate.getMajor());
        System.out.println("GPA: "+undergraduate.getGpa());
        System.out.println("----------------------------------");
        System.out.println("Postgraduate Student");
        System.out.println("Name: "+ postgraduate.getName());
        System.out.println("ID: " + postgraduate.getId());
        System.out.println("Marks: ");
        for(int mark: postgraduate.getMarks()) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + postgraduate.calcAverageMark());
        System.out.println("Grade: "+postgraduate.findGrade());
        postgraduate.printInfo();
        System.out.println("Register at "+postgraduate.getRegisterDate());

        System.out.println("Total number of students: " + Student.getNumOfStudents());
    }
}