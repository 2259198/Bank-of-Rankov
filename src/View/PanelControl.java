package View;

import Model.Model;

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
    JPanel textFieldRow;

    private MainFrame mainFrame;
    private JPanel createAccountPanel;
    private SignInPanelControl signInPanelControl;

    JTextField userName = new JTextField(1);
    JPasswordField password = new JPasswordField(1);

    JButton createAccountButton = new RoundedButton("Create account");

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
        inputTextFieldActionListener();
        buttonsActionListener();
        buttonDesignLogic();
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
        welcomeText = new JLabel("Welcome to the bank of Rankov !");
        welcomeText.setAlignmentX(Component.CENTER_ALIGNMENT);
        welcomeText.setBorder(new EmptyBorder(10,0,10,0));

        add(welcomeText, BorderLayout.CENTER);
    }

    public void logoLogic()
    {
        logo.setDescription("This is the logo of my fictional banking company");

        imageLogo = new JLabel();
        imageLogo.setIcon(logo);
        imageLogo.setHorizontalAlignment(SwingConstants.CENTER);
        imageLogo.setVerticalAlignment(SwingConstants.CENTER);
        imageLogo.setAlignmentX(Component.CENTER_ALIGNMENT);

        imageLogo.setPreferredSize(new Dimension(420, 420));
        add(imageLogo, BorderLayout.CENTER);
    }

    public void inputTextFieldLogic()
    {

        userName.setFont(FontPalette.READING_FONT);
        userName.setPreferredSize(buttonDimension);
        userName.setForeground(ColorPalette.MAIN_COLOR);
        userName.setToolTipText("Enter your username");
        userName.setMargin(new Insets(5,10,5,10));

        password.setFont(FontPalette.READING_FONT);
        password.setPreferredSize(buttonDimension);
        password.setToolTipText("Create your password");
        password.setEchoChar('*');

        textFieldRow = new JPanel();
        textFieldRow.setLayout(new BoxLayout(textFieldRow, BoxLayout.Y_AXIS));

        textFieldRow.add(userName);
        textFieldRow.add(password);
        add(textFieldRow);
    }

    public void buttonDesignLogic()
    {
        createAccountButton.setSize(buttonDimension);
        createAccountButton.setFont(FontPalette.READING_FONT);
        createAccountButton.setBackground(ColorPalette.MAIN_COLOR);
        createAccountButton.setForeground(ColorPalette.SECONDARY_COLOR);
        createAccountButton.setMargin(new Insets(15,15,15,15));

        createAccountButton.setBorderPainted(false);

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

                String user = userName.getText();
                String pass = password.getText();

                if(user.isEmpty() || pass.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Nothing has been entered, please enter something");
                    return;
                }

                Model model = Model.getInstance();

                if (model.userExists(user)) {
                    JOptionPane.showMessageDialog(null,"Sorry, this username already exits. Please try another one.");
                }
                else {
                    model.ajouterUtilisateur(user, pass);
                    System.out.println("Your account was created with success");

                    userName.setText("");
                    password.setText("");

                    model.printAllUsers();
                }

                createAccountPanel.setVisible(false);
                signInPanelControl.setVisible(true);
                signInPanelControl.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
