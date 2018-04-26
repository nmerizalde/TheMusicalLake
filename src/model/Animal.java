package model;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private String AnimalName;
	private ArrayList<String> arrlist;
	
	
	public String getAnimalName() {
		return AnimalName;
	}
	public void setAnimalName(String animalName) {
		AnimalName = animalName;
	}
	public ArrayList<String> getArrlist() {
		return arrlist;
	}
	public void setArrlist(ArrayList<String> arrlist) {
		this.arrlist = arrlist;
	}
	
}
