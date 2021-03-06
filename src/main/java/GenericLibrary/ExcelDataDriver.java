package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

/**
 * @author deepak.saini
 */
public class ExcelDataDriver extends CommonLibrary {
	String filepath = ".\\src\\test\\resources\\NRDA_TESTDATA.xlsx"; // This is
																		// test
																		// data
																		// file
																		// path
	// static String filepath1=""; //This is test data file path

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	@SuppressWarnings("unused")
	private static XSSFRow Row;

	/**
	 * getExcelData() is used to fetch the data from the excelSheet.
	 * 
	 * @param SheetName
	 * @param rowNum
	 * @param colNum
	 * @return
	 * @throws IOException
	 * @author deepak.saini
	 * @throws InvalidFormatException
	 * @throws EncryptedDocumentException
	 * @since 2017-06-15
	 */

	public String getExcelData(WebElement element, String sheet, int rowNum, int colNum)
			throws IOException, EncryptedDocumentException, InvalidFormatException {
		WebElement searchbox = element;
		HighlightOnElement(element);
		FileInputStream file = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheet);
		DataFormatter formatter = new DataFormatter();
		String keyword = formatter.formatCellValue(sh.getRow(colNum).getCell(rowNum)).trim();
		searchbox.sendKeys(keyword);
		return keyword;
	}
	
	public String getExcelDataj(String sheet, int rowNum, int colNum)
			throws IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream file = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheet);
		DataFormatter formatter = new DataFormatter();
		String keyword = formatter.formatCellValue(sh.getRow(colNum).getCell(rowNum)).trim();
		return keyword;
	}

	public String getExcelData1(String sheet, int rowNum, int colNum)
			throws IOException, EncryptedDocumentException, InvalidFormatException {

		FileInputStream file = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheet);
		DataFormatter formatter = new DataFormatter();
		String keyword = formatter.formatCellValue(sh.getRow(colNum).getCell(rowNum)).trim();
		// searchbox.sendKeys(keyword);
		return keyword;
	}

	/**
	 * setExcelData() is used to write the data in the excelSheet.
	 * 
	 * @param SheetName
	 * @param rowNum
	 * @param colNum
	 * @param data
	 * @throws IOException
	 * @author deepak.saini
	 * @throws InvalidFormatException
	 * @throws EncryptedDocumentException
	 * @since 2017-06-15
	 */

	@SuppressWarnings({ "deprecation", "static-access" })
	public void setExcelData(String data, int rownum, int colnum, String Sheetname)
			throws EncryptedDocumentException, InvalidFormatException, IOException {

		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Customer ID");
		Row row = sh.getRow(rownum);
		Cell cell = row.createCell(colnum);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(data);

		try {
			FileOutputStream fos = new FileOutputStream(filepath);
			wb.write(fos);
			fos.close();
		} catch (Exception e) {
			e.getMessage();
		}

	}

	// for negative value
	public static Object[][] getNegativeValue(String FilePath, String SheetName) throws Exception {
		String[][] value = null;
		try {
			FileInputStream ExcelFile = new FileInputStream(FilePath);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			int startRow = 1;
			int startCol = 1;
			int ci, cj;
			int totalRows = ExcelWSheet.getLastRowNum();
			// you can write a function as well to get Column count
			int totalCols = 2;
			value = new String[totalRows][totalCols];
			ci = 0;
			for (int i = startRow; i <= totalRows; i++, ci++) {
				cj = 0;
				for (int j = startCol; j <= totalCols; j++, cj++) {
					value[ci][cj] = getNegativeData(i, j);
					Reporter.log(value[ci][cj], true);
				}
			}
		}

		catch (FileNotFoundException e) {
			Reporter.log("Could not read the Excel sheet data", true);
			e.printStackTrace();
		} catch (IOException e) {
			Reporter.log("Could not read the Excel sheet data,true");
			e.printStackTrace();
		}
		return (value);
	}

	public static String getNegativeData(int RowNum, int ColNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			int dataType = Cell.getCellType();
			if (dataType == 4) {
				return "";
			} else {
				String CellData = Cell.getStringCellValue();
				return CellData;
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
			throw (e);
		}
	}

	@SuppressWarnings({ "deprecation", "static-access" })
	public String[][] getCellData(String path, String sheetName) throws InvalidFormatException, IOException {
		FileInputStream stream = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(stream);
		Sheet s = workbook.getSheet(sheetName);
		int rowcount = s.getLastRowNum();
		int cellcount = s.getRow(0).getLastCellNum();
		String data[][] = new String[rowcount][cellcount];
		for (int i = 1; i <= rowcount; i++) {

			Row r = s.getRow(i);
			for (int j = 0; j < cellcount; j++) {
				Cell c = r.getCell(j);
				try {
					if (c.getCellType() == c.CELL_TYPE_STRING) {
						data[i - 1][j] = c.getStringCellValue();
					} else {
						data[i - 1][j] = String.valueOf(c.getNumericCellValue());

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return data;
	}

	// get customer id and store in the excel sheet
	public void setCudtomerIDInExcel(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Customer ID");
		Object[][] customter_id = { { result } };
		int rowCount = sh.getLastRowNum();
		for (Object[] customerid : customter_id) {
			Row row = sh.createRow(++rowCount);
			int columnCount = 0;
			Cell cell = row.createCell(columnCount);
			cell.setCellValue(rowCount);
			for (Object cellresult : customerid) {
				cell = row.createCell(++columnCount);
				if (cellresult instanceof String) {
					cell.setCellValue((String) cellresult);
				} else if (cellresult instanceof Integer) {
					cell.setCellValue((Integer) cellresult);
				}
			}
		}
		fis.close();
		try {
			FileOutputStream fos = new FileOutputStream(filepath);
			wb.write(fos);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// for new connection
	@SuppressWarnings("static-access")
	public void updateExcelData(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Customer ID");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for transfer
	@SuppressWarnings("static-access")
	public void updateExcelData2(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("TransferApplicationNumber");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// FOR RTI

	@SuppressWarnings("static-access")
	public void updateExcelDataa(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("RTIApplication Number");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// FOR SalePurchase

	public void updateExcelDATA(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("IndividualApplicationNumber");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	public void updateExcelDATA1(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("ConsortiumApplicationNumber");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	public void updateExcelDATA3(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("RefferenceNumber");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	public void updateExcelDATA2(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("CoApplicantApplicationNumber");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// FOR Environment Section

	@SuppressWarnings("static-access")
	public void updateExcelDataEnvironment(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Environment_Application_Number");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// LEGAL SECTION

	@SuppressWarnings("static-access")
	public void updateExcelData1(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("AM_CaseNumber");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// For Disconnection
	@SuppressWarnings("static-access")
	public void updateexcelData(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Disconnection");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// For Estate And Project Section

	@SuppressWarnings("static-access")
	public void updateExcelDataEstateProject(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Estate_Application_Number");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// For Disconnection
	@SuppressWarnings("static-access")
	public void updateexcelDataDisconnectionNumber(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("DisconnectionNumber");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for plumber
	@SuppressWarnings("static-access")
	public void updatePlumberID(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Plumber ID");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for change of use
	@SuppressWarnings("static-access")
	public void updateChangeOfUseID(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("ChangeOfUseID");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for PRO
	@SuppressWarnings("static-access")
	public void updatePRO(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("PRO_Application_Number");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for Temporary Water Meter testing
	@SuppressWarnings("static-access")
	public void updateWaterMeterTesting(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Water Meter Testing");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for Temporary BOD
	@SuppressWarnings("static-access")
	public void updateBOD(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("BOD Temp Id");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for Consumer id
	@SuppressWarnings("static-access")
	public void updateConsumerId(String result) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Consumer ID");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for Water Meter testing
	@SuppressWarnings("static-access")
	public void updateAppWaterMeterTesting(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("WaterMeterTesting_Application");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for reconnection Application number
	@SuppressWarnings("static-access")
	public void updateReconnectionAppNum(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Reconnection_App_Num");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for land request initiation Application number

	@SuppressWarnings("static-access")
	public void updateLandRequestInitiationAppNum(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Land Request Initiation");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for land Encoarchment section Application number

	@SuppressWarnings("static-access")
	public void updateLandEncoarchmentAppNum(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Land_Encoarchment_AppNum");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for land diversion section Application number

	public void updateLandDiversionAppNum(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Land_Diversion_AppNum");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for land mutual transfer section Application number

	public void updateLandMutualTransferAppNum(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Land_Mutual_Transfer_AppNum");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// Govt Land Transfer
	public void updateGovtLandTransfer(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("GovtLandTransferApp");
		Row row = sh.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for NRDA Land Compulsory Application Number
	public void updateCompulsoryAppNum(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Land_Compulsory_AppNum");
		Row row = sh.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	public void updateLandNOCIssuingAppNum(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Land_NOC_No");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

	// for new connection
	@SuppressWarnings("static-access")
	public void updateWaterAndSewerageID(String result)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Customer ID");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(result);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}
}
