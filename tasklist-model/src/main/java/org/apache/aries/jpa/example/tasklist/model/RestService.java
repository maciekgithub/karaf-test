package org.apache.aries.jpa.example.tasklist.model;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pl.orange.isep.model.service.Service;



@Produces(MediaType.APPLICATION_JSON)
public interface RestService {	
	    @GET
	    @Path("/test")
	    public List<Service> getAll();     
}
