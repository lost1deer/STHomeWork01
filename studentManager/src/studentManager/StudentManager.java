package studentManager;

import java.util.Scanner;

public class StudentManager {
	Student[] student=new Student[1];
	
	//���ѧ����Ϣ���� ������4
	public void addStudent(int a) {
		int i;
		for(i=0;i<a;i++) {
			student[i]=new Student();
			Scanner s = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			System.out.println("���������ѧ����ѧ��");
	        int ID = s.nextInt();
			student[i].setID(ID);
			System.out.println("���������ѧ��������");
			String name = s2.next();
			student[i].setName(name);
			System.out.println("���������ѧ��������");
			String birDate = s2.next();
			student[i].setbirDate(birDate);
			System.out.println("���������ѧ�����Ա�");
			String gender = s2.next();
			student[i].setgender(gender);
			System.out.print("��ӳɹ������ѧ����ϢΪ��");
			System.out.print("ѧ��:"+student[i].getID());
			System.out.print("����:"+student[i].getName());
			System.out.print("����:"+student[i].getbirDate());
			System.out.print("�Ա�:"+student[i].getgender());	
			}
	}
	
	//��ӡѧ����Ϣ���� ������4
	public void print(Student student[]) {
		for(int i =0;i<student.length;i++) {
			if(student[i].getID()!=0) {System.out.print("ѧ����Ϣ:");
			System.out.print("ѧ��:"+student[i].getID());
			System.out.print("����:"+student[i].getName());
			System.out.print("����:"+student[i].getbirDate());
			System.out.println("�Ա�:"+student[i].getgender());	
		}else {}
		}
	}
	
	//����ѧ����Ϣ���� ������4
	public void  select(Student student[]) {
		int flag=0;
		System.out.println("���������ѧ����ѧ��");
		Scanner s = new Scanner(System.in);
		int ID=s.nextInt();
		for(int i=0;i<student.length;i++) {
			if(ID==student[i].getID()) {
				flag=1;
				System.out.print("ѧ����Ϣ:");
				System.out.print("ѧ��:"+student[i].getID());
				System.out.print("����:"+student[i].getName());
				System.out.print("����:"+student[i].getbirDate());
				System.out.println("�Ա�:"+student[i].getgender());
			}else {}
		}
		if(flag==0) {
			System.out.println("δ�ҵ�ѧ����Ϣ");
		}else {}
	}
	
	//����ѧ����Ϣ���� ������4
	public void change(Student student[]) {
		int flag=0;
		System.out.print("������Ҫ�޸ĵ�ѧ����ѧ��");
		Scanner s = new Scanner(System.in);
		int id=s.nextInt();
		for(int i=0;i<student.length;i++) {
			if(id==student[i].getID()) {
				flag=1;
				Scanner s1 = new Scanner(System.in);
				Scanner s2 = new Scanner(System.in);
				System.out.println("�������޸�ѧ����ѧ��");
		        int ID = s.nextInt();
				student[i].setID(ID);
				System.out.println("�������޸�ѧ��������");
				String name = s2.next();
				student[i].setName(name);
				System.out.println("�������޸�ѧ��������");
				String birDate = s2.next();
				student[i].setbirDate(birDate);
				System.out.println("�������޸�ѧ�����Ա�");
				String gender = s2.next();
				student[i].setgender(gender);
			}else {}
		}
		if(flag==0) {System.out.println("δ�ҵ�Ҫ�޸ĵ�ѧ��");}else {}
		if(flag==1) {System.out.println("�޸ĳɹ���");}else {}
	}
	
	//ɾ��ѧ����Ϣ���� ������4
	public void delete(Student student[]) {
		int flag=0;
		System.out.print("������Ҫɾ����ѧ����ѧ��");
		Scanner s = new Scanner(System.in);
		int id=s.nextInt();
		for(int i=0;i<student.length;i++) {
			/*if(id==student[i].getID()) {
				flag=1;
				student[i].setID(0);
		}*/
			//������36
			if(id==student[i].getID()) {
			flag=1;
			student[i].setID(0);
	        }else {}
		}
		if(flag==0) {
			System.out.print("δ�ҵ�Ҫɾ����ѧ��");
		}else {}
		if(flag==1) {
			System.out.print("ɾ���ɹ���");
		}else {}
		
	}
	
	//�������� ������24
	/*public void app(int num) {
		Student []sarr=new Student[3];
		sarr[0]=new Student();
		sarr[0].setID(2017011893);
		sarr[0].setName("����");
		sarr[0].setbirDate("1999.12.14");
		sarr[0].setgender("��");
		
		sarr[1]=new Student();
		sarr[1].setID(2017034333);
		sarr[1].setName("����");
		sarr[1].setbirDate("1999.7.14");
		sarr[1].setgender("Ů");
		
		sarr[2]=new Student();
		sarr[2].setID(2017455644);
		sarr[2].setName("����");
		sarr[2].setbirDate("1999.8.19");
		sarr[2].setgender("��");
        if(num==1) {
        	addStudent(1);
        }
        if(num==2) {
        	select(sarr);
        }
        if(num==3) {
        	delete(sarr);
        }
        if(num==4) {
        	change(sarr);
        }
        if(num==5) {
        	print(sarr);
        }
        
	}*/
    //����Ϊ������22��24�Ĵ��������޸Ĵ���
	public Student[] addStudents() {
		Student []sarr=new Student[3];
		sarr[0]=new Student();
		sarr[0].setID(2017011893);
		sarr[0].setName("����");
		sarr[0].setbirDate("1999.12.14");
		sarr[0].setgender("��");
		
		sarr[1]=new Student();
		sarr[1].setID(2017034333);
		sarr[1].setName("����");
		sarr[1].setbirDate("1999.7.14");
		sarr[1].setgender("Ů");
		
		sarr[2]=new Student();
		sarr[2].setID(2017455644);
		sarr[2].setName("����");
		sarr[2].setbirDate("1999.8.19");
		sarr[2].setgender("��");
		return sarr;
	}
	
	public void app(int num) {
		Student []sarr=new Student[3];
		sarr=addStudents();
		if(num==1) {
        	addStudent(1);
        }
        if(num==2) {
        	select(sarr);
        }
        if(num==3) {
        	delete(sarr);
        }
        if(num==4) {
        	change(sarr);
        }
        if(num==5) {
        	print(sarr);
        }else {
        	
        }
        //������36
	}
	

}
