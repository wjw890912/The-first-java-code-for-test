package com.runoob.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer {
	
	/*main�������*/
	public static void main(String[] args) {
		ServerSocket ss;//����һ��socket���
		try {
			ss = new ServerSocket(8002);//����socketʵ�����󶨵��ƶ��˿�
			boolean bRunning = true;//��ʼ������
			while (bRunning) {
				Socket s = ss.accept();//����һ��socket s�����ָ��socketsever��accept������������߳�
				new Thread(new Service(s)).start();//���accept�ɹ���ô����һ�����߳�ӿ������������ӣ�����LWIP����PCBnew�ķ�ʽ���еġ�
			}
			ss.close();//�رշ���socket
		} catch (IOException e) {
			e.printStackTrace();//��ӡ�쳣�߳���ض�ջ��Ϣ
		}
	}
}