/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author Dsouza
 */
public class RetrieveJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RetrieveJPanel
     */
   Employee employee;
    EmployeeHistory history;
    
    public RetrieveJPanel(EmployeeHistory history) {
        initComponents();
      //  this.employee = employee;
        this.history = history;
      //  displayEmployee();
      populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartdate = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblPositiontitle = new javax.swing.JLabel();
        lblStartdate = new javax.swing.JLabel();
        txtPositiontitle = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        lblView = new javax.swing.JButton();
        lblDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblLabel = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Retrieve Employee Data");

        lblName.setText("Name: ");

        lblEmployeeID.setText("EmployeeID");

        lblAge.setText("Age: ");

        lblGender.setText("Gender:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblLevel.setText("Level");

        lblPositiontitle.setText("Position Title");

        lblStartdate.setText("Start Date");

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Contact Info", "Photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        lblView.setText("View");
        lblView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblViewActionPerformed(evt);
            }
        });

        lblDelete.setText("Delete");
        lblDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblLabel.setText("Search");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPositiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblStartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(200, 200, 200)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPositiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearch)
                                        .addGap(199, 199, 199)
                                        .addComponent(lblView)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDelete)))))))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblView)
                    .addComponent(btnUpdate)
                    .addComponent(lblDelete)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLabel)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeID)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositiontitle)
                    .addComponent(txtPositiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStartdate)
                    .addComponent(txtStartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void lblViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblViewActionPerformed
        // TODO add your handling code here:
        int selecredrowIndex =  tblEmployees.getSelectedRow();
        if(selecredrowIndex < 0)
      {
          JOptionPane.showMessageDialog(this,"Please select a row to view"); 
          
      }else{
          DefaultTableModel model = (DefaultTableModel)tblEmployees.getModel(); 
          //model.removeRow(selecredrowIndex);
           Employee selectedEmp = (Employee)model.getValueAt(selecredrowIndex, 0);
        
           txtName.setText(selectedEmp.getName());
           txtEmployeeID.setText(String.valueOf(selectedEmp.getEmployeeID()));
            txtAge.setText(String.valueOf(selectedEmp.getAge()));
           txtGender.setText(selectedEmp.getGender());
           txtStartdate.setText(selectedEmp.getStartdate());
            
           txtPositiontitle.setText(selectedEmp.getPositiontitle());
           //   txt.setText(selectedEmp.getName());
               
                txtName.setText(selectedEmp.getName());
                 txtName.setText(selectedEmp.getName());
        }
           
        
    }//GEN-LAST:event_lblViewActionPerformed

    private void lblDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDeleteActionPerformed
        // TODO add your handling code here:
        
      int selecredrowIndex =  tblEmployees.getSelectedRow();
      if(selecredrowIndex < 0)
      {
          JOptionPane.showMessageDialog(this,"Please select a row to delete"); 
          return;
      }else{
          DefaultTableModel model = (DefaultTableModel)tblEmployees.getModel(); 
          //model.removeRow(selecredrowIndex);
           Employee selectedEmp = (Employee)model.getValueAt(selecredrowIndex, 0);
        
       history.deleteEmployee(selectedEmp);
        JOptionPane.showMessageDialog(this,"Employee deleted");   
   
        populateTable();
          
      }
        
    }//GEN-LAST:event_lblDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         int selectedrowIndex =  tblEmployees.getSelectedRow();
        if(selectedrowIndex < 0)
      {
          JOptionPane.showMessageDialog(this,"Please select a row to update"); 
          
      }else{
             DefaultTableModel model = (DefaultTableModel)tblEmployees.getModel(); 
          //model.removeRow(selecredrowIndex);
           //Employee selectedEmp = (Employee)model.getValueAt(selecredrowIndex, 0);
          //call addnewemp method
        
           Employee emp = new Employee();
               String name = txtName.getText();
        int EmpId = Integer.parseInt(txtEmployeeID.getText());
        int age = Integer.parseInt(txtAge.getText());
      String gender = txtGender.getText();
      String level = txtLevel.getText();
              String startdate = txtStartdate.getText();
              String position = txtPositiontitle.getText();
        //employee.setGender(txtGender.getText());
      
       
           emp.setName(name);
        emp.setEmployeeID(EmpId);
        emp.setAge(age);
         emp.setGender(gender);
         emp.setLevel(level);
         emp.setStartdate(startdate);
        emp.setPositiontitle(position);
         
         // Employee updatedEmp = (Employee)model.setValueAt(age, age, age)
         
       model.setValueAt( name, selectedrowIndex,0);
           model.setValueAt( EmpId, selectedrowIndex,1);
           model.setValueAt( age, selectedrowIndex,3);
               model.setValueAt( gender, selectedrowIndex,4);
                   model.setValueAt( level, selectedrowIndex,5);
                       model.setValueAt( startdate, selectedrowIndex,6);
                           model.setValueAt( position, selectedrowIndex,7);
                       
        
         Employee newdata = history.updateEmployee(selectedrowIndex,emp);
//           newdata.setName(name);
//        newdata.setEmployeeID(EmpId);
//        newdata.setAge(age);
//         newdata.setGender(gender);
//         newdata.setLevel(level);
//         newdata.setStartdate(startdate);
//        newdata.setPositiontitle(position);
         
        JOptionPane.showMessageDialog(this, "Employee Information Updated.");
          populateTable();
          
       txtName.setText("");
        txtEmployeeID.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtLevel.setText("");
        txtPositiontitle.setText("");
          txtStartdate.setText("");
        
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        
       // String tf = txtSearch.getText();
        
     //   String query = 
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String s = txtSearch.getText();
        ArrayList<Employee> list = new ArrayList<Employee>();
      list =  history.searchFor(s);
      
         DefaultTableModel model = (DefaultTableModel)tblEmployees.getModel(); 
         
         int rowCount = model.getRowCount();
         for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}
        // model.setRowCount(0);
     //   String cols[] = {"Name","EmployeeID","Age","Gender","Level"};
       //tblEmployees.setModel(new DefaultTableModel(cols, list.size()));
       
       //DefaultTableModel newmodel = new DefaultTableModel();
      for(Employee ee : list)
      {
     
           
        model.addRow(new Object[] {ee.getName(),ee.getEmployeeID(),ee.getAge(),ee.getGender(),ee.getLevel(),ee.getStartdate(),
           // ee.getTeamInfo(),ee.getPositionTitle(),ee.getContact(),ee.getEmailAddress(), ee.getFileName()
        });
           //newmodel.addRow(ee);
         // }
         
      }
      
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JButton lblDelete;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLabel;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPositiontitle;
    private javax.swing.JLabel lblStartdate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton lblView;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositiontitle;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStartdate;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
      
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel(); 
        model.setRowCount(0);  // delete empty record
        
        for (Employee emp : history.getHistory())
        {
            Object[] row = new Object[8];
           // row[0] = emp.getName();
           row[0] = emp;
            row[1] = emp.getEmployeeID();
            row[2] = emp.getAge();
            row[3] = emp.getGender();
            row[4] = emp.getStartdate();
            row[5] = emp.getLevel();
           // row[6] = emp.getTeamInfo();
            row[7] = emp.getPositiontitle();
           // row[8] = emp.getContactInfo();
           //row[9] = emp.getPhoto();
            
           model.addRow(row);
        }
    }

   // private void displayEmployee() {
   //     txtName.setText(employee.getName());
   //   //  txtEmployeeID.setText(employee.getEmployeeID());
  //    txtGender.setText(employee.getGender());
  //   // txtAge.setText(employee.getAge());
   // }
}
