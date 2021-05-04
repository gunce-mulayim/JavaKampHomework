package Concrete;


import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	public void Save (Customer customer) {

		if (customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
			System.out.println("Validation successful.");
			System.out.println("Starbucks person");
		} else {
			System.out.println("Not a valid person.");
		}

	}
}
