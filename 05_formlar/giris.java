package hafta05;

import javax.swing.*;

public class giris {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form01 f1 = new form01();
                f1.setVisible(true);
                form02 f2 = new form02();
                f2.setVisible(true);
            }
        });
    }
}
