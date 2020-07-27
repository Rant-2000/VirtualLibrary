/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gral.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rant AA
 */
public class consultaLibro extends Conexion {
    PreparedStatement ps;
    ResultSet rs;
    public boolean Registro(Libro es) throws SQLException {
        PreparedStatement ps=null;
        
        Connection con = getConnection();
        String registro="INSERT INTO libros (ISBN, Titulo, Autor,Editorial, anho) VALUES (?,?,?,?,?)";
        try {
            
            ps = con.prepareStatement(registro);
            ps.setString(1, es.getIsbn());
            ps.setString(2, es.getTitulo());
            ps.setString(3, es.getAutor());
            ps.setString(4, es.getEditorial());
            ps.setString(5, es.getAnho());
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            con.close();
        }
    }
    
}
