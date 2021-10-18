package service;

import model.Customer;

public interface ICustomerService{
  boolean insertWithStoredProcedure(Customer customer);
}
