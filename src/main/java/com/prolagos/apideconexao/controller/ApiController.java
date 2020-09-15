package com.prolagos.apideconexao.controller;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prolagos.apideconexao.controller.dto.ApiDto;
import com.prolagos.apideconexao.model.Api;

@RestController
public class ApiController {

	@RequestMapping("/api")
	public List<ApiDto> lista() throws UnknownHostException {
		Api api = new Api(10, "gggg", "192", "ze");

		return ApiDto.converter (Arrays.asList(api, api, api));

	}

}
