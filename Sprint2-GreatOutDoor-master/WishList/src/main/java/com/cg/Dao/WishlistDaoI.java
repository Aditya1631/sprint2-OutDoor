package com.cg.Dao;

import java.util.List;


import org.springframework.stereotype.Repository;
import com.cg.Entity.WishList;

@Repository
public interface WishlistDaoI {
	
	public void addToWishlist(WishList w);
	public int removeFromWishlist(int id);
	public List retrieve();

}
