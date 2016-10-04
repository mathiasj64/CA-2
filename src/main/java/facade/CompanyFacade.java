package facade;

//@author Mathias
import entity.Company;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class CompanyFacade
{

  EntityManagerFactory emf;
      
  public CompanyFacade(EntityManagerFactory emf)
  {  
    this.emf = emf;
  }

  public Company getCompany(int cvr)
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
  
//  public List<Company> getBigCompanies(int minEmployees)
//  {
//    
//  }

}
