package mx.edu.utez.database;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {
    public static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new Driver());
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/institute?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "root");
        //url: jdbc://mysql://@ip:@puerto/@baseDatos,@usuario,@contraseña
        //localhost = 127.0.0.1 es una dirección de ip local
    }

    public static void main(String[] args) {

        try{ //intenta lo que este dentro del try
            Connection con = ConnectionMySQL.getConnection();
            System.out.println("Conexión exitosa");

        }catch (Exception e){ //cacha el error
            e.printStackTrace();
        }
    }


}
