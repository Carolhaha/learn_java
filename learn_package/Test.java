package learn_package;

public class Test {
	public static void main(String args[]){
	    StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
	    sBuffer.append("www");
	    sBuffer.append(".runoob");
	    sBuffer.append(".com");
	    sBuffer.insert(1,3);
	    System.out.println(sBuffer);  
	  }

}
