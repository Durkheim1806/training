package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCode {
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;

    public JavaCode() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello world");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCode");
        frame.setContentPane(new JavaCode().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
