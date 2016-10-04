/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import entity.Company;
import facade.CompanyFacade;
import facade.PersonFacade;
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
  PersonFacade pf;

  @Context
  private UriInfo context;

  public Person()
  {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2PU");
    cf = new CompanyFacade(emf);
    pf = new PersonFacade(emf);
  }

  @GET
//  @Produces(MediaType.APPLICATION_JSON)
  public String getCompany()
  {
//    entity.Person p = pf.getPerson(1);
    Company c = cf.getCompany(123);
    return c.getName();
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public void putJson(String content)
  {
  }
}
