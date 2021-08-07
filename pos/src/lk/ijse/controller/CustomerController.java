/*---------------------------------------------------------------------------------------------
 *  Copyright (c) shamal iroshan. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package lk.ijse.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.db.DBConnection;
import lk.ijse.model.CustomerModel;

/**
 *
 * @author <shamaliroshan.online@gmail.com>shamal iroshan
 */
public class CustomerController {
    Connection connection;

    public CustomerController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }
    
    public boolean saveCustomer(CustomerModel model) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");
        stm.setString(1, model.getId());
        stm.setString(2, model.getName());
        stm.setString(3, model.getAddress());
        stm.setDouble(4, model.getSalary());
        ResultSet rst = stm.executeQuery();
        return rst.next();
    }
    
}
