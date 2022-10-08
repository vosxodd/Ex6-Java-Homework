package exercises.Ex6;

public class RecordNotValid extends Exception{

    public RecordNotValid() {
        super();
    }

    public RecordNotValid(String message) {
        super(message);
    }
}