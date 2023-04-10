package com.testconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

  public final Connection con;

  public TestConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver"); // nap trinh dieu khien
    con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/userinfo", "root", "1qazXSW@2020");
    // thuc hien ket noi
  }

  public ResultSet GetData(String tableName) throws SQLException {
    ResultSet kq;
    Statement statement = this.con.createStatement();
    String sql = "SELECT * FROM " + tableName;
    kq = statement.executeQuery(sql);
    return kq;
  }

  public void Update(String tableName, int id, String username, String password)
      throws SQLException {
    Statement sta = this.con.createStatement();
    String sql1 = "UPDATE " + tableName + " SET username ='" + username + "' WHERE ID =" + id + "";
    String sql2 = "UPDATE user SET password ='" + password + "' WHERE ID =" + id + "";
    sta.executeUpdate(sql1);
    sta.executeUpdate(sql2);
  }

  public void Insert(String tableName, int id, String username, String password)
      throws SQLException {
    Statement sta = this.con.createStatement();
    String sql1 =
        "INSERT " + tableName + " VALUES(" + id + ", '" + username + "', '" + password + "') ";
    sta.executeUpdate(sql1);
  }

  public void Delete(String tableName, int id) throws SQLException {
    Statement sta = this.con.createStatement();
    String sql = "DELETE " + tableName + " WHERE ID = " + id;
    sta.executeUpdate(sql);
  }

  public void Close() throws SQLException {
    if (this.con != null) {
      this.con.close();
    }
  }
}