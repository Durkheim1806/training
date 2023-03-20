package cursus.javase.labs.h3;

public class Trainee {
    private String firstName;
    private String lastName;

    public Trainee(String firstName){
        setFirstName(firstName);
    }

    public void setFirstName(String fn){
        firstName = fn;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

}
