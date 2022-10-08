package exercises.Ex6;

public class RecordNotFound extends RuntimeException{

    public RecordNotFound() {
        super();
    }

    public RecordNotFound(String message) {
        super(message);
    }
}
