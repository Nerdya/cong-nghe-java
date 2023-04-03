package com.chuong4;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author cuongnk
 * @since 03/04/2023
 */
public class ComboboxList {

  private JComboBox comboBox1;
  private JPanel panel1;

  public ComboboxList() {

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Combobox List");
    frame.setContentPane(new ComboboxList().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(800, 450);
    frame.setVisible(true);
  }
}
