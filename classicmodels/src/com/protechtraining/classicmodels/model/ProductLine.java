package com.protechtraining.classicmodels.model;

public enum ProductLine {
	Motorcycles("Motorcycle"), 
	Planes("Planes"), 
	Ships("Ships"), 
	TrucksAndBuses("Trucks and Buses"), 
	VintageCars("Vintage Cars"),
	Trains("Trains"), 
	ClassicCars("Classic Cars"); 
	
	ProductLine(String dbName) {
		this.dbName = dbName;
	}
	
	public String getDbName() {
		return dbName;
	}

	private String dbName;
}
