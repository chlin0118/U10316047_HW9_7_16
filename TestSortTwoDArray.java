public class TestSortTwoDArray{
	
	public static void main (String[] args){
		//Declare a twoDimensional Array data field
		int [][] TwoDimensionalArray = {{4,2,4},{1,7,4},{4,5,7},{1,2,7},
			{1,1,4},{4,1,4},{4,2,6},{1,7,3},{4,5,4},{1,2,3},{1,1,5},{4,1,6}};
		
		System.out.println("The Array's original order is:");
		//Print the Array's original order
		printTwoDArray(TwoDimensionalArray);
		
		System.out.println("The Array's order after sorted is:");
		//Sort the Array
		sort(TwoDimensionalArray);
		//Print the Array's sorted order
		printTwoDArray(TwoDimensionalArray);
	}

	//Function to sort a twoDimensional Array
	public static void sort(int m[][]){

		//Using bubble sort to sort the array
		for(int i = 1;i < m.length; i++){
			for(int row = 0;row < m.length - i; row++){
				for(int column = 0;column < m[row].length ; column++){
					
					/*If the one row's element is little than the next one in the same column
					, the order between these two is right.*/
					if(m[row][column] < m[row + 1][column]){
						break;
					}
					
					/*If the one row's element is bigger than the next one in the same column
					, exchange the two's order*/
					else if( m[row][column] > m[row + 1][column]){
						int temp [] = m[row];
						m[row] = m[row + 1];
						m[row + 1] = temp ;
						break;
					}
				}
			}
		}
	}
	
	//Function to print a twoDimensional Array
	public static void printTwoDArray(int m[][]){
		
		for(int row = 0;row < m.length; row++){
			for(int column =0; column < m[row].length; column++){
				//Print the element in each rows and columns
				System.out.printf( "%-3d",m[row][column]);
			}
			System.out.println();
		}
	}
}
