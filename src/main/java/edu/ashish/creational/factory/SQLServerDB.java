package edu.ashish.creational.factory;

import java.sql.Connection;

public class SQLServerDB implements Database {

    @Override
    public Connection createConnection() {
        return null;
    }
}
