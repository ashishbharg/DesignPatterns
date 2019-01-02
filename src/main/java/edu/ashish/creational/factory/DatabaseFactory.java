package edu.ashish.creational.factory;

/**
 * This is factory method class where based on input argument, object would be created and returned back.
 * Not a good example here as database object should be singleton but yes, this factory can be merged with
 * singleton class to achieve it.
 */
public class DatabaseFactory {

    public static Database getDatabase(String type) {

        Database db = null;
        switch(type) {
            case "Oracle" :
                db = new OracleDB();
                break;
            case "MySQL":
                db = new MySQLDB();
                break;
            case "SQL Server":
                db = new SQLServerDB();
                break;
        }
        return db;
    }
}
