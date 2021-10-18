package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ICustomerRepository;

public class CustomerService implements ICustomerService {

  @Autowired
  private ICustomerRepository customerRepository;

  @Override
  public boolean insertWithStoredProcedure(Customer customer) {
    return customerRepository.insertWithStoredProcedure(customer);
  }
}
