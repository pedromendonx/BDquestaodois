package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.entidade.Aluno;

public class AlunoDao extends AbstratoDao {
        public boolean adicionar (Aluno c) throws SQLException {
            boolean sucesso;
            String sql = "insert into aluno (nome, curso, nota1, nota2, nota3, nota4) values (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, c.getNome());
                stmt.setString(2, c.getCurso());
                stmt.setFloat(3, c.getNota1());
                stmt.setFloat(4, c.getNota2());
                stmt.setFloat(5, c.getNota3());
                stmt.setFloat(6, c.getNota4());

                sucesso = stmt.executeUpdate() == 1;
            } catch (SQLException e) {
                throw e;
            }

            return sucesso;

        } 

        public List<Aluno> buscarTodos() throws SQLException {
		List<Aluno> aluno = new ArrayList<>();
		String sql = "select * from aluno";

		try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
                String nome = rs.getString("nome");
				String curso = rs.getString("curso");
				float nota1 = rs.getFloat("nota1");
                float nota2 = rs.getFloat("nota2");
                float nota3 = rs.getFloat("nota3");
                float nota4 = rs.getFloat("nota4");
				Aluno c = new Aluno(nome, curso, nota1, nota2, nota3, nota4);

				aluno.add(c/*  */);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aluno;
	}

}
