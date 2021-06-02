package model;

import java.time.LocalDate;

public class ProductForRent extends Product implements Rentable{
	private LocalDate devolutionDate;

	private State state;

	public ProductForRent(String code, String name,  double price, ProductType type   ){
		super(code, name,1, price, type  );
		this.state=State.AVAILABLE;
		LocalDate devolutionDate = LocalDate.of(2021,05,28);
		
	}
	
	public void rentProduct(int amountDays  ){
		this.state=State.RENTED;
		devolutionDate=devolutionDate.plusDays(amountDays);
	}
	@Override	
	public double getRentPrice(int amountDays ){
		double totalPrice=amountDays*price;
		return totalPrice;
	}
	@Override
	public String getInformation(){
		String out="";
		out= "El codigo es:"+ getCode()+"\n"+ "El nombre es: "+ getName()+ "\n"+ "Las unidades son"+ getUnits()+ "\n"+ "El precio es: "+ getPrice(); 
		switch (getType()){

			case BOOK:
			out += "Tipo Libro";
			break;
			case MAGAZINE:
			out += "Tipo Revista";
			break;
			case DVD_MOVIE:
			out += "Tipo pelicula en DVD";
			break;
			case DOWNLOAD_MOVIE:
			out+= "Tipo pelicula descargada";
			break;
		}

return out;
		}

	@Override	
	public boolean isSafeRent(){
		boolean a = false;

		if (state==state.AVAILABLE) {
			a=true;		
		}
		return a;
	}
}