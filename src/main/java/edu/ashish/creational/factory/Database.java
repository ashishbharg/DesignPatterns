package edu.ashish.creational.factory;

import java.sql.Connection;

public interface Database {

    Connection createConnection();

}
