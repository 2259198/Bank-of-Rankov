package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable {

    JPanel mainPanel = new JPanel();

    JLabel mainText;

    @Override
    public void run()
    {
        configurateWindow();
        configurateDesign();
        this.setVisible(true);
    }

    public void configurateWindow()
    {
        this.setSize(new Dimension(1920,1080));
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Bank of Rankov");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void configurateDesign()
    {
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(new PanelControl(), BorderLayout.CENTER);

        mainText = new JLabel("Bank of Rankov");
        mainText.setForeground(new Color(0x0077ff));
        mainText.setHorizontalAlignment(JLabel.CENTER);

        add(mainPanel, BorderLayout.CENTER);
        add(mainText, BorderLayout.CENTER);
    }

}
