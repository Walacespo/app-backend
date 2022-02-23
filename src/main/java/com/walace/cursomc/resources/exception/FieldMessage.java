package com.walace.cursomc.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String Fildnome;
	private String message;
	
	public FieldMessage(){
		
	}

	public FieldMessage(String fildnome, String message) {
		super();
		Fildnome = fildnome;
		this.message = message;
	}

	public String getFildnome() {
		return Fildnome;
	}

	public void setFildnome(String fildnome) {
		Fildnome = fildnome;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	

}
