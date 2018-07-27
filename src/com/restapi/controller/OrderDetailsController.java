package com.restapi.controller;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.dao.DaoInterface;
import com.restapi.pojo.ORDERDETAILS;

@RestController
@RequestMapping("/orders")


public class OrderDetailsController {
	
	@Autowired
	@Qualifier("CustomerAddressDao")
	private DaoInterface<ORDERDETAILS> dao;

	
	@GetMapping(value = "/customer/{id}")
	public List<ORDERDETAILS> getCustomerAddress(@PathVariable int id) {
		List<ORDERDETAILS> cust = null;
		try {
			cust = dao.getSome(id);
		} catch (NoResultException e) {
			System.out.println("err in get summary " + e);
			return null;
		}
		return cust;
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getAddress(@PathVariable int id) {
		ORDERDETAILS cust = null;
		try {
			cust = dao.get(id);
		} catch (NoResultException e) {
			System.out.println("err in get summary " + e);
			return new ResponseEntity<String>("Invalid ", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ORDERDETAILS>(cust, HttpStatus.OK);
	}

	@GetMapping(value = "/")
	// @RequestMapping(....,method=RequestMethod.GET)
	public List<ORDERDETAILS> listAdmin() {
		System.out.println("in list ORDERDETAILS");
		List<ORDERDETAILS> list = (List<ORDERDETAILS>) dao.getall();
		System.out.println(list);
		return list;
	}

	@PostMapping("/")
	public ResponseEntity<?> insertCustomer(@RequestBody ORDERDETAILS cust) {
		Boolean status = false;
		try {
			status = dao.insert(cust);
			return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		} catch (NoResultException e) {
			return new ResponseEntity<Boolean>(status, HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@PutMapping("/")
	public ResponseEntity<?> updateCustomer(@RequestBody ORDERDETAILS cust) {
		Boolean status = false;
		try {
			status = dao.update(cust);
			return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		} catch (NoResultException e) {
			return new ResponseEntity<Boolean>(status, HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@DeleteMapping("/")
	public ResponseEntity<?> DeleteCustomer(@RequestBody int id) {
		Boolean status = false;
		try {
			status = dao.delete(id);
			return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		} catch (NoResultException e) {
			return new ResponseEntity<Boolean>(status, HttpStatus.NOT_IMPLEMENTED);
		}
	}
}
