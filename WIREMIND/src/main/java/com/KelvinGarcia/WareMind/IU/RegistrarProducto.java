/*
 * Created by JFormDesigner on Thu May 02 09:07:36 GMT-05:00 2024
 */

package com.KelvinGarcia.WareMind.IU;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Samuel
 */
public class RegistrarProducto extends JFrame {
    public RegistrarProducto() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Samuel Jimenez Paredes
        this2 = new JFrame();
        lblId = new JLabel();
        lblNombre = new JLabel();
        lblPrecio = new JLabel();
        lblCantidad = new JLabel();
        lblTipo = new JLabel();
        txtId = new JTextField();
        spnPrecio = new JSpinner();
        txtNombre = new JTextField();
        spnCantidad = new JSpinner();
        txtTipo = new JTextField();
        btnGuardar = new JButton();
        btnLimpiar = new JButton();

        //======== this2 ========
        {
            this2.setTitle("REGISTRAR PRODUCTO");
            var this2ContentPane = this2.getContentPane();

            //---- lblId ----
            lblId.setText("ID");

            //---- lblNombre ----
            lblNombre.setText("Nombre");

            //---- lblPrecio ----
            lblPrecio.setText("Precio");

            //---- lblCantidad ----
            lblCantidad.setText("Cantidad");

            //---- lblTipo ----
            lblTipo.setText("Tipo");

            //---- btnGuardar ----
            btnGuardar.setText("Guardar");

            //---- btnLimpiar ----
            btnLimpiar.setText("Limpiar");

            GroupLayout this2ContentPaneLayout = new GroupLayout(this2ContentPane);
            this2ContentPane.setLayout(this2ContentPaneLayout);
            this2ContentPaneLayout.setHorizontalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lblId, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtId))
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(lblPrecio)
                                            .addComponent(lblNombre))
                                        .addGap(18, 18, 18)
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(spnPrecio)
                                            .addComponent(txtNombre)))
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(lblCantidad)
                                            .addComponent(lblTipo))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(txtTipo, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnCantidad, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38))
                            .addGroup(GroupLayout.Alignment.TRAILING, this2ContentPaneLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)))
                        .addComponent(btnGuardar)
                        .addGap(31, 31, 31))
            );
            this2ContentPaneLayout.setVerticalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio)
                            .addComponent(spnPrecio, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad)
                            .addComponent(spnCantidad, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(txtTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar))
                        .addContainerGap(30, Short.MAX_VALUE))
            );
            this2.pack();
            this2.setLocationRelativeTo(this2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Samuel Jimenez Paredes
    private JFrame this2;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblPrecio;
    private JLabel lblCantidad;
    private JLabel lblTipo;
    private JTextField txtId;
    private JSpinner spnPrecio;
    private JTextField txtNombre;
    private JSpinner spnCantidad;
    private JTextField txtTipo;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
