package Exception;

public class Demo {
    static void checkAge(int age)
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age cannot be less than 18");
        }
        System.out.println("valid age");
    }

    public static void main(String[] args) {
        try{
            checkAge(10);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End of execution");
        }
    }
}
