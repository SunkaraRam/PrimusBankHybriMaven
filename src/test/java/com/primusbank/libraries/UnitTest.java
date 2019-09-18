package com.primusbank.libraries;

import java.io.IOException;

import XLApachePOI.XLUnits;

public class UnitTest {

	public static void main(String[] args) throws IOException {
		
		String keywordFile = "D:\\PrimusBankHybridFrameWork\\src\\com\\primusbank\\testHybridData\\TestDataHybrid1.xlsx";
		
		String tSsheet= "TestScenario";
		
		String tCsheet = "TestCases";
		
		String keyword;
		
		int tscount,tccount;
		
		tscount= XLUnits.getRowCount(keywordFile, tSsheet);
		
		tccount = XLUnits.getRowCount(keywordFile, tCsheet);
		
		System.out.println("tscount "+ tscount + "tccount " + tccount);
		
		keyword = XLUnits.getCellData(keywordFile, tCsheet, 1 , 4);
		
		System.out.println(keyword);
		
	}

}
