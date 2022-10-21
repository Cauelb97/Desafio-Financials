package com.IBM.Projetoibm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ";")
public class Controller {
	
	@Autowired
	Repository repository;
	
	@GetMapping("mensais")
	public List<Entidades> mensaisList(){
		return repository.findAll();
	}
	
	@PostMapping("inserir")
	public Repository inserir(@RequestBody Repository inserirPost) {
		return repository.save(inserirPost);
	}
	
	@DeleteMapping("delete")
	public Repository delete(@PathVariable(value="id") int id) {
		repository.deleteById(id);
		return "id" + id;
	}
	
	@PutMapping("atualizar")
	public Repository atualizar(@RequestBody Repository Entidades) {
		return Repository.save(Entidades);
	}
	
	
}
