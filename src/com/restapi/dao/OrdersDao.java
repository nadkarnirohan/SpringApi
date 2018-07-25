package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.ORDERS;
@Repository("OrdersDao")
@Transactional
public class OrdersDao implements DaoInterface<ORDERS> {

	@Autowired
	private SessionFactory sf;

	@Override
	public ORDERS get(int id) {
		
		System.out.println("orderdao : get summary " + id );
		return sf.getCurrentSession()
				.createQuery("select a from ORDERS a where a.ORDERNUM = :id", ORDERS.class)
				.setParameter("id",id).getSingleResult();
	}

	public List<ORDERS>  getOrders(int id) {
		
		System.out.println("orderdao : get summary " + id );
		return sf.getCurrentSession()
				.createQuery("select a from ORDERS a where a.CUSTID = :id", ORDERS.class)
				.setParameter("id",id).getResultList();
	}
	
	@Override
	public List<ORDERS> getall() {
		String query = "select c from ORDERS c";
		return sf.getCurrentSession().createQuery
				(query,ORDERS.class).getResultList();
	}

	@Override
	public boolean insert(ORDERS order) {
		Integer stat = (Integer)sf.getCurrentSession().save(order);
		//sf.getCurrentSession().get(order);
	if(stat > 0) {
		return true;
	}
		return false;
	}

	@Override
	public boolean delete(int id) {
		ORDERS order =get(id);
		sf.getCurrentSession().delete(order);
		return true;
	}

	@Override
	public boolean update(ORDERS order) {
		sf.getCurrentSession().update(order);
		return true;
	}

	@Override
	public ORDERS get(String email, String password) {
		return  null;	}
}
