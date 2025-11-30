package View;

import javax.swing.*;
import java.awt.*;

public class PanelControl extends JPanel{

    JButton signInButton = new JButton("Sign in");
    JButton createAccountButton = new JButton("Create account");

    public PanelControl()
    {
        configuratePanelControl();
    }

    public void configuratePanelControl()
    {
        signInButton.setSize(new Dimension(150,30));
        createAccountButton.setSize(new Dimension(150, 30));
        signInButton.setHorizontalAlignment(JLabel.CENTER);
        add(signInButton);
        add(createAccountButton);
    }

}
