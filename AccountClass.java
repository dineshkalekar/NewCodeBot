package code;

public class AccountClass {
	@SuppressWarnings("unused")
	private int ano;
	@SuppressWarnings("unused")
	private String OwnerName;
	private double Balance;
	
	public AccountClass(int no,String name,double bal)
	{
		ano=no;
		OwnerName=name;
		Balance=bal;
	}
	
	public void withdrow(double amt)
	
		throws InsufficuintBalanceExcepation{
			if(Balance>1000) 
			{
				throw new InsufficuintBalanceExcepation("Insufficeint Balance in the Account ");
				
			}else
			{
				Balance-=amt;
				System.out.println("Withdrow Successfuly. remainning Balance ="+Balance);
			}
		}
	
}
