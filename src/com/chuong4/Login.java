package com.chuong4;

import javax.swing.*;

public class Login {

  public JPanel panelMain;
  public JTextField textField1;
  public JPasswordField passwordField1;
  public JButton OKButton;

  public Login() {
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
}
