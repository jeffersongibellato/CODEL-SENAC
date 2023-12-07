import java.sql.*;

public class Connector {
    public static void main(String[] args) throws Exception {
        System.out.println("Conectando ao banco de dados...");
        conectar();
    }

    public static Connection conectar() {
        String mysqlHost = "localhost";
        String mysqlPort = "3306";
        String mysqlUser = "root";
        String mysqlPass = "";
        String mysqlDatabase = "teste2";
        String getVars = "useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + ":" + mysqlPort + "/" + mysqlDatabase + "?" + getVars;
        String status = "Nada aconteceu";
        Connection conn = null;
        Statement stmSql = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(mysqlUrl,mysqlUser,mysqlPass);
            status = "Connection opened";
            stmSql = conn.createStatement();
            stmSql.executeBatch();
            System.out.println("Ok! Conectado.");
            stmSql.close();
        } catch (SQLException e) {
            status = "Erro SQLException: " + e;
        } catch (ClassNotFoundException e) {
            status = "Erro ClassNotFoundException: " + e;
        } catch (Exception e) {
            status = "Erro Exception: " + e;
        }
        System.out.println(status);
        return conn;
    }
}
