package excep;

public class exdemo {
    static void checkage(int age) throws InvalidAgeExp
    {
        if(age<18)
        {
            throw new InvalidAgeExp("Age cannot be less than 18");
        }
        else {
            System.out.println("valid age");
        }
    }
    public  static void main(String[] args)
    {
        try{
             checkage(10);

        }
        catch (InvalidAgeExp e)
        {
            System.out.println(e.getMessage());
        }
    }
}
