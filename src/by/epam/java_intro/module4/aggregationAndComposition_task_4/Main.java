package by.epam.java_intro.module4.aggregationAndComposition_task_4;

public class Main {

    public static void main(String[] args) {

        Logic logic = new Logic();
        Bank bulBank = new Bank("BulBank");
        View view = new View();

        Client hobotkov = (new Client("Hobotkov", "Ihar", "Evlampievich"));
        bulBank.addClient(hobotkov);
        hobotkov.addBankAccount(new BankAccount("Main Account", 11111111, 5000, -1000, false, "BYN", hobotkov));
        hobotkov.addBankAccount(new BankAccount("Spare account", 11111112, 15000, 0, false, "BYN", hobotkov));

        Client nosov = (new Client("Nosov", "Pavel", "Ragnedovich"));
        bulBank.addClient(nosov);
        nosov.addBankAccount(new BankAccount("Main Account", 11111113, -1000, -1000, true, "BYN", nosov));
        nosov.addBankAccount(new BankAccount("Spare account", 33333331, 700,0, false, "BYN", nosov));


        view.print("Account search by number: ", logic.findAccountByNumber(bulBank,33333331 ));
        view.print("Accounts sort by Balance: ", logic.sortAccountsByBalance(bulBank));
        view.print("Amount of money on all customer accounts: ", logic.findClientTotal(hobotkov));
        view.print("Cash of all clients: ", logic.findBankTotal(bulBank));
        view.print("Amount of negative customer accounts: ", logic.findClientNegativeTotal(hobotkov));
        view.print("Amount of positive customer accounts: ", logic.findClientPositiveTotal(nosov));
        view.print("Cash of all positive customers accounts: ", logic.findBankPositiveTotal(bulBank));
        view.print("Cash of all negative customers accounts: ", logic.findClientNegativeTotal(nosov));

        view.print("Account : ", hobotkov.getBankAccounts().get(1));
        logic.moneyTransaction(hobotkov.getBankAccounts().get(0), hobotkov.getBankAccounts().get(1), 7000 );
        view.print("Account changes: ", hobotkov.getBankAccounts().get(1));

        view.print("Account : ", nosov.getBankAccounts().get(1));
        logic.moneyTransaction(hobotkov.getBankAccounts().get(0), nosov.getBankAccounts().get(1), 500 );
        view.print("Account changes: ", nosov.getBankAccounts().get(1));



    }
}