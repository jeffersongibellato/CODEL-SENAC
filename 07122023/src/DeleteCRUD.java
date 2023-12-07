import java.sql.*;
import java.util.*;

public class DeleteCRUD {
    public static void main(String[] args){
        String status = "Nada Aconteceu";
        try{
        Connection conn = App.conectar();
        String usuario = "'testestes'";
        String senha = "'senha199'";
        String strSqlInsert = "DELETE FROM tbl_usuarios WHERE usuario ="+usuario;
        Statement stmSql = null;
        stmSql = conn.createStatement();
        stmSql.addBatch(strSqlInsert);
        stmSql.executeBatch();
        status = "OK! REGISTRO ATUALIZADO";
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
