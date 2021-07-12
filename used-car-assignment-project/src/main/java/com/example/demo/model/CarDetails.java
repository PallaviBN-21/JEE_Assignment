package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CarDetails {

	private String model;
	private int yearOfManufacture;
	private double kilometersTraveled;
	private String status;
	@Override
	public String toString() {
		return "CarDetails [model=" + model + ", yearOfManufacture=" + yearOfManufacture + ", kilometersTravelled="
				+ kilometersTraveled + ", status=" + status + "]";
	}
	public CarDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarDetails(String model, int yearOfManufacture, double kilometersTravelled, String status) {
		super();
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.kilometersTraveled = kilometersTravelled;
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kilometersTraveled);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + yearOfManufacture;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarDetails other = (CarDetails) obj;
		if (Double.doubleToLongBits(kilometersTraveled) != Double.doubleToLongBits(other.kilometersTraveled))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (yearOfManufacture != other.yearOfManufacture)
			return false;
		return true;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public double getKilometersTravelled() {
		return kilometersTraveled;
	}
	public void setKilometersTravelled(double kilometersTravelled) {
		this.kilometersTraveled = kilometersTravelled;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
