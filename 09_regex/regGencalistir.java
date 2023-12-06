package hafta09;

import javax.swing.*;

public class regGencalistir {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //ekrana basılması için thread
            @Override
            public void run() {
                RegGen fr = new RegGen();
                fr.setVisible(true);
            }
        });
    }
}
