package org.apache.aries.jpa.example.tasklist.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.orange.isep.model.service.Service;
//@Component
public class RestServiceImpl implements RestService {
// 	  private JpaTemplate jpa;

	/*
	* jpa is never set - is null
	*/
// 	   @Reference(target = "(osgi.unit.name=tasklist)")
//         public void setJpaTemplate(JpaTemplate jpa) {
//          this.jpa = jpa;
//         }
	

	  @PersistenceContext(unitName = "tasklist")
	  EntityManager em;
	
	  @Override
		public List<Service> getAll() {
	    			List<Service> resultList = em.createQuery("select s from Service s", Service.class).getResultList();
	    			return resultList;
		}
}
