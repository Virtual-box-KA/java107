public class AgeExceptionMain {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();
        try{
            udf.validate(12);
        }catch(invalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
