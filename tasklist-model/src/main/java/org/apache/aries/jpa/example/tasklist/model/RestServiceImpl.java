package org.apache.aries.jpa.example.tasklist.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.aries.jpa.example.tasklist.ds.impl.TaskService;

import pl.orange.isep.model.service.Service;

public class RestServiceImpl implements RestService {
	
//	TaskService srv;
	
	  @PersistenceContext(unitName = "tasklist")
	  EntityManager em;
	
	  @Override
		public List<Service> getAll() {
//			logger.info("JPA TEMPLATE "+getJpa());
//			logger.info("JPA TEMPLATE "+em);
//			return getJpa().txExpr(new EmFunction<List<Service>>() {
//	    		@Override
//	    		public List<Service> apply(EntityManager em) {
	    			List<Service> resultList = em.createQuery("select s from Service s", Service.class).getResultList();
//	    			logger.info("JPA TEMPLATE returned "+resultList);
	    			return resultList;
//	    		}
//	    	});
		}

}
