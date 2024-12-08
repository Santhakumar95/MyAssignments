package week3.day2;

public class CountOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="TestLeaf";
int count = 0;

for (int i=0;i<text.length();i++) {
	if (text.charAt(i)=='e'){
		count++;
	}
}
System.out.println("Number of Occurrence of 'e':"+count);
}
}