package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
public class UsedProduct extends product {
	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	
	public String priceTag() {
		return getName() + "(Used) $" + String.format("%.2f", getPrice() + "Manufacture Date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
}
