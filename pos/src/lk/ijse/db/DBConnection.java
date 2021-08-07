/*---------------------------------------------------------------------------------------------
 *  Copyright (c) shamal iroshan. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package lk.ijse.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author <shamaliroshan.online@gmail.com>shamal iroshan
 */
public class DBConnection {

    private static DBConnection dBConnection;
    private Connection connection;

    public DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos", "root", "");
    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            return dBConnection = new DBConnection();
        } else {
            return dBConnection;
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
