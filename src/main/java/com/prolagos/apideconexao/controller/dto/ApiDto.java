package com.prolagos.apideconexao.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.prolagos.apideconexao.model.Api;
import com.prolagos.apideconexao.model.StatusBot;


public class ApiDto {

	private Integer Bot;
	private String Hostname;
	private String Ip;
	private String User;
	private LocalDateTime Hora = LocalDateTime.now();
	
	public ApiDto(Api api) {
		
		this.Bot = api.getBot();
		this.Hostname = api.getHostname();
		this.Ip = api.getIp();
		this.User = api.getUser();
		this.Hora = api.getHora();
		this.status = api.getStatus();
		
		
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
	private StatusBot status = StatusBot.NÃO_INICIADO;

	public static List<ApiDto> converter(List<Api> apis) {
		
		return apis.stream().map(ApiDto::new).collect(Collectors.toList());
	}
}
