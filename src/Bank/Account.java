package Bank;

public class Account {
    private String name;
    private String accountnumber;
    private double balance;
    private String customertype;
    private boolean pervayaOperaciya;



    public Account(String name, String customertype) {
        this.name = name;
        this.accountnumber = "" + Math.round(Math.random()*10000);
        this.balance = 1000;
        this.customertype = customertype;
        this.pervayaOperaciya = true;

    }
    public double getBalance() {
        return balance;
    }
    public void addMoney(double amount){
        balance += amount;
    }
    public void payment(double amount, Account user){
        if (customertype.equals("Базовый")) {
            balance -= 100;
        }
        if (amount > balance){
            throw new RuntimeException("недостаточно средств для списания оплаты");
        }
        balance -= amount;
        user.balance += amount;
    }
    public void servispay(double amount) throws Exception {
        if(pervayaOperaciya){
            balance += 1000;
            pervayaOperaciya = false;
        }
        if (amount > balance) {
            throw new Exception("недостаточно средств");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма оплаты должна быть положительной.");
        }

        balance -= amount;
        calculatorCashback(amount);
    }
    private void calculatorCashback(double amount){
        switch (customertype){
            case "Базовый" -> {
                balance += amount/100;
            }
            case "Премиум" -> {
                if (amount < 10000){
                    balance += amount/100;
                }
            }
            case "VIP" -> {
                if (amount < 10000) {
                    balance += amount * 0.01;
                } else if (amount < 100000) {
                    balance += amount * 0.05;
                } else {
                    balance += amount * 0.10;
                }
            }
        }
    }
}
