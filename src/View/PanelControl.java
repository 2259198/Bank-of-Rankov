package View;

import javax.swing.*;
import java.awt.*;

public class PanelControl extends JPanel{

    JLabel imageLogo;

    JButton signInButton = new JButton("Sign in");
    JButton createAccountButton = new JButton("Create account");

    ImageIcon logo = new ImageIcon("src/Images/Logo.png");

    public PanelControl()
    {
        configuratePanelControl();
    }

    public void configuratePanelControl()
    {
        signInButton.setSize(new Dimension(150,30));
        createAccountButton.setSize(new Dimension(150, 30));
        signInButton.setHorizontalAlignment(JLabel.CENTER);
        logo.setDescription("This is the logo of my fictional banking company");

        imageLogo = new JLabel();
        imageLogo.setIcon(logo);
        //imageLogo.setPreferredSize(new Dimension(150, 150));

        add(imageLogo);
        add(signInButton);
        add(createAccountButton);
    }

}
