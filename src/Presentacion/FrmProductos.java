
package Presentacion;

import Datos.Productos;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.output.OutputException;



/**
 *
 * @author USUARIO
 */
public class FrmProductos extends javax.swing.JFrame {

     String nombre_Imagen = "";
     BufferedImage imagen;
    
    /**
     * Creates new form FrmProductos
     */
    public FrmProductos() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       //this.setResizable(false); /* lo quitamos porque no dejaba maximiza la ventana automaticamente pero a mano si se puede*/
        this.setDefaultCloseOperation(2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();
        LbImagenCodigoBarras = new javax.swing.JLabel();
        BtnCargarImagen = new javax.swing.JButton();
        TxtCodigo = new javax.swing.JTextField();
        TxtDescripcion = new javax.swing.JTextField();
        TxtStock = new javax.swing.JTextField();
        TxtMedida = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        TxtCodBarras = new javax.swing.JTextField();
        PanelDocumento = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TxtFecha = new com.toedter.calendar.JDateChooser();
        PanelProveedor = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TxtClaveProv = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        BtnBuscarProv = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del articulo"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 39, -1, -1));

        jLabel2.setText("Descripcion");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setText("Stock");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setText("Ud. Medida");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setText("Precio");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel6.setText("Codigo de barras");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        LabelImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LabelImage.setOpaque(true);
        jPanel2.add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 240, 160));

        LbImagenCodigoBarras.setOpaque(true);
        jPanel2.add(LbImagenCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 250, 60));

        BtnCargarImagen.setText("Cargar");
        BtnCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarImagenActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCargarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));
        jPanel2.add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 40, 180, -1));
        jPanel2.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 380, -1));
        jPanel2.add(TxtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, -1));
        jPanel2.add(TxtMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 140, -1));
        jPanel2.add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 140, -1));

        TxtCodBarras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtCodBarrasFocusLost(evt);
            }
        });
        TxtCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodBarrasActionPerformed(evt);
            }
        });
        jPanel2.add(TxtCodBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 90, 560, 350));

        PanelDocumento.setBackground(new java.awt.Color(102, 0, 102));
        PanelDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuento"));
        PanelDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Fecha Ingreso");
        PanelDocumento.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        PanelDocumento.add(TxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 190, 30));

        jPanel1.add(PanelDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 490, 130));

        PanelProveedor.setBackground(new java.awt.Color(102, 0, 102));
        PanelProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proveedor"));
        PanelProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Clave");
        PanelProveedor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jLabel11.setText("Proveedor");
        PanelProveedor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 75, -1, -1));

        jScrollPane8.setViewportView(TxtClaveProv);

        PanelProveedor.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 130, -1));

        jScrollPane9.setViewportView(jTextPane9);

        PanelProveedor.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 390, -1));

        BtnBuscarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Opera_Glasses_48px.png"))); // NOI18N
        PanelProveedor.add(BtnBuscarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 20, 80, 40));

        jPanel1.add(PanelProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 490, 130));

        TablaDatos.setBackground(new java.awt.Color(204, 204, 0));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Stock", "Ud Medida", "Precio", "Codigo de barras", "Fecha", "ClaveProv", "Numero cuenta"
            }
        ));
        jScrollPane10.setViewportView(TablaDatos);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 1190, 170));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel13.setText("INGRESO PRODUCTOS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 310, 50));

        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Shopping_Basket_48px_1.png"))); // NOI18N
        BtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 90, 60));

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_48px_1.png"))); // NOI18N
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 90, 60));

        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Inspection_48px.png"))); // NOI18N
        BtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 90, 60));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Exit_Sign_48px_1.png"))); // NOI18N
        BtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 90, 70));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodBarrasActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        Productos prod = new Productos();
        
        prod.setClavepd(Integer.parseInt(TxtCodigo.getText()));
        prod.setDescripcion(TxtDescripcion.getText());
        prod.setStock(Integer.parseInt(TxtStock.getText()));
        prod.setPrecio(Float.parseFloat(TxtPrecio.getText()));
        prod.setUdMedida(TxtMedida.getText());
        prod.setNumcompra(Integer.parseInt(TxtNumCompra.getText()));
        prod.setClaveprovedor(Integer.parseInt(TxtClaveProv.getText()));

        
       
       //*****Asignar fecha del jDateChooser
        
        Date fecha = TxtFecha.getDate();
        long d = fecha.getTime();
        java.sql.Date solofecha = new java.sql.Date(d);
        
        prod.setFechaIngreso(solofecha);
        
        
        
        
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarImagenActionPerformed
        
        // **** obtener imagen del producto que agregamos
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG PNG & GIF Imagenes","jpg","gif","png");
        JFileChooser archivo = new JFileChooser();
        archivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        archivo.setFileFilter(filtro);
        archivo.setDialogTitle("Abrir archivo de imagen");
        File ruta = new File("C:/imagenesProductos/");  //ruta de donde obtenemos de las imagenes
        archivo.setCurrentDirectory(ruta);
        int resultado = archivo.showOpenDialog(this);
        
        if(resultado != JFileChooser.CANCEL_OPTION){  //resultado = jfilechooser. aprove option , tambien funciona
            File nombreArchivo = archivo.getSelectedFile();
            nombre_Imagen = String.valueOf(nombreArchivo);
            
            Image foto = getToolkit().getImage(nombre_Imagen);
            foto=foto.getScaledInstance(LabelImage.getWidth(), LabelImage.getHeight(), Image.SCALE_DEFAULT);
            LabelImage.setIcon(new ImageIcon(foto));
            
        }
        
        
    }//GEN-LAST:event_BtnCargarImagenActionPerformed

    private void TxtCodBarrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCodBarrasFocusLost
        if(TxtCodBarras.getText().length() != 0){   //si tiene algo
            LbImagenCodigoBarras.setIcon(GenerarCodigo(TxtCodBarras.getText()));
            
            
            
        }
    }//GEN-LAST:event_TxtCodBarrasFocusLost

    public ImageIcon GenerarCodigo(String valor){
        
         try {
             Barcode barcode = null;  // esta bien solo hay que agregar las librerias
            
                 barcode= BarcodeFactory.createCode39(valor,true);
                 barcode.setDrawingText(false);
                 barcode.setBarWidth(2);
                 barcode.setBarHeight(60);
                 imagen = new BufferedImage(300,100,BufferedImage.TYPE_INT_ARGB);
                 Graphics2D g = (Graphics2D) imagen.getGraphics();
                 barcode.draw(g, 5, 20);
             } catch (BarcodeException ex) {
                  JOptionPane.showMessageDialog(null,"Excepcion"+ex);
             }catch (OutputException ex) {
            JOptionPane.showMessageDialog(null,"Excepcion"+ex);
         }
         ImageIcon img = new ImageIcon(imagen);
         return img;
}
    
    
    
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
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscarProv;
    private javax.swing.JButton BtnCargarImagen;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JLabel LbImagenCodigoBarras;
    private javax.swing.JPanel PanelDocumento;
    private javax.swing.JPanel PanelProveedor;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextPane TxtClaveProv;
    private javax.swing.JTextField TxtCodBarras;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtDescripcion;
    private com.toedter.calendar.JDateChooser TxtFecha;
    private javax.swing.JTextField TxtMedida;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane jTextPane9;
    // End of variables declaration//GEN-END:variables
}
