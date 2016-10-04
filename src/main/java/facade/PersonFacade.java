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

  public Person getPerson(int id)
  {
    Person p = null;
    EntityManager em = emf.createEntityManager();

    try
    {
      em.getTransaction().begin();
      Query nQuery5 = em.createNamedQuery("person.findAll");
      List<Person> students5 = nQuery5.getResultList();
//      p = em.find(Person.class, id);
      em.getTransaction().commit();
      System.out.println("person: " + p.getFirstName());
      return students5.get(0);
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
//      Query nQuery5 = em.createNamedQuery("Student.findAll");
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
