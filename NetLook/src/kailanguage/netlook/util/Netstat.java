package kailanguage.netlook.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Netstat {
	public ArrayList<StringBuilder> list;
	public Netstat() {
		list=new ArrayList<StringBuilder>();
		
		String command="netstat -ano";
		String line = null;
		StringBuilder sb = new StringBuilder();
		Runtime runtime = Runtime.getRuntime();
		
		try {
		Process process = runtime.exec(command);
		BufferedReader	bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

		while ((line = bufferedReader.readLine()) != null) {
			if(line.contains("TCP")||line.contains("UDP")){
				sb.append(line + "\n");
				list.add(sb);
			}
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public ArrayList<StringBuilder> getList() {
		return list;
	}
	public void setList(ArrayList<StringBuilder> list) {
		this.list = list;
	}
	public int getSize() {
		return list.size();
	}

}
