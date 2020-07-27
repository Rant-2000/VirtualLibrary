/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gral.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Rant AA
 */
public class Conexion {
        public static final String URL="jdbc:mysql://localhost:3306/e-biblioteca?serverTimezone=UTC";
public static final String USERNAME="root";
public static final String PASSWORD="1234";

public  Connection getConnection(){
    Connection con=null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= (Connection)DriverManager.getConnection(URL,USERNAME, PASSWORD);
        JOptionPane.showMessageDialog(null, "Conexion Establecida");
    } catch (Exception e) {
        System.out.println(e);
    }
    return con;
    }
}
