public class student {
    int id;
    String name;
    student(){
        System.out.println("Please pass some parameters");
    }
    student(int n, String stu){
        id = n;
        name = stu;
    }
    student(student s1){
        id = s1.id;
        name = s1.name;
    }
    void display(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}
