/**
 * 
 */
package com.receipe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.receipe.dao.ReceipeDao;
import com.receipe.model.Receipe;
import com.receipe.service.ReceipeService;

@Service
public class ReceipeServiceImpl implements ReceipeService {
	
	@Autowired
	private ReceipeDao receipeDao;

	@Override
	public List<Receipe> getReceipes() {
		return receipeDao.getReceipes();
	}
	
	@Override
	public String getReceipeImage(int id) {
		return receipeDao.getReceipeImage(id);
	}
	
	@Override
	public Receipe getReceipe(int id) {
		return receipeDao.getReceipe(id);
	}


	@Override
	public Receipe addReceipe(Receipe receipe) {
		return receipeDao.addReceipe(receipe);
	}

}
