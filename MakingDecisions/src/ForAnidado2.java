
public class ForAnidado2 {
	
	public static void main(String[] args) {
		
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

		LOOP_EXT: for(int[] mySimpleArray:myComplexArray){

			LOOP_INT: for (int i = 0; i < mySimpleArray.length; i++) {

				System.out.print(mySimpleArray[i] + "\n"); 

				//break LOOP_INT; //5 /n 3 /n /5
				//break LOOP_EXT; //5
				
				if (i>0) 
					continue LOOP_EXT; //==break LOOP_INT;
					//continue LOOP_INT;
				
				System.out.println("i="+i);
			}
			System.out.println();

		}
		
		
	}

}
