package cursus.javase.labs.h7;

public class PersonDiedException extends RuntimeException{
    public PersonDiedException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
