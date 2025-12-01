package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelControl extends JPanel implements ActionListener {

    JLabel imageLogo;
    JLabel welcomeText;


    JTextField userName = new JTextField(10);
    JTextField password = new JTextField(10);


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

        userName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = userName.getText();
                System.out.println("The user entered : " + input);
            }
        });

        password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String input = password.getText();
                System.out.println("The username's password is : " + input);
            }
    });

        add(imageLogo);
        add(welcomeText);
        add(userName);
        add(password);
        add(signInButton);
        add(createAccountButton);
    }

    public void buttonSizes()
    {
        signInButton.setSize(new Dimension(150,30));
        createAccountButton.setSize(new Dimension(150, 30));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
