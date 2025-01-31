/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Person_Profile;

/**
 *
 * @author jiaye
 */
public class ViewJPanel extends javax.swing.JPanel {
    
    Person_Profile profile;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(Person_Profile pro) {
        profile = pro;
        initComponents();
        
        displayProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirst_name = new javax.swing.JLabel();
        txtZIP = new javax.swing.JTextField();
        lblLast_name = new javax.swing.JLabel();
        lblTelenum = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelenum = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblFaxnum = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtFaxnum = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtDLN = new javax.swing.JTextField();
        lbl_DLN = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblMBTI = new javax.swing.JLabel();
        txtFirst_name = new javax.swing.JTextField();
        txtMBTI = new javax.swing.JTextField();
        lblDLS = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtDLS = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        lblHobby = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        txtHobby = new javax.swing.JTextField();
        lblAddr1 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAddr2 = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        lblAddr2 = new javax.swing.JLabel();
        lblStarsign = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtStarsign = new javax.swing.JTextField();
        txtAddr1 = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtLast_name = new javax.swing.JTextField();
        lblZIP = new javax.swing.JLabel();

        lblFirst_name.setText("First name");

        txtZIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZIPActionPerformed(evt);
            }
        });

        lblLast_name.setText("Last name");

        lblTelenum.setText("Telephone Number");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtTelenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelenumActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        lblFaxnum.setText("Fax Number");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtFaxnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxnumActionPerformed(evt);
            }
        });

        lblPhone.setText("Phone");

        lblGender.setText("Gender");

        txtDLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDLNActionPerformed(evt);
            }
        });

        lbl_DLN.setText("Drivers License Number");

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        lblMBTI.setText("MBTI");

        txtFirst_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirst_nameActionPerformed(evt);
            }
        });

        txtMBTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMBTIActionPerformed(evt);
            }
        });

        lblDLS.setText("Drivers License State");

        lblStatus.setText("Status");

        txtDLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDLSActionPerformed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblSSN.setText("Social Security Number");

        lblHobby.setText("Hobby");

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        txtHobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHobbyActionPerformed(evt);
            }
        });

        lblAddr1.setText("Address Line 1");

        lblAge.setText("Age");

        txtAddr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddr2ActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblAddr2.setText("Address Line 2");

        lblStarsign.setText("Star sign");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblCity.setText("City");

        txtStarsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStarsignActionPerformed(evt);
            }
        });

        txtAddr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddr1ActionPerformed(evt);
            }
        });

        lblState.setText("State");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Personal Profile");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        txtLast_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLast_nameActionPerformed(evt);
            }
        });

        lblZIP.setText("ZIP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblAddr1)
                        .addGap(42, 42, 42)
                        .addComponent(txtAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLast_name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtLast_name, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblAddr2)
                        .addGap(42, 42, 42)
                        .addComponent(txtAddr2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblCity)
                        .addGap(99, 99, 99)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblState)
                        .addGap(92, 92, 92)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_DLN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtDLN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblZIP)
                        .addGap(102, 102, 102)
                        .addComponent(txtZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDLS, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtDLS, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(lblTelenum)
                        .addGap(12, 12, 12)
                        .addComponent(txtTelenum, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblFaxnum)
                        .addGap(55, 55, 55)
                        .addComponent(txtFaxnum, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblMBTI)
                        .addGap(92, 92, 92)
                        .addComponent(txtMBTI, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblHobby)
                        .addGap(83, 83, 83)
                        .addComponent(txtHobby, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAge)
                        .addGap(133, 133, 133)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblStarsign)
                        .addGap(73, 73, 73)
                        .addComponent(txtStarsign, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblAddr1))
                    .addComponent(txtAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblLast_name, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLast_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblAddr2))
                    .addComponent(txtAddr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblCity))
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblState))
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_DLN, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblZIP))
                    .addComponent(txtZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblDLS, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTelenum))
                    .addComponent(txtTelenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblFaxnum))
                    .addComponent(txtFaxnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblMBTI))
                    .addComponent(txtMBTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHobby)
                    .addComponent(txtHobby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblStarsign))
                    .addComponent(txtStarsign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtZIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZIPActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelenumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelenumActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtFaxnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxnumActionPerformed

    private void txtDLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDLNActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtFirst_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirst_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirst_nameActionPerformed

    private void txtMBTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMBTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMBTIActionPerformed

    private void txtDLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDLSActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtHobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHobbyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHobbyActionPerformed

    private void txtAddr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddr2ActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtStarsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStarsignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStarsignActionPerformed

    private void txtAddr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddr1ActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtLast_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLast_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLast_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddr1;
    private javax.swing.JLabel lblAddr2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDLS;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFaxnum;
    private javax.swing.JLabel lblFirst_name;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHobby;
    private javax.swing.JLabel lblLast_name;
    private javax.swing.JLabel lblMBTI;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblStarsign;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelenum;
    private javax.swing.JLabel lblZIP;
    private javax.swing.JLabel lbl_DLN;
    private javax.swing.JTextField txtAddr1;
    private javax.swing.JTextField txtAddr2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDLN;
    private javax.swing.JTextField txtDLS;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFaxnum;
    private javax.swing.JTextField txtFirst_name;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHobby;
    private javax.swing.JTextField txtLast_name;
    private javax.swing.JTextField txtMBTI;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtStarsign;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTelenum;
    private javax.swing.JTextField txtZIP;
    // End of variables declaration//GEN-END:variables

    private void displayProfile() {
        txtFirst_name.setText(profile.getFirst_name());
        txtLast_name.setText(profile.getLast_name());
        txtEmail.setText(profile.getEmail());
        txtPhone.setText(profile.getPhone());
        txtDLN.setText(profile.getDriver_lice_num());
        txtDLS.setText(profile.getDrive_lice_state());
        txtSSN.setText(profile.getSsn());
        txtGender.setText(profile.getGender());
        txtStatus.setText(profile.getStatus());
        txtAge.setText(profile.getAge());
        txtAddr1.setText(profile.getAddr_1());
        txtAddr2.setText(profile.getAddr_2());
        txtCity.setText(profile.getCity());
        txtState.setText(profile.getState());
        txtZIP.setText(profile.getZip());
        txtTelenum.setText(profile.getTele_num());
        txtFaxnum.setText(profile.getFax_num());
        txtMBTI.setText(profile.getMbti());
        txtHobby.setText(profile.getHobby());
        txtStarsign.setText(profile.getStar_sign());
    }
}
