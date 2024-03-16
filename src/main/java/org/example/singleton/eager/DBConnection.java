package org.example.singleton.eager;

/**
 * @author ANUPAM DAS
 * Date : 3/11/2024
 * Time : 12:58 PM
 */

public class DBConnection {
    private static DBConnection conObj = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance() {
        return conObj;
    }
}
