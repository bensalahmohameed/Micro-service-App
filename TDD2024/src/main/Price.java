package main;

public class Price {
	
	
	
	private static final int TVA = 19;

	public float getTTCPrice(float prixHT) {
		// TODO Auto-generated method stub
		return prixHT+ prixHT *TVA/100;
	}

}
