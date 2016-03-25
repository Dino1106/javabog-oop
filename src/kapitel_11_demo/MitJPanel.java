/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_11_demo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author j
 */
public class MitJPanel extends javax.swing.JPanel {

  private String hilsen = "Hej grafiske verden!"; 
  private int xpos;
  private int ypos;

  /**
   * Creates new form MitJPanel
   */
  public MitJPanel() {
    initComponents();
  }

	public void paintComponent(Graphics g)
	{
		// Herunder referer g til et Graphics-objekt man kan tegne med
		super.paintComponent(g);                // tegn først baggrunden på panelet

		g.drawLine(0,0,xpos,ypos);

		g.fillOval(5,10,300,30);
		g.setColor(Color.GREEN);
		g.drawString(hilsen,100,30);

		System.out.println("Der blev tegnet!! "+xpos + ", "+ypos);
	}
  
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButton1 = new javax.swing.JButton();
    jTextField1 = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jProgressBar1 = new javax.swing.JProgressBar();
    jSlider1 = new javax.swing.JSlider();

    addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(java.awt.event.MouseEvent evt) {
        musFlyttet(evt);
      }
    });

    jButton1.setForeground(new java.awt.Color(248, 24, 24));
    jButton1.setMnemonic('H');
    jButton1.setText("Tryk her");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel1.setForeground(new java.awt.Color(27, 112, 0));
    jLabel1.setText("Hvad hedder du, smarte fyr?");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
          .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addComponent(jButton1))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    jButton1.setText("TAK!!");
    String navn = jTextField1.getText();
    hilsen = "Hej kære "+navn;
    
    jTextField1.setText("");
    
    repaint();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void musFlyttet(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musFlyttet
    // TODO add your handling code here:
    xpos = evt.getX();
    ypos = evt.getY();
    repaint();
  }//GEN-LAST:event_musFlyttet


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JProgressBar jProgressBar1;
  private javax.swing.JSlider jSlider1;
  private javax.swing.JTextField jTextField1;
  // End of variables declaration//GEN-END:variables
}