package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	
			
	@Override
	public List<Customer> getCustomers() {
		Session session=sessionFactory.getCurrentSession();
		Query<Customer> theQuery= session.createQuery("from Customer order by lastname",Customer.class);
		
		List<Customer> customers= theQuery.getResultList();
		return customers;
	}


	@Override
	public void addCustomer(Customer customer) {
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer); //If object with given id exists it will update it if not then creates it
		
	}


	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		System.out.println("----------Inside Customer Dao Implementaion------------------");
		
		Session session=sessionFactory.getCurrentSession();
		System.out.println("----------Inside Customer Dao Implementaion----------Session-------- "+session);
		
		Customer customer= session.get(Customer.class, id);
		System.out.println("----------Inside Customer service Implementaion----------Customer-------- "+customer);
		
		return customer;
		
	}

}
