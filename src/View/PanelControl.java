package View;

import javax.swing.*;
import java.awt.*;

public class PanelControl extends JPanel{

    JButton signInButton = new JButton("Sign in");

    public PanelControl()
    {
        configuratePanelControl();
    }

    public void configuratePanelControl()
    {
        signInButton.setSize(new Dimension(150,30));
        add(signInButton);
    }

}
