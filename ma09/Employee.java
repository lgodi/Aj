import java.sql.*;
import java.util.*;
import java.io.*;

class Employee
{
	public static void main(String args[])
	{
		try
		{
			class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getconnection("jdbc:mysql://localhost:8088/employee_master","root","");

			Statement stat=CreateStatement();
			System.out.println("DB Sucessfully");

			//ResultSet rs=stat.executeQuery("Select*from emp_detail");
			catch(Exception e)
			{
					System.out.println(e);
			}
		}
	}
}

class Employee_details
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1.View All records");
		System.out.println("2.View specific records based on primary key");
		System.out.println("3.View specific employee detail based on emp_code filter");
		System.out.println("4.Update specific record based on primary key");
		System.out.println("5.Delete specific record based on primary key");
		System.out.println("7.Update specific record based on the field emp_code");
		System.out.println("8.Delete specific record based on the field emp_code");

		void getData()
		{
			System.out.println("Enter Id:")'
			int id=s.nextInt();

			Syetem.out.println("Enter First Name:");
			String fname=s.next();

			System.out.println("Enter Middle Name:");
			String mname=s.next();

			System.out.println("Enter Last Name:");
			String lname=s.next();

			System.out.println("Enter Code:");
			String code=s.next();

			System.out.println("Enter Address:");
			String add=s.next();

			Syetem.out.println("Enter Pincode:");
			int pin=s.nextInt();

			System.out.println("Enter Phone:");
			int phn=s.nextInt();

			System.out.println("Enter Gender[M/F]:");
			bool gen=s.next();
		}
		void insert_qry()
		{
			getData();
			String sql="insert into employee_detail(emp_id,emp_fname,emp_mname,emp_lname,emp_code,emp_address,emp_pincode,emp_phone,emp_gender)";
			int q=st.executeQuery(sql);
			//rs.sql();
		}

		void view_all()
		{
			//getData();
			String qry= "select*from emp_detail";
			rs=st.executeQuery(qry);
		}
		void data()
		{
			System.out.println("Employee id:");
			rs=st.nextInt();

			String str="select * from emp_detail where emp_id="+id+"";
			rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.println("Employee First Name:"+rs.getString(2));
				System.out.println("Employee Middle Name:"+rs.getString(3));
				System.out.println("Employee Last Name:"+rs.getString(4));
				System.out.println("Employee Code:"+rs.getString(5));
				System.out.println("Employee Address:"+rs.getString(6));
				System.out.println("Employee Pin Code:"+rs.getInt(7));
				System.out.println("Employee Phone number:"+rs.getInt(8));
				System.out.println("Employee Gender:"+rs.getString(9));
				//System.out.println(rs.getInt(1)+""+rs.getInt(2)+""+rs.getInt(3)+""+rs.getInt(4)+""+rs.getInt(5)+""+rs.getInt(6)+""+rs.getInt(7)+""+rs.getInt(8)+""+rs.getInt(9);
				con.close();
			}
		}
		void update()
		{
			String up="update emp_id where emp_id="" set emp_id=" "";


	}
}
