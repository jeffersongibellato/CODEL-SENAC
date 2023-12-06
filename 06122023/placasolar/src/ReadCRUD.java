import java.sql.*;
import java.util.*;

public class ReadCRUD {
    public static void main(String[] args){
        String status = "Nada Aconteceu";
        try{
        Connection conn = App.conectar();
        String usuario = "'testestes'";
        String senha = "'senha190'";
        String strSqlInsert = "SELECT id FROM tbl_usuarios WHERE usuario=" + usuario+";";
        System.out.println(strSqlInsert);
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
