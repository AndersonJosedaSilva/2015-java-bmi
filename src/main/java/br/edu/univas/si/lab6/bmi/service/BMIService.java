package br.edu.univas.si.lab6.bmi.service;


public class BMIService {
	private BMIService(){
		
	}
	
	
	public static Float getIndex(Float height, Float weight){
		return weight / (height * height);
		
	}
	public static String getDescription(Float bmiIndex){
		//TODO to be implemented as home work
		return "";
	}
	
}
