package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelControl extends JPanel implements ActionListener {

    Dimension buttonDimension = new Dimension(150,30);

    JLabel mainText;
    JLabel imageLogo;
    JLabel welcomeText;
    JPanel buttonRow;

    JTextField userName = new JTextField(1);
    JTextField password = new JTextField(1);

    //JButton signInButton = new JButton("Sign in");
    JButton createAccountButton = new JButton("Create account");

    ImageIcon logo = new ImageIcon("src/Images/Logo.png");

    public PanelControl()
    {
        configuratePanelControl();
    }

    public void configuratePanelControl()
    {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        mainTextLogic();
        logoLogic();
        welcomeTextLogic();
        inputTextFieldLogic();
        buttonSizes();
        inputTextFieldActionListener();
        buttonsActionListener();
        buttonDesign();
        buttonRowLogic();
    }

    public void mainTextLogic()
    {
        mainText = new JLabel("Bank of Rankov");
        mainText.setFont(FontPalette.MAIN_FONT);
        mainText.setForeground(ColorPalette.MAIN_COLOR);

        add(mainText, BorderLayout.CENTER);
    }

    public void welcomeTextLogic()
    {
        welcomeText = new JLabel("Welcome to the bank of Rankov");

        add(welcomeText, BorderLayout.CENTER);
    }

    public void logoLogic()
    {
        imageLogo = new JLabel();
        imageLogo.setIcon(logo);
        imageLogo.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLogo, BorderLayout.CENTER);

        logo.setDescription("This is the logo of my fictional banking company");
    }

    public void inputTextFieldLogic()
    {

        userName.setFont(FontPalette.READING_FONT);
        //userName.setText("Username");
        userName.setPreferredSize(buttonDimension);

        password.setFont(FontPalette.READING_FONT);

        add(userName);
        add(password);
    }

    public void buttonSizes()
    {
        //signInButton.setSize(buttonDimension);
        createAccountButton.setSize(buttonDimension);
    }

    public void buttonDesign()
    {
        //signInButton.setFont(FontPalette.READING_FONT);

        createAccountButton.setFont(FontPalette.READING_FONT);
    }

    public void buttonRowLogic()
    {
        buttonRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 30));
        //buttonRow.add(signInButton);
        buttonRow.add(createAccountButton);
        add(buttonRow);
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
        /*signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked");
            }
        });
         */

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
