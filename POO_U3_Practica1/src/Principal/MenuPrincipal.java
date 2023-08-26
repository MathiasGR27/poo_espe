package Principal;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        editMenu1 = new javax.swing.JMenu();
        cutMenuItem2 = new javax.swing.JMenuItem();
        copyMenuItem2 = new javax.swing.JMenuItem();
        pasteMenuItem2 = new javax.swing.JMenuItem();
        deleteMenuItem2 = new javax.swing.JMenuItem();
        editMenu2 = new javax.swing.JMenu();
        cutMenuItem3 = new javax.swing.JMenuItem();
        copyMenuItem3 = new javax.swing.JMenuItem();
        pasteMenuItem3 = new javax.swing.JMenuItem();
        deleteMenuItem3 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        editMenup = new javax.swing.JMenu();
        cutMenuItem1 = new javax.swing.JMenuItem();
        copyMenuItem1 = new javax.swing.JMenuItem();
        pasteMenuItem1 = new javax.swing.JMenuItem();
        deleteMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Estudiante");
        editMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                editMenuMenuSelected(evt);
            }
        });

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        editMenu1.setMnemonic('e');
        editMenu1.setText("Profesor");
        editMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                editMenu1MenuSelected(evt);
            }
        });

        cutMenuItem2.setMnemonic('t');
        cutMenuItem2.setText("Cut");
        editMenu1.add(cutMenuItem2);

        copyMenuItem2.setMnemonic('y');
        copyMenuItem2.setText("Copy");
        editMenu1.add(copyMenuItem2);

        pasteMenuItem2.setMnemonic('p');
        pasteMenuItem2.setText("Paste");
        editMenu1.add(pasteMenuItem2);

        deleteMenuItem2.setMnemonic('d');
        deleteMenuItem2.setText("Delete");
        editMenu1.add(deleteMenuItem2);

        menuBar.add(editMenu1);

        editMenu2.setMnemonic('e');
        editMenu2.setText("Horario");
        editMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                editMenu2MenuSelected(evt);
            }
        });

        cutMenuItem3.setMnemonic('t');
        cutMenuItem3.setText("Cut");
        editMenu2.add(cutMenuItem3);

        copyMenuItem3.setMnemonic('y');
        copyMenuItem3.setText("Copy");
        editMenu2.add(copyMenuItem3);

        pasteMenuItem3.setMnemonic('p');
        pasteMenuItem3.setText("Paste");
        editMenu2.add(pasteMenuItem3);

        deleteMenuItem3.setMnemonic('d');
        deleteMenuItem3.setText("Delete");
        editMenu2.add(deleteMenuItem3);

        menuBar.add(editMenu2);

        helpMenu.setMnemonic('h');
        helpMenu.setText("help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        editMenup.setMnemonic('e');
        editMenup.setText("Profesor");
        editMenup.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                editMenupMenuSelected(evt);
            }
        });

        cutMenuItem1.setMnemonic('t');
        cutMenuItem1.setText("Cut");
        editMenup.add(cutMenuItem1);

        copyMenuItem1.setMnemonic('y');
        copyMenuItem1.setText("Copy");
        editMenup.add(copyMenuItem1);

        pasteMenuItem1.setMnemonic('p');
        pasteMenuItem1.setText("Paste");
        editMenup.add(pasteMenuItem1);

        deleteMenuItem1.setMnemonic('d');
        deleteMenuItem1.setText("Delete");
        editMenup.add(deleteMenuItem1);

        helpMenu.add(editMenup);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void editMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_editMenuMenuSelected
        // TODO add your handling code here:
        Form_estu form1 = new Form_estu();
        Escritorio.add(form1);
        form1.toFront();
        form1.setVisible(true);
    }//GEN-LAST:event_editMenuMenuSelected

    private void editMenupMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_editMenupMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenupMenuSelected

    private void editMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_editMenu1MenuSelected
        // TODO add your handling code here:
        Form_profesor form2 = new Form_profesor();
        Escritorio.add(form2);
        form2.toFront();
        form2.setVisible(true);
        
    }//GEN-LAST:event_editMenu1MenuSelected

    private void editMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_editMenu2MenuSelected
        // TODO add your handling code here:
        Form_horario form3 = new Form_horario();
        Escritorio.add(form3);
        form3.toFront();
        form3.setVisible(true);
    }//GEN-LAST:event_editMenu2MenuSelected

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem copyMenuItem1;
    private javax.swing.JMenuItem copyMenuItem2;
    private javax.swing.JMenuItem copyMenuItem3;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem cutMenuItem1;
    private javax.swing.JMenuItem cutMenuItem2;
    private javax.swing.JMenuItem cutMenuItem3;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem deleteMenuItem1;
    private javax.swing.JMenuItem deleteMenuItem2;
    private javax.swing.JMenuItem deleteMenuItem3;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenu1;
    private javax.swing.JMenu editMenu2;
    private javax.swing.JMenu editMenup;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    public javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem pasteMenuItem1;
    private javax.swing.JMenuItem pasteMenuItem2;
    private javax.swing.JMenuItem pasteMenuItem3;
    // End of variables declaration//GEN-END:variables

}
