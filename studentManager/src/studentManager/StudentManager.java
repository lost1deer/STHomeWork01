package studentManager;

import java.util.Scanner;

public class StudentManager {
	Student[] student=new Student[1];
	
	//添加学生信息功能 问题编号4
	public void addStudent(int a) {
		int i;
		for(i=0;i<a;i++) {
			student[i]=new Student();
			Scanner s = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			System.out.println("请输入添加学生的学号");
	        int ID = s.nextInt();
			student[i].setID(ID);
			System.out.println("请输入添加学生的姓名");
			String name = s2.next();
			student[i].setName(name);
			System.out.println("请输入添加学生的生日");
			String birDate = s2.next();
			student[i].setbirDate(birDate);
			System.out.println("请输入添加学生的性别");
			String gender = s2.next();
			student[i].setgender(gender);
			System.out.print("添加成功！添加学生信息为：");
			System.out.print("学号:"+student[i].getID());
			System.out.print("姓名:"+student[i].getName());
			System.out.print("生日:"+student[i].getbirDate());
			System.out.print("性别:"+student[i].getgender());	
			}
	}
	
	//打印学生信息功能 问题编号4
	public void print(Student student[]) {
		for(int i =0;i<student.length;i++) {
			if(student[i].getID()!=0) {System.out.print("学生信息:");
			System.out.print("学号:"+student[i].getID());
			System.out.print("姓名:"+student[i].getName());
			System.out.print("生日:"+student[i].getbirDate());
			System.out.println("性别:"+student[i].getgender());	
		}else {}
		}
	}
	
	//查找学生信息功能 问题编号4
	public void  select(Student student[]) {
		int flag=0;
		System.out.println("请输入查找学生的学号");
		Scanner s = new Scanner(System.in);
		int ID=s.nextInt();
		for(int i=0;i<student.length;i++) {
			if(ID==student[i].getID()) {
				flag=1;
				System.out.print("学生信息:");
				System.out.print("学号:"+student[i].getID());
				System.out.print("姓名:"+student[i].getName());
				System.out.print("生日:"+student[i].getbirDate());
				System.out.println("性别:"+student[i].getgender());
			}else {}
		}
		if(flag==0) {
			System.out.println("未找到学生信息");
		}else {}
	}
	
	//更改学生信息功能 问题编号4
	public void change(Student student[]) {
		int flag=0;
		System.out.print("请输入要修改的学生的学号");
		Scanner s = new Scanner(System.in);
		int id=s.nextInt();
		for(int i=0;i<student.length;i++) {
			if(id==student[i].getID()) {
				flag=1;
				Scanner s1 = new Scanner(System.in);
				Scanner s2 = new Scanner(System.in);
				System.out.println("请输入修改学生的学号");
		        int ID = s.nextInt();
				student[i].setID(ID);
				System.out.println("请输入修改学生的姓名");
				String name = s2.next();
				student[i].setName(name);
				System.out.println("请输入修改学生的生日");
				String birDate = s2.next();
				student[i].setbirDate(birDate);
				System.out.println("请输入修改学生的性别");
				String gender = s2.next();
				student[i].setgender(gender);
			}else {}
		}
		if(flag==0) {System.out.println("未找到要修改的学生");}else {}
		if(flag==1) {System.out.println("修改成功！");}else {}
	}
	
	//删除学生信息功能 问题编号4
	public void delete(Student student[]) {
		int flag=0;
		System.out.print("请输入要删除的学生的学号");
		Scanner s = new Scanner(System.in);
		int id=s.nextInt();
		for(int i=0;i<student.length;i++) {
			/*if(id==student[i].getID()) {
				flag=1;
				student[i].setID(0);
		}*/
			//问题编号36
			if(id==student[i].getID()) {
			flag=1;
			student[i].setID(0);
	        }else {}
		}
		if(flag==0) {
			System.out.print("未找到要删除的学生");
		}else {}
		if(flag==1) {
			System.out.print("删除成功！");
		}else {}
		
	}
	
	//主程序功能 问题编号24
	/*public void app(int num) {
		Student []sarr=new Student[3];
		sarr[0]=new Student();
		sarr[0].setID(2017011893);
		sarr[0].setName("张三");
		sarr[0].setbirDate("1999.12.14");
		sarr[0].setgender("男");
		
		sarr[1]=new Student();
		sarr[1].setID(2017034333);
		sarr[1].setName("李四");
		sarr[1].setbirDate("1999.7.14");
		sarr[1].setgender("女");
		
		sarr[2]=new Student();
		sarr[2].setID(2017455644);
		sarr[2].setName("王五");
		sarr[2].setbirDate("1999.8.19");
		sarr[2].setgender("男");
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
    //以下为问题编号22和24的错误代码的修改代码
	public Student[] addStudents() {
		Student []sarr=new Student[3];
		sarr[0]=new Student();
		sarr[0].setID(2017011893);
		sarr[0].setName("张三");
		sarr[0].setbirDate("1999.12.14");
		sarr[0].setgender("男");
		
		sarr[1]=new Student();
		sarr[1].setID(2017034333);
		sarr[1].setName("李四");
		sarr[1].setbirDate("1999.7.14");
		sarr[1].setgender("女");
		
		sarr[2]=new Student();
		sarr[2].setID(2017455644);
		sarr[2].setName("王五");
		sarr[2].setbirDate("1999.8.19");
		sarr[2].setgender("男");
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
        //问题编号36
	}
	

}
