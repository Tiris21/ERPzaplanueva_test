/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controladores.ProveedoresCtrl;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiris
 */
public class ProveedoresPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProveedoresPanel
     */
    private ProveedoresCtrl ctrl;
    private JPanel pnorte;
    private JPanel psur;
    private JPanel peste;
    private JPanel poeste;
    private JPanel pcentral;
    private GridBagLayout layout;
    private GridBagConstraints gbc;
    
    
    public ProveedoresPanel() {
        initComponents();
        
//        layout = new GridBagLayout();
//        gbc = new GridBagConstraints();
//        pnorte = new JPanel();
//        psur = new JPanel();
//        poeste = new JPanel();
//        peste = new JPanel();
//        pcentral = new JPanel();
//        
//        tablePanel.setLayout(layout);
//        
//        tablaProveedores.setVisible(false);
//        
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.gridwidth = 3;
//        gbc.gridheight = 1;
//        gbc.weightx = 0.5;
//        gbc.weighty = 0.5;
//        gbc.fill = GridBagConstraints.HORIZONTAL; 
//        pnorte.setBackground(Color.yellow);
//        tablePanel.add(pnorte, gbc);
//        
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        gbc.gridwidth = 3;
//        gbc.gridheight = 1;
//        gbc.fill = GridBagConstraints.NONE;
//        peste.setBackground(Color.MAGENTA);
//        tablePanel.add(peste, gbc);
//        
//        gbc.gridx = 1;
//        gbc.gridy = 1;
//        gbc.fill = GridBagConstraints.NONE;
//        pcentral.setBackground(Color.blue);
//        pcentral.add(tablaProveedores);
//        tablePanel.add(pcentral, gbc);
//        
//        gbc.gridx = 2;
//        gbc.gridy = 1;
//        gbc.fill = GridBagConstraints.NONE;
//        poeste.setBackground(Color.red);
//        tablePanel.add(poeste, gbc);
//        
//        gbc.gridx = 0;
//        gbc.gridy = 2;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        psur.setBackground(Color.black);
//        tablePanel.add(psur, gbc);
        
        ctrl = new ProveedoresCtrl();
        agregarDatosTabla("");
    }
    
    void agregarDatosTabla(String buscar){
        try {
            DefaultTableModel modelo;
            modelo = ctrl.listar(buscar);
            
            tablaProveedores.setModel(modelo);
            tablaProveedores.getTableHeader().setReorderingAllowed(false);
            tablaProveedores.getColumnModel().getColumn(0).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(1).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(2).setResizable(false);

            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
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

        filtrosPanel = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();

        filtrosPanel.setBackground(new java.awt.Color(102, 153, 255));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filtrosPanelLayout = new javax.swing.GroupLayout(filtrosPanel);
        filtrosPanel.setLayout(filtrosPanelLayout);
        filtrosPanelLayout.setHorizontalGroup(
            filtrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtrosPanelLayout.createSequentialGroup()
                .addContainerGap(581, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addContainerGap())
        );
        filtrosPanelLayout.setVerticalGroup(
            filtrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtrosPanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addContainerGap())
        );

        tablePanel.setBackground(new java.awt.Color(255, 153, 102));

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del Proveedor", "Nombre de la Tienda", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProveedores.setToolTipText("");
        tablaProveedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tablaProveedores);
        if (tablaProveedores.getColumnModel().getColumnCount() > 0) {
            tablaProveedores.getColumnModel().getColumn(0).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(1).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filtrosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filtrosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        ProveedoresForm pf = new ProveedoresForm(new MainFrame(), true);
        pf.setLocationRelativeTo(null);
        pf.setVisible(true);
        
        //luego de cerrar el pf
        agregarDatosTabla("");
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel filtrosPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
