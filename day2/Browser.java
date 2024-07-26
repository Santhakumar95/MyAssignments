package week1.day2;

 public class Browser {
       public String launchBrowser(String browserName) {
		return browserName;
	}
 public void loadurl() {
	System.out.println("Application url load successfully");
	}
 public static void main (String[] args) {
	Browser b = new Browser();
	b.loadurl();
	String browserName = b.launchBrowser("Chrome");
	System.out.println("browser launched successfully:" +browserName);
  }
 }
 


