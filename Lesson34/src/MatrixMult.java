
public class MatrixMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] MatrixA = {{6,-2,0},
						   {7,6,3},
						   {4,2,0},
						   };
		int[][] MatrixB = {{0,22,7,8,10},
				   		   {1,6,7,6,3},
				   		   {1,4,7,4,6},
				   		   };
		int[][] resultMatrix = new int[MatrixA.length][MatrixB[0].length];
		
		System.out.println("Dimensions of Resulting Array: " + resultMatrix.length + "x" + resultMatrix[0].length);
		int result = 0;
		int resX = 0, resY = 0, posX = 0, posY = 0; // Position of column B
		if(MatrixA[0].length == MatrixB.length){
			//Iterating through columns of A
			for(int i = 0; i < MatrixA.length; i++){
				//Iterating through row of A at i
				for(int j = 0; j < MatrixA[i].length; j++){
					result = result + (MatrixA[i][j] * MatrixB[posX][posY]);
					posX++;
				}
				
				//Storing the result
				if(resX < resultMatrix.length-1){
					resultMatrix[resX][resY] = result;
					resX++;
				}else if(resX == resultMatrix.length-1){
					resultMatrix[resX][resY] = result;
					resX = 0;
					resY++; 
				}
				result = 0;
				
				// Moves to the next row of B after iterating thru each row of MatrixA, also avoids out of bounds error
				if(i == MatrixA.length-1 && posY+1 != MatrixB[0].length){
					posY++;
					i = -1;
				}
				posX = 0;
				
			}
		}else{
			System.out.println("Not valid.");
		}
		
		// Prints out resulting matrix
		System.out.println("- Resulting Matrix -");
		for(int i = 0; i < resultMatrix.length; i++){
			for(int j = 0; j < resultMatrix[i].length; j++){
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
