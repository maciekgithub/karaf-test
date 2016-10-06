package org.apache.aries.jpa.example.tasklist.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.orange.isep.model.service.Service;

public class RestServiceImpl implements RestService {


	  @PersistenceContext(unitName = "tasklist")
	  EntityManager em;
	
	  @Override
		public List<Service> getAll() {
	    			List<Service> resultList = em.createQuery("select s from Service s", Service.class).getResultList();
	    			return resultList;
		}
}
