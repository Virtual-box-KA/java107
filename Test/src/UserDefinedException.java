public class UserDefinedException {
    public void validate(int age) throws invalidAgeException{
        if(age<18)
            throw new invalidAgeException("Cannot caste vote, Age less than 18");
        else{
            System.out.println("Eligible to vote");
        }
    }
}
