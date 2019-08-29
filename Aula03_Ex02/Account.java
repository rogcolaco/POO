public class Account {
    private long number, agency;
    private double balance, availabreCredit;
    private int password, accountTime;
    private Client client;
    private Bank bank;


    public void setClient(Client client) {
        this.client = client;
    }

    public long getNumber() {
        return number;
    }

    public long getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }

    public double getAvailabreCredit() {
        return availabreCredit;
    }

    public int getPassword() {
        return password;
    }

    public Client getClient() {
        return client;
    }
}
