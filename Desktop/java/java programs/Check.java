import java.util.*;
class Account
{
private int id ;
private double balance ;
private double annualInterestRate ;
private Date dateCreated;
public static int count;
Account()
{
id=0;
balance=0;
annualInterestRate=0;

}

Account(int id,double balance)
{
this.id=id;
this.balance=balance;
annualInterestRate=0;
count++;
dateCreated = new Date();
}

int getId()
{
return id;
}

void setId(int id)
{
this.id=id;
}

double getBalance()
{
return balance;
}

void setBalance(double a)
{
balance=a;
}

double getAnnualInterestRate()
{
return annualInterestRate;
}

void setAnnualInterestRate(double k)
{
annualInterestRate=k;
}

Date getDateCreated()
{
return dateCreated;
}

double getMonthlyInterestRate()
{
return annualInterestRate/12;
}

void withdraw(double a)
{
balance =balance -a;
}

void deposit(double a)
{
balance =balance + a;
}

public String toString()
{return("BALNCES AND IDS ARE");
}
}
class check
{
public static void main(String [] ar)
{
Account ac =new Account(1122,20000);
System.out.println(ac);
Account [] ac1=new Account[10];
for(int i=0;i<10;i++)
{Account a=new Account(i,100);
ac1[i]=a;
}

System.out.println("total objects are = "+ac.count);
ac.setAnnualInterestRate(4.5);

ac.withdraw(2500);
ac.deposit(3000);
System.out.println(ac.getBalance());
System.out.println(ac.getMonthlyInterestRate());
System.out.println(ac.getDateCreated());
for(int i=0;i<10;i++)
System.out.println("id is = "+ac1[i].getId()+" Balance is = "+ac1[i].getBalance());
}
}
