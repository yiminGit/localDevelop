package com.test.design.creational.factory;

public class ShapeFactory {
	
	
	public static Object getClass(Class<?extends Shape> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }
	
	//使用 getShape 方法获取形状类型的对象
	public Shape getShape(String shapeType){
	    if(shapeType == null){
	        return null;
	    }        
	    if(shapeType.equalsIgnoreCase("CIRCLE")){
	        return new Circle();
	    } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	        return new Rectangle();
	    } else if(shapeType.equalsIgnoreCase("SQUARE")){
	        return new Square();
	    }
	    return null;
	}

}
