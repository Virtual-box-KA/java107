import java.io.DataInputStream;
import java.util.*;
public class someException {

    public static void main(String[] args) {
        int x, y, z=0;
        Scanner sc = new Scanner(System.in);
        DataInputStream dis = new DataInputStream(System.in);
        try{
            x = sc.nextInt();
            y = sc.nextInt();
            z=x/y;
            System.out.println("No exception");
        }

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Result is "+z);
        }
    }
}

