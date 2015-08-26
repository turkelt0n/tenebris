package model;

public class Building {
	
	private int metalCost, crystalCost, deutCost;
	private int buildingTime;   //seconds
	private int level;
	private double costFactor;

	public Building(double costFactor)	{
		this.costFactor = costFactor;
	}
	
	public int getMetalCost() {
		return metalCost;
	}
	
	public int getMetalCostForNextLevel() {
		return (int)costFactor*metalCost;
	}

	public void setMetalCost(int metalCost) {
		this.metalCost = metalCost;
	}

	public int getCrystalCost() {
		return crystalCost;
	}
	
	public void setCrystalCost(int crystalCost) {
		this.crystalCost = crystalCost;
	}

	public int getDeutCost() {
		return deutCost;
	}

	public void setDeutCost(int deutCost) {
		this.deutCost = deutCost;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void levelUp() {
		this.level++;
	}

	public int getBuildingTime() {
		return buildingTime;
	}

	public void setBuildingTime(int buildingTime) {
		this.buildingTime = buildingTime;
	}

}
