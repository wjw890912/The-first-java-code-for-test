package com.runoob.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer {
	
	/*main程序入口*/
	public static void main(String[] args) {
		ServerSocket ss;//建立一个socket句柄
		try {
			ss = new ServerSocket(8002);//建立socket实例并绑定到制定端口
			boolean bRunning = true;//初始化变量
			while (bRunning) {
				Socket s = ss.accept();//建立一个socket s句柄并指向socketsever的accept，并阻塞这个线程
				new Thread(new Service(s)).start();//如果accept成功那么建立一个新线程涌来处理这个链接，这里LWIP是用PCBnew的方式进行的。
			}
			ss.close();//关闭服务socket
		} catch (IOException e) {
			e.printStackTrace();//打印异常线程相关堆栈信息
		}
	}
}