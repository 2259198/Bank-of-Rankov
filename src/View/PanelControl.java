package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelControl extends JPanel implements ActionListener {

    JLabel mainText;
    JLabel imageLogo;
    JLabel welcomeText;
    JPanel buttonRow;


    JTextField userName = new JTextField(5);
    JTextField password = new JTextField(5);


    JButton signInButton = new JButton("Sign in");
    JButton createAccountButton = new JButton("Create account");

    ImageIcon logo = new ImageIcon("src/Images/Logo.png");

    public PanelControl()
    {
        configuratePanelControl();
    }

    public void configuratePanelControl()
    {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        buttonSizes();

        mainText = new JLabel("Bank of Rankov");
        mainText.setFont(FontPalette.MAIN_FONT);
        mainText.setForeground(ColorPalette.MAIN_COLOR);
        mainText.setHorizontalAlignment(SwingConstants.CENTER);

        add(mainText, BorderLayout.CENTER);

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
        add(userName);
        add(password);

        buttonRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        buttonRow.add(signInButton);
        buttonRow.add(createAccountButton);

        add(buttonRow);

        inputTextFieldActionListener();
        buttonsActionListener();
    }

    public void buttonSizes()
    {
        signInButton.setSize(new Dimension(150,30));
        createAccountButton.setSize(new Dimension(150, 30));
    }

    public void inputTextFieldActionListener()
    {
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
    }

    public void buttonsActionListener()
    {
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked");
            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked 2.0");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
