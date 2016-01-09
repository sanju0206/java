package program2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class denomination {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int d[]={1000,500,200,100,50,20,10,5,3,2,1};
System.out.println("Enter amount:");
int amount=Integer.parseInt(br.readLine());
System.out.println("\n Denominations\n:");
int count = 0,i;
for(i=0;i<10;i++)
{
	count=amount/d[i];
	amount=amount%d[i];
if(count!=0)
{
System.out.println(d[i]+"\tx\t"+count+"\t= "+d[i]*count);
}
}
}
}
