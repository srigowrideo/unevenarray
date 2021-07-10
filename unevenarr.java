package fibonacciseries;

public class unevenarr{
	public static void main(String[] args)
	{
		int twoD[][]=new int[3][5];
		twoD[0]=new int[3];
		twoD[1]=new int[1];
		twoD[2]=new int[5];
		int i,j,k=0;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<twoD[i].length;j++,k++)
			{	
						
					
			twoD[i][j]=k;
			
			for(i=0;i<3;i++)
			{
				for(j=0;j<twoD[i].length;j++)
			
				{
			System.out.print(twoD[i][j]+"");
			System.out.println();
		
	}}
		


		

