package com.kasun.ui;

	public class SerchPersion extends javax.swing.JFrame {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
	     * Creates new form SerchPersion
	     */
	    public SerchPersion() {
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jCheckBox1 = new javax.swing.JCheckBox();
	        jCheckBox2 = new javax.swing.JCheckBox();
	        jCheckBox3 = new javax.swing.JCheckBox();
	        jCheckBox4 = new javax.swing.JCheckBox();
	        jButton1 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jCheckBox1.setText("Know the Name");

	        jCheckBox2.setText("Know The ID");

	        jCheckBox3.setText("Know The Address");

	        jCheckBox4.setText("Know The TP Num");

	        jButton1.setText("Serch");
	        jButton1.setToolTipText("");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(72, 72, 72)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jCheckBox4)
	                            .addComponent(jCheckBox3)
	                            .addComponent(jCheckBox2)
	                            .addComponent(jCheckBox1)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(124, 124, 124)
	                        .addComponent(jButton1)))
	                .addContainerGap(173, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(44, 44, 44)
	                .addComponent(jCheckBox1)
	                .addGap(18, 18, 18)
	                .addComponent(jCheckBox2)
	                .addGap(18, 18, 18)
	                .addComponent(jCheckBox3)
	                .addGap(18, 18, 18)
	                .addComponent(jCheckBox4)
	                .addGap(31, 31, 31)
	                .addComponent(jButton1)
	                .addContainerGap(46, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    }                                        

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
	            java.util.logging.Logger.getLogger(SerchPersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(SerchPersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(SerchPersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(SerchPersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new SerchPersion().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JCheckBox jCheckBox1;
	    private javax.swing.JCheckBox jCheckBox2;
	    private javax.swing.JCheckBox jCheckBox3;
	    private javax.swing.JCheckBox jCheckBox4;
	    // End of variables declaration                   
	}
