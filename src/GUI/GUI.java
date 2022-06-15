/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Automata.AFD;
import Automata.TransicionAFD;
import Grafo.ManejaGrafo;
import com.mxgraph.swing.mxGraphComponent;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mdlaf.MaterialLookAndFeel;

/**
 *
 * @author angel
 */
public class GUI extends javax.swing.JFrame {

    // VARIABLES
    public int xMouse, yMouse;
    public Object estadoInicial;
    public String[] alfabeto;
    public ArrayList<String> estados=new ArrayList<String>();
    public String cadenaPrueba;
    public ArrayList<Object> estado_final=new ArrayList<Object>();
    public String estado_aceptacion;
    DefaultTableModel model = new DefaultTableModel();
    char [][] Panel_Magico;
    public char[] alfaChar;
    public char[] estChar;
    public String[] estString;
    //public ArrayList<Object> Transicion_estadoDestino=new ArrayList<Object>();
    ManejaGrafo grafica = new ManejaGrafo();
        ///Automata finito determinista
        AFD Automata = new AFD();
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        background = new javax.swing.JPanel();
        panel_titulo = new javax.swing.JPanel();
        panel_salir = new javax.swing.JPanel();
        txt_salir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_form = new javax.swing.JPanel();
        panel_btn_graficar_automata = new javax.swing.JPanel();
        btn_add_transicion = new javax.swing.JButton();
        Gen_tabla = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        estado_1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        elemento_alfabeto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        estado_2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_alfabeto3 = new javax.swing.JTextField();
        btn_add_alfabeto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_edo_inicial = new javax.swing.JTextField();
        btn_add_estado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        estado_Inicial_box = new javax.swing.JComboBox<>();
        btn_estado_inicial = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        estado_Final_box = new javax.swing.JComboBox<>();
        btn_estado_final = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        panel_tablero = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_estados = new javax.swing.JScrollPane();
        T_estructura = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(234, 235, 237));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_titulo.setBackground(new java.awt.Color(152, 218, 217));
        panel_titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_tituloMouseDragged(evt);
            }
        });
        panel_titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_tituloMousePressed(evt);
            }
        });
        panel_titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_salir.setForeground(new java.awt.Color(168, 209, 231));

        txt_salir.setBackground(new java.awt.Color(152, 218, 217));
        txt_salir.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txt_salir.setForeground(new java.awt.Color(51, 51, 51));
        txt_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_salir.setText("x");
        txt_salir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_salirLayout = new javax.swing.GroupLayout(panel_salir);
        panel_salir.setLayout(panel_salirLayout);
        panel_salirLayout.setHorizontalGroup(
            panel_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_salirLayout.createSequentialGroup()
                .addComponent(txt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_salirLayout.setVerticalGroup(
            panel_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_salirLayout.createSequentialGroup()
                .addComponent(txt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_titulo.add(panel_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 50, 50));

        jLabel1.setBackground(new java.awt.Color(152, 218, 217));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Generador De Autómatas");
        panel_titulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 60));

        background.add(panel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 55));

        panel_form.setBackground(new java.awt.Color(152, 218, 217));
        panel_form.setForeground(new java.awt.Color(204, 204, 204));
        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_btn_graficar_automata.setBackground(new java.awt.Color(0, 153, 255));
        panel_btn_graficar_automata.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_btn_graficar_automata.setLayout(new java.awt.GridLayout(1, 0));
        panel_form.add(panel_btn_graficar_automata, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 722, -1, -1));

        btn_add_transicion.setBackground(new java.awt.Color(152, 218, 217));
        btn_add_transicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        btn_add_transicion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 218, 217), 1, true));
        btn_add_transicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add_transicion.setMaximumSize(new java.awt.Dimension(20, 20));
        btn_add_transicion.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_add_transicion.setOpaque(true);
        btn_add_transicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_add_transicionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_add_transicionMouseExited(evt);
            }
        });
        btn_add_transicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_transicionActionPerformed(evt);
            }
        });
        panel_form.add(btn_add_transicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 100, 50));

        Gen_tabla.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Gen_tabla.setText("Generar Tabla");
        Gen_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gen_tablaActionPerformed(evt);
            }
        });
        panel_form.add(Gen_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 170, 50));

        btn_limpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_limpiar.setText("LImpiar tabla");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        panel_form.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 140, 40));

        jPanel1.setBackground(new java.awt.Color(152, 218, 217));
        jPanel1.setLayout(new java.awt.GridLayout(3, 2, 40, 30));

        jLabel10.setBackground(new java.awt.Color(152, 218, 217));
        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Estado:");
        jPanel1.add(jLabel10);

        estado_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_1ActionPerformed(evt);
            }
        });
        jPanel1.add(estado_1);

        jLabel12.setBackground(new java.awt.Color(152, 218, 217));
        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Elemento:");
        jPanel1.add(jLabel12);

        elemento_alfabeto.setToolTipText("");
        elemento_alfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento_alfabetoActionPerformed(evt);
            }
        });
        jPanel1.add(elemento_alfabeto);

        jLabel11.setBackground(new java.awt.Color(152, 218, 217));
        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Estado:");
        jPanel1.add(jLabel11);

        estado_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_2ActionPerformed(evt);
            }
        });
        jPanel1.add(estado_2);

        panel_form.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 260, 170));

        jPanel2.setBackground(new java.awt.Color(152, 218, 217));
        jPanel2.setLayout(new java.awt.GridLayout(2, 3, 21, 25));

        jLabel2.setBackground(new java.awt.Color(152, 218, 217));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Alfabeto:");
        jPanel2.add(jLabel2);

        txt_alfabeto3.setBackground(new java.awt.Color(168, 232, 233));
        txt_alfabeto3.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txt_alfabeto3.setForeground(new java.awt.Color(153, 153, 153));
        txt_alfabeto3.setText("Ej. a, b, c");
        txt_alfabeto3.setToolTipText("Alfabeto del autómata\nEjemplo: a, b, c");
        txt_alfabeto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_alfabeto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_alfabeto3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_alfabeto3MousePressed(evt);
            }
        });
        txt_alfabeto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alfabeto3ActionPerformed(evt);
            }
        });
        jPanel2.add(txt_alfabeto3);

        btn_add_alfabeto.setText("add");
        btn_add_alfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_alfabetoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add_alfabeto);

        jLabel3.setBackground(new java.awt.Color(152, 218, 217));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Estado:");
        jPanel2.add(jLabel3);

        txt_edo_inicial.setBackground(new java.awt.Color(168, 232, 233));
        txt_edo_inicial.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txt_edo_inicial.setForeground(new java.awt.Color(153, 153, 153));
        txt_edo_inicial.setText("Ej. q0");
        txt_edo_inicial.setToolTipText("Estado a ingresar.\nEjemplo: q0");
        txt_edo_inicial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_edo_inicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_edo_inicialMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_edo_inicialMousePressed(evt);
            }
        });
        txt_edo_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edo_inicialActionPerformed(evt);
            }
        });
        jPanel2.add(txt_edo_inicial);

        btn_add_estado.setText("add");
        btn_add_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_estadoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add_estado);

        panel_form.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 400, 100));

        jPanel3.setBackground(new java.awt.Color(152, 218, 217));
        jPanel3.setLayout(new java.awt.GridLayout(2, 3, 20, 25));

        jLabel6.setBackground(new java.awt.Color(152, 218, 217));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Estado Inicial:");
        jPanel3.add(jLabel6);

        estado_Inicial_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_Inicial_boxActionPerformed(evt);
            }
        });
        jPanel3.add(estado_Inicial_box);

        btn_estado_inicial.setText("add");
        btn_estado_inicial.setPreferredSize(new java.awt.Dimension(70, 29));
        btn_estado_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estado_inicialActionPerformed(evt);
            }
        });
        jPanel3.add(btn_estado_inicial);

        jLabel7.setBackground(new java.awt.Color(152, 218, 217));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Estado Final:");
        jPanel3.add(jLabel7);

        estado_Final_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_Final_boxActionPerformed(evt);
            }
        });
        jPanel3.add(estado_Final_box);

        btn_estado_final.setText("add");
        btn_estado_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estado_finalActionPerformed(evt);
            }
        });
        jPanel3.add(btn_estado_final);

        panel_form.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 100));

        jLabel8.setBackground(new java.awt.Color(152, 218, 217));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Transiciones");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 260, 36));

        background.add(panel_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 440, 680));

        panel_tablero.setBackground(new java.awt.Color(91, 130, 145));
        panel_tablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(234, 235, 237));
        panel_tablero.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 560, 410));

        background.add(panel_tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 600, 450));

        tabla_estados.setViewportView(T_estructura);

        background.add(tabla_estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 600, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txt_salirMouseClicked

    private void txt_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salirMouseExited
        // TODO add your handling code here:
        txt_salir.setBackground(new Color(168, 209, 231));
    }//GEN-LAST:event_txt_salirMouseExited

    private void txt_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salirMouseEntered
        // TODO add your handling code here:
        txt_salir.setBackground(new Color(250, 59, 90));
    }//GEN-LAST:event_txt_salirMouseEntered

    private void panel_tituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_tituloMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel_tituloMousePressed

    private void panel_tituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_tituloMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panel_tituloMouseDragged

    private void txt_edo_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edo_inicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edo_inicialActionPerformed

    private void txt_edo_inicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_edo_inicialMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_edo_inicialMouseClicked

    private void txt_edo_inicialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_edo_inicialMousePressed
        // TODO add your handling code here:
        if(txt_edo_inicial.getText().equals("Ej. q0")){
            txt_edo_inicial.setText("");
            txt_edo_inicial.setForeground(new Color(51,51,51));
        }
        if(txt_alfabeto3.getText().isEmpty()){
            txt_alfabeto3.setForeground(new Color(153,153,153));
            txt_alfabeto3.setText("Ej. a, b, c");
        }
        
        
    }//GEN-LAST:event_txt_edo_inicialMousePressed

    private void txt_alfabeto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_alfabeto3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alfabeto3MouseClicked

    private void txt_alfabeto3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_alfabeto3MousePressed
        // TODO add your handling code here:
        if (txt_alfabeto3.getText().equals("Ej. a, b, c")){
            txt_alfabeto3.setText("");
            txt_alfabeto3.setForeground(new Color(51,51,51));
        }
        if(txt_edo_inicial.getText().isBlank()){
            txt_edo_inicial.setText("Ej. q0");
            txt_edo_inicial.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_alfabeto3MousePressed

    private void txt_alfabeto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alfabeto3ActionPerformed
        
    }//GEN-LAST:event_txt_alfabeto3ActionPerformed

    private void Desmenuzado() {                                     

       alfaChar= new char[alfabeto.length];
       for (int i=0;i<alfabeto.length;i++){
           String holder=alfabeto[i];
           alfaChar[i]=holder.charAt(0);
       }
       
       ///Panel magico
       
       Object[] placeHD=estados.toArray();
       estChar=new char[placeHD.length];
       
       for (int i=0;i<estChar.length;i++){
           String holder=placeHD[i].toString();
           estChar[i]=holder.charAt(0);
       }
       
       
       Panel_Magico = new char[(estChar.length+1)][(alfaChar.length+1)];
       String cadena="";
       Panel_Magico[0][0]='x';
       for(int i=1;i<alfaChar.length+1;i++){
           Panel_Magico[0][i]=alfaChar[i-1];
           //System.out.println("Alfabeto"+Panel_Magico[0][i]);
           cadena+=Panel_Magico[0][i];
          // System.out.println(cadena);
       }
       cadena+= '\n';
       for(int i=1;i<estChar.length+1;i++){
           Panel_Magico[i][0]=estChar[i-1];
           cadena+=Panel_Magico[i][0];
           //System.out.println(cadena);
       }
       cadena+= '\n'; 
        //System.out.println(cadena);
        cadena ="";
        
            for(int x=1;x<estChar.length+1;x++){
                cadena+=Panel_Magico[x][0];
            }
            cadena+= '\n';
        
//        //System.out.print(Panel_Magico[0][4]);
         cadena="";
           for(int i=0;i<estChar.length+1;i++){
            for(int x=0;x<alfaChar.length+1;x++){
                cadena+=Panel_Magico[i][x];
            }
            cadena+= '\n';
        }
//        //System.out.print(Panel_Magico[0][4]);
        //System.out.println(cadena); 
        
       //Lista_De_Caracteres = new char[CD.length()];
        /*for(int i=0;i<CD.length();i++){
            System.out.println(Lista_De_Caracteres[i]);
        }*///jTable1.row
        
    }
    
     private void Colocacion() {                                     
        //Lista_De_Caracteres = new [txt_alfabeto3]
        //char origen=Estado_Origen 
        //char Final = Estado_Finanl.getText();
        
       
        
    }
     
     public void actualizarGrafica() {
        try {
            ///Este es un nos ayudara a generar grafos 
            mxGraphComponent grafica_generada;
            ///Parametros para generar () (Estados)
            
            
            
                grafica_generada = grafica.generarAFD(Automata, estString);
            

            //scroll.removeAll();
            jScrollPane1.add(grafica_generada);
            jScrollPane1.getViewport().add(grafica_generada);
            jScrollPane1.revalidate();
            jScrollPane1.repaint();
            

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage(),
                    "Error al generar grafica", JOptionPane.OK_OPTION,
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private void btn_estado_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estado_finalActionPerformed
              estado_final.add(estado_Final_box.getSelectedItem());
              estado_aceptacion=estado_Final_box.getSelectedItem().toString();
    }//GEN-LAST:event_btn_estado_finalActionPerformed

    private void btn_add_alfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_alfabetoActionPerformed
        String cadena=txt_alfabeto3.getText();
        String co1 = cadena.replace(",", "");
        String co2 = co1.replace(" ", "");
        
        String[] guardar=new String[co2.length()];
        
        for (int i=0;i<co2.length();i++){
            String g=String.valueOf(co2.charAt(i));
            guardar[i]=g;
        }
        alfabeto=guardar;
        elemento_alfabeto.removeAllItems();
        for(int i=0;i<alfabeto.length;i++){
        elemento_alfabeto.addItem(alfabeto[i]);
        }
        TableColumn aColumn=new TableColumn();
        
        
        for(int j=0;j<alfabeto.length;j++){//revisa lo que tiene guardado el arreglo alfabeto
            //System.out.println("caracter en: "+j);
        //System.out.println(alfabeto[j]);
        //System.out.println("-----------------------");
        }
        
        
    }//GEN-LAST:event_btn_add_alfabetoActionPerformed

    private void elemento_alfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento_alfabetoActionPerformed
        
    }//GEN-LAST:event_elemento_alfabetoActionPerformed

    private void btn_add_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_estadoActionPerformed
        String estado=txt_edo_inicial.getText();

        estado_Inicial_box.addItem(estado);
        estado_Final_box.addItem(estado);
        
        estado_1.addItem(estado);
        estado_2.addItem(estado);
        estados.add(estado);

        
    }//GEN-LAST:event_btn_add_estadoActionPerformed
        
    private void estado_Inicial_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_Inicial_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_Inicial_boxActionPerformed

    private void estado_Final_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_Final_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_Final_boxActionPerformed

    private void estado_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_1ActionPerformed

    private void estado_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_2ActionPerformed

    private void btn_estado_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estado_inicialActionPerformed
        estado_Final_box.removeItem(estado_Inicial_box.getSelectedItem());
        estadoInicial=estado_Inicial_box.getSelectedItem();
    }//GEN-LAST:event_btn_estado_inicialActionPerformed

    private void btn_add_transicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_transicionActionPerformed
        
        Object estado1;
        Object elementoDeAlfabeto;
        Object estado2;
        estado1=estado_1.getSelectedItem();
        elementoDeAlfabeto=elemento_alfabeto.getSelectedItem();
        estado2=estado_2.getSelectedItem();
        
        for(int k=1;k<model.getColumnCount();k++){
        for(int l=0;l<model.getRowCount();l++){
            if((model.getValueAt(l, k))==null && (model.getColumnName(k)==estado1) && (elementoDeAlfabeto==model.getValueAt(l, 0)))
            model.setValueAt(estado2, l, k);
        }
        }
        T_estructura.setModel(model);
        
        char Ini = estadoInicial.toString().charAt(0);
        char fin = estado_aceptacion.charAt(0);
        char Simbolo_DE_Transicion = elementoDeAlfabeto.toString().charAt(0);
        Desmenuzado();
        
        char o = estado1.toString().charAt(0);
       char f=estado2.toString().charAt(0);
       char T=elementoDeAlfabeto.toString().charAt(0);
           // }
            //cadena+= '\n';
        //}
        int amk1=0;
        int a2;
           for(int i=0;i<alfaChar.length+1;i++){
               if(Panel_Magico[0][i]==T){
                   //System.out.println("aa"+Panel_Magico[0][i]+"I"+i);
                   for(int x=0;x<estChar.length+1;x++){
                      // System.out.println(Panel_Magico[x][0]+"=="+o);
                       if(Panel_Magico[x][0]==o){
                            //System.out.println("aa"+Panel_Magico[x][0]+"X"+x);
                            Panel_Magico[x][i]=f;
                       }
                   }
                   
               }
               
           }
           ///
           //System.out.println(Panel_Magico[0][1]);
           String cadena="";
           for(int i=0;i<estChar.length+1;i++){
            for(int x=0;x<alfaChar.length+1;x++){
                cadena+=Panel_Magico[i][x];
            }
            cadena+= '\n';
        }
//        System.out.print(Panel_Magico[0][4]);
        //System.out.println(cadena); 
        AFD automata = new AFD();
        automata.estadosFinales.add(fin);
        //automata.agregarTransicion("a", '1', "c");
       // System.out.println(automata);

        //automata.setEstadoInicial("a");
        TransicionAFD t = new TransicionAFD(estado1.toString(),elementoDeAlfabeto.toString().charAt(0),estado2.toString());
        Automata.agregarTransicion(t);
        actualizarGrafica();
        
    }//GEN-LAST:event_btn_add_transicionActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        model.setRowCount(0);
        model.setColumnCount(0);
        T_estructura.setModel(model);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void Gen_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gen_tablaActionPerformed

        
        Object[] columnNames;//inicio codigo de tabla
        columnNames=estados.toArray();
        
        //colocar los datos a la tabla
        model.addColumn("x");
        for(int i=0;i<columnNames.length;i++){
        model.addColumn(columnNames[i]);
        }
        for(int j=0;j<alfabeto.length;j++){
        model.addRow(new Object[]{alfabeto[j]});
        }
        T_estructura.setModel(model);
        
        Object[] holder=new Object[estados.size()];
            holder=estados.toArray();
            estString=new String[holder.length];
            for(int i=0;i<holder.length;i++){
            estString[i]=String.valueOf(holder[i]);
            }
    }//GEN-LAST:event_Gen_tablaActionPerformed

    private void btn_add_transicionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_transicionMouseEntered
        // TODO add your handling code here:
        btn_add_transicion.setBackground(new Color(112,175,206));
    }//GEN-LAST:event_btn_add_transicionMouseEntered

    private void btn_add_transicionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_transicionMouseExited
        // TODO add your handling code here:
        btn_add_transicion.setBackground(new Color(152,218,217));
    }//GEN-LAST:event_btn_add_transicionMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel()); //</editor-fold>
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gen_tabla;
    private javax.swing.JTable T_estructura;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_add_alfabeto;
    private javax.swing.JButton btn_add_estado;
    private javax.swing.JButton btn_add_transicion;
    private javax.swing.JButton btn_estado_final;
    private javax.swing.JButton btn_estado_inicial;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> elemento_alfabeto;
    private javax.swing.JComboBox<String> estado_1;
    private javax.swing.JComboBox<String> estado_2;
    private javax.swing.JComboBox<String> estado_Final_box;
    private javax.swing.JComboBox<String> estado_Inicial_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_btn_graficar_automata;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_salir;
    private javax.swing.JPanel panel_tablero;
    private javax.swing.JPanel panel_titulo;
    private javax.swing.JScrollPane tabla_estados;
    private javax.swing.JTextField txt_alfabeto3;
    private javax.swing.JTextField txt_edo_inicial;
    private javax.swing.JLabel txt_salir;
    // End of variables declaration//GEN-END:variables
}
