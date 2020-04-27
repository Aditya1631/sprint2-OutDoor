package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.WishList;
import com.cg.Service.WishlistServiceI;

@CrossOrigin("*")
@RestController
public class WishlistController {
	
	@Autowired
	WishlistServiceI wl_service;
	

	@GetMapping(value="/wishlists")
	public List<WishList> viewRequests() {
		return wl_service.retrieve();
	}
	
	@PostMapping(value="/wishlist/new",consumes= {"application/json"})
	public String addToWishlist(@RequestBody WishList w_obj)
	{
		wl_service.addToWishlist(w_obj);
		return "product added successfully";
	}

}
