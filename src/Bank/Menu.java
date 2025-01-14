package Bank;

public class Menu {
    public static void main(String[] args) {
        Account ac1 = new Account("Арсен Владимировач Иванов",  "Базовый клиент");
        Account ac2 = new Account("Валерий Александрович Николаев", "Базовый клиент");
        Account ac3 = new Account("Александр Васильевич  Тихомиров", "Базовый клиент");
        Account ac4 = new Account("Валерия Алексеевна Морозова", "Базовый клиент");
        Account ac5 = new Account("Александра Валерьевна Орлова", "Базовый клиент");


        Account acco1 = new Account("Дмитрий Владиславович Кузнецов", "Премиум клиент");
        Account acco2 = new Account("Роман Алексеевич Егоров", "Премиум клиент");
        Account acco3 = new Account("Роман Дмитреевич Смирнов", "Премиум клиент");
        Account acco4 = new Account("Юрий Леондович Левин", "Премиум клиент");
        Account acco5 = new Account("Владимир Александрович Петров", "Премиум клиент");



        Account a1 = new Account("Александр Леонидович Орлов", "VIP клиент");
        Account a2 = new Account("Валентина Николаевна Юдина", "VIP клиент");
        Account a3 = new Account("Валерия Александровна Романова", "VIP клиент");
        Account a4 = new Account("Анастасия Викторовна Морозова", "VIP клиент");
        Account a5 = new Account("Михаил Валентинович Николаев", "VIP клиент");

        a1.addMoney(1000);
        a1.payment(727, a3);
        a3.payment(745, a5);
        acco2.payment(627, a4);



        System.out.println(a1.getBalance());
        System.out.println(a3.getBalance());
        System.out.println(acco2.getBalance());



        ac2.addMoney(1000);

    }
}
