package com.fatec.sce;

import com.fatec.sce.model.Usuario;

public class ObtemUsuario {
	public static Usuario comDadosValidos() {
		Usuario usuario = new Usuario();
		usuario.setRa("12121212");
		usuario.setNome("Usuario da Silva");
		return usuario;
	}
	public static Usuario comRA_Branco() {
		Usuario usuario = new Usuario();
		usuario.setRa("");
		usuario.setNome("Usuario da Silva");
		return usuario;
	}
	public static Usuario comRA_nulo() {
		Usuario usuario = new Usuario();
		usuario.setRa(null);
		usuario.setNome("Usuario da Silva");
		return usuario;
	}
	public static Usuario comNome_Branco() {
		Usuario usuario = new Usuario();
		usuario.setRa("12121212");
		usuario.setNome("");
		return usuario;
	}
	public static Usuario comNome_nulo() {
		Usuario usuario = new Usuario();
		usuario.setRa("12121212");
		usuario.setNome(null);
		return usuario;
	}
}