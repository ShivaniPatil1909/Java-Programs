package introduction;

public class TwoDArrayTest1 {

	public static void main(String[] args) {
		
		boolean [][]numList;
		

		//use numList
		numList=new boolean[3][4];
		System.out.println("numList.length = "+numList.length);
		
		for(int i=0; i<numList.length; i++)
		{
			for(int j=0; j<numList[i].length; j++)
			{
				System.out.println(" "+numList[i][j]);
				
			}
			System.out.println(" ");
		}

	}

}
