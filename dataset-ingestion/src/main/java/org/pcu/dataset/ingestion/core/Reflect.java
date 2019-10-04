package org.pcu.dataset.ingestion.core;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class Reflect {

	
	public static Map<String, ClassInfo> mapOfClassInfoByClassName=new HashMap<String, ClassInfo>();
	public static String CUSTOMER_CLASS = "org.pcu.dataset.json.model.customer.Customer";
	public static String CATEGROY_CLASS = "org.pcu.dataset.json.model.category.Category";
	
	
	static {

		Class<?> cls = null;
		ClassInfo classInfo =null;
		Map<String,String> mapOfClassByName = new HashMap<String, String>();
		Map<String,String> mapOfFieldTypeByFieldName =null;
		
		
//		mapOfClassByName.put("customer","org.pcu.dataset.json.model.customer.Customer");
//		mapOfClassByName.put("categorie","org.pcu.dataset.json.model.category.Category");
//		mapOfClassByName.put("product","org.pcu.dataset.json.model.product.Product");
//		mapOfClassByName.put("visit","org.pcu.dataset.json.model.visit.Visit");

		mapOfClassByName.put("customer","org.pcu.dataset.ingestion.json.model.customer.Customer");
		mapOfClassByName.put("categorie","org.pcu.dataset.ingestion.json.model.category.Category");
		mapOfClassByName.put("product","org.pcu.dataset.ingestion.json.model.product.Product_");
		mapOfClassByName.put("visit","org.pcu.dataset.ingestion.json.model.visit.Visit_");

		
		for (Map.Entry<String,String> entry:mapOfClassByName.entrySet()) {
			
			mapOfFieldTypeByFieldName = new HashMap<String, String>();
			
			try {
				
				String key = entry.getKey();
				cls = Class.forName(entry.getValue());
			
				classInfo =new ClassInfo();
				classInfo.setClassz(entry.getValue());
				
				Field[] fields = cls.getDeclaredFields();
				for (Field declraredField : fields) {
	                if (Modifier.isPrivate(declraredField.getModifiers())) {
	                	declraredField.setAccessible(true);
	                	
	                	mapOfFieldTypeByFieldName.put(declraredField.getName(), declraredField.getType().getName());
	                	
	                }
	            }
				
				classInfo.setMapOfFieldTypeByFieldName(mapOfFieldTypeByFieldName);
				
				//mapOfClassInfo.put(key, classInfo);
				mapOfClassInfoByClassName.put(key, classInfo);
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}

	
	public static Method getter(String className, String field) {
		
		String setterMethod = "get"+field.substring(0, 1).toUpperCase()+field.substring(1);
		
		try {
			
			Class<?> cls = Class.forName(className);
			
			for (Method method:cls.getMethods()) {
				if ( method.getName().equals(setterMethod)) {
					return method;
				}
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
	public static Method getSetter(String className, String field) {
		
		String setterMethod = "set"+field.substring(0, 1).toUpperCase()+field.substring(1);
		
		try {
			
			Class<?> cls = Class.forName(className);
			
			for (Method method:cls.getMethods()) {
				if ( method.getName().equals(setterMethod)) {
					return method;
				}
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
