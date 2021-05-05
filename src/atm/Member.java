package atm;

public class Member
{
	private String name;
	private int id;
	private int balance;
	private int password;
	public Member(String name, int id, int balance,int password)
	{
		
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.password=password;
		
	}
	Member(){
		
	}
	public int addBalance(int deposite)
	{
		balance=balance+deposite;
		return balance;
	}
	
	public int withdraw(int withdraw)
	{
		balance=balance-withdraw;
		return balance;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", balance=" + balance + ", password=" + password + "]";
	}
   
	
	
	
	
}
