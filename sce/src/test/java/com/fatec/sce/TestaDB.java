package com.fatec.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.sce.model.ConfiguraDB;
import com.fatec.sce.model.FabricaDeConexoes;

public class TestaDB {

	@Test
	public void quandoConectaComOBancoRetornaOK() {
		// cenario
		FabricaDeConexoes fabrica;
		// acao
		fabrica = new FabricaDeConexoes();
		// verificacao
		assertNotNull(fabrica.getConnection());
	}

	@Test
	public void conexaoComFalhaUsuarioInvalido() {
		FabricaDeConexoes fabrica = new FabricaDeConexoes();
		// cenario
		String url = "jdbc:mysql://mysql8.db4free.net:3306/sceweb";
		String driver = "com.mysql.jdbc.Driver";
		String usuario = "root";
		String senha = "alunosfatec";
		FabricaDeConexoes fabricaDeConexoes = null;
		// acao
		ConfiguraDB configuraDB = new ConfiguraDB(url, driver, usuario, senha);
		try {
			fabricaDeConexoes = new FabricaDeConexoes(configuraDB);
			fail("deveria falhar");
		} catch (Exception e) {
			// verificacao
			assertNull(fabricaDeConexoes.getConnection());
		}
	}

}
