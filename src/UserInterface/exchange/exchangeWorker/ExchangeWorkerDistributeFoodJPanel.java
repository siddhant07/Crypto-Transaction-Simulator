/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.exchange.exchangeWorker;

import Business.Enterprise.Enterprise;
import Business.Enterprise.ExchangeEnterprise;
import Business.Util.Leftovers.Leftovers;
import Business.Util.Inventory.DistributedItemsDirectory;
import Business.Util.Inventory.DistributedItems;
import Business.Util.Request.RequestItem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author indap.n
 */
public class ExchangeWorkerDistributeFoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExchangeWorkerDistributeFoodJPanel
     */
    private JPanel userProcessContainer;
    private ExchangeEnterprise enterprise;
    private DistributedItemsDirectory distributed;
    private Boolean isDistributed = false;

    public ExchangeWorkerDistributeFoodJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = (ExchangeEnterprise) enterprise;
        populateInventoryTable();
        if (!isDistributed) {
            distributed = new DistributedItemsDirectory();
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
        tblInventory = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jScrollPaneTblListItem = new javax.swing.JScrollPane();
        tblListItem = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        lblPeopleFed = new javax.swing.JLabel();
        spnPeopleFed = new javax.swing.JSpinner();
        lblWastageAvoided = new javax.swing.JLabel();
        lblWastageAvoidedValue = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coin", "Quantity", "Time "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInventory.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(tblInventory);
        if (tblInventory.getColumnModel().getColumnCount() > 0) {
            tblInventory.getColumnModel().getColumn(0).setResizable(false);
            tblInventory.getColumnModel().getColumn(1).setResizable(false);
            tblInventory.getColumnModel().getColumn(2).setResizable(false);
        }

        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantity.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblListItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coin", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListItem.getTableHeader().setReorderingAllowed(false);
        jScrollPaneTblListItem.setViewportView(tblListItem);
        if (tblListItem.getColumnModel().getColumnCount() > 0) {
            tblListItem.getColumnModel().getColumn(0).setResizable(false);
            tblListItem.getColumnModel().getColumn(1).setResizable(false);
        }

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblPeopleFed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPeopleFed.setText("Transfer");

        spnPeopleFed.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblWastageAvoided.setText("Turned");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(32, 47, 90));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Exchange Worker - Distribution");

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
            .addComponent(jSeparator)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPeopleFed, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWastageAvoided)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWastageAvoidedValue, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnPeopleFed, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(490, 490, 490)
                            .addComponent(btnConfirm))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTblListItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRemove))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(lblQuantity)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTblListItem, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemove)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeopleFed)
                    .addComponent(spnPeopleFed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWastageAvoided))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWastageAvoidedValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnBack))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateInventoryTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblInventory.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : enterprise.getInventory().getRequestItemList()) {
            if (ri.getQuantity() > 0 && ri.getHoursToPerish() > 0) {
                Object row[] = new Object[3];

                row[0] = ri;
                row[1] = ri.getQuantity();
                row[2] = ri.getHoursToPerish();
                dtm.addRow(row);
            }
        }

        //Enable sorting
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
        tblInventory.setRowSorter(sorter);
    }

    private void populateItemTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblListItem.getModel();
        dtm.setRowCount(0);

        for (DistributedItems di : distributed.getDistributedItemList()) {
            Object row[] = new Object[2];

            row[0] = di.getDistributedRequestItem();
            row[1] = di.getQuantityDistributed();
            dtm.addRow(row);
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        // Clear distributed list and add back to inventory       
        // Clear item table
        DefaultTableModel dtm = (DefaultTableModel) tblListItem.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            RequestItem ri = (RequestItem) tblListItem.getValueAt(i, 0);
            if (ri != null) {
                addBackToInventory(ri);
            }
        }
        dtm.setRowCount(0);

        // GO back
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int selectedRow = tblInventory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select an item to be added",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            RequestItem ri = (RequestItem) tblInventory.getValueAt(selectedRow, 0);

            int quantity = (int) spnQuantity.getValue();
            if (quantity > ri.getQuantity()) {
                JOptionPane.showMessageDialog(null,
                        "Not enough quantity present in the inventory for the selected quantity",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Add item to table
            DefaultTableModel dtm = (DefaultTableModel) tblListItem.getModel();
            Object row[] = new Object[2];
            row[0] = ri;
            row[1] = ri.getQuantity();
            dtm.addRow(row);

            // Decrease Quantity from inventory and add to distributed list (if exists)
            boolean alreadyPresent = false;
            for (DistributedItems di : distributed.getDistributedItemList()) {
                RequestItem reqi = di.getDistributedRequestItem();
                if (reqi == ri) {
                    int oldAvail = ri.getQuantity();
                    int newAvail = oldAvail - quantity;
                    ri.setQuantity(newAvail);

                    alreadyPresent = true;
                    break;
                }
            }

            // Decrease Quantity from inventory and add to distributed list (if doesn't exist)
            if (!alreadyPresent) {
                int oldAvail = ri.getQuantity();
                int newAvail = oldAvail - quantity;

                ri.setQuantity(newAvail);

                //RequestItem requestItem = new RequestItem(ri.getFoodName(), quantity, 0);
                DistributedItems di = distributed.addDistributedItems();
                di.setDistributedRequestItem(ri);
                di.setQuantityDistributed(quantity);
            }
            populateItemTable();
            populateInventoryTable();
            calculateWastageAvoided();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        int selectedRow = tblListItem.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select an item to be removed",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        RequestItem ri = (RequestItem) tblListItem.getValueAt(selectedRow, 0);
        addBackToInventory(ri);

        JOptionPane.showMessageDialog(null,
                "Selected food item removed and added back to inventory",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);

        populateInventoryTable();
        populateItemTable();
        calculateWastageAvoided();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (distributed.getDistributedItemList().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No food items distributed",
                    "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int peopleFed = (int) spnPeopleFed.getValue();
        distributed.setPeopleFed(peopleFed);

        enterprise.addDistributedItem(distributed);

        JOptionPane.showMessageDialog(null,
                "Selected Items successfully distributed to people",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);

        populateInventoryTable();
        populateItemTable();

        DefaultTableModel dtm = (DefaultTableModel) tblListItem.getModel();
        dtm.setRowCount(0);

        distributed = new DistributedItemsDirectory();
        isDistributed = true;
        spnPeopleFed.setValue(1);
        lblWastageAvoidedValue.setText("0 pounds");
        //btnConfirm.setEnabled(false);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void calculateWastageAvoided() {

        double wastageAvoided = 0;
        for (DistributedItems di : distributed.getDistributedItemList()) {
            RequestItem ri = di.getDistributedRequestItem();
            wastageAvoided += Leftovers.getLeftoversQuantityPerServing(ri.getFoodName()) * di.getQuantityDistributed();
        }
        lblWastageAvoidedValue.setText(wastageAvoided + " pounds");
    }

    private void addBackToInventory(RequestItem ri) {

        // Reset quantity in inventory
        int oldQty = ri.getQuantity();
        int currentAvail = 0;

        DistributedItems toBeRemoved = null;

        for (DistributedItems di : distributed.getDistributedItemList()) {
            RequestItem reqi = di.getDistributedRequestItem();
            if (reqi == ri) {
                currentAvail = di.getQuantityDistributed();
                // Remove item from current distributed list
                toBeRemoved = di;
            }
        }

        distributed.removeDistributedItem(toBeRemoved);
        ri.setQuantity(oldQty + currentAvail);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPaneTblListItem;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblPeopleFed;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblWastageAvoided;
    private javax.swing.JLabel lblWastageAvoidedValue;
    private javax.swing.JSpinner spnPeopleFed;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTable tblListItem;
    // End of variables declaration//GEN-END:variables
}
