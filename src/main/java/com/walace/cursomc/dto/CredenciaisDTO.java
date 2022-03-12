package com.walace.cursomc.dto;

public class CredenciaisDTO {
	
	private String senha;
	private String email;
	
	private CredenciaisDTO() {
		
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
