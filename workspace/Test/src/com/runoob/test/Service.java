package com.runoob.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Service implements Runnable {
	private Socket s;

	public Service(Socket s) {
		this.s = s;
	}

	public void run() {
		InputStream ips;
		try {
			
			System.out.println("thread running  !");
			ips = s.getInputStream();
			OutputStream ops = s.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(ips));
			PrintWriter pw = new PrintWriter(ops, true);
			while (true) {
				String strLine = br.readLine();
				if (strLine.equalsIgnoreCase("quit")) {
					break;
				}
				System.out.println(strLine + " : " + strLine.length());
				String strEcho = new StringBuffer(strLine).reverse().toString();
				pw.println(strLine + "---->" + strEcho);
			}
			br.close();
			pw.close();
			s.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}