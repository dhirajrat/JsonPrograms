package com.app;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountUserAndOperation {
	String UserName;
	ArrayList<Stock> userStockList;
	
	public static int i = 0;
	
	public StockAccountUserAndOperation(String userName, ArrayList<Stock> userStockReportList) {
		UserName = userName;
		this.userStockList = userStockReportList;
	}
	

	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public ArrayList<Stock> getUserStockReportList() {
		return userStockList;
	}


	public void setUserStockReportList(ArrayList<Stock> userStockReportList) {
		this.userStockList = userStockReportList;
	}


	public static StockAccountUserAndOperation buyStock(StockAccountUserAndOperation user)
	{
		for(Stock l : user.getUserStockReportList()) {
			if(i == 0) {
				l.setNumberOfShares(0);
			}
			System.out.println("How many Stocks you want to buy From : "+l.getStockName()+" Your Available Stocks : "+l.getNumberOfShares());
			Scanner sc = new Scanner(System.in);
			int stockNumbers = sc.nextInt();
				stockNumbers = stockNumbers + l.getNumberOfShares();
				l.setNumberOfShares(stockNumbers);
				System.out.println("Number of Stocks you bought : "+stockNumbers);
		}
		i=1;
		return user;
	}
	
	public static StockAccountUserAndOperation sellStock(StockAccountUserAndOperation user)
	{
		for(Stock l : user.getUserStockReportList()) {
			if(i == 0) {
				l.setNumberOfShares(0);
				i = 1;
			}
			System.out.println("How many Stocks you want to sell From : "+l.getStockName()+" Company Available Stocks : "+l.getNumberOfShares());
			Scanner sc = new Scanner(System.in);
			int stockNumbers = sc.nextInt();
				
				stockNumbers =  l.getNumberOfShares() - stockNumbers;
				l.setNumberOfShares(stockNumbers);
				System.out.println("Number of Stocks remain after sell: "+stockNumbers);
		}
		return user;
	}


	@Override
	public String toString() {
		return "StockAccountUserAndOperation [UserName=" + UserName + ", userStockList=" + userStockList + "]";
	}
	
}
