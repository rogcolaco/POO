public class Principal {

    public static void main(String[] args) {
        Bank b1=new Bank(1);
        Bank b2=new Bank(2);
        Bank b3=new Bank(3);

        Client c1 = new Client("rogerio", "123");
        Client c2 = new Client("monica","456");
        Client c3 = new Client("jiban", "789");
        Client c4 = new Client("jaspion", "159");
        Client c5 = new Client("seya", "357");

        Account a1 = new Account(123, 1,0,0,123456,1);

        a1.withdraw(100,123456);
        a1.deposit(500,123456);
        a1.Account(c1,b1,123456);
        c1.listAccount();
        b1.listAccounts();
        System.out.println(a1.balance(123456));
        System.out.println(a1.balance(456));
        a1.increaseLimit(1000,123456);
        System.out.println(a1.getAvailabeCredit());
        b1.listAccounts(1);
    }
}
