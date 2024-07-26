package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s1=0,s2=1,i,count=8;
System.out.println(s1);
System.out.println(s2);
for (i=2;i<count;i++)
{
	int c =s1+s2;
	System.out.println(c);
s1=s2;
s2=c;

}

	}

}
