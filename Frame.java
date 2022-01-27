import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JTextField field;
    JButton button;
    
    public Frame(){
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("Nathan Learns to code");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Enter Number");
        label.setBounds(25,25,100,25);
        label.setForeground(Color.white);

        field = new JTextField();
        field.setBounds(125,25,75,25);
        //field.setFocusable(false);
        field.setFont(new Font("verdana",Font.PLAIN,15));
        field.setBackground(new Color(255,255,255));
        field.setForeground(new Color(0,0,0));

        button = new JButton("Submit");
        button.setBackground(new Color(245,245,245));
        button.setForeground(Color.GREEN);
        button.setBounds(50,55,75,25);
        button.setFont(new Font("calibri",Font.BOLD,12));
        button.setFocusable(false);
        button.addActionListener(this);


        panel = new JPanel();
        panel.setBounds(0,0,500,500);
        panel.setLayout(null);
        panel.setBackground(new Color(172,14,92));

        panel.add(label);
        panel.add(field);
        panel.add(button);
        
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void action(){
        System.out.println("Pressed");
        String input = field.getText();
        if(input.length()== 0){
            System.out.println("empty");
            JOptionPane.showMessageDialog( button, "Please input some text", "Warning", JOptionPane.WARNING_MESSAGE); 
        }else{
            System.out.println("something");
            JOptionPane.showMessageDialog( button, "you have entered "+input, "Success", JOptionPane.INFORMATION_MESSAGE); 
        }     
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
           action();
        }
        
    }
}
