package com.test.design.creational.builder;

/**
 * 优点： 1、建造者独立，易扩展。 
 *      2、便于控制细节风险。
 * 缺点： 1、产品必须有共同点，范围有限制。 
 *      2、如内部变化复杂，会有很多的建造类。
 * 使用场景： 1、需要生成的对象具有复杂的内部结构。 
 *        2、需要生成的对象内部属性本身相互依赖。
 * @author Bryant
 *
 */
public class BuiderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
	    System.out.println("Veg Meal");
	    vegMeal.showItems();
	    System.out.println("Total Cost: " +vegMeal.getCost());

	    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	    System.out.println("\n\nNon-Veg Meal");
	    nonVegMeal.showItems();
	    System.out.println("Total Cost: " +nonVegMeal.getCost());
	}

}
