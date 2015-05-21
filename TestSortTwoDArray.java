public class TestSortTwoDArray{
	
	public static void main (String[] args){
	  //int [][] TwoDimensionalArray = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		int [][] TwoDimensionalArray = {{4,2,4},{1,7,4},{4,5,7},{1,2,7},{1,1,4},{4,1,4},{4,2,6},{1,7,3},{4,5,4},{1,2,3},{1,1,5},{4,1,6}};
		sort(TwoDimensionalArray);

	}

	public static void sort(int m[][]){

		for(int i = 1;i < m.length; i++){
			for(int row = 0;row < m.length - i; row++){
				for(int column = 0;column < m[row].length ; column++){
					if(m[row][column] < m[row + 1][column]){
						break;
					}
					else if( m[row][column] > m[row + 1][column]){
						int temp [] = m[row];
						m[row] = m[row + 1];
						m[row + 1] = temp ;
						break;
					}
				}
			}
		}

		for(int row = 0;row < m.length; row++){
			for(int column =0; column < m[row].length; column++){
				System.out.printf( "%-3d",m[row][column]);
			}
			System.out.println();
		}
	}
}
