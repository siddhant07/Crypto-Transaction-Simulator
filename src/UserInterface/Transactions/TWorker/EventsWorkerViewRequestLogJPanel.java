/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Transactions.TWorker;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.CollectionWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indap.n
 */
public class EventsWorkerViewRequestLogJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;

    /**
     * Creates new form RestaurantWorkerViewRequestLogJPanel
     */
    public EventsWorkerViewRequestLogJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblLog.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            CollectionWorkRequest cwr = (CollectionWorkRequest) wr;

            Object row[] = new Object[4];
            row[0] = cwr.getRequestDate();
            row[1] = cwr;
            row[2] = cwr.getTotalQuantity();
            row[3] = cwr.getDeliverToExchange() == null ? "Undelivered" : cwr.getDeliverToExchange();

            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblLog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnViewRequestItem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Raised Date", "Status", "Quantity ", "Collected By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblLog);
        if (tblLog.getColumnModel().getColumnCount() > 0) {
            tblLog.getColumnModel().getColumn(0).setResizable(false);
            tblLog.getColumnModel().getColumn(1).setResizable(false);
            tblLog.getColumnModel().getColumn(2).setResizable(false);
            tblLog.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewRequestItem.setText("View Request Item");
        btnViewRequestItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestItemActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(32, 47, 90));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Events Worker Work Area - Request Log");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(448, 448, 448)
                        .addComponent(btnViewRequestItem))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnViewRequestItem))
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewRequestItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestItemActionPerformed

        int selectedRow = tblLog.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to view details",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            CollectionWorkRequest cwr = (CollectionWorkRequest) tblLog.getValueAt(selectedRow, 1);

            EventsWorkerViewLogItemJPanel eventsWorkerViewLogItemJPanel = new EventsWorkerViewLogItemJPanel(userProcessContainer, cwr);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("EventsWorkerViewLogItemJPanel", eventsWorkerViewLogItemJPanel);
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewRequestItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewRequestItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tblLog;
    // End of variables declaration//GEN-END:variables
}