package com.example.spring_hibernate.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring_hibernate.entity.Biryani;

import lombok.AllArgsConstructor;

@Repository("biryaniDao")
@AllArgsConstructor
public class BiryaniDaoImpl implements BiryaniDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Biryani createMenu(Biryani biryani) {
		Session session=sessionFactory.openSession();
		session.save(biryani);
		return biryani;
	}
	
	@Override
	public List<Biryani> getMenu()
	{
		Session session = sessionFactory.openSession();

        Query query = session.createQuery("from Biryani",Biryani.class);
       
       // System.out.println(list);
     
		return query.getResultList();
	}
	@Override
	public Biryani getBiryani(int id)
	{
		Session session = sessionFactory.openSession();
		Biryani biryani = session.get(Biryani.class, id);
		return biryani;
	}
	@Override
	public List<Biryani> getByName(String biryaniname) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Biryani where biryaniname=:biryaniname",Biryani.class);
		query.setParameter("biryaniname", biryaniname);
		return query.getResultList();
		
	}
	@Override
	public void deleteMenuItem(int id) {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("delete Biryani where id=:id",Biryani.class);
		q.executeUpdate();
		
	}
	
	@Override
	@Transactional
	public Biryani updateBiryani(String biryaniname,int cost, int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Biryani biryani2=session.find(Biryani.class, id);
		if(biryani2!=null)
		{
			biryani2.setBiryaniname(biryaniname);
			biryani2.setCost(cost);
			
			session.getTransaction().begin();
			session.saveOrUpdate(biryani2);
			session.getTransaction().commit();
			
		}
		//customer2.setId(0);
		return biryani2;
	}

}
