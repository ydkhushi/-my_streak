import java.util.Scanner;

public class The_Two_Dishes
{
   public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0)
		{
			int n=scn.nextInt();
			int s=scn.nextInt();
			int count=0;
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					if(i+j==s)
					{
						count++;
					}
				}
			}
			System.out.println(count-1);
		}

	}

}
