package com.chuong4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginForm {

  private JPanel panelMain;
  private JTextField textField1;
  private JPasswordField passwordField1;
  private JButton OKButton;

  public LoginForm() {
    OKButton.addActionListener(e -> {
      String username = textField1.getText();
      String password = new String(passwordField1.getPassword());
      if (username.toLowerCase().equals("admin") && password.toLowerCase().equals("uneti")) {
        JOptionPane.showMessageDialog(null, "Login successful!");
      } else {
        JOptionPane.showMessageDialog(null, "Wrong username or password!");
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("LoginForm");
    frame.setContentPane(new LoginForm().panelMain);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(800, 450);
    frame.setVisible(true);
  }
}
