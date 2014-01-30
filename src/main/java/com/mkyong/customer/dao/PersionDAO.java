package com.mkyong.customer.dao;

import com.mkyong.customer.model.Persion;

public interface PersionDAO 
{
	public void insert(Persion persion);
	public Persion findByCustomerId(int ID);
}




