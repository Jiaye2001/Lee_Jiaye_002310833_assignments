/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author jiaye
 */
public class ManagePersonsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    /**
     * Creates new form ManagePersonsJPanel
     */
    public ManagePersonsJPanel(JPanel container, PersonDirectory directory) {
        initComponents();
        
        userProcessContainer = container;
        personDirectory = directory;
        
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersons = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        txt_searchbox = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Person Profile");

        btnBack.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First name", "Last name", "Home_city", "Home_zip code", "Work_city", "Work_zip code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersons);

        btnSearch.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewDetails.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDeletePerson.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        btnDeletePerson.setText("Delete Person");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        txt_searchbox.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        txt_searchbox.setForeground(new java.awt.Color(153, 153, 153));
        txt_searchbox.setText("Type first_name, last_name or street address");
        txt_searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeletePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(txt_searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeletePerson, btnSearch, btnViewDetails});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txt_searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletePerson)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblPersons.getSelectedRow();
        
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected person?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Person selectedPerson = (Person) tblPersons.getValueAt(selectedRow, 0);
                personDirectory.deletePerson(selectedPerson);
                populateTable();
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select one person from the list to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPersons.getSelectedRow();
        
        if (selectedRow >= 0) {
            Person selectedPerson = (Person) tblPersons.getValueAt(selectedRow, 0);
            // we want to open ViewJPanel here for the selected person
            
            ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer, personDirectory, selectedPerson);
            userProcessContainer.add("ViewAccountJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select one person from the list to view.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!txt_searchbox.getText().isBlank()) {
            String information = txt_searchbox.getText();
            List<Person> foundPersons = personDirectory.searchPerson(information);

        if (!foundPersons.isEmpty()) {
            if (foundPersons.size() == 1) {
                // show the only one person
                Person foundPerson = foundPersons.get(0);
                ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer, personDirectory, foundPerson);
                userProcessContainer.add("ViewAccountJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                // if multiple ppl
                String[] options = new String[foundPersons.size()];  // store how many ppl have the same
                for (int i = 0; i < foundPersons.size(); i++) {
                    options[i] = foundPersons.get(i).getFirstName() + " " + foundPersons.get(i).getLastName();
                }
                int selectedIndex = JOptionPane.showOptionDialog(null, "Found multiple people, please choose one", "Which person do you want to view?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);        
                if (selectedIndex >= 0) {
                    Person selectedPerson = foundPersons.get(selectedIndex);
                    ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer, personDirectory, selectedPerson);
                    userProcessContainer.add("ViewAccountJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Person not found. Please check the First_name / Last_name / Address and try again", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(null, "Please type the First_name / Last_name / Address to view.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
            txt_searchbox.setText("Type first_name, last_name or street address");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txt_searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPersons;
    private javax.swing.JTextField txt_searchbox;
    // End of variables declaration//GEN-END:variables

    
    void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
        model.setRowCount(0);
        
        for (Person p : personDirectory.getPerson()) {
            Address homeAddress = p.getHomeaddr();
            Address workAddress = p.getWorkaddr();
            
            Object[] row = new Object[6];
            row[0] = p; // First Name
            row[1] = p.getLastName(); // Last Name
            row[2] = homeAddress.getCity(); // Home City
            row[3] = homeAddress.getZipcode(); // Home Zip Code
            row[4] = workAddress.getCity(); // Work City
            row[5] = workAddress.getZipcode(); // Work Zip Code
            
            model.addRow(row);
        }
//    void populateTable() {
//        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
//        model.setRowCount(0);
//        
//        for (Person p : personDirectory.getPerson()) {
//            
//            Object[] row = new Object[6];
//            row[0] = p;
//            row[1] = p.getLastName();
//            row[2] = p.getH_city();
//            row[3] = p.getH_zipcode();
//            row[4] = p.getW_city();
//            row[5] = p.getW_zipcode();
//            
//            model.addRow(row);
//        }
//    }
    }
}
