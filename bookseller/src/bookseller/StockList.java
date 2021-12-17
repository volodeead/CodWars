package bookseller;

public class StockList { 	

	  public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) 
	  {
	    String rtnval="";
	    if(lstOfArt.length != 0 && lstOf1stLetter.length != 0)
	    {

	      for(int i = 0; i < lstOf1stLetter.length; i++)
	      {
	        String currentLetter= lstOf1stLetter[i];
	        int count =0;

	        for(int q = 0; q < lstOfArt.length; q++)
	        {
	          String currentArt = lstOfArt[q];
	          if( currentArt.substring(0,1).equals(currentLetter) )
	          {
	            String[] artValues = currentArt.split(" ");
	            count += Integer.parseInt(artValues[1]);
	          }
	        }
	        String stock = "(" + currentLetter + " : " + count + ")";
	        if(i != lstOf1stLetter.length - 1)
	        {
	          rtnval += stock + " - ";
	        }
	        else
	        {
	          rtnval += stock;
	        }
	      }
	    }
	    return rtnval;
	  }
	}