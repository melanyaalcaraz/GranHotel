package Vistas;

import Controlador.CategoriaData;
import Controlador.Conexion;
import Modelo.Categoria;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author La Bestia
 */
public class FormularioCategoriaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioCategoriaView
     */
    public FormularioCategoriaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jREstado = new javax.swing.JRadioButton();
        jTIdCategoria = new javax.swing.JTextField();
        jTCantPersonas = new javax.swing.JTextField();
        jTTipoHabitacion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jBBuscar = new javax.swing.JButton();
        jTPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTCantCamas = new javax.swing.JTextField();
        jTTipoCama = new javax.swing.JTextField();
        jBEliminar = new javax.swing.JButton();

        setTitle("Categoria");

        jLabel1.setText("Categoria");

        jLabel2.setText("Id Categoria");

        jLabel3.setText("Cantidad de Personas:");

        jLabel4.setText("Cantidad de Camas:");

        jLabel5.setText("Tipo de Cama:");

        jLabel6.setText("Tipo de Habitacion:");

        jLabel7.setText("Precio:");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jTIdCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIdCategoriaKeyTyped(evt);
            }
        });

        jTCantPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCantPersonasKeyTyped(evt);
            }
        });

        jTTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTipoHabitacionKeyTyped(evt);
            }
        });

        jBBuscar.setText("Buscar");

        jTPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPrecioKeyTyped(evt);
            }
        });

        jLabel8.setText("Activo:");

        jTCantCamas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCantCamasKeyTyped(evt);
            }
        });

        jTTipoCama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTipoCamaKeyTyped(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jBBuscar))
                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTTipoCama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTCantCamas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTCantPersonas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jBLimpiar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jREstado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jBModificar)
                                .addGap(18, 18, 18)
                                .addComponent(jBAgregar)
                                .addGap(37, 37, 37)
                                .addComponent(jBEliminar)))
                        .addGap(42, 42, 42)))
                .addComponent(jBSalir)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSalir)
                            .addComponent(jBAgregar)
                            .addComponent(jBModificar)
                            .addComponent(jBLimpiar)
                            .addComponent(jBEliminar))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jREstado)
                        .addGap(0, 89, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTIdCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdCategoriaKeyTyped
        noNumero(evt);
    }//GEN-LAST:event_jTIdCategoriaKeyTyped

    private void jTCantPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCantPersonasKeyTyped
        noNumero(evt);
    }//GEN-LAST:event_jTCantPersonasKeyTyped

    private void jTCantCamasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCantCamasKeyTyped
        noNumero(evt);
    }//GEN-LAST:event_jTCantCamasKeyTyped

    private void jTTipoCamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTipoCamaKeyTyped
        noNumero(evt);
    }//GEN-LAST:event_jTTipoCamaKeyTyped

    private void jTTipoHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTipoHabitacionKeyTyped
        noCaracter(evt);
    }//GEN-LAST:event_jTTipoHabitacionKeyTyped

    private void jTPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioKeyTyped
        noNumero(evt);
    }//GEN-LAST:event_jTPrecioKeyTyped

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        Conexion con = new Conexion();
        CategoriaData cd = new CategoriaData(con);

        Integer id = Integer.parseInt(jTIdCategoria.getText());

        if (jREstado.isSelected()) {
            cd.eliminarCategoria(id);
        } else {
            JOptionPane.showMessageDialog(null, " Verifica la casilla que indica si esta activo o no la categoria");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        Conexion con = new Conexion();
        CategoriaData cd = new CategoriaData(con);

        if (vacio()) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, verifique antes de guardar");
        } else {
            int idCategoria = Integer.parseInt(jTIdCategoria.getText());
            int cantPersonas = Integer.parseInt(jTCantPersonas.getText());
            int cantCamas = Integer.parseInt(jTCantCamas.getText());
            int tipoCama = Integer.parseInt(jTTipoCama.getText());
            String tipoHabitacion = jTTipoHabitacion.getText();
            double precio = Double.parseDouble(jTPrecio.getText());
            boolean activo = jREstado.isSelected();

            Categoria categoria = new Categoria(idCategoria, cantPersonas, cantCamas, tipoCama, tipoHabitacion, precio, activo);

            cd.modificarCategoria(categoria);
        }

    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        Conexion con = new Conexion();
        CategoriaData cdt = new CategoriaData(con);
        
        if(vacio()){
            JOptionPane.showMessageDialog(null, "Hay campos vacios, por favor complete el formulario");
        }else{
            int cantPer = Integer.parseInt(jTCantPersonas.getText());
            int cantCam = Integer.parseInt(jTCantCamas.getText());
            int tipoCam = Integer.parseInt(jTTipoCama.getText());
            String tipoHab = jTTipoHabitacion.getText();
            double pre = Double.parseDouble(jTPrecio.getText());
            boolean b = jREstado.isSelected();
            
            Categoria cate = new Categoria(cantPer, cantCam, tipoCam, tipoHab, pre, b);
            
            cdt.añadirCategoria(cate);
            
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void limpiar() {
        jTIdCategoria.setText("");
        jTCantPersonas.setText("");
        jTTipoHabitacion.setText("");
        jTCantCamas.setText("");
        jTTipoCama.setText("");
        jTPrecio.setText("");
        jREstado.setSelected(false);
    }

    private boolean vacio() {
        boolean vacio = false;

        if (jTCantPersonas.getText().equals("") || jTTipoHabitacion.getText().equals("") || jTCantCamas.getText().equals("") || jTTipoCama.getText().equals("") || jTPrecio.getText().equals("")) {
            vacio = true;

        }
        return (vacio);
    }

    public void noNumero(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {  //getToolkit().beep();
            evt.consume();
        }
    }

    public void noCaracter(java.awt.event.KeyEvent evt) {
        if (!(Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCantCamas;
    private javax.swing.JTextField jTCantPersonas;
    private javax.swing.JTextField jTIdCategoria;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTTipoCama;
    private javax.swing.JTextField jTTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
