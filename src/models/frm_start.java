/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package models;

import alert.AlertInformation;
import alert.InsertSeach;
import alert.Replace;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class frm_start extends javax.swing.JFrame {
    private int x, y;
    private boolean minimiza = false;
    private int contadorNuevo = 0;
    public static boolean creoNuevo = false;
    public static boolean abrioArchivo = false;
    public static String valor;
   //public static String[] arrayTexto = txt_entrada.getText().indexOf(" ",1);
    /**
     * Creates new form frm_start
     */
    public frm_start() {
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

        pn_background = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_salida = new javax.swing.JTextArea();
        lbl_palaImpar = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_totalpalabras = new javax.swing.JLabel();
        lbl_primerale = new javax.swing.JLabel();
        lbl_ultimale = new javax.swing.JLabel();
        lbl_letracentral = new javax.swing.JLabel();
        lbl_repeticionesA = new javax.swing.JLabel();
        lbl_repeticionesE = new javax.swing.JLabel();
        lbl_repeticionesI = new javax.swing.JLabel();
        lbl_repeticionesO = new javax.swing.JLabel();
        lbl_repeticionesU = new javax.swing.JLabel();
        lbl_primerapa = new javax.swing.JLabel();
        lbl_palacentral = new javax.swing.JLabel();
        lbl_ultimapa = new javax.swing.JLabel();
        lbl_palaPar = new javax.swing.JLabel();
        lbl_longitudtxt1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_entrada = new javax.swing.JTextArea();
        btb_procesar = new javax.swing.JButton();
        lbl_letra_central = new javax.swing.JLabel();
        lbl_longitud = new javax.swing.JLabel();
        lbl_total_palabras = new javax.swing.JLabel();
        lbl_primer_letra = new javax.swing.JLabel();
        lbl_ultima_letra = new javax.swing.JLabel();
        lbl_rep_A = new javax.swing.JLabel();
        lbl_rep_E = new javax.swing.JLabel();
        lbl_rep_I = new javax.swing.JLabel();
        lbl_rep_O = new javax.swing.JLabel();
        lbl_rep_U = new javax.swing.JLabel();
        lbl_primera_palabra = new javax.swing.JLabel();
        lbl_palabra_central = new javax.swing.JLabel();
        lbl_ultima_palabra = new javax.swing.JLabel();
        lbl_cantidad_par = new javax.swing.JLabel();
        lbl_cantidad_impar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mb_menubar = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jm_guardar = new javax.swing.JMenuItem();
        jm_saveas = new javax.swing.JMenuItem();
        jm_editar = new javax.swing.JMenu();
        jm_copiar = new javax.swing.JMenuItem();
        jm_cortar = new javax.swing.JMenuItem();
        jm_pegar = new javax.swing.JMenuItem();
        jm_buscar = new javax.swing.JMenuItem();
        jm_remplazar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pn_background.setForeground(new java.awt.Color(204, 204, 204));
        pn_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lbl_logo.setForeground(new java.awt.Color(0, 51, 102));
        lbl_logo.setText("MANEJO DE CADENAS");
        pn_background.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        txt_salida.setColumns(20);
        txt_salida.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_salida.setRows(5);
        txt_salida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jScrollPane1.setViewportView(txt_salida);

        pn_background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 600, 120));

        lbl_palaImpar.setForeground(new java.awt.Color(0, 102, 153));
        lbl_palaImpar.setText("Palabras con cantida de caracter impar:");
        pn_background.add(lbl_palaImpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        lbl_nombre.setForeground(new java.awt.Color(204, 204, 204));
        lbl_nombre.setText("hola");
        pn_background.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 110, 20));

        lbl_totalpalabras.setForeground(new java.awt.Color(0, 102, 153));
        lbl_totalpalabras.setText("Total de palabras:");
        pn_background.add(lbl_totalpalabras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        lbl_primerale.setForeground(new java.awt.Color(0, 102, 153));
        lbl_primerale.setText("Primer letra del texto:");
        pn_background.add(lbl_primerale, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        lbl_ultimale.setForeground(new java.awt.Color(0, 102, 153));
        lbl_ultimale.setText("Ultima letra del texto:");
        pn_background.add(lbl_ultimale, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lbl_letracentral.setForeground(new java.awt.Color(0, 102, 153));
        lbl_letracentral.setText("Letra central del texto: ");
        pn_background.add(lbl_letracentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        lbl_repeticionesA.setForeground(new java.awt.Color(0, 102, 153));
        lbl_repeticionesA.setText("Repeticiones de \"A\", \"a\" y \"á\":");
        pn_background.add(lbl_repeticionesA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        lbl_repeticionesE.setForeground(new java.awt.Color(0, 102, 153));
        lbl_repeticionesE.setText("Repeticiones de \"E\",\"e\" y \"é\":");
        pn_background.add(lbl_repeticionesE, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        lbl_repeticionesI.setForeground(new java.awt.Color(0, 102, 153));
        lbl_repeticionesI.setText("Repeticions de \"I\",\"i\" y \"í\":");
        pn_background.add(lbl_repeticionesI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        lbl_repeticionesO.setForeground(new java.awt.Color(0, 102, 153));
        lbl_repeticionesO.setText("Repeticiones de \"O\",\"o\" y \"ó\":");
        pn_background.add(lbl_repeticionesO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        lbl_repeticionesU.setForeground(new java.awt.Color(0, 102, 153));
        lbl_repeticionesU.setText("Repeticiones de \"U\",\"u\" y \"ú\":");
        pn_background.add(lbl_repeticionesU, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        lbl_primerapa.setForeground(new java.awt.Color(0, 102, 153));
        lbl_primerapa.setText("Primera palabra:");
        pn_background.add(lbl_primerapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        lbl_palacentral.setForeground(new java.awt.Color(0, 102, 153));
        lbl_palacentral.setText("Palabra central:");
        pn_background.add(lbl_palacentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        lbl_ultimapa.setForeground(new java.awt.Color(0, 102, 153));
        lbl_ultimapa.setText("Ultima palabra: ");
        pn_background.add(lbl_ultimapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        lbl_palaPar.setForeground(new java.awt.Color(0, 102, 153));
        lbl_palaPar.setText("Palabras con cantida de caracter par:");
        pn_background.add(lbl_palaPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        lbl_longitudtxt1.setForeground(new java.awt.Color(0, 102, 153));
        lbl_longitudtxt1.setText("Longitud del texto: ");
        pn_background.add(lbl_longitudtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txt_entrada.setColumns(20);
        txt_entrada.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_entrada.setRows(5);
        txt_entrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txt_entrada.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_entrada.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_entrada.setSelectionColor(new java.awt.Color(255, 255, 255));
        txt_entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_entradaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txt_entrada);

        pn_background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 120));

        btb_procesar.setBackground(new java.awt.Color(0, 0, 0));
        btb_procesar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btb_procesar.setForeground(new java.awt.Color(255, 255, 255));
        btb_procesar.setText("Procesar");
        btb_procesar.setBorder(null);
        btb_procesar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btb_procesarMouseClicked(evt);
            }
        });
        btb_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_procesarActionPerformed(evt);
            }
        });
        pn_background.add(btb_procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 90, 30));

        lbl_letra_central.setText("0");
        pn_background.add(lbl_letra_central, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        lbl_longitud.setText("0");
        pn_background.add(lbl_longitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        lbl_total_palabras.setText("0");
        pn_background.add(lbl_total_palabras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        lbl_primer_letra.setText("0");
        pn_background.add(lbl_primer_letra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        lbl_ultima_letra.setText("0");
        pn_background.add(lbl_ultima_letra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        lbl_rep_A.setText("0");
        pn_background.add(lbl_rep_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        lbl_rep_E.setText("0");
        pn_background.add(lbl_rep_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        lbl_rep_I.setText("0");
        pn_background.add(lbl_rep_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        lbl_rep_O.setText("0");
        pn_background.add(lbl_rep_O, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        lbl_rep_U.setText("0");
        pn_background.add(lbl_rep_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        lbl_primera_palabra.setText("0");
        pn_background.add(lbl_primera_palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 70, -1));

        lbl_palabra_central.setText("0");
        pn_background.add(lbl_palabra_central, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 70, -1));

        lbl_ultima_palabra.setText("0");
        pn_background.add(lbl_ultima_palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 70, -1));

        lbl_cantidad_par.setText("0");
        pn_background.add(lbl_cantidad_par, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        lbl_cantidad_impar.setText("0");
        pn_background.add(lbl_cantidad_impar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Ingrese un texto o abra un archivo .TXT");
        pn_background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("TRADUCCION A CLAVE MURCIELAGO");
        pn_background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        pn_background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -350, 690, 1100));

        mb_menubar.setBorder(null);
        mb_menubar.setBorderPainted(false);

        jm_archivo.setForeground(new java.awt.Color(0, 102, 153));
        jm_archivo.setText("Archivo");

        jMenuItem1.setText("abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm_archivo.add(jMenuItem1);

        jm_guardar.setText("Guardar");
        jm_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_guardarActionPerformed(evt);
            }
        });
        jm_archivo.add(jm_guardar);

        jm_saveas.setText("Guardar como");
        jm_saveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_saveasActionPerformed(evt);
            }
        });
        jm_archivo.add(jm_saveas);

        mb_menubar.add(jm_archivo);

        jm_editar.setBackground(new java.awt.Color(102, 102, 102));
        jm_editar.setBorder(null);
        jm_editar.setForeground(new java.awt.Color(0, 102, 153));
        jm_editar.setText("Editar");

        jm_copiar.setText("Copiar");
        jm_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_copiarActionPerformed(evt);
            }
        });
        jm_editar.add(jm_copiar);

        jm_cortar.setText("Cortar");
        jm_cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_cortarActionPerformed(evt);
            }
        });
        jm_editar.add(jm_cortar);

        jm_pegar.setText("Pegar");
        jm_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_pegarActionPerformed(evt);
            }
        });
        jm_editar.add(jm_pegar);

        jm_buscar.setText("Buscar");
        jm_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_buscarMouseClicked(evt);
            }
        });
        jm_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_buscarActionPerformed(evt);
            }
        });
        jm_editar.add(jm_buscar);

        jm_remplazar.setText("Reemplazar");
        jm_remplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_remplazarActionPerformed(evt);
            }
        });
        jm_editar.add(jm_remplazar);

        mb_menubar.add(jm_editar);

        setJMenuBar(mb_menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_background, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_background, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    JFileChooser fileChooser = new JFileChooser();

    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + File.separator + "Documents"));

    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de texto (*.txt)", "txt"));

    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        try {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());
            
            // Leer el archivo y mostrar su contenido en txt_entrada
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(selectedFile));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(frm_start.class.getName()).log(Level.SEVERE, null, ex);
            }
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            txt_entrada.setText(content.toString());
        } catch (IOException ex) {
            Logger.getLogger(frm_start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    }//GEN-LAST:event_jMenuItem1ActionPerformed
private void guardarArchivo(File archivo, String contenido) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
        writer.write(contenido);
        writer.flush();
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void jm_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_guardarActionPerformed
        if (abrioArchivo) {
        // Guardar el archivo existente
        guardarArchivo(new File(lbl_nombre.getText()), txt_entrada.getText());
        JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Si no hay un archivo abierto, usar la función de "Guardar como"
        jm_saveasActionPerformed(evt);
    }
    }//GEN-LAST:event_jm_guardarActionPerformed

    private void jm_saveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_saveasActionPerformed
       JFileChooser fileChooser = new JFileChooser();

    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + File.separator + "Documents"));

    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de texto (*.txt)", "txt"));

    int result = fileChooser.showSaveDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        if (!selectedFile.getAbsolutePath().endsWith(".txt")) {
            selectedFile = new File(selectedFile + ".txt");
        }

        // Guardar el archivo
        guardarArchivo(selectedFile, txt_entrada.getText());
        lbl_nombre.setText(selectedFile.getName());
        abrioArchivo = true;
        creoNuevo = false;
        JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente", "Guardar como", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_jm_saveasActionPerformed

    private void txt_entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_entradaMouseClicked
        if ("Ingrese un texto o abra un archivo".equals(txt_entrada.getText())){
            txt_entrada.setText("");
            txt_entrada.setForeground(Color.white);}// TODO add your handling code here:
    }//GEN-LAST:event_txt_entradaMouseClicked

    private void btb_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_procesarActionPerformed
        // TODO add your handling code here:
        contadorNuevo++;
        this.lbl_nombre.setText("Archivo" + contadorNuevo + ".txt");
        this.txt_salida.setText("");
        this.txt_salida.setEditable(true);
        this.txt_salida.requestFocus();
        creoNuevo = true;
        abrioArchivo = false;  
    }//GEN-LAST:event_btb_procesarActionPerformed

    private void jm_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_copiarActionPerformed
            StringSelection selection = new StringSelection(txt_entrada.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);        // TODO add your handling code here:
    }//GEN-LAST:event_jm_copiarActionPerformed

    private void jm_cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_cortarActionPerformed
        StringSelection selection = new StringSelection(txt_entrada.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);  
        txt_entrada.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jm_cortarActionPerformed

    private void jm_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_pegarActionPerformed
     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    DataFlavor flavor = DataFlavor.stringFlavor;
    if (clipboard.isDataFlavorAvailable(flavor)) {
      try {
        String text = (String) clipboard.getData(flavor);
        txt_entrada.setText(text);
      } catch (UnsupportedFlavorException e) {
        System.out.println(e);
      } catch (IOException e) {
        System.out.println(e);
      }
    }
          // TODO add your handling code here:
    }//GEN-LAST:event_jm_pegarActionPerformed

    private void btb_procesarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btb_procesarMouseClicked
        //procesado 
        valor = txt_entrada.getText();
        String[] valorarray = txt_entrada.getText().split(" ");
        String[] chararray = valor.split("");
        int tamano1= 0;
        int tamano2=0;
        //longitud del texto
        
        
        //primera palabra
        for (int i = 0; i < valorarray.length; i++){
            lbl_primera_palabra.setText(valorarray[0]);
            break;
        }
        
        //longitud del texto
        for (int i = 0; i < chararray.length; i++){
            tamano1 ++;
            
        }
        lbl_longitud.setText(Integer.toString(tamano1));
        
        //longitud palabras
        for (int i = 0; i < valorarray.length; i++){
            tamano2 ++;
            
        }
        lbl_total_palabras.setText(Integer.toString(tamano2));
        
        //primera letra
        for (int i = 0; i < chararray.length; i++){
            lbl_primer_letra.setText(chararray[0]);
            break;
        }
        
        //ulitma letra del texto     
        lbl_ultima_letra.setText(chararray[tamano1-1]);
        
        //letra central
        //agarramos tamano y lo dividimos e imprmimos la palabra que esta en esa ubicacnion
        int medio1=tamano1/2;
        lbl_letra_central.setText(chararray[medio1]);
        
        
        
        //palabra central
        int medio2=tamano2/2;
        lbl_palabra_central.setText(valorarray[medio2]);
        
        //ultima palabra del texto
        lbl_ultima_palabra.setText(valorarray[tamano2-1]);
        
        //repeticiones en A
        new Functions().Repa(valor,"a");
        
    //repeticiones en E
        new Functions().Repe(valor,"e");
        //repeticiones en I
        new Functions().Repi(valor,"i");
        //repeticiones en O
        new Functions().Repo(valor,"o");
        //repeticiones en U
        new Functions().Repu(valor,"u");
        
        //cantidad de letras par o impar
        new Functions().PAR(valor);
        
        new encode().Encode(valor);
        
        /*
        int init = valor.indexOf("",1);
        int fin= valor.indexOf("",init + 1);
        lbl_primera_palabra.setText(valor.substring(init));*/
        
        //repeticiones de E
        //lbl_rep_E.setText(Integer.toString(valor.indexOf("e",1)));
        
        
    }//GEN-LAST:event_btb_procesarMouseClicked

    private void jm_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_buscarActionPerformed
        // TODO add your handling code here:
        alert.InsertSeach a = new InsertSeach(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_jm_buscarActionPerformed

    private void jm_remplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_remplazarActionPerformed
        // TODO add your handling code here:
        alert.Replace a = new Replace(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_jm_remplazarActionPerformed

    private void jm_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_buscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_buscarMouseClicked

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
            java.util.logging.Logger.getLogger(frm_start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btb_procesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenuItem jm_buscar;
    private javax.swing.JMenuItem jm_copiar;
    private javax.swing.JMenuItem jm_cortar;
    private javax.swing.JMenu jm_editar;
    private javax.swing.JMenuItem jm_guardar;
    private javax.swing.JMenuItem jm_pegar;
    private javax.swing.JMenuItem jm_remplazar;
    private javax.swing.JMenuItem jm_saveas;
    public static javax.swing.JLabel lbl_cantidad_impar;
    public static javax.swing.JLabel lbl_cantidad_par;
    private javax.swing.JLabel lbl_letra_central;
    private javax.swing.JLabel lbl_letracentral;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_longitud;
    private javax.swing.JLabel lbl_longitudtxt1;
    public static javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_palaImpar;
    private javax.swing.JLabel lbl_palaPar;
    private javax.swing.JLabel lbl_palabra_central;
    private javax.swing.JLabel lbl_palacentral;
    private javax.swing.JLabel lbl_primer_letra;
    private javax.swing.JLabel lbl_primera_palabra;
    private javax.swing.JLabel lbl_primerale;
    private javax.swing.JLabel lbl_primerapa;
    public static javax.swing.JLabel lbl_rep_A;
    public static javax.swing.JLabel lbl_rep_E;
    public static javax.swing.JLabel lbl_rep_I;
    public static javax.swing.JLabel lbl_rep_O;
    public static javax.swing.JLabel lbl_rep_U;
    private javax.swing.JLabel lbl_repeticionesA;
    private javax.swing.JLabel lbl_repeticionesE;
    private javax.swing.JLabel lbl_repeticionesI;
    private javax.swing.JLabel lbl_repeticionesO;
    private javax.swing.JLabel lbl_repeticionesU;
    private javax.swing.JLabel lbl_total_palabras;
    private javax.swing.JLabel lbl_totalpalabras;
    private javax.swing.JLabel lbl_ultima_letra;
    private javax.swing.JLabel lbl_ultima_palabra;
    private javax.swing.JLabel lbl_ultimale;
    private javax.swing.JLabel lbl_ultimapa;
    private javax.swing.JMenuBar mb_menubar;
    private javax.swing.JPanel pn_background;
    public static javax.swing.JTextArea txt_entrada;
    public static javax.swing.JTextArea txt_salida;
    // End of variables declaration//GEN-END:variables
}
