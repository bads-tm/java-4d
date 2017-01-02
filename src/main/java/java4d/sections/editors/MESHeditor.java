/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MESHeditor.java
 *
 * Created on 17-ago-2009, 14.11.24
 */

package java4d.sections.editors;

import java4d.sections.data.MESHdata;
import java4d.sections.data.sectData;

/**
 *
 * @author Pierantonio
 */
public class MESHeditor extends sectEditor {
    MESHdata meshdata;

    /** Creates new form MESHeditor */
    public MESHeditor(sectData toEdit) {
        super(toEdit);
        initComponents();
        meshdata=(MESHdata)sdata;
        jPanel1.add(meshdata.desc.getEditor() );
        jPanel1.add(meshdata.space.getEditor() );
        this.setTitle(meshdata.getOwner().getTipDetails());
        this.setBounds(this.getX()-this.getWidth()/2, this.getY()-this.getHeight()/2, 350, 350);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Select Parent Entity...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange
        if(evt.getPropertyName().matches("renderer"))
        {
            if(sdata.getOwner().getEventListener() != null)
                sdata.getOwner().getEventListener().dataChanged();
        }
    }//GEN-LAST:event_jPanel1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        parentIdEditDialog ed1=new parentIdEditDialog(this, true,meshdata);
        ed1.setVisible(true);
        if(sdata.getOwner().getEventListener() != null)
                sdata.getOwner().getEventListener().dataChanged();
        this.setTitle(meshdata.getOwner().getTipDetails());
    }//GEN-LAST:event_jButton2ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    protected javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
