package cursus.javase.labs.h10.vraag9;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CardApp {

    public static void main(String[] args) {

        Card cardGerda = new RegularCard(1235, "Gerda", "-", "-", 1000.0);
        Card cardDonald = new GoldCard(1236, "Donald", "-", "-", 7000.0, 25);
        Card cardEdward = new RegularCard(1237, "Edward", "-", "-", 7000.0);
        Card cardPiet = new RegularCard(1238, "Piet", "-", "-", 5000.0);
        Card cardAnna = new RegularCard(1239, "Anna", "-", "-", 2000.0);
        List listOfCards = new ArrayList<>();
        listOfCards.add(cardGerda);
        listOfCards.add(cardDonald);
        listOfCards.add(cardEdward);
        listOfCards.add(cardPiet);
        listOfCards.add(cardAnna);

        CardDAO dao = new CardDAO();
        System.out.println(dao.getAllCards());

        try (Connection connectionLocalHost = DriverManager.getConnection("jdbc:mysql://localhost:3306/javase", "root", "")) {

//            String createTable = "CREATE TABLE cards (cardid int, name varchar(255), address varchar(255), credit decimal(6,2))";
            String insertRow = "INSERT INTO cards (cardid, name, credit) VALUES ('1235', 'Gerda', '1000.00')";
            String insertRows = """
                    INSERT INTO cards
                    (cardid, name, credit)
                    VALUES 
                    ('1235', 'Gerda', '1000.00'),
                    ('1236', 'Donald', '7000.00'),
                    ('1237', 'Edward', '7000.00'),
                    ('1238', 'Piet', '5000.00'),
                    ('1239', 'Anna', '2000.00');
                    """;

//            PreparedStatement iRow = connectionLocalHost.prepareStatement(insertRow);

            PreparedStatement iRows = connectionLocalHost.prepareStatement(insertRows);

            System.out.println(iRows.execute());
            iRows.execute();


        } catch (SQLException e) {

        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                CardModel model = new CardModel(listOfCards);
                CardView view = new CardView(model);
                CardController controller = new CardController(view, model);
            }
        });
    }
}
