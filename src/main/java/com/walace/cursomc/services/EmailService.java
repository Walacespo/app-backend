package com.walace.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.walace.cursomc.domain.Pedido;

public interface EmailService {
		
		void sendOrderConfirmationEmail(Pedido obj);
		
		void sendEmail(SimpleMailMessage msg);
		
	}

