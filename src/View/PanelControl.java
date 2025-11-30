package View;

import javax.swing.*;

public class PanelControl extends JPanel{

    JButton signInButton = new JButton("Sign in");

    public PanelControl()
    {
        configuratePanelControl();
    }

    public void configuratePanelControl()
    {
        add(signInButton);
    }

}
