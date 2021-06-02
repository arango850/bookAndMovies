package model;

public class ProductForSale  extends Product implements Saleable{

	private double discount;

	


	public ProductForSale (java.lang.String code,  java.lang.String name, int units, double price, ProductType type){

		super(code, name, units,price,type);
	}
	
	@Override
	public double calculateTax(double totalPrice, double percentage){
			double finalPrice;
		finalPrice= totalPrice+ (totalPrice*percentage);
		return finalPrice;
	}
	@Override
	public double getSalePrice(int units){
		double out=0;

		out= getPrice()*units-discount;

		return out;
	}
	@Override
	public String getInformation(){
		String out;
		out= "El código es "+ getCode()+"\n"+
		"El nombre es "+ getName()+"\n"+
		"Las unidades son "+ getUnits()+"\n"+
		"El precio es "+ getPrice();
		switch(getType()){
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
	public void setDiscount(double discount){


		this.discount=discount;
	}
	
	@Override
	public boolean isSafeSale(int units){
		boolean a=false;

		if (units>0 && units<=getUnits()) {
	a=true;
	setUnits(getUnits()-units);			
		}
		return a;
	}

	@Override
	public double applyExtraDiscount(double subtotal, double percentageDiscount){
		double finalPrice=0;
		finalPrice=subtotal-(percentageDiscount*subtotal);
		return finalPrice;
	}
}