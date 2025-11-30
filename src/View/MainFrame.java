package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable {

    JPanel mainPanel = new JPanel();

    @Override
    public void run()
    {
        configurateWindow();
    }

    public void configurateWindow()
    {
        this.setSize(new Dimension(1920,1080));
        this.setTitle("Bank of Rankov");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
