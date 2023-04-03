package com.chuong4;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
  public JPanel panelMain;
  public JTextField tfUsername;
  public JPasswordField tfPassword;
  public JButton btnLogin;
  private JButton btnClear;

  public Login() {
    btnLogin.addActionListener(e -> {
      String username = this.tfUsername.getText();
      String password = new String(this.tfPassword.getPassword());
      if (username.equals("cnttuneti") && password.equals("123456")) {
        JOptionPane.showMessageDialog(null, "Login successful!");
      } else {
        JOptionPane.showMessageDialog(null, "Wrong username or password!");
      }
    });
    btnClear.addActionListener(e -> {
      JFrame frame = new JFrame();
    });
  }
}
