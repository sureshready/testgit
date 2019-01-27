package Playsmartbabe;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class maventest3 {
	
	
	@Test(dataProvider="test4")
	public void testcase3(HashMap<Object, Object> datas)
	{
		
		
		
		System.out.println("this kis test3");
	}
	
	@DataProvider
	public Object[][] test4() throws Throwable
	{
	
		
		Object[][] data  = null;
		
		HashMap<Object, Object> data1= null;
		
		try
		{
		File f = new File("C:\\entertainment\\PlaySmart\\playsmartbabe\\testsheeter.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		
		XSSFWorkbook hb = new XSSFWorkbook(fis);
		XSSFSheet sh= hb.getSheetAt(0);
	int rows =sh.getLastRowNum();
	
	int cols = sh.getRow(0).getLastCellNum();
	
data = new Object[rows][1];	
	

	for(int i=0;i<rows;i++)
	{
		
		data1= new HashMap<>();
		
		for(int j=0;j<cols;j
				++)
		{
		
			
			data1.put(sh.getRow(0).getCell(j).toString(), sh.getRow(i+1).getCell(j).toString());
			
			//data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			
			
		}
		
		data[i][0]= data1;
		
	}}catch (Exception e) {
		e.printStackTrace();
	}
	
		return data;
		
		
		
	}

}
