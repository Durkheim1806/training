package cursus.javase.labs.h4;

public class EvenNumberExceptionUnchecked extends RuntimeException{
    public EvenNumberExceptionUnchecked(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
