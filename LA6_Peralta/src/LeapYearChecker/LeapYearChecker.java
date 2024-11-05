package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JTextField yearTextField;
    private JPanel pMain;
    private JButton checkYearButton;
public LeapYearChecker() {
    checkYearButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int year = Integer.parseInt(yearTextField.getText());

            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                JOptionPane.showMessageDialog(null, "Leap year");
            } else {
                JOptionPane.showMessageDialog(null, "Not a leap year");
            }
        }
    });
}
    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.pMain);
        app.setSize(400, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
