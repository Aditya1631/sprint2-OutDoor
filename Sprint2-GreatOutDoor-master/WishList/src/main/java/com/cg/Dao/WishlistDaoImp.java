package com.cg.Dao;



import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cg.Entity.*;


public class WishlistDaoImp implements WishlistDaoI{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void addToWishlist(WishList w) {
				em.persist(w);
	}

	@Override
	public int removeFromWishlist(int id) {
		WishList w= em.find(WishList.class, id);
		System.out.println(w.getRetail().getRetailer_Id()+" "+w.getProduct().getProduct_ID()+" "+"this record is deleted");
		em.remove(w);
		return 0;
	}

	@Override
	public List retrieve() {
		Query q = em.createQuery("from Product p");
		return q.getResultList();
	}

	

}
