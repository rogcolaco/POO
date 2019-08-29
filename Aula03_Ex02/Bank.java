public class Bank {
    private int number;
    private Account accounts[] = new Account[10];
    int qtdAccount = 0;

    public int sizeOfAccount(){
        return qtdAccount;
    }

    public void listAccounts(long agency){
        for (int i=0;i<qtdAccount;i++){
            if(this.getAccounts()[i].getAgency()==agency) {
                System.out.println("Número: " + this.getAccounts()[i].getNumber() + "Agência: " + this.getAccounts()[i].getAgency());
            }
        }
    }

    public void listAccounts(){
        for (int i=0;i<qtdAccount;i++){
            System.out.println("Número: " + this.getAccounts()[i].getNumber() + "Agência: "+ this.getAccounts()[i].getAgency());
        }
    }

    public void removeAccount(Account a){
        int position = -1;

        for (int i = 0; i < qtdAccount; i++) {
            if(this.getAccounts()[i]==a) {
                position = i;
                break;
            }
        }
        if(position!=-1) {
            for (int i = position; i < qtdAccount - 1; i++) {
                this.getAccounts()[i] = this.getAccounts()[i + 1];
            }
            qtdAccount--;
        }
    }

    public void AddAccount(Account a){
        if(qtdAccount<this.getAccounts().length){
            accounts[qtdAccount ++]=a;
        }
    }

    public int getNumber() {
        return number;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public Bank(int number) {
        this.number = number;
    }
}
