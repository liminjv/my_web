package com.interview;

/**
 * 数据库连接池
 * @author limin
 * 2017年6月2日
 */
public class SqlPool {

	//1、数据库连接池工作机制
	/**
	 * 连接池的实现是以空间换时间。在服务器启动的时候会建立一定数量的池连接，并一直维持不少于此链接数量的连接池。
	 * 调用：客户端程序当需要连接时，池驱动程序会返回一个未使用的池连接，并将其标记为忙，如果当前没有空闲连接，池驱动会新建立一定数量的连接
	 *     新建连接的数量由配置参数决定。
	 * 释放：当使用的池连接调用完成后，池驱动程序将此连接标记为空闲，其他调用就可以使用这个连接了。
	 */
}
