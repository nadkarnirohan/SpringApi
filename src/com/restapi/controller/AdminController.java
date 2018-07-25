package com.restapi.controller;
import javax.servlet.http.HttpSession;

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
import com.restapi.pojo.ADMIN;
/*import com.restapi.service.AdminService;*/


@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	@Qualifier("AdminDao")
	private DaoInterface<ADMIN> dao;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> getAdmin (@PathVariable int id){
		ADMIN adm = null;
		try {
			adm = dao.get(id);
		} catch (NoResultException e) {
			System.out.println("err in get summary " + e);
			return new ResponseEntity<String>
			("Invalid A/C details", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ADMIN>(adm,HttpStatus.OK);
	}
	
	@GetMapping(value = "/")
	// @RequestMapping(....,method=RequestMethod.GET)
	public List<ADMIN> listAdmin() {
		System.out.println("in list ADMINS");
		List<ADMIN> list = (List<ADMIN>)dao.getall();
		System.out.println(list);
		return list;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> ValidateAdmin(@RequestBody ADMIN a) {
		ADMIN adm = null;
		try {
			adm = dao.get(a.ADMINNAME,a.PASSWORD);
			if(adm.ADMINNAME.equals(a.ADMINNAME) && adm.PASSWORD.equals(adm.PASSWORD)) {
				return new ResponseEntity<ADMIN>(adm,HttpStatus.OK);
			}
			else {
				return null;
			}
		} catch (NoResultException e) {
			return null;
		}
	}

}


