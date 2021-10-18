package com.receipe.dao.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.receipe.dao.ReceipeDao;
import com.receipe.model.Receipe;

@Component
public class ReceipeDaoImpl implements ReceipeDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public List<Receipe> getReceipes() {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Receipe> criteria = builder.createQuery(Receipe.class);
		Root<Receipe> contactRoot = criteria.from(Receipe.class);
		criteria.select(contactRoot);
		return session.createQuery(criteria).getResultList();
	}
	
	
	public String getReceipeImage(int id) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Receipe receipe = session.get(Receipe.class, id);
		return receipe.getImage();
	}
	
	public Receipe getReceipe(int id) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Receipe receipe = session.get(Receipe.class, id);
		return receipe;
	}
	
	public Receipe addReceipe(Receipe receipe) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		session.save(receipe);
		return receipe;
	}
}
