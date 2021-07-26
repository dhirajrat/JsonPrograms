package com.app;

import java.util.ArrayList;

public class StockOperation {
	static ArrayList<StockReport> calculatedStocks = new ArrayList<>();
	
	public static ArrayList<StockReport> calculateStocks(ArrayList<Stock> list) {
		for(Stock l : list) {
			StockReport obj = new StockReport();
			int wholeSharePrice;
			wholeSharePrice = (l.sharePrice * l.numberOfShares);
			obj.setStockName(l.getStockName());
			obj.setWholeSharePrice(wholeSharePrice);
			calculatedStocks.add(obj);
		}
		return calculatedStocks;
	}
}
