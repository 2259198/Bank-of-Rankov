package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable {

    JPanel mainPanel = new JPanel();
    JPanel signInLabel = new JPanel();
    JPanel footerPanel = new JPanel();

    JLabel mainText;
    JLabel footerText;

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
        mainText = new JLabel("Bank of Rankov");
        footerText = new JLabel("© All rights reserved to Alexander Rankov 2025.");

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(signInLabel);
        mainPanel.add(footerPanel, BorderLayout.PAGE_END);


        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black,3));

        signInLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        signInLabel.add(mainText, BorderLayout.CENTER);
        signInLabel.add(new PanelControl(), BorderLayout.CENTER);

        footerPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        footerPanel.setPreferredSize(new Dimension(1920, 150));
        footerPanel.add(footerText);

        mainText.setForeground(new Color(0x0077ff));
        mainText.setHorizontalAlignment(SwingConstants.CENTER);

        footerText.setVerticalAlignment(SwingConstants.CENTER);
    }

}
