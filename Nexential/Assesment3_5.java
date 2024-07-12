package Nexential;

class SavingsAccount
{
	double annualInterestRate;
	double savingsBalance;
	SavingsAccount() {
		annualInterestRate = 0.0;
		savingsBalance = 0.0;
		}
	SavingsAccount(double intRate, double savBal) {
	annualInterestRate = intRate;
	savingsBalance = savBal;
	}

	double calculateMonthlyInterest() {
	double intRate = (savingsBalance * annualInterestRate/12);
	savingsBalance = savingsBalance + intRate;
	return intRate;
	}

	void modifyInterestRate(double newInteresRate) {
	annualInterestRate = newInteresRate;
	}

	void setSavingsBalance(double newBal) {
	savingsBalance = newBal;
	}
    double getSavingsBalance() {
	return savingsBalance;
	}
	double getAnnualInterestRate() {
	return annualInterestRate;
	}
}

public class Assesment3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount Saver1= new SavingsAccount(0.4,2000);
		SavingsAccount Saver2= new SavingsAccount(0.4,3000);
		Saver1.calculateMonthlyInterest();
		Saver2.calculateMonthlyInterest();
		System.out.printf("New Balance for Saver1=%f\n",Saver1.getSavingsBalance());
		System.out.printf("New Balance for Saver2=%f\n",Saver2.getSavingsBalance());

		Saver1.modifyInterestRate(0.05);
		Saver2.modifyInterestRate(0.05);
		Saver1.calculateMonthlyInterest();
		Saver2.calculateMonthlyInterest();
		System.out.printf("New Balance for Saver1=%f\n",Saver1.getSavingsBalance());
		System.out.printf("New Balance for Saver2=%f\n",Saver2.getSavingsBalance());

	}

}
// Create class SavingsAccount. Use a svariable
//annualInterestRate to store the annual interest rate for all account 
//holders. Each object of the class contains a private instance variable 
//savingsBalance indicating the amount the saver currently has ondeposit 
//use constructor to initialize the same. Provide method 
//calculateMonthlyInterest to calculate the monthly interest by 
//multiplying the savingsBalance by annualInterestRate divided by 12 
//ie (savingsBalance* annualInterestRate/12) this interes