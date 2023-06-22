public class Undergraduate extends Student {
    private int yearLevel;
    private String major;
    private double gpa;
    protected Undergraduate(String name, String id, int[] marks, int yearLevel, String major, double gpa) {
        super(name, id, marks);
        this.yearLevel = yearLevel;
        this.major = major;
        this.gpa = gpa;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
