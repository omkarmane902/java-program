package oops;

public class BankAccountDriver
{

    public static void main(String[] args) 
    {

        BankAccount b1 = new BankAccount("Raju", "ICICI", 9887654341L,
                "icici1234", 300000.0,
                1234567891L, "Pune", 56781234L, 1234, "Deccan");

        System.out.println(b1.getBalance(1234567891L, 1234));

        b1.withdraw(1234567891L, 1234, 100.0);

        b1.setPin(1234567891L, 1234, 9876);

        b1.deposit(1234567891L, 9876, 1000);
    }
}
