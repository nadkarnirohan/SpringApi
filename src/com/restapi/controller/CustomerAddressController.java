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
import com.restapi.pojo.CUSTOMERADDRESS;

@RestController
@RequestMapping("/customeraddress")
public class CustomerAddressController {

	@Autowired
	@Qualifier("CustomerAddressDao")
	private DaoInterface<CUSTOMERADDRESS> dao;

	@GetMapping(value = "/customer/{id}")
	public List<CUSTOMERADDRESS> getCustomerAddress(@PathVariable int id) {
		List<CUSTOMERADDRESS> cust = null;
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
		CUSTOMERADDRESS cust = null;
		try {
			cust = dao.get(id);
		} catch (NoResultException e) {
			System.out.println("err in get summary " + e);
			return new ResponseEntity<String>("Invalid ", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CUSTOMERADDRESS>(cust, HttpStatus.OK);
	}

	@GetMapping(value = "/")
	// @RequestMapping(....,method=RequestMethod.GET)
	public List<CUSTOMERADDRESS> listAdmin() {
		System.out.println("in list CUSTOMERADDRESS");
		List<CUSTOMERADDRESS> list = (List<CUSTOMERADDRESS>) dao.getall();
		System.out.println(list);
		return list;
	}
	


	@PostMapping("/")
	public ResponseEntity<?> insertCustomer(@RequestBody CUSTOMERADDRESS cust) {
		Boolean status = false;
		try {
			status = dao.insert(cust);
			return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		} catch (NoResultException e) {
			return new ResponseEntity<Boolean>(status, HttpStatus.NOT_IMPLEMENTED);
		}
	}
	@PutMapping("/")
	public ResponseEntity<?> updateCustomer(@RequestBody CUSTOMERADDRESS cust) {
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
