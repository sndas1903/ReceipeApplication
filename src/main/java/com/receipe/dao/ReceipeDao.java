package com.receipe.dao;

import java.util.List;

import com.receipe.model.Receipe;

public interface ReceipeDao {
	
	List<Receipe> getReceipes();
	Receipe addReceipe(Receipe receipe);
	String getReceipeImage(int id);
	Receipe getReceipe(int id);
}
