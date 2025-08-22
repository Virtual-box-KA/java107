public class bread {
    static int something = 10;
    public static void display(){
        System.out.println("Slice remaining: "+something);
    }
    public static void act(){
        something --;
        System.out.println("Remaining slices: "+something);
    }
    public static void main (String[] args){
        bread.display();
        bread.act();
    }
}