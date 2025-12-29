package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInPanelControl extends JPanel {

    JTextField username = new JTextField();
    JTextField passwordConfirmation = new JTextField();

    JButton signInButton = new JButton("Sign in");

    public SignInPanelControl()
    {
        configurateSignInControlPanel();
    }

    public void configurateSignInControlPanel()
    {
        username.setFont(FontPalette.READING_FONT);
        passwordConfirmation.setFont(FontPalette.READING_FONT);

        signInButton.setPreferredSize(new Dimension(150,30));
        signInButton.setFont(FontPalette.READING_FONT);

        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");
            }
        });

        add(username);
        add(passwordConfirmation);
    }

}
