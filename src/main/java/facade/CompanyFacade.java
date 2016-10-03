package facade;

//@author Mathias
import entity.Company;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class CompanyFacade
{

  EntityManagerFactory emf;

//      EntityManagerFactory emf = Persistence.createEntityManagerFactory("rest_1_2PU");
//      CompanyFacade cf = new CompanyFacade(emf);
      
  public CompanyFacade(EntityManagerFactory emf)
  {  
    this.emf = emf;
  }

  Company getCompany(int cvr)
  {
    Company c = null;
    EntityManager em = emf.createEntityManager();

    try
    {
      em.getTransaction().begin();
      c = em.find(Company.class, cvr);
      em.getTransaction().commit();
      System.out.println("comapny: " + c.getName());
      return c;
    }
    finally
    {
      em.close();
    }
  }

}
