package facade;

//@author Mathias
import entity.Company;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CompanyFacade
{

  EntityManagerFactory emf;
      
  public CompanyFacade(EntityManagerFactory emf)
  {  
    this.emf = emf;
  }

  public Company getCompany(int cvr)
  {
    EntityManager em = emf.createEntityManager();
    Company c = null;
    Query q = em.createQuery("SELECT c FROM Company c WHERE c.id = 1");
    c = (Company)q.getSingleResult();
//    try
//    {
//      em.getTransaction().begin();
//      c = em.find(Company.class, cvr);
//      em.getTransaction().commit();
////      System.out.println("comapny: " + c.getName());
//      return c;
//    }
//    finally
//    {
//      em.close();
//    }
    return c;
  }
  
//  public List<Company> getBigCompanies(int minEmployees)
//  {
//    
//  }

}
