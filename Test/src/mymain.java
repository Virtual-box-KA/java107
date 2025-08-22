import java.util.Scanner;
public class mymain {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Please enter roll no: ");
        int roll_o = sc.nextInt();
        //sc.nextLine();
        System.out.print("Please enter name: ");
        String name = sc.nextLine();
        student s1=new student(roll_o, name);
        s1.display();
//        System.out.println("Print");
    }
}

// 98 /n