import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame window;
    JPanel titleNamePanel, startButtonPanel, loginPanel;
    JLabel titleNameLabel, usernameLabel, passwordLabel, messageLabel;
    JButton startButton;
    JTextField usernameField;
    JPasswordField passwordField;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font buttonFont = new Font("Times New Roman", Font.PLAIN, 40);
    Font messageFont = new Font("Times New Roman", Font.PLAIN, 30);
    Font loginFont = new Font("Times New Roman", Font.PLAIN, 20);
    String loginUsername = "admin";
    String loginPassword = "password";
    public void createUI(){
        //window
        window = new JFrame();
        window.setSize(1360, 768);
        window.setTitle("Library Management System");
        window.setResizable(false);
        //window.getContentPane().setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setVisible(true);

        //title panel
        titleNameLabel = new JLabel("Library Management System");
        titleNameLabel.setFont(titleFont);
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(280, 189, 800, 80);
        titleNamePanel.add(titleNameLabel);

        //login panel
        loginPanel = new JPanel();
        loginPanel.setBounds(500, 300, 400, 150);
        loginPanel.setBackground(Color.white);
        loginPanel.setLayout(new GridLayout(4, 1));

        // Username label & field
        usernameLabel = new JLabel(" Username");
        usernameLabel.setForeground(Color.black);
        usernameLabel.setFont(loginFont);
        usernameField = new JTextField(10);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        // Password field
        passwordLabel = new JLabel(" Password");
        passwordLabel.setForeground(Color.black);
        passwordLabel.setFont(loginFont);
        passwordField = new JPasswordField();
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        //start button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(500, 459, 400, 100); //last x 580, 400 width
        startButton = new JButton("Login");
        startButton.setPreferredSize(new Dimension(400, 50));
        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.white);
        startButton.setFont(buttonFont);
        startButton.setFocusPainted(false);
        startButtonPanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);
        window.add(loginPanel);
        window.setVisible(true);
    }
}
