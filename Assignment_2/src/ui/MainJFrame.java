/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.Address;
import model.Person;
import model.PersonDirectory;
import ui.PersonManager.PersonMngWorkAreaJPanel;

/**
 *
 * @author jiaye
 */
public class MainJFrame extends javax.swing.JFrame {

    private PersonDirectory personDirectory;
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        this.personDirectory = new PersonDirectory();
        generateDemoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        topJPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topJPanel.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setBackground(new java.awt.Color(204, 228, 238));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton1.setText("Click to start managing person profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(topJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 204, 204));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PersonMngWorkAreaJPanel panel = new PersonMngWorkAreaJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("PersonMngWorkAreaJPanel", panel);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    private void generateDemoData() {
        Address homeAddr1 = new Address("Westland Ave.", 28, "Boston", "MA", "02115", 857354295);
        Address workAddr1 = new Address("Huntington Ave.", 46, "Boston", "MA", "02115", 984246312);
        Person newPerson = personDirectory.addPerson("Jiaye", "Lee", "231232333", (byte)23, 24.5, homeAddr1, workAddr1);

        Address homeAddr2 = new Address("Wall St.", 48, "New York", "NY", "02345", 857353461);
        Address workAddr2 = new Address("Columbia St", 231, "New York", "NY", "02345", 853334663);
        Person newPerson1 = personDirectory.addPerson("Charlotte", "Heinz", "342464563", (byte)28, 24.0, homeAddr2, workAddr2);

        Address homeAddr3 = new Address("Newbury St.", 74, "Boston", "MA", "02115", 855533134);
        Address workAddr3 = new Address("Boylston St.", 98, "Boston", "MA", "02115", 835423454);
        Person newPerson2 = personDirectory.addPerson("Lea", "Chang", "6775454", (byte)18, 23.0, homeAddr3, workAddr3);

        Address homeAddr4 = new Address("Petersons ave", 230, "Boston", "MA", "02115", 857456695);
        Address workAddr4 = new Address("Saint Stephen St.", 65, "Boston", "MA", "02115", 837323495);
        Person newPerson3 = personDirectory.addPerson("Jasmine", "Lin", "3466757672", (byte)48, 24.5, homeAddr4, workAddr4);

        Address homeAddr5 = new Address("Jose St.", 25, "SomerVille", "MA", "02165", 854456348);
        Address workAddr5 = new Address("Pizzeria Ave.", 56, "Newton", "MA", "02332", 278482937);
        Person newPerson4 = personDirectory.addPerson("Olive", "Cheng", "29857842", (byte)20, 25.5, homeAddr5, workAddr5);
        
//        Person newPerson = personDirectory.addPerson();
//        newPerson.setFirstName("Jiaye");
//        newPerson.setLastName("Lee");
//        newPerson.setSsn("231232333");
//        newPerson.setAge((byte)23);
//        newPerson.setShoesnum(24.5);
//        newPerson.setH_streetaddr("Westland Ave.");
//        newPerson.setH_unitnum(28);
//        newPerson.setH_city("Boston");
//        newPerson.setH_state("MA");
//        newPerson.setH_zipcode("02115");
//        newPerson.setH_phonenum(857354295);
//        newPerson.setW_streetaddr("Huntington Ave.");
//        newPerson.setW_unitnum(46);
//        newPerson.setW_city("Boston");
//        newPerson.setW_state("MA");
//        newPerson.setW_zipcode("02115");
//        newPerson.setW_phonenum(984246312);
//        
//        Person newPerson1 = personDirectory.addPerson();
//        newPerson1.setFirstName("Charlotte");
//        newPerson1.setLastName("Heinz");
//        newPerson1.setSsn("342464563");
//        newPerson1.setAge((byte)28);
//        newPerson1.setShoesnum(24.0);
//        newPerson1.setH_streetaddr("Wall St.");
//        newPerson1.setH_unitnum(48);
//        newPerson1.setH_city("New York");
//        newPerson1.setH_state("NY");
//        newPerson1.setH_zipcode("02345");
//        newPerson1.setH_phonenum(857353461);
//        newPerson1.setW_streetaddr("Columbia St");
//        newPerson1.setW_unitnum(231);
//        newPerson1.setW_city("New York");
//        newPerson1.setW_state("NY");
//        newPerson1.setW_zipcode("02345");
//        newPerson1.setW_phonenum(853334663);
//        
//        Person newPerson2 = personDirectory.addPerson();
//        newPerson2.setFirstName("Lea");
//        newPerson2.setLastName("Chang");
//        newPerson2.setSsn("6775454");
//        newPerson2.setAge((byte)18);
//        newPerson2.setShoesnum(23.0);
//        newPerson2.setH_streetaddr("Newbury St.");
//        newPerson2.setH_unitnum(74);
//        newPerson2.setH_city("Boston");
//        newPerson2.setH_state("MA");
//        newPerson2.setH_zipcode("02115");
//        newPerson2.setH_phonenum(855533134);
//        newPerson2.setW_streetaddr("Boylston St.");
//        newPerson2.setW_unitnum(98);
//        newPerson2.setW_city("Boston");
//        newPerson2.setW_state("MA");
//        newPerson2.setW_zipcode("02115");
//        newPerson2.setW_phonenum(835423454);
//        
//        Person newPerson3 = personDirectory.addPerson();
//        newPerson3.setFirstName("Jasmine");
//        newPerson3.setLastName("Lin");
//        newPerson3.setSsn("3466757672");
//        newPerson3.setAge((byte)48);
//        newPerson3.setShoesnum(24.5);
//        newPerson3.setH_streetaddr("Petersons ave");
//        newPerson3.setH_unitnum(230);
//        newPerson3.setH_city("Boston");
//        newPerson3.setH_state("MA");
//        newPerson3.setH_zipcode("02115");
//        newPerson3.setH_phonenum(857456695);
//        newPerson3.setW_streetaddr("Saint Stephen St.");
//        newPerson3.setW_unitnum(65);
//        newPerson3.setW_city("Boston");
//        newPerson3.setW_state("MA");
//        newPerson3.setW_zipcode("02115");
//        newPerson3.setW_phonenum(837323495);
//        
//        Person newPerson4 = personDirectory.addPerson();
//        newPerson4.setFirstName("Olive");
//        newPerson4.setLastName("Cheng");
//        newPerson4.setSsn("29857842");
//        newPerson4.setAge((byte)20);
//        newPerson4.setShoesnum(25.5);
//        newPerson4.setH_streetaddr("Jose St.");
//        newPerson4.setH_unitnum(25);
//        newPerson4.setH_city("SomerVille");
//        newPerson4.setH_state("MA");
//        newPerson4.setH_zipcode("02165");
//        newPerson4.setH_phonenum(854456348);
//        newPerson4.setW_streetaddr("Pizzeria Ave.");
//        newPerson4.setW_unitnum(56);
//        newPerson4.setW_city("Newton");
//        newPerson4.setW_state("MA");
//        newPerson4.setW_zipcode("02332");
//        newPerson4.setW_phonenum(278482937);
    }
}
