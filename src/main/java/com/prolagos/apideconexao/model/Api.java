package com.prolagos.apideconexao.model;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Api {
	
	private Integer Bot;
	private String Hostname;
	private String Ip;
	@ManyToOne
	private String User;
	private LocalDateTime Hora = LocalDateTime.now();
	@Enumerated(EnumType.STRING)
	private StatusBot status = StatusBot.NÃO_INICIADO;
	
	public Api(Integer Bot, String Hostname, String Ip, String User) throws UnknownHostException {
		this.Bot = Bot;
		this.Hostname = InetAddress.getLocalHost().getHostName();
		this.Ip = InetAddress.getLocalHost().getHostAddress();
		this.User = System.getProperty("user.name");
		this.Hora = LocalDateTime.now();
	}
	
	
	public Integer getBot() {
		return Bot;
	}
	public String getHostname() {
		return Hostname;
	}
	public String getIp() {
		return Ip;
	}
	public String getUser() {
		return User;
	}
	public LocalDateTime getHora() {
		return Hora;
	}
	public StatusBot getStatus() {
		return status;
	}
	public void setBot(Integer bot) {
		Bot = bot;
	}
	public void setHostname(String hostname) {
		Hostname = hostname;
	}
	public void setIp(String ip) {
		Ip = ip;
	}
	public void setUser(String user) {
		User = user;
	}
	public void setHora(LocalDateTime hora) {
		Hora = hora;
	}
	public void setStatus(StatusBot status) {
		this.status = status;
	}

	
	
	
	
	
	
}
