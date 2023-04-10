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
        boolean found = false;
        TestConnection testConnection = new TestConnection();
        Statement statement = testConnection.con.createStatement();
        String sql =
            "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password
                + "'";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
          if (!resultSet.wasNull()) {
            found = true;
            break;
          }
          System.out.println(resultSet.wasNull());
        }

        if (found) {
          System.out.println(resultSet);
          setVisible(false);
          SolveTaskFrame solveTaskFrame = new SolveTaskFrame();
          solveTaskFrame.setVisible(true);
        } else {
          JOptionPane.showMessageDialog(null, "Wrong username or password!");
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
