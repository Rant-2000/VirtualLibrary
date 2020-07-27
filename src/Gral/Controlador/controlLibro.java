/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gral.Controlador;

import Gral.Modelo.Libro;
import Gral.Modelo.consultaLibro;
import Gral.Vista.formLibro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rant AA
 */
public class controlLibro implements ActionListener{
    private Libro es;
   private consultaLibro cones; 
   private formLibro frm; 
    public void controlLibro(Libro es, consultaLibro cones, formLibro frm){
       this.es =es;
       this.cones = cones;
       this.frm=frm;
       this.frm.btnBuscar.addActionListener(this);
       this.frm.btnEliminar.addActionListener(this);
       this.frm.btnGuardar.addActionListener(this);
       this.frm.btnLimpiar.addActionListener(this);
       this.frm.btnModificar.addActionListener(this);
    }
    public  void iniciar() {
        frm.setTitle("Control Libros");
        frm.setLocationRelativeTo(null);
        frm.txtidlibro.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==frm.btnGuardar) {
            es.setIsbn(frm.txtisbn.getText());
            es.setTitulo(frm.txttitulo.getText());
            es.setAutor(frm.txtautor.getText());
            es.setEditorial(frm.txtedi.getText());
            es.setAnho(frm.txtanho.getText());
            
            try {
                if (cones.Registro(es)) {
                    JOptionPane.showMessageDialog(null, "Guardado correctamente");
                    limpia();
                }else{
                    JOptionPane.showMessageDialog(null, "Error "+e);
                    limpia();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource()==frm.btnLimpiar) {
        limpia();
        }
    }
    public void limpia(){
        frm.txtidlibro.setText(null);
        frm.txttitulo.setText(null);
        frm.txtautor.setText(null);
        frm.txtisbn.setText(null);
        frm.txtedi.setText(null);
        frm.txtanho.setText(null);
        //frm.txtidlibro.setText(null);
        
    }    
}
