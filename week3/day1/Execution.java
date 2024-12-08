package week3.day1;

public class Execution extends Button{
	
	public static void main(String args[])
	{
	
	CheckBoxButton checkbox=new CheckBoxButton();
	checkbox.clickCheckButton();
	RadioButton radio=new RadioButton();
	radio.selectRadioButton();
	TextField textfield=new TextField();
	textfield.getText();
	Execution exe = new Execution();
	exe.submit();
	exe.setText("Inheritance");
	exe.click();
	exe.submit();
}
}
