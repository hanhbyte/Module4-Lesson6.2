package repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import model.Customer;

public class CustomerRepository implements ICustomerRepository {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public boolean insertWithStoredProcedure(Customer customer) {
    String sql = "CALL Insert_Customer(:firstName, :lastName)";
    Query query = entityManager.createNativeQuery(sql);
    query.setParameter("firstName", customer.getFirstName());
    query.setParameter("lastName", customer.getLastName());
    return query.executeUpdate() == 0;
  }
}
