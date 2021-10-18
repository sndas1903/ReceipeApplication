/**
 * 
 */
package com.receipe.service;

import java.util.List;

import com.receipe.model.Receipe;

public interface ReceipeService {

	List<Receipe> getReceipes();
	Receipe addReceipe(Receipe receipe);
	String getReceipeImage(int id);
	Receipe getReceipe(int id);
}
