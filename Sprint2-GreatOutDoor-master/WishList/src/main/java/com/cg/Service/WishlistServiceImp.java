package com.cg.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Entity.WishList;
import com.cg.Dao.WishlistDaoI;


@Service
public class WishlistServiceImp implements WishlistServiceI{
	
	@Autowired
	WishlistDaoI wl;

	

	@Override
	public List retrieve() {
		return wl.retrieve();
	}

	@Override
	public void addToWishlist(WishList w) {
		wl.addToWishlist(w);
	}

	@Override
	public int removeFromWishlist(int id) {
		return wl.removeFromWishlist(id);
	}

}
