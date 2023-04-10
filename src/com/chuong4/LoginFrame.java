package com.chuong4;

import com.testconnection.TestConnection;
import java.sql.*;
import javax.swing.*;

public class LoginFrame extends JFrame {

  private JPanel mainPanel;
  private JTextField usernameField;
  private JPasswordField passwordField;
  private JButton loginButton;
  private JButton clearButton;

  public LoginFrame() {
    setTitle("Nhập thông tin");
    setSize(400, 225);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);

    loginButton.addActionListener(e -> {
      String username = this.usernameField.getText();
      String password = new String(this.passwordField.getPassword());
      try {
        TestConnection testConnection = new TestConnection();
        Statement statement = testConnection.con.createStatement();
        String sql =
            "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password
                + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        if (!resultSet.wasNull()) {
          JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
          setVisible(false);
          SolveTaskFrame solveTaskFrame = new SolveTaskFrame();
          solveTaskFrame.setVisible(true);
        } else {
          JOptionPane.showMessageDialog(null, "Sai tên tài khoản hoặc mật khẩu!");
        }
      } catch (ClassNotFoundException | SQLException ex) {
        throw new RuntimeException(ex);
      }
    });
    clearButton.addActionListener(e -> {
      usernameField.setText("");
      passwordField.setText("");
    });
  }
}
