public class child extends Parent {
    public void watchVideo(){
        System.out.println("Watch Reel Video");
    }

    public static void main(String[] args) {
        child b = new child();
        b.watchVideo();
    }
}
