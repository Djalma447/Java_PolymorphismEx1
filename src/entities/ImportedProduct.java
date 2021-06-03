package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustmosFee() {
		return customsFee;
	}

	public void setCustmosFee(Double custmosFee) {
		this.customsFee = custmosFee;
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
	}
}
