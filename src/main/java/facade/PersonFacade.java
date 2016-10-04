package facade;

//@author Mathias
import entity.Company;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

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
//    List<Person> persons = null;
//    EntityManager em = emf.createEntityManager();
//
//    try
//    {
//      em.getTransaction().begin();
//      Query nQuery5 = em.createNamedQuery("Person.findAll");
//      List<Person> students5 = nQuery5.getResultList();
//      em.getTransaction().commit();
//      System.out.println("person: " + p.getFirstName());
//      return persons;
//    } finally
//    {
//      em.close();
//    }
//  }

//  List<Person> getPersons(int zipCode)
//  {
//
//  }
//
//  List<Person> getPersons(String hobby)
//  {
//
//  }
//
//  int getPersonAmount(String hobby)
//  {
//
//  }
}
