package studentManager;

import java.util.Scanner;

public class SMTest {
	public static void main(String args[]) {
		System.out.println("请选择操作：\r\n" + 
				"**********************************************************************\r\n" + 
				"*                           1  插入                                  *\r\n" + 
				"*                           2  查找                                  *\r\n" + 
				"*                           3  删除                                  *\r\n" + 
				"*                           4  修改                                  *\r\n" + 
				"*                           5  输出                                  *\r\n" + 
				"*                           6  退出                                  *\r\n" + 
				"**********************************************************************\r\n" + 
				"");
		StudentManager stm=new StudentManager();
		int num=1;
		while(num!=6) {
			Scanner s = new Scanner(System.in);
	        num = s.nextInt();
			stm.app(num);
		}
		System.out.println("您已退出学生信息查找程序");
	}
}
