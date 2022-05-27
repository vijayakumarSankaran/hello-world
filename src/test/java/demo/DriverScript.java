package demo;

import demo.KeywordActions;
public class DriverScript {

    public static void main(String[] args) throws Exception {
    	// Declaring the path of the Excel file with the name of the Excel file
    	String sPath = "C:\\Users\\Vijayakumar\\Desktop\\TestData.xlsx";

    	// Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
    	ReadExcelData.setExcelFile(sPath, "Sheet1");

    	//Hard coded values are used for Excel row & columns for now
    	//In later chapters we will replace these hard coded values with varibales
    	//This is the loop for reading the values of the column 3 (Action Keyword) row by row
    	for (int iRow=1;iRow<=6;iRow++){
		    //Storing the value of excel cell in sActionKeyword string variable
    		String sActionKeyword = ReadExcelData.getCellData(iRow, 3);
    		System.out.println(sActionKeyword);
    		//Comparing the value of Excel cell with all the project keywords
    		if(sActionKeyword.equals("openBrowser")){
                        //This will execute if the excel cell value is 'openBrowser'
    			//Action Keyword is called here to perform action
    			KeywordActions.openBrowser();}
    		else if(sActionKeyword.equals("navigate")){
    			KeywordActions.navigate();}
    	
    		else if(sActionKeyword.equals("input_Username")){
    			KeywordActions.input_Username();}
    		else if(sActionKeyword.equals("input_Password")){
    			KeywordActions.input_Password();}
    		else if(sActionKeyword.equals("click_Login")){
    			KeywordActions.click_Login();}
    		

    		}
    	}
 }