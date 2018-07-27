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
import com.restapi.pojo.SELLERS;
import com.restapi.pojo.SELLERS_VIEW;
@RestController
@RequestMapping("/seller")
public class SellerController {
	@Autowired
	@Qualifier("SellerDao")
	private DaoInterface<SELLERS> dao;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> get(@PathVariable int id) {
		SELLERS seller = null;
		try {
			seller = dao.get(id);
		} catch (NoResultException e) {
			System.out.println("err in get summary " + e);
			return new ResponseEntity<String>("Invalid ", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SELLERS>(seller, HttpStatus.OK);
	}

	@GetMapping(value = "/")
	// @RequestMapping(....,method=RequestMethod.GET)
	public List<SELLERS> getall() {
		System.out.println("in list Sellers");
		List<SELLERS> list = (List<SELLERS>) dao.getall();
		System.out.println(list);
		return list;
	}

	@PostMapping("/login")
	public ResponseEntity<?> ValidateCustomer(@RequestBody SELLERS_VIEW a) {
		SELLERS seller = null;
		try {
			seller = dao.get(a.getEMAIL(), a.getPASSWORD());
			if (seller.getEMAIL().equals(a.getEMAIL()) && seller.getPASSWORD().equals(seller.getPASSWORD())) {

				SELLERS claim = new SELLERS(seller.getEMAIL(), seller.getFIRSTNAME(), seller.getSELLERID());
				return new ResponseEntity<SELLERS>(claim, HttpStatus.OK);
			} else {
				return null;
			}
		} catch (NoResultException e) {
			return null;
		}
	}

	@PostMapping("/")
	public ResponseEntity<?> insertCustomer(@RequestBody SELLERS seller) {
		Boolean status = false;
		try {
			status = dao.insert(seller);
			return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		} catch (NoResultException e) {
			return new ResponseEntity<Boolean>(status, HttpStatus.NOT_IMPLEMENTED);
		}
	}
	@PutMapping("/")
	public ResponseEntity<?> updateCustomer(@RequestBody SELLERS seller) {
		Boolean status = false;
		try {
			status = dao.update(seller);
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
