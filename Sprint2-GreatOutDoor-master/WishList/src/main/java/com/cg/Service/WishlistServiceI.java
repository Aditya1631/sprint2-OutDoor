package com.cg.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.Entity.WishList;

@Service
public interface WishlistServiceI {
	
	public void addToWishlist(WishList w);
	public int removeFromWishlist(int id);
	public List retrieve();
	

}
