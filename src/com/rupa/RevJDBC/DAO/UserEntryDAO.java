/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rupa.RevJDBC.DAO;

import com.rupa.RevJDBC.entity.UserEntry;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public interface UserEntryDAO {
   boolean register(UserEntry user)throws ClassNotFoundException,SQLException;
    
}
