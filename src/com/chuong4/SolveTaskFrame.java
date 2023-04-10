package com.chuong4;

import javax.swing.*;

/**
 * @author cuongnk
 * @since 03/04/2023
 */
public class SolveTaskFrame extends JFrame {

  private JPanel mainPanel;

  public SolveTaskFrame() {
    setTitle("GIẢI QUYẾT CÔNG VIỆC");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setLocationRelativeTo(null);
    setContentPane(mainPanel);
    pack();
    setSize(400, 225);
  }
}
