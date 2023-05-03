/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.easyapp.todoapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import util.ConnectionFactory;

/**
 *
 * @author vanessadeoliveiramello
 */
public class TodoApp {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");
        //é o mesmo que int numero = 5 ou
        //int num = teclado.nextInt();
        Connection c = ConnectionFactory.getConnection();
        System.out.println(c.getSchema());
        ConnectionFactory.closeConnection(c);
    }
}
