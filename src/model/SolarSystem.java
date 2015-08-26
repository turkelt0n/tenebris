package model;

import java.util.ArrayList;

public class SolarSystem {

	private ArrayList<Planet> planets;
	private double sun;			// Idee: Sonnen in verschiedenen Systemen haben andere Stärke
	private int xOrdinate, yOrdinate, zOrdinate;

	public SolarSystem(int xOrdinate, int yOrdinate, int zOrdinate)	{
		this.xOrdinate = xOrdinate;
		this.yOrdinate = yOrdinate;
		this.zOrdinate = zOrdinate;
		generatePlanets();
	}
	
	public ArrayList<Planet> getPlanets() {
		return planets;
	}

	public void setPlanets(ArrayList<Planet> planets) {
		this.planets = planets;
	}

	private void generatePlanets() {
		int temp;
		for(int i =0; i < 8; i++)	{
			temp = generatePlanetPosition();
			planets.add(new Planet(temp));
		}
	}

	private int generatePlanetPosition() {
		return (int) Math.round(Math.random()*10);
	}

	public int getxOrdinate() {
		return xOrdinate;
	}

	public void setxOrdinate(int xOrdinate) {
		this.xOrdinate = xOrdinate;
	}

	public int getyOrdinate() {
		return yOrdinate;
	}

	public void setyOrdinate(int yOrdinate) {
		this.yOrdinate = yOrdinate;
	}

	public int getzOrdinate() {
		return zOrdinate;
	}

	public void setzOrdinate(int zOrdinate) {
		this.zOrdinate = zOrdinate;
	}
	
	
	
}
