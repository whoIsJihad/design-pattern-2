public abstract class Loan{
    double amountOfLoan;

    double loanDuration;

    abstract double calculateInterest(int years); 

    public void payAmount(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }

        this.amountOfLoan -= amount;
    }
}

class RegularLoan extends Loan{
    double interestRate;

    public RegularLoan(){
        this.interestRate = 0.14;
    }

    public double calculateInterest(int years){
        return this.amountOfLoan * this.interestRate*years;
    }
}

class PremiumLoan extends Loan{
    double interestRate;

    public PremiumLoan(){
        this.interestRate = 0.12;
    }

    public double calculateInterest(int years){
        return this.amountOfLoan * this.interestRate*years;
    }
}

class VIPLoan extends Loan{
    double interestRate;

    public VIPLoan(){
        this.interestRate = 0.10;
    }

    public double calculateInterest(int years){
        return this.amountOfLoan * this.interestRate*years;
    }
}