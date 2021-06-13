package br.com.portfolio.demoPipeline.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de dados para demonstração")
	public List<String> listaDocumentos(){
		List<String> listaDemonstracao = new ArrayList<String>();
		listaDemonstracao.add("Primeiro dado");
		listaDemonstracao.add("Segundo dado");
		
		return listaDemonstracao;
	}
}
