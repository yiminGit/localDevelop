package com.test.design.singleton;

/**
 * 优点： 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。 
 *     2、避免对资源的多重占用（比如写文件操作）。
 * 缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
 * 使用场景： 1、要求生产唯一序列号。 
 *        2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。 
 *        3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。
 *        
 *        
 * 经验之谈：
 * 一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
 * 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
 * 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。       
 * @author Bryant
 *
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		Singleton4 obj = Singleton4.getSingleton();
		obj.showMessage();
	}
}
