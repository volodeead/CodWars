
public class KeepHydrated {

	  static double LPH = 0.5;
	  
	  public static int Liters(double time)  {
	    
	    //Your code goes here! Hint: You should change that -1
	    return (int)(time * LPH);
	  
	  }
	  
	  public static void main(String[] args) {
		int liter = KeepHydrated.Liters(6.7);
		System.out.println(liter);

	}

}
