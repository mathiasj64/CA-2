/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import entity.Company;
import facade.CompanyFacade;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Philip
 */
@Path("person")
public class Person
{

  CompanyFacade cf;

  @Context
  private UriInfo context;

//  public Person()
//  {
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2PU");
//    cf = new CompanyFacade(emf);
//  }

  @GET
  @Path("company")
  @Produces(MediaType.APPLICATION_JSON)
  public String getCompany()
  {
//    Company c = cf.getCompany(1);
//    return c.getName();
    return "{\"name\":\"Henrik\"}";
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public void putJson(String content)
  {
  }
}
