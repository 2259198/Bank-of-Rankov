package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable {


    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    JPanel mainPanel = new JPanel();
    JPanel createAccountPanel = new JPanel();
    JPanel signInAccountPanel = new JPanel();
    JPanel footerPanel = new JPanel(new GridBagLayout());


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

        fontsLogic();
        borderIdentification();
        mainPanel();
        signInPanel();
        footerPanel();
    }

    public void fontsLogic()
    {
        footerText = new JLabel("© All rights reserved to Alexander Rankov 2025.");
        footerText.setFont(FontPalette.FOOTER_FONT);
        footerText.setVerticalAlignment(SwingConstants.CENTER);
        footerText.setForeground(ColorPalette.SECONDARY_COLOR);
    }

    public void borderIdentification()
    {
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black,3));
        createAccountPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        signInAccountPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
        footerPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
    }

    public void mainPanel()
    {
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(createAccountPanel);
        mainPanel.add(footerPanel, BorderLayout.PAGE_END);
        mainPanel.setBackground(ColorPalette.SECONDARY_COLOR);
    }

    public void signInPanel()
    {
        createAccountPanel.add(new PanelControl(this, createAccountPanel), BorderLayout.CENTER);
    }

    public void footerPanel()
    {
        footerPanel.setPreferredSize(new Dimension(screenSize.width, 100));
        footerPanel.setBackground(ColorPalette.MAIN_COLOR);
        footerPanel.add(footerText);
    }

}
