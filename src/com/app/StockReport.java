package com.app;
/*
 * Stock Report Class Contructor Getters And Setters
 */
public class StockReport {
	String stockName;
	int wholeSharePrice;
	
	public void setStockName(String stockName1) {
		stockName = stockName1;
	}
	public void setWholeSharePrice(int wholeSharePrice1) {
		wholeSharePrice = wholeSharePrice1;
	}
	public String getStockName() {
		return stockName;
	}
	public int getWholeSharePrice() {
		return wholeSharePrice;
	}
	@Override
	public String toString() {
		return "StockReport [stockName=" + stockName + ", wholeSharePrice=" + wholeSharePrice + "]";
	}
	
}
