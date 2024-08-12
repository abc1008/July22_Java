package encapsulation;

public class Class_1 {
	
	private double accBalacne = 1000.00;
	
	public double viewBalance()
	{
		
		return accBalacne;
	}
	
	public void withdraw(double amount)
	{
		if(accBalacne < amount)
		{
			System.out.println("Insufficient Balance.");
		}
		else
		{
			double newBal = accBalacne - amount;
			System.out.println(newBal);
		}
	}
	
	
	
	
	
	

}
