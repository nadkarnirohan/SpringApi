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
import com.restapi.pojo.CLAIM;
import com.restapi.pojo.CUSTOMERS;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	@Qualifier("CustomerDao")
	private DaoInterface<CUSTOMERS> dao;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getAdmin(@PathVariable int id) {
		CUSTOMERS cust = null;
		try {
			cust = dao.get(id);
		} catch (NoResultException e) {
			System.out.println("err in get summary " + e);
			return new ResponseEntity<String>("Invalid ", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CUSTOMERS>(cust, HttpStatus.OK);
	}

	@GetMapping(value = "/")
	// @RequestMapping(....,method=RequestMethod.GET)
	public List<CUSTOMERS> listAdmin() {
		System.out.println("in list ADMINS");
		List<CUSTOMERS> list = (List<CUSTOMERS>) dao.getall();
		System.out.println(list);
		return list;
	}

	@PostMapping("/login")
	public ResponseEntity<?> ValidateCustomer(@RequestBody CLAIM a) {
		CUSTOMERS cust = null;
		try {
			cust = dao.get(a.getEMAIL(), a.getPASSWORD());
			if (cust.getEMAIL().equals(a.getEMAIL()) && cust.getPASSWORD().equals(cust.getPASSWORD())) {

				CLAIM claim = new CLAIM(cust.getEMAIL(), cust.getCUSTID());
				return new ResponseEntity<CLAIM>(claim, HttpStatus.OK);
			} else {
				return null;
			}
		} catch (NoResultException e) {
			return null;
		}
	}

	@PutMapping("/")
	public ResponseEntity<?> InsertCustomer(@RequestBody CUSTOMERS cust) {
		Boolean status = false;
		try {
			status = dao.insert(cust);
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
