package com.app;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;


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
	}
}
