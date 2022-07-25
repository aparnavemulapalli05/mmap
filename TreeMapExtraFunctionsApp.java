package com.advance.treemapextrafunctions;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExtraFunctionsApp {

	public static void main(String[] args) {
		TreeMap<String, Double>productPricesTreeMap=new TreeMap<>();
		productPricesTreeMap.put("apple", 1.2);
		productPricesTreeMap.put("orange", 1.2);
		productPricesTreeMap.put("lemon", 1.2);
		productPricesTreeMap.put("coconut", 1.2);
		productPricesTreeMap.put("mango", 1.2);
		productPricesTreeMap.put("kiwi", 1.2);
		
		System.out.println("first product in the map:" +productPricesTreeMap.firstKey());
		System.out.println("TreeMap");
		
		for(String product:productPricesTreeMap.keySet()) {
			System.out.println(product+ "$" +productPricesTreeMap.get(product));
		}
		

	}

}
