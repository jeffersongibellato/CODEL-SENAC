import java.sql.*;

public class CreateTableAllTypesCRUD {
public static void main(String[] args) {
String status = "Nada aconteceu";
    try {
        Connection conn = MySQLConnector.conectar();
        String strSqlCreate = "CREATE TABLE `teste`.`tbl_tipos_dados`(`id` INT NOT NULL AUTO_INCREMENT , `tipovarchar` VARCHAR(255) NULL , `tipotext` TEXT NULL , `tipodate` DATE NULL , `tipotinyint` TINYINT NULL , `tiposmallint` SMALLINT NULL , `tipomediumint` MEDIUMINT NULL , `tipobigint` BIGINT NULL , `tipodecimal` DECIMAL NULL , `tipofloat` FLOAT NULL , `tipodouble` DOUBLE NULL , `tiporeal` REAL NULL , `tipobit` BIT NULL , `tiposerial` INT , `tipodatetime` DATETIME NULL , `tipotimestamp` TIMESTAMP NULL , `tipotime` TIME NULL , `tipoyear` YEAR NULL , `tipochar` CHAR(10) NULL , `tipotinytext` TINYTEXT NULL , `tipomediumtext` MEDIUMTEXT NULL , `tipolongtext` LONGTEXT NULL , `tipobinary` BINARY(255) NULL , `tipovarbinary` VARBINARY(255) NULL , `tipotinyblob` TINYBLOB , `tipoblob` BLOB , `tipomediumblob` MEDIUMBLOB , `tipolongblob` LONGBLOB , PRIMARY KEY (`id`));";
            Statement stmSql = null;
            stmSql = conn.createStatement();
            stmSql.addBatch(strSqlCreate);
            stmSql.executeBatch();
            status = "Ok! Tabela criada.";
            stmSql.close();
        } catch (SQLException e) {
            status = "Erro SQLException: " + e;
        } catch (Exception e) {
         status = "Erro Exception: " + e;
        }
        System.out.println(status);
    }
}
