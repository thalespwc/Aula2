package com.fatec.sce;

import static org.junit.Assert.*;
import org.junit.Test;
import com.fatec.sce.model.Livro;

public class UC01CadastrarLivro {
/**
 * Objetivo - verificar o comportamento da aplicacao na inclusao de dados invalidos
 */
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	/**
	 * Objetivo - Caso de Teste 02 para verificar o comportamento da aplicacao na inclusao de Livro com ISBN em Branco
	 */
	@Test
	public void CT02CadastrarLivroComISBNBranco() {
		
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	/**
	 * Objetivo - Caso de Teste 03 para verificar o comportamento da aplicacao na inclusao de Livro com ISBN Nulo
	 */
	@Test
	public void CT03CadastrarLivroComISBNNulo() {
		
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_nulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	/**
	 * Objetivo - Caso de Teste 04 para verificar o comportamento da aplicacao na inclusao de dados validos comparando o ISBN
	 */	
	@Test
	public void CT04CadastrarLivroComDadosValidos() {
		
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("1111");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
			// verificacao
			assertEquals("1111",umLivro.getIsbn());
		
	}
	/**
	 * Objetivo - Caso de Teste 05 para verificar o comportamento da aplicacao na inclusao de dados validos comparando o Titulo
	 */
	@Test
	public void CT05CadastrarLivroComDadosValidos() {
		
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comDadosValidos();
			// verificacao
			assertEquals("Engenharia de Software",umLivro.getTitulo());
		
	}
	/**
	 * Objetivo - Caso de Teste 06 para verificar o comportamento da aplicacao na inclusao de Livro com Titulo em Branco
	 */
	@Test
	public void CT06CadastrarLivroComTituloBranco() {
		
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comTituloBranco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
		
	}
	/**
	 * Objetivo - Caso de Teste 07 para verificar o comportamento da aplicacao na inclusao de Livro com Titulo Nulo
	 */
	@Test
	public void CT07CadastrarLivroComTituloNulo() {
		
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comTituloNulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
		
	}
	/**
	 * Objetivo - Caso de Teste 08 para verificar o comportamento da aplicacao na inclusao de dados validos comparando o Autor
	 */
	@Test
	public void CT08CadastrarLivroComTituloNulo() {
		
		// cenario
		Livro umLivro = new Livro();
		// acao
		umLivro = ObtemLivro.comDadosValidos();
		// verificacao
		assertEquals("Pressman",umLivro.getAutor());
		
	}
	/**
	 * Objetivo - Caso de Teste 09 para verificar o comportamento da aplicacao na inclusao de Livro com Autor em Branco
	 */
	@Test
	public void CT09CadastrarLivroComAutorBranco() {
		
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comAutorBranco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido",e.getMessage());
		}
		
	}
	/**
	 * Objetivo - Caso de Teste 10 para verificar o comportamento da aplicacao na inclusao de Livro com Autor Nulo
	 */
	@Test
	public void CT10CadastrarLivroComAutorNulo() {
		
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comAutorNulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido",e.getMessage());
		}
		
	}
	
}
