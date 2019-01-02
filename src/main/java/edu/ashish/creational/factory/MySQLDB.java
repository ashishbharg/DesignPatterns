package edu.ashish.creational.factory;

import java.sql.Connection;

public class MySQLDB implements Database {

    @Override
    public Connection createConnection() {
        return null;
    }
}
