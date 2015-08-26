package model;

import java.util.ArrayList;

public class Planet {

	
	// verteilung produktion 
	// forschung skalieren
	// skilltree / fog of war
	// npc angreifen
	// WŸrfel , reskšrper, metrik
	// Schild-System
	// Kampf-System Ÿberarbeitet
	
	private int size, temperature, metal, crystal, deut;
	private String name = "";
	private ArrayList<Building> buildings;
	private MetalMine metalMine = new MetalMine(1.35, 1.05);
	private int position; 
	private double sunCoefficient;
	
	public Planet(int position)	{
		generateSize();
		sunCoefficient = generateSunCoefficient(position);
		initiateBuildings();
	}	

	private double generateSunCoefficient(int position2) {
		return 1-((position-1)*0.025);
	}



	private void initiateBuildings() {
		metalMine = new MetalMine(1.35, 1.05);
		buildings.add(metalMine);
	}

	private int generateSize() {
		return (int) (150+Math.round(Math.random()*110));
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getMetal() {
		return metal;
	}

	public void setMetal(int metal) {
		this.metal = metal;
	}

	public int getCrystal() {
		return crystal;
	}

	public void setCrystal(int crystal) {
		this.crystal = crystal;
	}

	public int getDeut() {
		return deut;
	}

	public void setDeut(int deut) {
		this.deut = deut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
