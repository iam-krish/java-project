import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Login {
    JFrame jFrame = null;

    JTextField txtuname = null;
    JTextField txtpsw = null;
    JButton login = null;

    Login() {
        jFrame = new JFrame("Login Window");
        JPanel panel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JPanel parentPanel = new JPanel();

        JLabel lbluname = new JLabel("Username");
        JLabel lblpsw = new JLabel("Password");

        txtuname = new JTextField(10);
        txtpsw = new JTextField(10);

        login = new JButton("Login");

        GridLayout gl = new GridLayout(2, 2, 10, 10);

        panel.setLayout(gl);
        panel.add(lbluname);
        panel.add(txtuname);
        panel.add(lblpsw);
        panel.add(txtpsw);
        buttonPanel.add(login);

        parentPanel.add(panel);
        parentPanel.add(buttonPanel);
        jFrame.add(parentPanel);

        jFrame.setSize(300, 150);
        jFrame.setVisible(true);

        login.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                String username = "kri";
                String password = "sadi";

                String uname = txtuname.getText().toString() ;
                String psw = txtpsw.getText().toString() ;
               
                if (username.equals(uname) && password.equals(psw)) {
                    System.out.println("Username and password matched " );
                } else {
                    System.out.println("Incorrect` ");
                }
        
            }
        });

    }
}
