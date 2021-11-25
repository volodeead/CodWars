
import java.util.HashMap;
import java.util.Map;

public class DnaStrand {
	public static String subtractSum (int n) {
	    
	    
	    
	    
	    do{
	    int OLDn = n;
	    String numbers = String.valueOf(n);
	    char[] number = numbers.toCharArray();
	    int sum = 0;
	      
	      for(int i=0; i<number.length; i++){
	        sum += Integer.parseInt(String.valueOf(number[i]));  
	      }
	      n = OLDn - sum;
	      
	    }while((n<=1||n>=100));
	      
	    Map<Integer, String> states = new HashMap<Integer, String>();
	    	
		    	states.put( 1, "kiwi");
		    	states.put( 2, "pear");
		    	states.put( 3, "kiwi");
		    	states.put( 4, "banana");
		    	states.put(	5, "melon");
		    	states.put(	6, "banana");
		    	states.put(	7, "melon");
		    	states.put(	8, "pineapple");
		    	states.put(	9, "apple");
		    	states.put(	10, "pineapple");
		    	states.put(	11, "cucumber");
		    	states.put(	12, "pineapple");
		    	states.put(	13, "cucumber");
		    	states.put(	14, "orange");
		    	states.put( 15, "grape");
		    	states.put(	16, "orange");
		    	states.put(	17, "grape");
		    	states.put(	18, "apple");
		    	states.put(	19, "grape");
		    	states.put(	20, "cherry");
		    	states.put(	21, "pear");
		    	states.put( 22, "cherry");
		    	states.put( 23, "pear");
		    	states.put(	24, "kiwi");
		    	states.put( 25, "banana");
		    	states.put(	26, "kiwi");
		    	states.put( 27, "apple");
		    	states.put( 28, "melon");
		    	states.put(	29, "banana");
		    	states.put(	30, "melon");
		    	states.put(	31, "pineapple");
		    	states.put( 32, "melon");
		    	states.put( 33, "pineapple");
		    	states.put(	34, "cucumber");
		    	states.put(	35, "orange");
		    	states.put(	36, "apple");
		    	states.put(	37, "orange");
		    	states.put(	38, "grape");
		    	states.put(	39, "orange");
		    	states.put(	40, "grape");
		    	states.put( 41, "cherry");
		    	states.put( 42, "pear");
		    	states.put( 43, "cherry");
		    	states.put( 44, "pear");
		    	states.put(	45, "apple");
		    	states.put(	46, "pear");
		    	states.put(	47, "kiwi");
		  		states.put( 48, "banana");
				states.put( 49, "kiwi");
				states.put( 50, "banana");
		  		states.put( 51, "melon");
		  		states.put( 52, "pineapple");
		  		states.put( 53, "melon");
		  		states.put( 54, "apple");
		  		states.put( 55, "cucumber");
		  		states.put( 56, "pineapple");
		    	states.put( 57, "cucumber");
		  		states.put( 58, "orange");
		    	states.put( 59, "cucumber");
		    	states.put( 60, "orange");
		    	states.put( 61, "grape");
		    	states.put( 62, "cherry");
		    	states.put( 63, "apple");
		    	states.put( 64, "cherry");
		    	states.put( 65, "pear");
		    	states.put( 66, "cherry");
		    	states.put( 67, "pear");
		    	states.put( 68, "kiwi");
		    	states.put( 69, "pear");
		    	states.put( 70, "kiwi");
		    	states.put( 71, "banana");
		    	states.put( 72, "apple");
		    	states.put( 73, "banana");
		    	states.put( 74, "melon");
		    	states.put( 75, "pineapple");
		    	states.put( 76, "melon");
		    	states.put( 77, "pineapple");
		    	states.put( 78, "cucumber");
		    	states.put( 79, "pineapple");
		    	states.put( 80, "cucumber");
		    	states.put( 81, "apple");
		    	states.put( 82, "grape");
		    	states.put( 83, "orange");
		    	states.put( 84, "grape");
		  		states.put( 85, "cherry");
		  		states.put( 86, "grape");
		    	states.put( 87, "cherry");
		    	states.put( 88, "pear");
		    	states.put( 89, "cherry");
		    	states.put( 90, "apple");
		    	states.put( 91, "kiwi");
		  		states.put( 92, "banana");
		  		states.put( 93, "kiwi");
		    	states.put( 94, "banana");
		    	states.put( 95, "melon");
		    	states.put( 96, "banana");
		    	states.put( 97, "melon");
		  		states.put( 98, "pineapple");
		  		states.put( 99, "apple");
		  		states.put( 100, "pineapple");
	          

		  		if(n<9) {
		  			return "apple";
		  		}
		  		
	    
	      return states.get(n);
	    
	  }
  
    public static void main(String args[]) {
    	
    	
    	
     String abc = subtractSum(223);
        System.out.println(abc);
      
    }
    
    
    
    
}
