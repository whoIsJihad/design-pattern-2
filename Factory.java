public interface Factory {
    Loan getLoan();
    Account getAccount();
}

class PremiumService implements Factory{
    public Loan getLoan(){
        return new PremiumLoan();
    }
    public Account getAccount(){
        return new PremiumAccount();
    }
}

class RegularService implements Factory{
    public Loan getLoan(){
        return new RegularLoan();
    }
    public Account getAccount(){
        return new RegularAccount();
    }
}

class VIPService implements Factory{
    public Loan getLoan(){
        return new VIPLoan();
    }
    public Account getAccount(){
        return new VIPAccount();
    }
}


