package com.chuong4;

import javax.swing.JFrame;

/**
 * @author cuongnk
 * @since 03/04/2023
 */
public class De1Cau2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Login");
    frame.setContentPane(new Login().panelMain);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(400, 225);
    frame.setVisible(true);
  }
}
