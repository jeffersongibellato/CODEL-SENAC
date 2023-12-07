import java.sql.*;
import java.util.*;

public class InsertCRUD {
    public static void main(String[] args){
        String status = "Nada Aconteceu";
        try{
        Connection conn = App.conectar();
        String usuario = "'pedro'";
        String senha = "'19001'";
        String strSqlInsert = "INSERT INTO tbl_usuarios (usuario, senha) VALUES ("+ usuario+","+senha+");";
        Statement stmSql = null;
        stmSql = conn.createStatement();
        stmSql.addBatch(strSqlInsert);
        stmSql.executeBatch();
        status = "OK! REGISTRO INSERIDO";
        stmSql.close();
        }
        catch (SQLException e){
            status = "Erro SQLException "+e;
        }catch (Exception e){
            status = "ERRO Exception: " +e;
        }
        System.out.println(status);
    }
}