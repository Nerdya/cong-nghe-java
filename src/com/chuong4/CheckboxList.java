package com.chuong4;

import java.awt.*;
import javax.swing.*;

public class CheckboxList extends JPanel {
  private JPanel panel1;
  private JCheckBox checkBox1CheckBox;
  private JCheckBox cb2;
  private JCheckBox cb3;
  private JCheckBox cb4;
  private JCheckBox cb5;
  private JCheckBox cb6;
  private JCheckBox cb7;
  private JCheckBox cb8;

  public CheckboxList() {
    int i = 1;
    for (Component comp : panel1.getComponents()) {
      if (comp instanceof JCheckBox) {
        JCheckBox checkBox = (JCheckBox) comp;
        checkBox.setText("Checkbox" + i);
        checkBox.addActionListener(e -> {
          if (checkBox.isSelected()) {
            JOptionPane.showMessageDialog(null, checkBox.getText());
          }
        });
        i++;
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Checkbox List");
    frame.setContentPane(new CheckboxList().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(800, 450);
    frame.setVisible(true);
  }
}
