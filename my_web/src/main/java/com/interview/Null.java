package com.interview;

/**
 * 关于null的理解
 * @author limin
 * 2017年6月2日
 */
public class Null {

	/**
	 * 1、null是java中的关键字，大小写敏感
	 * 2、null是任何引用类型的默认值
	 * 3、null既不是对象也不是一种类型，只是一种特殊的值，可以将它赋值给任何引用类型，也可以将它转换成任何引用类型。
	 * 4、null不能赋值给基础类型变量
	 * 5、任何含有null的包装类在java拆箱中都会报空指针异常
	 * 6、如果使用了带有null值的引用类型变量，instanceof操作将会返回false
	 * 7、静态方法可以用null的引用类型变量来调用，非静态方法不能，因为静态方法是使用静态绑定
	 * 8、可以将null值传递给方法，这时方法可以接收任何引用类型
	 * 9、可以用== 和 != 对null进行比较
	 */
}
