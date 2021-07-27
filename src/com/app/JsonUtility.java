package com.app;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
/*
 * Json Operation of File and Json String Building
 */
public class JsonUtility {
	public static String convertJavaObjToJsonString(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
		String jsonString;
		jsonString = writer.writeValueAsString(obj);
		return jsonString;
	}
	
	public static String convertJavaObjToJsonString1(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
		String jsonString;
		jsonString = writer.writeValueAsString(obj);
		return jsonString;
	}
	
	public static String convertJavaObjToJsonString2(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
		String jsonString;
		jsonString = writer.writeValueAsString(obj);
		return jsonString;
	}
	
	public static void jsonStringToFile(String jsonString) throws IOException {
		FileWriter fw = new FileWriter(".//data/StocksOutput.json");
		fw.write(jsonString);
		fw.close();
	}
	
	public static void jsonStringToFile1(String jsonString) throws IOException {
		FileWriter fw = new FileWriter(".//data/StockReport.json");
		fw.write(jsonString);
		fw.close();
	}
	
	public static void jsonStringToFile2(String jsonString) throws IOException {
		FileWriter fw = new FileWriter(".//data/StockReportOfUser.json");
		fw.write(jsonString);
		fw.close();
	}
}
