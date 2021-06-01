package model;

import java.time.LocalDate;

public class ProductForRent extends Product implements Rentable{
	private LocalDate devolutionDate;

	private State state;

	public ProductForRent(java.lang.String code, java.lang.String name,  double price, ProductType type   ){
		super(code, name,1, price, type  );
		this.state=State.AVAILABLE;
		LocalDate devolutionDate = LocalDate.of(2021,05,28);
		
	}
	
	public void rentProduct(int amountDays ){
		this.state=State.RENTED;
		
	}
		
	public double getRentPrice(double amountDays ){
		return 0;
	}
	
	public java.lang.String getInformation(){
		return "";
	}
	
	public boolean isSafeRent(){
		return true;
	}
}