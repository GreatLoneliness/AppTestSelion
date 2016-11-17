package com.test.dataprovider;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.data.City;
import com.data.Student;
import com.dataprovider.DataProviderYaml;

public class DataProviderYamlTest {
	
	@Test(dataProvider = "yamlDataProvider1", dataProviderClass = DataProviderYaml.class)
	public void testMethod1(String testData) {
		System.out.println(testData);
	}
	
	@Test(dataProvider = "yamlDataProvider2", dataProviderClass = DataProviderYaml.class)
	public void testMethod2(City testData) {
		System.out.println(testData);
	}
	
	@Test(dataProvider = "yamlDataProvider3", dataProviderClass = DataProviderYaml.class)
	public void testMethod3(HashMap<Object, Object> testData) {
		System.out.println(testData);
	}
	
	@Test(dataProvider = "yamlDataProvider4", dataProviderClass = DataProviderYaml.class) 
	public void testMethod4(HashMap<Object, Object> testData) {
		System.out.println(testData);
	}
	
	@Test(dataProvider = "yamlDataProvider5", dataProviderClass = DataProviderYaml.class)
	public void testMethod5(HashMap<Object, Object> testData) {
		System.out.println(testData);
		
	}
	
	@Test(dataProvider = "yamlDataProvider6", dataProviderClass = DataProviderYaml.class)
	public void testMethod6(City testData1, Student testData2) {
		System.out.println(testData1);
		System.out.println(testData2);
	}
}
