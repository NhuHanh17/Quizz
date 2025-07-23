/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.han.quizapp;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.css.StyleConverter;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author trant
 */
public class QuestionController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "111111");
            
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM catelory; ");
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                System.out.printf("%d - %s/n", id, name);
            }
            
            conn.close();
                    
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
    }    
    
}
