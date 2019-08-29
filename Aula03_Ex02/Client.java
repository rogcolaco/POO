public class Client {
    private String nome, cpf;
    private Account accounts[]= new Account[10];
    private int qtdAccount = 0;

    public Client(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addAccount(Account a){
        if(qtdAccount<this.getAccounts().length){
            accounts[qtdAccount ++]=a;
        }
    }

    public int sizeofAccount(){
        return qtdAccount;
    }

    public void listAccount(){
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

    public Account[] getAccounts() {
        return accounts;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
