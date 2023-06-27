/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edcompanies;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ed
 */
public class TMSDao {
    private static final String url="jdbc:mysql://localhost:3306/tms_new";
    private static final String username="root";
    private static final String password="*AndreAd@$8268";
    private static  Connection connection=null;
    
    
    
    
    public static Connection getConnection(){
        if(connection==null)
            connect();
        return connection;
    }
    
    
    private static void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(url,username,password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    
    
}
