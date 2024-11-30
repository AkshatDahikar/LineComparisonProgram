package LineComparisonProgram;

public class Comparison  {
	   
	   public static void checkEquality(Line line1, Line line2, String lineName1, String lineName2) {  
	       boolean equalityCheck = line1.equals(line2); 
	       System.out.println(lineName1 + " equals " + lineName2 + ": " + equalityCheck); 
	   }
	   public static void compareLines(Line line1, Line line2, String lineName1, String lineName2) {  

			 int result = line1.compareTo(line2); 
	   System.out.println(lineName1+" vs "+ lineName2 + compareResult(result));
		}
	   private static String compareResult(int result) {
		      if (result == 0) {
		          return "Lines are equal.";
		      } else if (result > 0) {
		          return "First line is longer.";
		      } else {
		    	  return "First line is shorter.";
		      }
		  }
		}
		      