package model;

public class ProductForSale extends Product implements Saleable{

	private double discount;

	public ProductForSale (java.lang.String code,  java.lang.String name, int units, double price, ProductType type){

		super(code, name, units,price,type);
	}

	public double calculateTax(double totalPrice, double percentage){
		return 0;
	}

	public double getSalePrice(int units){
		return 0;
	}
	public java.lang.String getInformation(){
		return "";
	}
	public void setDiscount(double discount){


		
	}
	public boolean isSafesale(int units){
		return true;
	}
	public double applyExtraDiscount(double subtotal, double percentage){
		return 0;
	}
}