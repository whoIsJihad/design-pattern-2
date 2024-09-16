public abstract class Account{
    double balance;
    public Account(){
        this.balance =0;
    }

    public void deposit(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }

        this.balance += amount;
    }

    public void withdraw(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0");
        }

        if(amount > this.balance){
            throw new IllegalArgumentException("Insufficient funds");
        }

        this.balance -= amount;
    }

    public abstract double calculateInterest(int years);

}

class RegularAccount extends Account{
    double interestRate;

    public RegularAccount(){
        this.interestRate = 0.025;
    }

    public double calculateInterest(int years){
        return this.balance * this.interestRate*years;
    }
    
}

class PremiumAccount extends Account{
    double interestRate;

    public PremiumAccount(){
        this.interestRate = 0.035;
    }

    public double calculateInterest(int years){
        return this.balance * this.interestRate*years;
    }
    
}

class VIPAccount extends Account{
    double interestRate;

    public VIPAccount(){
        this.interestRate = 0.050;
    }

    public double calculateInterest(int years){
        return this.balance * this.interestRate*years;
    }
}