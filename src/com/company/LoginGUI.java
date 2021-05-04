package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {

    //this is the structure that is inside of the frame created
    private JPanel panel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel logged;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton button;

    public LoginGUI() {

        //title of the window
        super("OOP CA3");

        panel = new JPanel();
        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        add(userLabel);

        userText = new JTextField(10);
        userText.setBounds(100, 20, 165, 25);
        add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        add(passwordLabel);

        passwordText = new JPasswordField(10);
        passwordText.setBounds(100, 50, 165, 25);
        add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 100, 80, 25);
        //setting action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String user = userText.getText();
                String password = passwordText.getText();
                System.out.println(user + ", " + password);

                if (user.equals("Luana") && password.equals("luana12345"))  {

                    logged.setText("Login Successful!");

                }else {
                    JOptionPane.showMessageDialog(logged, "Wrong User or Password");
                }

            }
        });
        add(button);

        logged = new JLabel("");
        logged.setBounds(10, 110, 300, 25);
        add(logged);


    }

}
