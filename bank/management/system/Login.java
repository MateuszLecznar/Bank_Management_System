package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        //Icon
        setTitle("Automated Teller Machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 200, 200);
        add(label);


        JLabel text = new JLabel("Welcom to ATM");
        text.setBounds(280, 90, 400, 60);
        text.setFont(new Font("Osward", Font.BOLD, 29));
        add(text);

        //Insert Data

        //Card number area
        JLabel cardno = new JLabel("Card No.");
        cardno.setBounds(150, 200, 250, 60);
        cardno.setFont(new Font("Osward", Font.BOLD, 25));
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 215, 250, 30);
        add(cardTextField);


        //Pin area
        JLabel pin = new JLabel("PIN");
        pin.setBounds(150, 260, 250, 60);
        pin.setFont(new Font("Osward", Font.BOLD, 25));
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 275, 250, 30);
        add(pinTextField);


        //Buttons
        login = new JButton("SIGN IN");
        login.setBounds(300, 330, 100, 30);
        login.setBackground(Color.ORANGE);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        //Clear
        clear = new JButton("CLEAR");
        clear.setBounds(450, 330, 100, 30);
        clear.setBackground(Color.ORANGE);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);

        //SignUp
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 370, 250, 30);
        signup.setBackground(Color.ORANGE);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(null);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {

        } else if (ae.getSource() == signup) {

        }

    }


    public static void main(String args[]) {
        new Login();

    }

}

