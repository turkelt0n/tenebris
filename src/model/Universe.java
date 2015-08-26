package model;

public class Universe {

	SolarSystem[][][] solarSystems;
		
	public Universe()	{
		populateUniverse();
	}

	private void populateUniverse() {
		for(int i=0; i < GameUtils.UNIVERSE_SIZE; i++)	{
			for (int j=0; j < GameUtils.UNIVERSE_SIZE; j++)	{
				for (int k=0; k < GameUtils.UNIVERSE_SIZE; k++)	{
					solarSystems[i][j][k] = new SolarSystem(i,j,k);
				}
			}
		}
	}
	
	public static double getDistance(SolarSystem a, SolarSystem b)	{
		// TODO: Bisher noch kein Restkšrper!
		Math.sqrt(Math.pow(Math.abs(a.getxOrdinate()-b.getxOrdinate()),2)+
				Math.pow(Math.abs(a.getyOrdinate()-b.getyOrdinate()),2)+
				Math.pow(Math.abs(a.getyOrdinate()-b.getyOrdinate()),2));
		return 0;
	}
	
	
	
}
