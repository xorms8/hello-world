package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//로그를 남길 수 있기 떄문에 쓰는 쪽에서 log를 남길 수 있음
		//(위에서 미뤘기 때문에)
		
		ThrowsException ex  = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) { //Exception 최상위 클래스, 이게 위에 들어가면 오류남
			System.out.println(e);
	}
		System.out.println("end");
	}
	
}
