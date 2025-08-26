public class calculator {
    double ar;
    public void Area(double l, double h){
        ar = l*h;
        System.out.println("Area of rectangle = "+ar);
    }
    public void Area(double r){
        ar = Math.PI*r*r;
        System.out.println("Area of circle = "+ar);
    }
    public void Area(double l, double b, double h) {
        ar = 2 * (l * b + b * h + h * l);
        System.out.println("Area of cuboid = " + ar);
    }


    public static void main(String[] args) {
        calculator cl = new calculator();
        cl.Area(23);
    }
}
