package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable {


    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    JPanel mainPanel = new JPanel();
    JPanel signInLabel = new JPanel();
    JPanel footerPanel = new JPanel(new GridBagLayout());

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

        fontsLogic();
        borderIdentification();
        mainPanel();
        signInPanel();
        footerPanel();
    }

    public void fontsLogic()
    {
        mainText.setFont(FontPalette.MAIN_FONT);
        mainText.setForeground(ColorPalette.MAIN_COLOR);
        mainText.setHorizontalAlignment(SwingConstants.CENTER);

        footerText.setFont(FontPalette.FOOTER_FONT);
        footerText.setVerticalAlignment(SwingConstants.CENTER);
        footerText.setForeground(ColorPalette.SECONDARY_COLOR);
    }

    public void borderIdentification()
    {
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black,3));
        signInLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        footerPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
    }

    public void mainPanel()
    {
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(signInLabel);
        mainPanel.add(footerPanel, BorderLayout.PAGE_END);
        mainPanel.setBackground(ColorPalette.SECONDARY_COLOR);
    }

    public void signInPanel()
    {
        signInLabel.add(mainText, BorderLayout.CENTER);
        signInLabel.add(new PanelControl(), BorderLayout.CENTER);
    }

    public void footerPanel()
    {
        footerPanel.setPreferredSize(new Dimension(screenSize.width, 100));
        footerPanel.setBackground(ColorPalette.MAIN_COLOR);
        footerPanel.add(footerText);
    }

}
