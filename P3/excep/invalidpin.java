package excep;

public class invalidpin extends RuntimeException {
    public invalidpin(String message) {
        super(message);
    }
}
