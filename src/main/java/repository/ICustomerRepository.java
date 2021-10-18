package repository;

import model.Customer;

public interface ICustomerRepository {
boolean insertWithStoredProcedure(Customer customer);
}
