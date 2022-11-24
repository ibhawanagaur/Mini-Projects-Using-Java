package emailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String passWord;
	private String alternateEmail;
	private String email;
	private String companySuffix = "bhawana.com";
	private int mailboxCapacity=250;
	private int defaultPasswordLength;
	
	//	Constructor firstname and lastname
	public Email(String firstName,String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED:" + this.firstName + " "+ this.lastName);
		
		// Call a method asking for the department and return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.passWord = randomPassword(8);
		System.out.println("your password is: " + this.passWord);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." +lastName.toLowerCase() +"@" + department + "."+companySuffix;
		//System.out.println("Yout email is: "+ email);
	}
	
	//	Ask for the department
	private String setDepartment()
	{
		System.out.print("Department Code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice  = in.nextInt();
		if(depChoice==1)
		{
			return "Sales";
			}
		else if(depChoice==2)
		{
			return "Development";
			}
		else if(depChoice==3)
		{
			return "Accounting";
		}
		else
		{
			return "none";
			}
	}

	//	Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*abcdefghijklmnopqrstuvwxyz=";
		char[] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set alternate email address
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity =  capacity;
	}
	
	//  Set the mailbox capacity
	public void setAlternativeEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	//	Change the password
	public void changePassword(String password)
	{
		this.passWord = password;
	}
	
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}

	public String sgetAlternativeEmail()
	{
		return alternateEmail;
	}

	public String getPassword()
	{
		return passWord;
	}
	
	public String showInfo()
	{
		return "\nDisplay Name: " + firstName +" "+ lastName +
				"\nCompany Email: " + email +
				"\nMailbox Capacity: " + mailboxCapacity +"mb";
				
	}
}