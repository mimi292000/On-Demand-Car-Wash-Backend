package com.ODCarwash.WasherBlock.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ODCarwash.WasherBlock.model.bookingDetails;
import com.ODCarwash.WasherBlock.model.customerRating;
import com.ODCarwash.WasherBlock.model.login;
import com.ODCarwash.WasherBlock.model.washers;
import com.ODCarwash.WasherBlock.service.loginService;
import com.ODCarwash.WasherBlock.service.washerService;


@RestController
@RequestMapping("/wash")
@CrossOrigin(origins = "*")
public class washerController {
	@Autowired
	private washerService service;
	
	@Autowired
	private loginService user;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
//------------Washer Operations------------------//
	@PostMapping("/addwasher")
	public washers saveWasher(@RequestBody washers washer) {
		return service.addWasher(washer);
	}
	
	@GetMapping("/allwashers")
	public List<washers> findAllwashers() {
		return service.getwashers();
	}

	@GetMapping("/allwashers/{location}")
	public List<washers> findwasherByAddress(@PathVariable String location) {
		return service.getwasherbylocation(location);
	}

	@DeleteMapping("/delete/{id}")
	public String removeUser(@RequestParam(value = "id", required = true)Integer id) {
		service.deletewasher(id);
		return "deleted";
	}
	@PostMapping("/login")
	public int userLogin(@RequestBody login login) {
		return user.userLogin(login);
	}
	
/*------------------ Resttemplates---------------------------- */
	
	@GetMapping("/allratings")
	public List<customerRating> getwashpacks() {
		String baseurl = "http://localhost:8081/admin/allratings";
		customerRating[] wp = restTemplate.getForObject(baseurl,customerRating[].class);
		return Arrays.asList(wp);
	}
	
	@GetMapping("/allbooking")
	public List<bookingDetails> getallbookings(){
		String baseurl="http://localhost:8083/order/allorders";
		bookingDetails[] allorders=restTemplate.getForObject(baseurl, bookingDetails[].class);		
		return Arrays.asList(allorders);
	
}
}
