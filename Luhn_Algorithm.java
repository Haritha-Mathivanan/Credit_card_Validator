package looppractice;

public class Luhn_Algorithm {
	 
	public static void main(String[] args)
	{
		String card_no="4012888888881881";
		
		System.out.println(IsValidIdNo(card_no));
	}
	private static boolean IsValidIdNo(String card_no)
	{
		int sum=0;
		for(int i=card_no.length()-1;i>=0;i--)
		{
			int num=card_no.charAt(i)-'0';
			if(i%2!=0)
			{
				sum+=num;
			}
			else
			{
				num=num*2;
				if(num>9)
				{
					int dsum=num/10;
					    dsum+=num%10;	
					    sum+=dsum;
				}
				else
				{
					sum+=num;
				}
			}
		}
		
		return (sum%10==0) ? true : false;
		
		
	}

}
