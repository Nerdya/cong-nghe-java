package com.chuong4;

import javax.swing.*;

public class LoginFrame extends JFrame {
  private JPanel mainPanel;
  private JTextField usernameField;
  private JPasswordField passwordField;
  private JButton loginButton;
  private JButton clearButton;

  public LoginFrame() {
    setTitle("Nhập thông tin");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setLocationRelativeTo(null);
    setContentPane(mainPanel);
    pack();
    setSize(400, 225);

    loginButton.addActionListener(e -> {
      String username = this.usernameField.getText();
      String password = new String(this.passwordField.getPassword());
      if (username.equals("cnttuneti") && password.equals("123456")) {
        setVisible(false);
        SolveTaskFrame solveTaskFrame = new SolveTaskFrame();
        solveTaskFrame.setVisible(true);
      } else {
        JOptionPane.showMessageDialog(null, "Wrong username or password!");
      }
    });
    clearButton.addActionListener(e -> {

    });
  }
}
