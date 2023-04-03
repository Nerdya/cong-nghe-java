package com.chuong4;

import java.awt.*;
import javax.swing.*;

/**
 * @author cuongnk
 * @since 03/04/2023
 */
public class ComboboxList extends JFrame {

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
