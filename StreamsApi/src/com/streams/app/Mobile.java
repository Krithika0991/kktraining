package com.streams.app;


public class Mobile  {
	
	private String brand;
	private String model;
	private Double price;
	private int mobileid;
	
	public Mobile(String model, String brand, Double i, int mobileid) {
		this.model = model;
		this.brand = brand;
		this.price = i;
		this.mobileid = mobileid;
	}
	
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
    public int getMobileid() {
    	return mobileid;
    }
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + ", mobileid=" + mobileid + "]";
	}


	public int compareTo(Mobile other) {
		return this.model.compareToIgnoreCase(other.model);
	}
	

}
