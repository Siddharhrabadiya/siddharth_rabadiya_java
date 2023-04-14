package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Info;

public class Dao 

{
	public void InsertData(Info p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.save(p);
		tr.commit();
		sess.close();
	}

}
