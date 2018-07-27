package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.restapi.pojo.INVENTORY;

@Repository("InvetoryDao")
@Transactional
public class InvetoryDao implements DaoInterface<INVENTORY> {

	@Autowired
	private SessionFactory sf;

	@Override
	public INVENTORY get(int id) {
		System.out.println("custdao : get summary " + id);
		return sf.getCurrentSession()
				.createQuery("select inventory from INVENTORY inventory where inventory.PRODUCTNO = :id",
						INVENTORY.class)
				.setParameter("id", id).getSingleResult();
	}

	@Override
	public List<INVENTORY> getall() {
		String query = "select inventory from INVENTORY inventory";
		return sf.getCurrentSession().createQuery(query, INVENTORY.class).getResultList();
	}

	public List<INVENTORY> getSome(int id) {
		return null;
	}

	@Override
	public boolean insert(INVENTORY inventory) {

		return false;
	}

	@Override
	public boolean delete(int id) {
		return false;
	}

	@Override
	public boolean update(INVENTORY inventory) {
		return false;
	}

	@Override
	public INVENTORY get(String email, String password) {
		return null;

	}
}
