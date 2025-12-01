package View;

import javax.swing.*;
import java.awt.*;

public class PanelControl extends JPanel{

    JLabel imageLogo;
    JLabel welcomeText;

    JButton signInButton = new JButton("Sign in");
    JButton createAccountButton = new JButton("Create account");

    ImageIcon logo = new ImageIcon("src/Images/Logo.png");

    public PanelControl()
    {
        configuratePanelControl();
    }

    public void configuratePanelControl()
    {
        buttonSizes();

        welcomeText = new JLabel("Welcome to the bank of Rankov");

        signInButton.setHorizontalAlignment(JLabel.CENTER);
        logo.setDescription("This is the logo of my fictional banking company");

        signInButton.setFont(FontPalette.READING_FONT);
        createAccountButton.setFont(FontPalette.READING_FONT);

        imageLogo = new JLabel();
        imageLogo.setIcon(logo);
        //imageLogo.setPreferredSize(new Dimension(150, 150));

        add(imageLogo);
        add(welcomeText);
        add(signInButton);
        add(createAccountButton);
    }

    public void buttonSizes()
    {
        signInButton.setSize(new Dimension(150,30));
        createAccountButton.setSize(new Dimension(150, 30));
    }

}
