package cursus.javase.labs.h10.vraag9;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CardView {

    private JPanel rootPanel;
    private JTable showTable;
    private JTextField textField1;
    private JTextField textField2;
    private JButton makePaymentButton;
    private JLabel inputCard;
    private JLabel inputAmount;

    public CardView() {
        JPanel root = this.getRootPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(root);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }


    void showCardTable(CardModel model) {
        showTable.setModel(model);
    }

    void updateCardTable(ActionListener listenForPaymentButton) {
        makePaymentButton.addActionListener(listenForPaymentButton);
    }

//    void displayErrorMessage(String errorMessage) {
//        JOptionPane.showMessageDialog(this, errorMessage);
//    }


    public int getCardID() {
        return Integer.parseInt(textField1.getText());
    }

    public int getAmount() {
        return Integer.parseInt(textField2.getText());
    }


}
