package com.fatec.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.sce.model.Usuario;

public class UC05CadastrarUsuario {
/**
 * Objetivo - Verificar o comportamento da aplicação na inclusão de dados invalidos
 * para caso de uso Cadastrar Usuario
 * **/
	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			Usuario usuario = ObtemUsuario.comDadosValidos();
		} catch (RuntimeException e) {
			// Verificação
			fail("Não deve falhar");
		}
	}

	@Test
	public void CT02CadastrarUsuarioComRa_em_branco() {
		try {
			// Cenário
			Usuario usuario = ObtemUsuario.comRA_Branco();
			// Ação
			fail("Deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// Verificação
			assertEquals("RA invalido", e.getMessage());
		}
	}

	@Test
	public void CT03CadastrarUsuarioComRa_nulo() {
		try {
			// Cenário
			Usuario usuario = ObtemUsuario.comRA_nulo();
			// Ação
			usuario.setRa(null);
			fail("Deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// Verificação
			assertEquals("RA invalido", e.getMessage());
		}
	}

	@Test
	public void CT04CadastrarUsuario_com_sucesso_getRa() {
		// Cenário
		Usuario usuario = ObtemUsuario.comDadosValidos();
		assertEquals("12121212", usuario.getRa());
	}
	
	@Test
	public void CT05CadastrarUsuarioComNome_em_branco() {
		try {
			// Cenário
			Usuario usuario = ObtemUsuario.comNome_Branco();
			fail("Deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// Verificação
			assertEquals("Nome invalido", e.getMessage());
		}
	}

	@Test
	public void CT06CadastrarUsuarioComNome_nulo() {
		try {
			// Cenário
			Usuario usuario = ObtemUsuario.comNome_nulo();
			fail("Deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// Verificação
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT07CadastrarUsuario_com_sucesso_getNome() {
		// Cenário
		Usuario usuario = ObtemUsuario.comDadosValidos();
		assertEquals("Usuario da Silva", usuario.getNome());
	}

}