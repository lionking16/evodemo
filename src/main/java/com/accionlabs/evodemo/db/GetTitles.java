// Copyright (c) 2023 AccionLabs.
package com.accionlabs.evodemo.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public final class GetTitles {
    public List<String> getConnectorsNames() throws SQLException {
        List<String> connectorsNamesList = new ArrayList<>();

        StringBuilder query = new StringBuilder();
        query.append("SELECT title FROM employees.employees");

        Connection connection = ConnectionUtil.getInstance().getConnection();

        Statement statement = connection.createStatement();

        ResultSet connectorsNames = statement.executeQuery(query.toString());

        while(connectorsNames.next()) {
            connectorsNamesList.add(connectorsNames.getString("title"));
        }

        connection.close();

        return connectorsNamesList;
    }

    public List<String> getConnectorsNames(String partialTitle) throws SQLException {
        List<String> connectorsNamesList = new ArrayList<>();

        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM employees.titles WHERE employees LIKE ?");

        Connection connection = ConnectionUtil.getInstance().getConnection();

        PreparedStatement statement = connection.prepareStatement(query.toString());
        statement.setString(1, partialTitle);

        ResultSet connectorsNames = statement.executeQuery();

        while(connectorsNames.next()) {
            connectorsNamesList.add(connectorsNames.getString("title"));
        }

        connection.close();

        return connectorsNamesList;
    }

    public static void main(String[] args) throws SQLException {
        GetTitles getConnectors = new GetTitles();

        List<String> privateConnectorsList = getConnectors.getConnectorsNames("Senior Engineer%");

        System.out.println(privateConnectorsList.size());

        ConnectionUtil.getInstance().closePooledConnection();

    }
}
