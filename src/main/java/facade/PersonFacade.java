package facade;

//@author Mathias
import entity.Person;
import java.util.List;
import javax.persistence.EntityManagerFactory;

public class PersonFacade
{

  EntityManagerFactory emf;

  public PersonFacade(EntityManagerFactory emf)
  {
    this.emf = emf;
  }

//  Person getPerson(int id)
//  {
//   
//  }
//
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
