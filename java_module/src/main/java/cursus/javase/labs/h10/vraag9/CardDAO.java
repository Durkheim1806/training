package cursus.javase.labs.h10.vraag9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CardDAO {

    public List<Card> getAllCards() {

        List<Card> listCards = new ArrayList<>();

        try (Connection connectionLocalHost = DriverManager.getConnection("jdbc:mysql://localhost:3306/javase", "root", "")) {
            String sql = """
                    SELECT * 
                    FROM cards
                    """;
            PreparedStatement p = connectionLocalHost.prepareStatement(sql);
            ResultSet rs = p.executeQuery();

            while (rs.next()) {
                int cardid = rs.getInt("cardid");
                String name = rs.getString("name");
                String address = rs.getString("address");
                double credit = rs.getDouble("credit");
                Card c1 = new RegularCard(cardid, name, address, "-", credit);
                listCards.add(c1);
            }

        } catch (SQLException e) {
        }
        return listCards;
    }
}
