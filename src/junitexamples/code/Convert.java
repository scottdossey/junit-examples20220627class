package junitexamples.code;

public class Convert {
	
	// unit is going to be "inches" or "cm"
	// if unit is "inches" we are converting cm to inches
	// if unit is "cm" we are converting inches to cm
	public double convertLength(double length, String unit) {
		if(unit.equalsIgnoreCase("inches")) {
			return length / 2.4;
		} else {
			return length * 2.4;
		}	
	}
	
	// unit is going to be "mL" or "oz"
	// If unit is "mL" we are converting oz to mL
	// uf unit is "oz" we are converting mL to oz
	public double convertVolume(double amount, String unit) {
		if(unit.equalsIgnoreCase("mL")) {
			return amount * 29.57;
		} else {
			return amount / 29.57;
		}
	}
	
	public double convertTemperature(double temperature, String unit) {
		if(unit.equalsIgnoreCase("F")) {
			return (temperature * 9/5) + 32;
		} else {
			return (temperature - 32) * 5/9;
		}
	}
}
