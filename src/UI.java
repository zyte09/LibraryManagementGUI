import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    JFrame window;
    JPanel titleNamePanel, startButtonPanel, loginPanel;
    JLabel titleNameLabel, usernameLabel, passwordLabel;
    JButton startButton;
    JTextField usernameField;
    JPasswordField passwordField;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font buttonFont = new Font("Arial", Font.BOLD, 20);
    Font loginFont = new Font("Times New Roman", Font.PLAIN, 20);
    Font loginTextField = new Font("Times New Roman", Font.PLAIN, 25);
    String loginUsername = "admin";
    String loginPassword = "password";
    public void createUI(){
        //window
        window = new JFrame();
        window.setSize(1360, 768);
        window.setTitle("Library Management System");
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        //title panel
        titleNameLabel = new JLabel();
        titleNameLabel.setText("Library Management System");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(280, 189, 800, 80);
        titleNamePanel.add(titleNameLabel);

        //login panel
        loginPanel = new JPanel();
        loginPanel.setBounds(480, 300, 400, 150);
        loginPanel.setPreferredSize(new Dimension(300, 100));
        loginPanel.setLayout(new GridLayout(4, 1));

        //username label & field
        usernameLabel = new JLabel(" Username");
        usernameLabel.setForeground(Color.white);
        usernameLabel.setFont(loginFont);
        usernameField = new JTextField(10);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        usernameField.setFont(loginTextField);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        //password field
        passwordLabel = new JLabel(" Password");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setFont(loginFont);
        passwordField = new JPasswordField();
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        passwordField.setFont(loginTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        //start button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(480, 450, 400, 60); //last x 580, 400 width
        startButton = new JButton("Log in");
        startButton.setPreferredSize(new Dimension(400, 50));
        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.white);
        startButton.setFont(buttonFont);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals(loginUsername) && password.equals(loginPassword)) {
                    //login message
                    JOptionPane.showMessageDialog(window, "Login successful!");
                } else {
                    //error message
                    JOptionPane.showMessageDialog(window, "Invalid username or password");
                }
            }
        });

        startButtonPanel.add(startButton);
        window.add(titleNamePanel);
        window.add(startButtonPanel);
        window.add(loginPanel);
        window.setVisible(true);
    }
}