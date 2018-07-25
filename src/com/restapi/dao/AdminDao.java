package com.restapi.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.ADMIN;

@Repository("AdminDao")
@Transactional
public class AdminDao implements DaoInterface<ADMIN> {
	// dependency
	@Autowired
	private SessionFactory sf;


	@Override
	public List<ADMIN> getall() {
		String query = "select a from ADMIN a";
		return sf.getCurrentSession().createQuery
				(query,ADMIN.class).getResultList();
	}

	@Override
	public boolean insert(ADMIN adm) {
	Integer stat = (Integer)sf.getCurrentSession().save(adm);
		//sf.getCurrentSession().get(adm);
	if(stat > 0) {
		return true;
	}
		return false;
	}

	@Override
	public ADMIN get(int id) {
		System.out.println("dao : get summary " + id );
		return sf.getCurrentSession()
				.createQuery("select a from ADMIN a where a.ADMINID = :id", ADMIN.class)
				.setParameter("id",id).getSingleResult();
	}

public ADMIN get(String name , String password) {
	System.out.println("dao : get summary " + name + " "+ password);
	return sf.getCurrentSession()
			.createQuery("select a from ADMIN a where a.ADMINNAME = :name and a.PASSWORD = :password", ADMIN.class)
			.setParameter("name",name).setParameter("password", password).getSingleResult();
	}

	@Override
	public boolean delete(int id) {
		ADMIN adm =get(id);
		sf.getCurrentSession().delete(adm);
		return true;
	}

	@Override
	public boolean update(ADMIN adm) {
		sf.getCurrentSession().update(adm);
		return true;
	}

}
