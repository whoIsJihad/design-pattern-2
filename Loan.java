public abstract class Loan{
    private double amountOfLoan;

    private int loanDuration;

    abstract double calculateInterest(int years); 

    public void payAmount(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }

        this.amountOfLoan -= amount;
    }
    public double getDueAmount(){
        return this.amountOfLoan;
    }

    public void setAmountOfLoan(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Loan amount must be greater than 0");
        }

        this.amountOfLoan = amount;
    }
    public void setLoanDuration(int duration){
        if(duration <= 0){
            throw new IllegalArgumentException("Loan duration must be greater than 0");
        }

        this.loanDuration = duration;
    }
}

class RegularLoan extends Loan{
    private double interestRate;

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