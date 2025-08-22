public class marks {
    private String grade;
    public int roll_no;
    public String name;

    public marks(int roll_no, String name, String grade) {
        this.roll_no = roll_no;
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
