package studentManager;

import java.util.Scanner;

public class SMTest {
	public static void main(String args[]) {
		System.out.println("��ѡ�������\r\n" + 
				"**********************************************************************\r\n" + 
				"*                           1  ����                                  *\r\n" + 
				"*                           2  ����                                  *\r\n" + 
				"*                           3  ɾ��                                  *\r\n" + 
				"*                           4  �޸�                                  *\r\n" + 
				"*                           5  ���                                  *\r\n" + 
				"*                           6  �˳�                                  *\r\n" + 
				"**********************************************************************\r\n" + 
				"");
		StudentManager stm=new StudentManager();
		int num=1;
		while(num!=6) {
			Scanner s = new Scanner(System.in);
	        num = s.nextInt();
			stm.app(num);
		}
		System.out.println("�����˳�ѧ����Ϣ���ҳ���");
	}
}
