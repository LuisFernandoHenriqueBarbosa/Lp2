package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }

    public Conexao() throws Exception {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=bdJava;trustServerCertificate=true;encript=false";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String usuario = "aluno";
        String senha = "dbo";
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, usuario, senha);
    }
}