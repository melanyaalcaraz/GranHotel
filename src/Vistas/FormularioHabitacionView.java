/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.CategoriaData;
import Controlador.Conexion;
import Controlador.HabitacionData;
import Modelo.Categoria;
import Modelo.Habitacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Anto
 */
public class FormularioHabitacionView extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioHabitacionView
     */
    public FormularioHabitacionView() {
        initComponents();
        buttonModificar.setEnabled(false);
        buttonEstado.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Recuerde: para añadir una habitacion la categoria ya debe de estar creada ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNmroHabitacion = new javax.swing.JTextField();
        jtPiso = new javax.swing.JTextField();
        radioEstado = new javax.swing.JRadioButton();
        jtIdHabitacion = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonEstado = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtIdCategoria = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Habitacion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Id habitación:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Número habitación:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Piso:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Id Categoria:");

        jtNmroHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNmroHabitacionActionPerformed(evt);
            }
        });

        jtPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPisoActionPerformed(evt);
            }
        });

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonEstado.setText("Cambiar estado");
        buttonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstadoActionPerformed(evt);
            }
        });

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Refaccion:");

        jtIdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioEstado)
                            .addComponent(jtIdHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jtNmroHabitacion)
                            .addComponent(jtPiso)
                            .addComponent(jtIdCategoria))
                        .addGap(18, 18, 18)
                        .addComponent(buttonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNmroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(radioEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGuardar)
                    .addComponent(buttonModificar)
                    .addComponent(buttonEstado)
                    .addComponent(buttonSalir)
                    .addComponent(buttonLimpiar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        // TODO add your handling code here:
        Conexion con = new Conexion();
        try {
            Integer id = Integer.parseInt(jtIdHabitacion.getText());
            Habitacion habitacion = new HabitacionData(con).buscarHabitacion(id);
            if (habitacion != null) {
                //Cambiar int a string
                String idHabi = String.valueOf(habitacion.getIdHabitacion());
                jtIdHabitacion.setText(idHabi);
                radioEstado.setSelected(habitacion.isRefaccion());
                String nmroHabitacion = String.valueOf(habitacion.getNroHabitacion());
                jtNmroHabitacion.setText(nmroHabitacion);
                String piso = String.valueOf(habitacion.getPiso());
                jtPiso.setText(piso);
                String idCat = String.valueOf(habitacion.obtengoIdCategoria());
                jtIdCategoria.setText(idCat);

                buttonModificar.setEnabled(true);
                buttonEstado.setEnabled(true);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El dato no es numerico, vuelve a ingresarlo ");
            jtIdHabitacion.requestFocus();
            limpiar();
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void jtNmroHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNmroHabitacionActionPerformed
        // TODO add your handling code here:ç
        try {
            int nmroHabitacion = Integer.parseInt(jtNmroHabitacion.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El dato no es numerico, vuelve a ingresarlo ");
            jtNmroHabitacion.requestFocus();
            limpiar();
        }
    }//GEN-LAST:event_jtNmroHabitacionActionPerformed

    private void jtPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPisoActionPerformed
        // TODO add your handling code here:
        try {
            int piso = Integer.parseInt(jtPiso.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El dato no es numerico, vuelve a ingresarlo ");
            jtPiso.requestFocus();
            limpiar();
        }
    }//GEN-LAST:event_jtPisoActionPerformed

    private void jtIdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdCategoriaActionPerformed
        // TODO add your handling code here:

        try {

            int piso = Integer.parseInt(jtPiso.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El dato no es numerico, vuelve a ingresarlo ");
            jtPiso.requestFocus();
            limpiar();
        }
    }//GEN-LAST:event_jtIdCategoriaActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        // TODO add your handling code here:
        if (vacio()) {
            Conexion con = new Conexion();
            HabitacionData ad = new HabitacionData(con);

            Categoria cat = new CategoriaData(con).buscarCategoria(Integer.parseInt(jtIdCategoria.getText()));
            cat.getIdCategoria();

            Integer nmro = Integer.parseInt(jtNmroHabitacion.getText());
            Integer piso = Integer.parseInt(jtPiso.getText());

            Boolean estado;
            if (radioEstado.isSelected()) {
                estado = true;
            } else {
                estado = false;
            }
            Habitacion alumno = new Habitacion(cat, nmro, piso, estado);

            ad.agregarHabitacion(alumno);
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos para revisar, no deben quedar vacios");
        }

    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        // TODO add your handling code here:
        if (vacio()) {
            Conexion con = new Conexion();
            HabitacionData ad = new HabitacionData(con);

            //Categoria cat = jtIdCategoria.getText();
            Categoria cat = new CategoriaData(con).buscarCategoria(Integer.parseInt(jtIdCategoria.getText()));
            cat.getIdCategoria();

            Integer nmro = Integer.parseInt(jtNmroHabitacion.getText());
            Integer piso = Integer.parseInt(jtPiso.getText());
            Integer idHabitacion = Integer.parseInt(jtIdHabitacion.getText());

            Boolean estado = false;

            Habitacion habitacion = new Habitacion(cat, nmro, piso, estado);

            ad.modificarHabitacion(idHabitacion, habitacion);
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos para revisar, no deben quedar vacios");
        }
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstadoActionPerformed
        // TODO add your handling code here:
        Conexion con = new Conexion();
        HabitacionData hd = new HabitacionData(con);

        Integer id = Integer.parseInt(jtIdHabitacion.getText());

        if (radioEstado.isSelected()) {
            hd.habilitarHabitacion(id);
        } else {
            hd.deshabilitarHabitacion(id);
        }
    }//GEN-LAST:event_buttonEstadoActionPerformed

    public void limpiar() {
        jtIdHabitacion.setText("");
        jtNmroHabitacion.setText("");
        jtPiso.setText("");
        jtIdCategoria.setText("");
        radioEstado.setSelected(false);
    }

    private boolean vacio() {
        String str = "";
        if (!str.equals(jtNmroHabitacion.getText()) && !str.equals(jtPiso.getText()) && !str.equals(jtIdCategoria.getText())) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonEstado;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtIdCategoria;
    private javax.swing.JTextField jtIdHabitacion;
    private javax.swing.JTextField jtNmroHabitacion;
    private javax.swing.JTextField jtPiso;
    private javax.swing.JRadioButton radioEstado;
    // End of variables declaration//GEN-END:variables
}
