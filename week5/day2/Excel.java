package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

public static void main(String args[]) throws IOException
{

//step1
XSSFWorkbook wb=new XSSFWorkbook("./TestData/CreateLead.xlsx");

//step2
XSSFSheet sheetAt = wb.getSheet("Sheet1");
//XSSFSheet sheetAt = wb.getSheetAt(0);
//step3 row count
int rowcount = sheetAt.getLastRowNum();
System.out.println("Row value :"+rowcount);
//header value will excluded

int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();

System.out.println("include value :"+physicalNumberOfRows);

//step4- cell count
int cellcount = sheetAt.getRow(1).getLastCellNum();
System.out.println("cell value :"+cellcount);

String sc = sheetAt.getRow(1).getCell(2).getStringCellValue();
System.out.println(sc);


//print all the values
for (int i = 1; i <=rowcount; i++) {

for (int j = 0; j < cellcount; j++) {
String value = sheetAt.getRow(i).getCell(j).getStringCellValue();
System.out.println(value);
}
}

wb.close();

}}