package com.chuong4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author cuongnk
 * @since 17/04/2023
 */
public class StudentManagerFrame extends JFrame {

  private JPanel mainPanel;
  private JTextField textField1;
  private JTextField textField2;
  private JTextField textField3;
  private JButton getDataButton;
  private JButton deleteButton;
  private JButton updateButton;
  private JButton exitButton;
  private JButton addButton;
  private JTable table1;

  public StudentManagerFrame() {
    // create a table model
    String[] columnNames = {"Name", "Age", "Gender"};
    Object[][] data = {
        {"John", 30, "Male"},
        {"Mary", 25, "Female"},
        {"Peter", 40, "Male"},
        {"Jane", 35, "Female"}
    };
    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    table1.setModel(model);

    setTitle("Student Manager");
    setSize(800, 450);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);

    addButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String name = textField1.getText();
        int age = Integer.parseInt(textField2.getText());
        String gender = textField3.getText();
        Object[] row = {name, age, gender};
        model.addRow(row);
      }
    });

    updateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow != -1) {
          String name = textField1.getText();
          int age = Integer.parseInt(textField2.getText());
          String gender = textField3.getText();
          Object[] row = {name, age, gender};
          model.setValueAt(name, selectedRow, 0);
          model.setValueAt(age, selectedRow, 1);
          model.setValueAt(gender, selectedRow, 2);
        }
      }
    });

    deleteButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int[] selectedRows = table1.getSelectedRows();
        for (int i = selectedRows.length - 1; i >= 0; i--) {
          model.removeRow(selectedRows[i]);
        }
      }
    });

    exitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
  }
}
