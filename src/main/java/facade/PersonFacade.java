package facade;

//@author Mathias
import entity.Company;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class PersonFacade
{

  EntityManagerFactory emf;

  public PersonFacade(EntityManagerFactory emf)
  {
    this.emf = emf;
  }

  Person getPerson(int id)
  {
    Person p = null;
    EntityManager em = emf.createEntityManager();

    try
    {
      em.getTransaction().begin();
      p = em.find(Person.class, id);
      em.getTransaction().commit();
      System.out.println("person: " + p.getFirstName());
      return p;
    } finally
    {
      em.close();
    }
  }

//  List<Person> getPersons()
//  {
//
//  }
//
//  List<Person> getPersons(int zipCode)
//  {
//
//  }
}
