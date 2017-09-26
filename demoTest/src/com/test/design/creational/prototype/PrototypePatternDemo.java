package com.test.design.creational.prototype;

/**
 * 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 优点： 1、性能提高。 
 *      2、逃避构造函数的约束。
 * 缺点： 1、配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。 
 *      2、必须实现 Cloneable 接口。 
 *      3、逃避构造函数的约束。
 * @author Bryant
 *
 */
public class PrototypePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}

}
