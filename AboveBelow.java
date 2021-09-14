public class Above_And_Below{

	public static void Array_2_InitValue_Check(int initN, int[] arrN){
		int aboveN = 0;
		int belowN = 0;

		for(int arrNum : arrN){
			if(arrNum > initN)     /*Checks if the numbers in the Array is greater than the initN */
				aboveN++;	    
			else if(arrNum < initN)
				belowN++;      
		}
		System.out.println("above: " + aboveN + ", below: " + belowN);      /*Prints results*/
	}
}
