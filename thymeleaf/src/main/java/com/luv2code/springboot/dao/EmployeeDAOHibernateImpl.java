package com.luv2code.springboot.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.luv2code.springboot.entity.Employee;


@Repository//component,database related exception handles
public class EmployeeDAOHibernateImpl{

	@Autowired
	private EntityManager entityManager; //similar to session factory in hibernate
	
	@Transactional //to avoid start commit close of session
	public List<Employee> findAll() {
		
		//get hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create a query
		Query<Employee> theQuery = currentSession.createQuery("from Employee order by lastName",Employee.class);
		//execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		//return the results
		
		return employees;
	}

	public Employee findById(int theId) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee = currentSession.get(Employee.class,theId);
		return employee;
	}


	public String save(Employee theEmployee) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(theEmployee);
		return "saved";
	}


	@Transactional
	public String deleteById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("delete from Employee where id=:empId");
		theQuery.setParameter("empId",theId);
		theQuery.executeUpdate();
		return "deleted";
	}

	
}
