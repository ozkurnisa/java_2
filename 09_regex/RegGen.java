package hafta09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegGen extends JFrame {
    private JTextArea textArea1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton ARAButton;
    private JLabel label1;

    RegGen() {
        add(panel1);
        setTitle("Regex Generator");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ARAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textArea1.getText();
                String pt = textField1.getText();
                Pattern p = Pattern.compile(pt);
                Matcher m = p.matcher(s);

                int sayac=0;
                while(m.find()) sayac++;

                label1.setText(Integer.toString(sayac)+ " adet bulundu");

            }
        });
    }
}
