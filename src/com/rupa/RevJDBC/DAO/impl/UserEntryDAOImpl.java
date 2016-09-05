/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rupa.RevJDBC.DAO.impl;

import com.rupa.RevJDBC.DAO.UserEntryDAO;
import com.rupa.RevJDBC.entity.UserEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class UserEntryDAOImpl implements UserEntryDAO {

    @Override
    public boolean register(UserEntry user) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/revjdbc", "root", null);
        String sql = "insert into user(firstname,lastname,email,password)values(?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        JOptionPane.showMessageDialog(null, "Connetion successful");
        stmt.setString(1, user.getFirstName());
        stmt.setString(2, user.getLastName());
        stmt.setString(3, user.getEmail());
        stmt.setString(4, user.getPassword());
        stmt.executeUpdate();
        conn.close();
        return true;
    }

}
