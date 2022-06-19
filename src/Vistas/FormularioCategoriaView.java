package Vistas;

import Controlador.CategoriaData;
import Controlador.Conexion;
import Modelo.Categoria;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author La Bestia
 */
public class FormularioCategoriaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioCategoriaView
     */
    FondoPanel fondo = new FondoPanel();
    public FormularioCategoriaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
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
        jSeparator2 = new javax.swing.JSeparator();

        setTitle("Categoria");

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Categoria");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Categoria:");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de Personas:");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de Camas:");

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Cama:");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de Habitacion:");

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio:");

        jBSalir.setBackground(new java.awt.Color(0, 102, 153));
        jBSalir.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBAgregar.setBackground(new java.awt.Color(0, 102, 153));
        jBAgregar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(0, 102, 153));
        jBModificar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(0, 102, 153));
        jBLimpiar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
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

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jBBuscar.setBackground(new java.awt.Color(0, 102, 153));
        jBBuscar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPrecioKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
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

        jBEliminar.setBackground(new java.awt.Color(0, 102, 153));
        jBEliminar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(jBLimpiar)
                        .addGap(38, 38, 38)
                        .addComponent(jBModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregar)
                        .addGap(37, 37, 37)
                        .addComponent(jBEliminar)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jBBuscar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTTipoCama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTCantCamas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTCantPersonas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                            .addComponent(jTTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jREstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jBSalir)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jREstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBAgregar)
                    .addComponent(jBModificar)
                    .addComponent(jBLimpiar)
                    .addComponent(jBEliminar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            JOptionPane.showMessageDialog(null, "Hay campos vacios, verifique antes de modificar");
        } else {
            int idCategoria = Integer.parseInt(jTIdCategoria.getText());
            int cantPersonas = Integer.parseInt(jTCantPersonas.getText());
            int cantCamas = Integer.parseInt(jTCantCamas.getText());
            int tipoCama = Integer.parseInt(jTTipoCama.getText());
            String tipoHabitacion = jTTipoHabitacion.getText();
            double precio = Double.parseDouble(jTPrecio.getText());
            boolean activo = jREstado.isSelected();

            Categoria categoria = new Categoria(cantPersonas, cantCamas, tipoCama, tipoHabitacion, precio, activo);

            cd.modificarCategoria(idCategoria,categoria);
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

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        Conexion con = new Conexion();
        CategoriaData cdta = new CategoriaData(con);
        Categoria categ = new Categoria();
        
        if(!jTIdCategoria.getText().equals("")){
            categ = cdta.buscarCategoria(Integer.parseInt(jTIdCategoria.getText()));
            
            jTCantPersonas.setText(String.valueOf(categ.getCantPersonas()));
            jTCantCamas.setText(String.valueOf(categ.getCantCamas()));
            jTTipoCama.setText(String.valueOf(categ.getTipoCama()));
            jTTipoHabitacion.setText(categ.getTipoHabitacion());
            jTPrecio.setText(String.valueOf(categ.getPrecio()));
            jREstado.setEnabled(categ.isActivo());
        }
        else{
            JOptionPane.showMessageDialog(null, "La categoria no fue encontrada");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTCantCamas;
    private javax.swing.JTextField jTCantPersonas;
    private javax.swing.JTextField jTIdCategoria;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTTipoCama;
    private javax.swing.JTextField jTTipoHabitacion;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        private Image imagen;
        @Override
        public void paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagen/categoria1.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
          
    }
    
}
