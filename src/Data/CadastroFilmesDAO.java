package Data;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class CadastroFilmesDAO {

	Connection conn;
	PreparedStatement st;
	ResultSet rs;

	public boolean conectar() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cenaflix", "root", "");

			return true;

		} catch (ClassNotFoundException | SQLException ex) {

			System.out.println("Erro ao conectar: " + ex.getMessage());
			return false;

		}

	}

	public void desconectar() {
		try {

			conn.close();

		} catch (SQLException e) {

		}

	}

	public int salvar(CadastroFilmes cadastroFilmes) {

		int status;

		try {
			st = conn.prepareStatement("INSERT INTO filmes  (nome, datalancamento, categoria) VALUES(?,?,?)");
			st.setString(1, cadastroFilmes.getNomeDoFilme());
			st.setDate(2, new java.sql.Date(cadastroFilmes.getDataLacamento().getTime()));
			st.setString(3, cadastroFilmes.getCategoria());

			status = st.executeUpdate();
			return status;

		} catch (SQLException ex) {

			System.out.println("Erro ao conectar: " + ex.getMessage());
			return ex.getErrorCode();

		}
	}
}
