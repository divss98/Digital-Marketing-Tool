/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author Mahe
 */
public class MarketerFilter extends javax.swing.JFrame {
Connection conn=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs=null;
  
    
    /**
     * Creates new form MarketerFilter
     */
    public MarketerFilter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        s = new javax.swing.JComboBox<>();
        sm = new javax.swing.JComboBox<>();
        m = new javax.swing.JComboBox<>();
        a = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 1000));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Analysis");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 130, 28));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Filter criteria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 74, -1, -1));

        s.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        s.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sport", "Football", "Basketball", "Cricket", "Tennis" }));
        s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 146, -1, -1));

        sm.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        sm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Social Media", "Facebook", "Whats App", "Instagram", "Twitter" }));
        sm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(sm, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 146, -1, -1));

        m.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        m.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genre", "Drama", "Horror", "Thriller", "RomCom" }));
        m.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 146, -1, -1));

        a.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile App", "Uber", "Zomato", "LinkedIn", "SnapChat" }));
        a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 146, -1, -1));

        jButton1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton1.setText("View");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 140, 40));

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Gender", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(t);
        if (t.getColumnModel().getColumnCount() > 0) {
            t.getColumnModel().getColumn(0).setPreferredWidth(500);
            t.getColumnModel().getColumn(1).setPreferredWidth(400);
            t.getColumnModel().getColumn(2).setPreferredWidth(150);
            t.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 271, 576, 146));

        jButton2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton2.setText("Pie chart(Gender)");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 531, 150, 40));

        jButton3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton3.setText("Pie chart(location)");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 531, 160, 40));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton4.setText("Logout");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 80, 40));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select the suitable rows for analysis");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 484, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 456, 730, 10));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton5.setText("Feedback");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
conn=SqlConnect.ConnDB();
try
{
    String sql="select u.name,u.location,u.gender,u.age from user_details u,user_interest i where (i.Sport=? or i.SocialMedia=? or i.Genre=? or i.MobileApp=? ) and i.user_name=u.user_name";
    pst=(OraclePreparedStatement) conn.prepareStatement(sql);
    pst.setString(1,String.valueOf(s.getSelectedItem()));
    pst.setString(2,String.valueOf(sm.getSelectedItem()));
    pst.setString(3,String.valueOf(m.getSelectedItem()));
    pst.setString(4,String.valueOf(a.getSelectedItem()));
    rs=(OracleResultSet) pst.executeQuery();
    DefaultTableModel tm=(DefaultTableModel)t.getModel();
    tm.setRowCount(0);
    while(rs.next())
    {
        
     Object o[]={rs.getString("Name"),rs.getString("Location"),rs.getString("Gender"),rs.getString("Age")};
        tm.addRow(o);
    }      
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,"No Records Found");
}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 ArrayList<String> a = new ArrayList<String>();
                 int[] selectedrows = t.getSelectedRows();

                 for (int i = 0; i < selectedrows.length; i++)
                {

                     a.add(t.getValueAt(selectedrows[i], 2).toString());

                }
                 System.out.println(a);
                int len = a.size();
                System.out.println(len);
    HashMap <String, Integer> map = new HashMap<String, Integer>();
int value=1;
    for(int i = 0; i < len; i++) {
        String key = a.get(i);
        if (map.containsKey(key)) {            
          map.put(key, ++value);
        }
        else {
            map.put(key, 1);
        }
    }
    String[] str = map.keySet().toArray(new String[map.size()]);
                 DefaultPieDataset Piedata=new DefaultPieDataset() ;
                 for(int i=0;i<map.size();i++)
                 {
                        
                Piedata.setValue(str[i],new Integer(map.get(str[i])));
                        
                      
                 }
                JFreeChart j=ChartFactory.createPieChart("Gender",Piedata,true,true,true);
                PiePlot p=(PiePlot)j.getPlot();
                //p.setForegroundAlpha(TOP_ALIGNMENT);
                ChartFrame frame=new ChartFrame("PIE",j);
frame.setVisible(true);
frame.setSize(450,500);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 ArrayList<String> a = new ArrayList<String>();
                 int[] selectedrows = t.getSelectedRows();

                 for (int i = 0; i < selectedrows.length; i++)
                {

                     a.add(t.getValueAt(selectedrows[i], 1).toString());
                }
                 System.out.println(a);
                int len = a.size();
                System.out.println(len);
    HashMap <String, Integer> map = new HashMap<String, Integer>();
int value=1;
    for(int i = 0; i < len; i++) {
        String key = a.get(i);
        if (map.containsKey(key)) {            
          map.put(key, ++value);
        }
        else {
            map.put(key, 1);
        }
    }
 String[] str = map.keySet().toArray(new String[map.size()]);
                 DefaultPieDataset Piedata=new DefaultPieDataset() ;
                 for(int i=0;i<map.size();i++)
                 {
                        
                Piedata.setValue(str[i],new Integer(map.get(str[i])));
                        
                      
                 }
                JFreeChart j=ChartFactory.createPieChart("Location",Piedata,true,true,true);
                PiePlot p=(PiePlot)j.getPlot();
                //p.setForegroundAlpha(TOP_ALIGNMENT);
                ChartFrame frame=new ChartFrame("PIE",j);
frame.setVisible(true);
frame.setSize(450,500);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Home h=new Home();
h.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
User_Feedback u=new User_Feedback();
u.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    

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
            java.util.logging.Logger.getLogger(MarketerFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketerFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketerFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketerFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketerFilter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> a;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> m;
    private javax.swing.JComboBox<String> s;
    private javax.swing.JComboBox<String> sm;
    private javax.swing.JTable t;
    // End of variables declaration//GEN-END:variables
}
