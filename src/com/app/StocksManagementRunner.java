package com.app;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;

/*
 * Stock Management Runner(main method) Class
 */
public class StocksManagementRunner  {
	public static void main  (String[] args) {
		Stock icici = new Stock();
		Stock sbi = new Stock();
		Stock hdfc = new Stock();
		
		icici.setStockName("ICICI");
		icici.setNumberOfShares(300);
		icici.setSharePrice(50);
		
		sbi.setStockName("SBI");
		sbi.setNumberOfShares(200);
		sbi.setSharePrice(30);
		
		hdfc.setStockName("HDFC");
		hdfc.setNumberOfShares(500);
		hdfc.setSharePrice(100);
		
		ArrayList<Stock> stocksList = new ArrayList<>();
		stocksList.add(icici);
		stocksList.add(sbi);
		stocksList.add(hdfc);
		
		String jsonString=null;
		try {jsonString = JsonUtility.convertJavaObjToJsonString(stocksList);} catch (JsonProcessingException e) {}
		System.out.println("********* Json String Of Stocks ************");
		System.out.println(jsonString);
		
		try {JsonUtility.jsonStringToFile(jsonString);} catch (IOException e) {}
		System.out.println("Stocks Output File Created");
		
		ArrayList<StockReport> stockReportList = new ArrayList<>();
		stockReportList = StockOperation.calculateStocks(stocksList);
		
		
		String jsonStringReport=null;
		try {jsonStringReport = JsonUtility.convertJavaObjToJsonString1(stockReportList);} catch (JsonProcessingException e) {}
		System.out.println("********* Json String Of Stocks Report ************");
		System.out.println(jsonStringReport);
		
		
		
		try {JsonUtility.jsonStringToFile1(jsonStringReport);} catch (IOException e) {}
		System.out.println("Report File Created");
		
		
		StockAccountUserAndOperation user1 = new StockAccountUserAndOperation("Dhiraj's Report", stocksList);
		user1.buyStock(user1);
		user1.sellStock(user1);
		System.out.println("Account Information of "+user1.getUserName()+ ">>>");
		
		String jsonStringUser1=null;
		try {jsonStringUser1 = JsonUtility.convertJavaObjToJsonString2(user1);} catch (JsonProcessingException e) {}
		System.out.println("********* Json String Of User Stocks ************");
		System.out.println("\nAccount Information of "+user1.getUserName()+ ">>>");
		System.out.println(jsonStringUser1);
		try {JsonUtility.jsonStringToFile2(jsonStringUser1);} catch (IOException e) {}
		System.out.println("Report Of user File Created");
		
	}
}
