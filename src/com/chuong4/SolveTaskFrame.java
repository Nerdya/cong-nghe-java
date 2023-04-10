package com.chuong4;

import javax.swing.*;

/**
 * @author cuongnk
 * @since 03/04/2023
 */
public class SolveTaskFrame extends JFrame {

  private JPanel mainPanel;
  private JTextField textField1;
  private JRadioButton factorizeRadio;
  private JRadioButton sumRadio;
  private JRadioButton primeNumberRadio;
  private JRadioButton perfectNumberRadio;
  private JTextField textField2;
  private JButton submitButton;
  private JButton continueButton;
  private JButton exitButton;

  public SolveTaskFrame() {
    setTitle("GIẢI QUYẾT CÔNG VIỆC");
    setSize(400, 225);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);
  }
}
