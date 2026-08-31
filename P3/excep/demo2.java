package excep;

public class demo2 {
    static void checkpin(int Pin) throws invalidpin
    {
        if (Pin==2010)
        {
            System.out.println("valid pin");
        }
        else
        {
            throw new invalidpin("invalid Pin");
        }
    }
    public static void main(String[] args){
        try{
            checkpin(2010);
        }
        catch(invalidpin e)
        {
            System.out.println(e.getMessage());
        }
    }
}
