package Shorn.shorn2;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class Login implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JTextField field;
    JPasswordField pass;
    JButton button;
    Rectangle ann = new Rectangle(75,125,75,25);
    Connection con;
    PreparedStatement pst;

    public void connection(){
        try {
            con = DriverManager.getConnection(
                "jdbc:mysql:https://remotemysql.com/",
                "blUqVPKNsO",
                "jaoG4anq0g"
            );
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    public Login(){
        frame = new JFrame();
        frame.setBounds(0,0,800,500);
        frame.setTitle("Login form");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBounds(0,0,500,500);
        panel.setLayout(null);
        panel.setBackground(new Color(245,245,200));
        //panel.setBackground(Color.decode(""));

        label1 = new JLabel("Username:");
        label1.setBounds(25,25,100,25);
        label1.setFont(new Font("verdana",Font.BOLD,15));

        label2 = new JLabel("Password:");
        label2.setBounds(25,75,100,25);
        label2.setFont(new Font("verdana",Font.BOLD,15));

        field = new JTextField();
        field.setBounds(150,25,100,25);
        field.setFont(new Font("Open Sans",Font.PLAIN,12));

        pass = new JPasswordField();
        pass.setBounds(150,75,100,25);
        //pass.setFont(new Font("Open Sans",Font.PLAIN,12));

        button = new JButton("login");
        button.setBounds(ann);
        button.setFocusable(false);
        button.addActionListener(this);

        panel.add(field);
        panel.add(pass);
        panel.add(label1);
        panel.add(label2);
        panel.add(button);

        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            //JOptionPane.showMessageDialog(null,"hahahahaha", "hooray!", JOptionPane.INFORMATION_MESSAGE);
           
            String user = field.getText();
            char[] password = pass.getPassword();
            
            String query = "INSERT INTO `password`(`user`,`password`) VALUES (?,?)";
            try {
                con = DriverManager.getConnection("jdbc:mysql://remotemysql.com/blUqVPKNsO","blUqVPKNsO","jaoG4anq0g");
                //connection();
                pst = con.prepareStatement(query);
                pst.setString(1, user);
                pst.setString(2, password.toString());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null,"data posted successfully!", "hooray!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
                JOptionPane.showMessageDialog(null, e1);
            }
        }
    }
}
