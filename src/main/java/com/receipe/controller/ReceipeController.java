package com.receipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.receipe.model.Receipe;
import com.receipe.service.ReceipeService;

@RestController
public class ReceipeController {
	
	@Autowired
	private ReceipeService userService;
	
	@GetMapping(path = "/")
	public ResponseEntity<List<Receipe>> receipes() {
        
		List<Receipe> receipes = userService.getReceipes();
		return new ResponseEntity<List<Receipe>>(receipes, HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}/show")
	public ResponseEntity<String> getImage(@PathVariable int id) {
        
		String image = userService.getReceipeImage(id);
		return new ResponseEntity<String>(image, HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Receipe> getReceipee(@PathVariable int id) {
        
		Receipe receipe = userService.getReceipe(id);
		return new ResponseEntity<Receipe>(receipe, HttpStatus.OK);
	}
	
	
	@PostMapping(path = "/")
	public ResponseEntity<Receipe> addReceipe(@RequestBody Receipe receipe) {
        
		Receipe addedReceipe = userService.addReceipe(receipe);
		return new ResponseEntity<Receipe>(addedReceipe, HttpStatus.OK);
	}

}
