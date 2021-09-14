public class RotateCharString{

	
	  public static String rotateCharBack(int rotateN, String inputString){
		StringBuilder newInputString = new StringBuilder();

		/* determine where to start string rotation */
		int rotateC = (rotateN % inputString.length());

		for(int i=0;i<inputString.length();i++){
			/* If the rotateC goes over inputString length, reset the rotateC to zero */
			if(rotateC >= inputString.length())
				rotateC = 0;

			newInputString.append(inputString.charAt(rotateC));
			rotateC++;
		}

		return(newInputString.toString());
	}
  
  public static String rotateCharForward(int rotateN, String inputString){
		StringBuilder newInputString = new StringBuilder();

		/* determine where to start the string rotation */
		int rotateC = (inputString.length() - (rotateN % inputString.length()));

		for(int i=0;i<inputString.length();i++){
			/* If the rotateC goes over inputString length, reset the rotateC to zero */
			if(rotateC >= inputString.length())
				rotateC = 0;

			newInputString.append(inputString.charAt(rotateC));
			rotateC++;
			
		}
		return(newInputString.toString());
	}  
}
