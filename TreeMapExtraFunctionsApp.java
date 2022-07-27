package com.advance.treemapextrafunctions;
import java.util.Map;
import java.util.NavigableMap;
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
		System.out.println();
		System.out.println("Descending Map");
		
		NavigableMap<String, Double>productPricesDescendingMap=productPricesTreeMap.descendingMap();
		for(String product:productPricesDescendingMap.keySet()) {
			System.out.println(product+ "$" +productPricesDescendingMap.get(product));
		}
		System.out.println();
		System.out.println("lower key:" +productPricesTreeMap.lowerKey("lemon"));
		System.out.println("floor key:" +productPricesTreeMap.floorKey("lemon"));
		System.out.println("Higher key:" +productPricesTreeMap.higherKey("lemon"));
		System.out.println("ceiling key:" +productPricesTreeMap.ceilingKey("lemon"));
		
		System.out.println();
		System.out.println("poll first entry:" +productPricesTreeMap.pollFirstEntry());
		System.out.println("the first entry:" +productPricesTreeMap.firstEntry());
		System.out.println("the last entry:" +productPricesTreeMap.lastEntry());
		
		System.out.println("lower entry:" +productPricesTreeMap.lowerEntry("kiwi"));
		System.out.println("floor entry:" +productPricesTreeMap.floorEntry("coconut"));
		System.out.println("Higher entry:" +productPricesTreeMap.higherEntry("coconut"));
		System.out.println("ceiling entry:" +productPricesTreeMap.ceilingEntry("coconut"));
		
		System.out.println();
		System.out.println("Tail map:" +productPricesTreeMap.tailMap("mango, true"));
		System.out.println("head map:" +productPricesTreeMap.headMap("mango, true"));
		System.out.println("sub map:" +productPricesTreeMap.subMap("lemon", "kiwi"));
		
		
		
		
		
		
		
		

	}

}
