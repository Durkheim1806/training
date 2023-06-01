package cursus.javase.labs.h3;

public class Vraag16 {

    public static void main(String[] args) {
        Trainee client1 = new Trainee("Jan");
        Trainee client2 = new Trainee("Piet");
        client2 = client1;
        client2.setFirstName("Joris");
        System.out.println(client1.getFirstName());
    }
}
