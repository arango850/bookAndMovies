package model;

public interface Saleable{
	public double getSalePrice(int units);
	public boolean isSafeSale(int  units);
	public double applyExtraDiscount(double subtotal, double percentageDiscount );
	public double calculateTax(double totalPrice, double percentage);
}