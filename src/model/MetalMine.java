package model;

public class MetalMine extends Building{

	private int metalProduction = GameUtils.METAL_PRODUCTION;
	private double prodFactor;
	
	public MetalMine(double costFactor, double prodFactor) {
		super(costFactor);
		this.prodFactor = prodFactor;
	}
	
	public int getMetalProduction() {
		return (int)(metalProduction * Math.pow(prodFactor, this.getLevel()));
	}
	
	public int getMetalProductionForNextLevel() {
		return (int)(metalProduction * Math.pow(prodFactor, this.getLevel()+1));
	}

	public void setMetalProduction(int metalProduction) {
		this.metalProduction = metalProduction;
	}

	
	
	
	
}
