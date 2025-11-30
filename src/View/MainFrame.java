package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable {

    JPanel mainPanel = new JPanel();
    JPanel signInLabel = new JPanel();

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
        setContentPane(mainPanel);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(new PanelControl(), BorderLayout.CENTER);
        mainPanel.add(signInLabel);
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black,3));

        signInLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));


        mainText = new JLabel("Bank of Rankov");
        mainText.setForeground(new Color(0x0077ff));
        mainText.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(mainText, BorderLayout.LINE_START);
    }

}
