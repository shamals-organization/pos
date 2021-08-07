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
import lk.ijse.model.ItemModel;

/**
 *
 * @author <shamaliroshan.online@gmail.com>shamal iroshan
 */
public class ItemController {
        Connection connection;

    public ItemController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }
    
    public boolean saveItem(ItemModel model) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO item VALUES(?,?,?,?)");
        stm.setString(1, model.getId());
        stm.setString(2, model.getName());
        stm.setDouble(3, model.getPrice());
        stm.setInt(4, model.getQty());
        ResultSet rst = stm.executeQuery();
        return rst.next();
    }
}
