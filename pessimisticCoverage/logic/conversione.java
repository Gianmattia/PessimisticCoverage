package logic;

public class conversione {

	
	public double con(double input) {
		double s;
		if(input>13.00 && input<=23.59) {
			s=input-12.00;
			return s;
			
		}
		s=input;
		return s;
		
		
	}

}
