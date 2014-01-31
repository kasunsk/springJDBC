package com.kasun.customer.dao;

import com.kasun.customer.model.Persion;

public interface PersionDAO 
{
	public void insert(Persion persion);
	public Persion findByCustomerId(int ID);
}




