package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelControl extends JPanel implements ActionListener {

    Dimension buttonDimension = new Dimension(150,30);

    JLabel mainText;
    JLabel imageLogo;
    JLabel welcomeText;
    JPanel buttonRow;

    private MainFrame mainFrame;
    private JPanel createAccountPanel;

    JTextField userName = new JTextField(1);
    JTextField password = new JTextField(1);

    //JButton signInButton = new JButton("Sign in");
    JButton createAccountButton = new JButton("Create account");

    ImageIcon logo = new ImageIcon("src/Images/Logo.png");

    public PanelControl(MainFrame mainFrame, JPanel createAccountPanel)
    {
        this.mainFrame = mainFrame;
        this.createAccountPanel = createAccountPanel;
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
        mainText.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainText.setBorder(new EmptyBorder(10,0,10,0));

        add(mainText);
    }

    public void welcomeTextLogic()
    {
        welcomeText = new JLabel("Welcome to the bank of Rankov");
        welcomeText.setAlignmentX(Component.CENTER_ALIGNMENT);
        welcomeText.setBorder(new EmptyBorder(10,0,10,0));

        add(welcomeText, BorderLayout.CENTER);
    }

    public void logoLogic()
    {
        logo.setDescription("This is the logo of my fictional banking company");

        imageLogo = new JLabel();
        imageLogo.setIcon(logo);
        imageLogo.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(imageLogo, BorderLayout.CENTER);
    }

    public void inputTextFieldLogic()
    {

        userName.setFont(FontPalette.READING_FONT);
        userName.setPreferredSize(buttonDimension);

        password.setFont(FontPalette.READING_FONT);

        add(userName);
        add(password);
    }

    public void buttonSizes()
    {
        createAccountButton.setSize(buttonDimension);
    }

    public void buttonDesign()
    {
        createAccountButton.setFont(FontPalette.READING_FONT);
    }

    public void buttonRowLogic()
    {
        buttonRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 30));
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

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAccountPanel.setVisible(false);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
