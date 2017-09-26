package com.test.design.creational.singleton;

/**
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * @author Bryant
 *
 */
public enum Singleton6 {

	INSTANCE;
	public void whateverMethod() {  
    
	}
}
