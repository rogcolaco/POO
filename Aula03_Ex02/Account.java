public class Account {
    private long number, agency;
    private double balance, availableCredit;
    private int password, accountTime;
    private Client client;
    private Bank bank;

    public double balance(int password){
        if(password==this.getPassword()) {
            return this.getBalance();
        }
        return 0;
    }

    public void Account(Client c, Bank b, int password){
        if(password==this.getPassword()){
            this.setClient(c);
            c.addAccount(this);
            this.setBank(b);
            b.AddAccount(this);
        }
    }

    public double increaseLimit(double amount, int password){
        if(password == this.getPassword()){
            this.setAvailableCredit(this.getBank().aproveLimit(amount, this));
            return this.getAvailabeCredit();
        }
        else {
            return this.getAvailabeCredit();
        }
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean deposit(double amount, int password) {

        if (password == this.getPassword()) {
            double balance = this.getBalance();

            balance += amount;
            setBalance(balance);
            return true;
        } else {
            return false;
        }
    }


    public boolean withdraw(double amount, int password){

        if(password == this.getPassword()) {

            //double balance = this.getBalance();

            if (amount > this.getBalance() + this.getAvailabeCredit()) {
                return false;
            }
            else if (amount>this.getBalance() && amount < this.getBalance() + this.getAvailabeCredit()){
                this.setBalance((this.getBalance()-amount));
                this.setAvailableCredit((this.getAvailabeCredit() + this.getBalance()));
                this.setBalance(0);
            }
            else {
                this.setBalance(this.getBalance()-amount);
                return true;
            }
        }
        return false;
    }

    private void setAvailableCredit(double availableCredit) {
        this.availableCredit = availableCredit;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getNumber() {
        return number;
    }

    public long getAgency() {
        return agency;
    }

    private double getBalance() {
        return balance;
    }

    public double getAvailabeCredit() {
        return availableCredit;
    }

    public int getPassword() {
        return password;
    }

    public Client getClient() {
        return client;
    }

    public int getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(int accountTime) {
        this.accountTime = accountTime;
    }

    public Account(long number, long agency, double balance, double availableCredit, int password, int accountTime) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.availableCredit = availableCredit;
        this.password = password;
        this.accountTime = accountTime;
    }
}
