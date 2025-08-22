public class schoolstudent extends person {
    public String course;

    public schoolstudent(String address, String course) {
        super(address);
        this.course = course;
    }

    public void getCourse(){
        System.out.println("Course : "+course);
    }
}
