//lab 4 from M130

public class MultTable
{
	public static void main(String[] args)
	{
		//declare variables
		int row, column, mult;
		int x = 1;

		//header for the multiplication table 
		System.out.print("          ");

		for(row = 0; row <= 15; row++)
		{
			//numbers
			System.out.printf("%d\t", row);
			//dashed border
			if(row == 15)
			{
				System.out.println();
				do
				{
					System.out.print("-");
					x++;
				}while(x<=130);

			}

		}

		System.out.println();
	}

	

}