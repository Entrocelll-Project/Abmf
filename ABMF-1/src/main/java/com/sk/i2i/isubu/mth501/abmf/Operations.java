package com.sk.i2i.isubu.mth501.abmf;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class Operations {

    private static final String ORACLE_URL = "jdbc:oracle:thin:@34.125.2.150:1521/XE";
    private static final String ORACLE_USERNAME = "C##MTH";
    private static final String ORACLE_PASSWORD = "123456";

    private static Connection createOracleConnection() throws SQLException {
        return DriverManager.getConnection(ORACLE_URL, ORACLE_USERNAME, ORACLE_PASSWORD);
    }

    public static String updateSms(int price, String msisdn, Long amount) {
    try (Connection connection = createOracleConnection()) {
        String sql = "BEGIN ENTEROCELL.update_sms(?, ?, ?, ?); END;";
        try (CallableStatement callableStatement = connection.prepareCall(sql)) {
            long custId = 0;
            callableStatement.setLong(1, custId);
            callableStatement.setString(2, msisdn);
            callableStatement.setLong(3, amount);
            callableStatement.setInt(4, price);
            callableStatement.execute();
        }
        
        return "Success";
    } catch (SQLException e) {
        throw new RuntimeException("Error updating SMS: " + e.getMessage(), e);
    }
}



    public static String updateData(long custId, String msisdn, long amount) {
    try (Connection connection = createOracleConnection()) {
        String sql = "BEGIN ENTEROCELL.update_data(?, ?, ?, ?); END;";
        try (CallableStatement callableStatement = connection.prepareCall(sql)) {
            callableStatement.setLong(1, custId);
            callableStatement.setString(2, msisdn);
            callableStatement.setLong(3, amount);
            callableStatement.setLong(4, 0);
            callableStatement.execute();
        }
        return "Success";
    } catch (SQLException e) {
        throw new RuntimeException("Error updating data: " + e.getMessage(), e);
    }
}

   public static String updateVoice(long subscId, String msisdn, long amount) {
    try (Connection connection = createOracleConnection()) {
        String sql = "BEGIN ENTEROCELL.update_voice(?, ?, ?, ?); END;";
        try (CallableStatement callableStatement = connection.prepareCall(sql)) {
            callableStatement.setLong(1, subscId);
            callableStatement.setString(2, msisdn);
            callableStatement.setLong(3, amount);
            callableStatement.setNull(4, Types.NUMERIC); 
            callableStatement.execute();
        }
        return "Success";
    } catch (SQLException e) {
        throw new RuntimeException("Error updating voice: " + e.getMessage(), e);
    }
}


}
