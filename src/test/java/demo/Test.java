package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	WebDriver driver;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static XSSFCell cell;
//	public static void main(String[] args) throws IOException {
//		
//
//		Test.data();
//	}
	public static void data() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\Vijayakumar\\Desktop\\Book1.xlsx");
		workbook = new XSSFWorkbook(f);
		sheet= workbook.getSheetAt(0);
			for(int i=1; i<=sheet.getLastRowNum(); i++){
				cell = sheet.getRow(i).getCell(0);
				//cell.setCellType(Cell.CELL_TYPE_STRING);
				//System.out.println(sheet.getLastRowNum());
				//cell.setCellType(Cell.CELL_TYPE_STRING);

				System.out.println(cell);
			}
	}
}
