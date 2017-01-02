
package java4d;



import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java4d.graphicRenderer.*;
import java4d.my4dfile.*;
import java4d.sections.*;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;
import utilities.*;


/**
 *
 * @author Pierantonio
 */
public class Form1 extends javax.swing.JFrame {

    sect s;
    myRendererFrame k;
    public Form1()
    {
        // sfondo jtree 233 227 255
        initComponents();
        myTreeUI ui=new myTreeUI();
        jTree1.setCellRenderer(new myTreeCellRenderer());
        jTree1.setUI(ui);
        ui.setCollapsedIcon(IconFactory.getIcon("java4d/images/open.png"));
        ui.setExpandedIcon(IconFactory.getIcon("java4d/images/open2.png"));
        ui.setLeftChildIndent(12);
        ui.setRightChildIndent(20);
        ui.setHashColor2(Color.decode("0xa7abf5"));
        ui.lineTypeDashed=true;

        k =new myRendererFrame();
        k.setVisible(true);
        k.startAnimator();
        this.setLocation(k.getX() + k.getWidth() +2, 8);
        
    }

    private boolean checkSaved()
    {
        if(s!=null)
        {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to save current file?");
            if (choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION)
                return false;

            if (choice == JOptionPane.YES_OPTION) {
                File t=myutil.fileSave(this,"Stormregion 4D Files","4d");
                if(t!=null)
                    my4dFileManager.saveFile(t, s);
                else
                    return true ;

            }
            s=null;
            k.getGlEventListener().setScene(null);
            k.getGlEventListener().updateRendering();

            return true;
           
        }
        return true;
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree(new myNode(""));
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("Edit");

        jMenu3.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4D EDITOR");

        jTree1.setBackground(new java.awt.Color(233, 227, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setRootVisible(false);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java4d/images/iconMTLS.png"))); // NOI18N
        jButton1.setText("Save 4d file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java4d/images/open2.png"))); // NOI18N
        jButton4.setText("Open 4d file");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java4d/images/iconSPOT.png"))); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("View model");
        jToggleButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton1ItemStateChanged(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java4d/images/objects.png"))); // NOI18N
        jButton5.setText("New 4d file");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("v0.2-SNAPSHOT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(s==null) return;
        File t=myutil.fileSave(this,"Stormregion 4D Files","4d");
        if(t!=null) my4dFileManager.saveFile(t, s);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed




   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!checkSaved()) return;
        try {
            k.stopAnimator();
            File t = myutil.fileOpen(this, "Stormregion 4D Files", "4d");
            
            if (t != null) {
                s = my4dFileManager.loadFile(t);
                sectJTreeBuilder.draw(s, jTree1);

                if (s.getClass() == sectSCEN.class) {
                    ((sectSCEN) s).setEventListener(new sectEventListener() {

                        public void structureChanged() {
                            sectJTreeBuilder.draw(s, jTree1);
                            dataChanged();
                        }

                        public void dataChanged() {
                            k.getGlEventListener().updateRendering();
                        }
                    });
                    k.getGlEventListener().setScene(s);
                    this.setTitle("4D EDITOR: " + t.getName());
                }

                int y = s.getSize();
            }
            //jLabel2.setText("Byte letti (header escluso): " + y);
        } catch (SizeMismatchException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Load error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Not4dFileException ex) {
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Not a 4d Stormregion file", "Header error", JOptionPane.ERROR_MESSAGE);
        }catch (InvalidDataException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Invalid data", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            k.startAnimator();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        if(evt.getNewLeadSelectionPath()!= null)
        {
            myNode  n=((myNode)evt.getNewLeadSelectionPath().getLastPathComponent());
            if(!n.isRoot())
            {
                k.getGlEventListener().setHighlightedObject(n.getSect());

            }

        }

        // TODO add your handling code here
    }//GEN-LAST:event_jTree1ValueChanged

   
    @SuppressWarnings("static-access")
    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        // TODO add your handling code here:
        TreePath p=jTree1.getPathForLocation(evt.getX(), evt.getY());

        if(evt.getClickCount()==2 && evt.getButton()==evt.BUTTON1 && p !=null )
        {
            myNode n = ((myNode)p.getLastPathComponent());
            if(sectMESH.class.isInstance(n.getSect()))
            {
                //((sectSCEN)s).deleteChild((sectMESH)n.getSect());

                sectMESH m=(sectMESH)n.getSect();
                ((sectSCEN)s).addObjectAt(m, 1);
                sectJTreeBuilder.draw(s, jTree1);
                k.getGlEventListener().updateRendering();
                //sectData t=m.getSectionData().clone();
                
                //s.showEditor();
                
                //s.getSize();
            }
        }
        else if(evt.getButton()==evt.BUTTON3 && p !=null)
        {
            jTree1.setSelectionPath(p);
            myNode n = ((myNode)p.getLastPathComponent());
            n.getSect().getEditMenu().getPopupMenu().show(
                    this,
                    evt.getXOnScreen()-this.getX() ,
                    evt.getYOnScreen()-this.getY());
        }

    }//GEN-LAST:event_jTree1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    @SuppressWarnings("static-access")
    private void jToggleButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton1ItemStateChanged

        if(evt.getStateChange() == evt.SELECTED)
        {
            k.setVisible(true);
            k.startAnimator();
        }else{
            k.setVisible(false);
            k.stopAnimator();
        }

                // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(!checkSaved()) return;
        sectJTreeBuilder.draw(s, jTree1);
        InputStream input = IconFactory.class.getClassLoader().getResourceAsStream("java4d/empty.4d");
      byte[] data;
        try {
            data = new byte[input.available()];
            input.read(data);
            s = sectListManager.getSect(data, 0, new String("SCEN"), null);
            sectJTreeBuilder.draw(s, jTree1);
             ((sectSCEN) s).setEventListener(new sectEventListener() {

                        public void structureChanged() {
                            sectJTreeBuilder.draw(s, jTree1);
                            dataChanged();
                        }

                        public void dataChanged() {
                            k.getGlEventListener().updateRendering();
                        }
                    });
            k.getGlEventListener().setScene(s);
            this.setTitle("4D EDITOR: new file");
        } catch (SizeMismatchException ex) {
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
        } 

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

}
