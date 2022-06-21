package Vistas;

import Controlador.CategoriaData;
import Controlador.Conexion;
import Controlador.HabitacionData;
import Controlador.HuespedData;
import Controlador.ReservaData;
import Modelo.Categoria;
import Modelo.Habitacion;
import Modelo.Huesped;
import Modelo.Reserva;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anto
 */
public class FormularioReservaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioReservaView
     */
    FondoPanel fondo = new FondoPanel();

    private HuespedData HuesData;
    private ReservaData resData;
    private HabitacionData habData;
    

    private ArrayList<Huesped> listaH;
    private ArrayList<Habitacion> listaHab;
    private ArrayList<Habitacion> listaHab1;
    
    
    private Conexion conexion;
    private DefaultTableModel modelo;

    public FormularioReservaView() {
        initComponents();
        //fechaInicial();
        conexion = new Conexion();
        HuesData = new HuespedData(conexion);
        habData = new HabitacionData(conexion);
        
        
        
        listaH = (ArrayList<Huesped>) HuesData.listarHuespedes();
        
        modelo = (DefaultTableModel) jTable1.getModel();
//        cargaHuesped();
//        cargaHabitacion();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoHabitacion = new javax.swing.ButtonGroup();
        jPanel1 = new FondoPanel()
        ;
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        boxHuesped = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        fechaFin = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jtCantPersonas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radioEstado = new javax.swing.JRadioButton();
        jtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        radioHabLibres = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonReservar = new javax.swing.JButton();
        buttonAnular = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTidReserva = new javax.swing.JTextField();
        jRHabOcupadas = new javax.swing.JRadioButton();
        jBBuscarId = new javax.swing.JButton();
        comboHabitacion = new javax.swing.JComboBox<>();
        buttonCargaCombo = new javax.swing.JButton();

        setResizable(true);
        setTitle("Reserva");
        setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reservas:");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un huesped:");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Inicio:");

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha Fin:");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad de personas:");

        jtCantPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantPersonasActionPerformed(evt);
            }
        });
        jtCantPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantPersonasKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");

        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio:           $ ");

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Listado de Habitaciones:");

        grupoHabitacion.add(radioHabLibres);
        radioHabLibres.setText("Habitaciones libres");
        radioHabLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHabLibresActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Habitacion", "Numero Habitacion", "Id Categoria", "Refaccion", "Piso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        buttonReservar.setText("Reservar");
        buttonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReservarActionPerformed(evt);
            }
        });

        buttonAnular.setText("Anular");
        buttonAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnularActionPerformed(evt);
            }
        });

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de Habitacion:");

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("id Reserva:");

        jTidReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTidReservaKeyTyped(evt);
            }
        });

        grupoHabitacion.add(jRHabOcupadas);
        jRHabOcupadas.setText("Habitaciones Ocupadas");
        jRHabOcupadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRHabOcupadasActionPerformed(evt);
            }
        });

        jBBuscarId.setText("Buscar");
        jBBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarIdActionPerformed(evt);
            }
        });

        buttonCargaCombo.setText("Cargar Combo");
        buttonCargaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCargaComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jTidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jBBuscarId))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(boxHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonCargaCombo))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(radioEstado)))))
                .addGap(26, 94, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(buttonReservar)
                        .addGap(29, 29, 29)
                        .addComponent(buttonAnular)
                        .addGap(64, 64, 64)
                        .addComponent(jBModificar)
                        .addGap(28, 28, 28)
                        .addComponent(buttonSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(34, 34, 34)
                                        .addComponent(jtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)))))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jRHabOcupadas)
                        .addGap(137, 137, 137)
                        .addComponent(radioHabLibres)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCargaCombo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioEstado)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(41, 41, 41)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRHabOcupadas)
                    .addComponent(radioHabLibres))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonReservar)
                    .addComponent(buttonAnular)
                    .addComponent(buttonSalir)
                    .addComponent(jBModificar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void buttonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReservarActionPerformed
        // TODO add your handling code here:
        if (vacio()) {
            resData = new ReservaData(conexion);
            int filaSeleccionada = jTable1.getSelectedRow();
            if (filaSeleccionada != -1) {
                Huesped hues = (Huesped) boxHuesped.getSelectedItem();
                habData = new HabitacionData(conexion);
                Habitacion hab = habData.buscarHabitacion((int) jTable1.getValueAt((int) jTable1.getSelectedRow(), 0));

                //JCalendar --> Date--> LocalDate
                Date fecha1 = fechaInicio.getDate();
                LocalDate fechaI = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Date fecha2 = fechaFin.getDate();
                LocalDate fechaF = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                //String--> Double
                String pre = jtPrecio.getText();
                Double precio = Double.parseDouble(pre);
                //String-->Int
                String cant = jtCantPersonas.getText();
                int cantPersonas = Integer.parseInt(cant);
                boolean estado;
                if (radioEstado.isSelected()) {
                    estado = true;
                } else {
                    estado = false;
                }

                Reserva re = new Reserva(hab, hues, fechaI, fechaF, precio, cantPersonas, estado);

                resData.reservar(re);
                borrarFilaTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Hay campos para revisar, no deben quedar vacios");
            }
        }

    }//GEN-LAST:event_buttonReservarActionPerformed

    private void buttonAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnularActionPerformed
        // TODO add your handling code here:
        resData = new ReservaData(conexion);
        habData = new HabitacionData(conexion);
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada != -1) {
            //modelo.setRowCount(0);
            Huesped hues = (Huesped) boxHuesped.getSelectedItem();
            int idHuesped = hues.getIdhuesped();
            Habitacion hab = habData.buscarHabitacion((int) jTable1.getValueAt((int) jTable1.getSelectedRow(), 0));
            int idHabitacion = hab.getIdHabitacion();
            resData.anularReserva(idHuesped, idHabitacion);
            // borrarFilaTabla();

        }

    }//GEN-LAST:event_buttonAnularActionPerformed

    private void radioHabLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHabLibresActionPerformed
        // TODO add your handling code here:
        if (vacio()) {
            jRHabOcupadas.setSelected(false);
            borrarFilaTabla();
            cargaHabLibres();
            buttonAnular.setEnabled(false);
            buttonReservar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor complete los campos del formulario");
        }
    }//GEN-LAST:event_radioHabLibresActionPerformed

    private void jtCantPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantPersonasActionPerformed
        // TODO add your handling code here:
        try {
            int cant = Integer.parseInt(jtCantPersonas.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El dato no es numerico, vuelve a ingresarlo ");
            jtCantPersonas.requestFocus();
            limpiar();
        }
    }//GEN-LAST:event_jtCantPersonasActionPerformed

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        try {
            int precio = Integer.parseInt(jtPrecio.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El dato no es numerico, vuelve a ingresarlo ");
            jtPrecio.requestFocus();
            limpiar();
        }
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        Conexion con = new Conexion();
        ReservaData reserd = new ReservaData(con);
        
        if (vacio()){
            JOptionPane.showMessageDialog(null, "Hay campos vacios, verifique antes de modificar");
        }else{
            
            Huesped hues = new HuespedData(con).buscarHuesped(((Huesped) boxHuesped.getSelectedItem()).getIdhuesped());
           // hues.getIdhuesped();
                    
            Habitacion habi = new HabitacionData(con).buscarHabitacion(((Habitacion)comboHabitacion.getSelectedItem()).getIdHabitacion());
           // habi.getIdHabitacion();
            
            int idReserva = Integer.parseInt(jTidReserva.getText());
            
            Date fecha1 = fechaInicio.getDate();
            LocalDate inicio = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Date fecha2 = fechaFin.getDate();
            LocalDate fin = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            double precio = Double.parseDouble(jtPrecio.getText());
            int cantiPersonas = (Integer.parseInt(jtCantPersonas.getText()));
            boolean activo = radioEstado.isSelected();
            
            Reserva reserva = new Reserva(habi,hues,inicio,fin,precio,cantiPersonas,activo);
            
            reserd.modificarReserva(idReserva, reserva);
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        noNumero(evt);
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtCantPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantPersonasKeyTyped
        noNumero(evt);
    }//GEN-LAST:event_jtCantPersonasKeyTyped

    private void jTidReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidReservaKeyTyped
        noNumero(evt);
    }//GEN-LAST:event_jTidReservaKeyTyped

    private void jRHabOcupadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRHabOcupadasActionPerformed
        if (vacio()) {
            radioHabLibres.setSelected(false);
            borrarFilaTabla();
            cargaHabReservadas();
            buttonAnular.setEnabled(true);
            buttonReservar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor complete los campos del formulario");
        }
    }//GEN-LAST:event_jRHabOcupadasActionPerformed

    private void jBBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarIdActionPerformed
        Conexion con = new Conexion();
        ReservaData rsdata = new ReservaData(con);
        Reserva reser = new Reserva();
              
          
        
        if(!jTidReserva.getText().equals("")){
            reser = rsdata.buscarReserva(Integer.parseInt(jTidReserva.getText()));
            
            comboHabitacion.setSelectedItem(reser.getHabitacion());
            boxHuesped.setSelectedItem(reser.getHuesped());
            
            LocalDate lc = reser.getFechaInicio();
            Date date = Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            fechaInicio.setDate(date);
            
            LocalDate loc = reser.getFechaFin();
            Date date2 = Date.from(loc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            fechaFin.setDate(date2);
            
            jtPrecio.setText(String.valueOf(reser.getPrecioTotal()));
            jtCantPersonas.setText(String.valueOf(reser.getCantPersonas()));
            radioEstado.setSelected(reser.isActivo());
        }
        else{
            JOptionPane.showMessageDialog(null, "El id no puede quedar vacio");
        }
       
    }//GEN-LAST:event_jBBuscarIdActionPerformed

    private void buttonCargaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCargaComboActionPerformed
        // TODO add your handling code here:
        if (validacionReserva()) {
            cargaHuesped();
            cargaHabitacion();
        }
    }//GEN-LAST:event_buttonCargaComboActionPerformed
    
    private boolean validacionReserva(){
        // if fechaInicio is set
        if (fechaInicio.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de inicio");
            return false;
        }
        // if fechaFin is set
        if (fechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de fin");
            return false;
        }
        // if fechaInicio is after fechaFin
        if (fechaInicio.getDate().after(fechaFin.getDate())) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser antes de la fecha de fin");
            return false;
        }
        // if cantPersonas is set
        if (jtCantPersonas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la cantidad de personas");
            return false;
        }
       
        return true;

    }
    
    public void limpiar() {
        jtCantPersonas.setText("");
        jtPrecio.setText("");
        radioEstado.setSelected(false);
        comboHabitacion.removeAllItems();
        boxHuesped.removeAllItems();
    }

    private void cargaHuesped() { // Carga al combo box
        for (Huesped item : listaH) {
            boxHuesped.addItem(item);
        }
    }
    
    
    private void cargaHabitacion(){ // Carga al combo box
        comboHabitacion.removeAllItems();
        int cantiPersonas = Integer.parseInt(jtCantPersonas.getText());
        listaHab1 = (ArrayList<Habitacion>) habData.listarHabitaciones(cantiPersonas);
        listaHab1.forEach((item) -> {
            comboHabitacion.addItem(item);
        });
    }
    
    
    public void fechaInicial() {
        LocalDate localDate = LocalDate.now();
        Date date = java.sql.Date.valueOf(localDate);
        fechaInicio.setDate(date);
        fechaFin.setDate(date);
    }


    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    
     private void cargaHabReservadas(){
        //borrarFilasTabla();
        
        Date fecha1 = fechaInicio.getDate();
        LocalDate fechaI = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Date fecha2 = fechaFin.getDate();
        LocalDate fechaF = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         resData= new ReservaData(conexion);
       int cantiPersonas = (Integer.parseInt(jtCantPersonas.getText()));
         listaHab = (ArrayList) resData.obtenerHabitacionesOcupadas(fechaI,fechaF,cantiPersonas);
        
        
        modelo.setRowCount(0);
         
         listaHab.forEach((h) -> {
             modelo.addRow(new Object[] { h.getIdHabitacion(), h.getNroHabitacion(), h.obtengoIdCategoria(), h.isRefaccion(), h.getPiso()});
        });
         
    }
    

    private void cargaHabLibres() {
        //borrarFilasTabla();
        Date fecha1 = fechaInicio.getDate();
        LocalDate fechaI = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date fecha2 = fechaFin.getDate();
        LocalDate fechaF = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        resData = new ReservaData(conexion);
        int cantiPersonas = (Integer.parseInt(jtCantPersonas.getText()));
        List<Habitacion> lista = resData.obtenerHabitacionesLibres(fechaI, fechaF,cantiPersonas);
        modelo.setRowCount(0);
        for (Habitacion h : lista) {
            modelo.addRow(new Object[]{h.getIdHabitacion(), h.getNroHabitacion(), h.obtengoIdCategoria(), h.isRefaccion(), h.getPiso()});
        }
    }

//    private boolean vacio() { //vacio no controla si esta marcado radiobutton siempre se puede modificar de nuevo
//        boolean vacio=false;
//        String str = "";
//        if (str.equals(jtPrecio.getText())||str.equals(jtCantPersonas.getText()) || fechaInicio.getDate()== fechaFin.getDate() || str.equals(jtPrecio.getText())) {
//            vacio= true;
//        }
//        return(vacio);
//    }
    private boolean vacio() {
       
        String str = "";
        if (!str.equals(jtPrecio.getText()) && !str.equals(jtCantPersonas.getText()) && !str.equals(fechaInicio.getDate()) && !str.equals(fechaFin.getDate()) && !str.equals(jtPrecio.getText())) {
            return true;
        } else {
            return false;
        }
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
    private javax.swing.JComboBox<Huesped> boxHuesped;
    private javax.swing.JButton buttonAnular;
    private javax.swing.JButton buttonCargaCombo;
    private javax.swing.JButton buttonReservar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<Habitacion> comboHabitacion;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.ButtonGroup grupoHabitacion;
    private javax.swing.JButton jBBuscarId;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRHabOcupadas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTidReserva;
    private javax.swing.JTextField jtCantPersonas;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JRadioButton radioEstado;
    private javax.swing.JRadioButton radioHabLibres;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagen/reserva2.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

}
