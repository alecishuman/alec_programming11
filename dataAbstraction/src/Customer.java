import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    public Customer(){
        //create default constructor
    }

//    Constructor
    public Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        deposit(checkDeposit, new Date(), CHECKING);
        deposit(savingDeposit, new Date(), SAVING);
    }

//    Deposit a certain amount in either account
    public double deposit(double amt, Date date, String account){
        this.deposits.add(new Deposit(amt, date, account));
        if (account.equals(CHECKING)) {
            this.checkBalance += amt;
            return checkBalance;
        } else if (account.equals(SAVING)) {
            this.savingBalance += amt;
            return savingBalance;
        }
        return 0;
    }
//    Withdraw a certain amount in either account
    public double withdraw(double amt, Date date, String account){
        this.withdraws.add(new Withdraw(amt, date, account));
        if (account.equals(CHECKING)) {
            this.checkBalance -= amt;
            return checkBalance;
        } else if (account.equals(SAVING)) {
            this.savingBalance -= amt;
            return savingBalance;
        }
        return 0;
    }

//    Check the overdraft of either account
    private boolean checkOverdraft(double amt, String account){
        if (account.equals(CHECKING) && checkBalance < OVERDRAFT) {
            return true;
        } else if (account.equals(SAVING) && savingBalance < OVERDRAFT) {
            return true;
        }
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}