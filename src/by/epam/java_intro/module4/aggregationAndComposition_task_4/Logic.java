package by.epam.java_intro.module4.aggregationAndComposition_task_4;

import java.util.ArrayList;
import java.util.List;

public class Logic {

    public BankAccount findAccountByNumber(Bank someBank, long accountNumber) {
        BankAccount account = null;
        for (int i = 0; i < someBank.getClientList().size(); i++) {
            for (int j = 0; j < someBank.getClientList().get(i).getBankAccounts().size(); j++) {
                if (accountNumber == someBank.getClientList().get(i).getBankAccounts().get(j).getAccountNumber()) {
                    account = someBank.getClientList().get(i).getBankAccounts().get(j);

                }
            }

        }
        return account;
    }

    public List<BankAccount> sortAccountsByBalance(Bank someBank) {

        List<BankAccount> sortedAccounts = new ArrayList<>();
        sortedAccounts = getAccounts(someBank, sortedAccounts);

        for (int i = 0; i < sortedAccounts.size() - 1; i++) {
            for (int j = i + 1; j < sortedAccounts.size(); j++) {
                if (sortedAccounts.get(i).getAccountBalance() >= sortedAccounts.get(j).getAccountBalance()) {
                    sort(i, j, sortedAccounts);
                }

            }
        }
        return sortedAccounts;
    }


    public int findBankTotal(Bank someBank) {
        int sum = 0;
        for (int i = 0; i < someBank.getClientList().size(); i++)
            for (int j = 0; j < someBank.getClientList().get(i).getBankAccounts().size(); j++)
                sum += someBank.getClientList().get(i).getBankAccounts().get(j).getAccountBalance();
        return sum;
    }

    public int findBankPositiveTotal(Bank someBank) {
        int sum = 0;
        for (int i = 0; i < someBank.getClientList().size(); i++) {
            for (int j = 0; j < someBank.getClientList().get(i).getBankAccounts().size(); j++) {
                if (!someBank.getClientList().get(i).getBankAccounts().get(j).isAccountStatusBlocked()) {
                    sum += someBank.getClientList().get(i).getBankAccounts().get(j).getAccountBalance();
                }
            }
        }
        return sum;
    }

    public int findBankNegativeTotal(Bank someBank) {
        int sum = 0;
        for (int i = 0; i < someBank.getClientList().size(); i++) {
            for (int j = 0; j < someBank.getClientList().get(i).getBankAccounts().size(); j++) {
                if (someBank.getClientList().get(i).getBankAccounts().get(j).isAccountStatusBlocked()) {
                    sum += someBank.getClientList().get(i).getBankAccounts().get(j).getAccountBalance();
                }
            }
        }
        return sum;
    }


    public int findClientTotal(Client someClient) {
        int sum = 0;
        for (int i = 0; i < someClient.getBankAccounts().size(); i++) {
            sum += someClient.getBankAccounts().get(i).getAccountBalance();
        }
        return sum;
    }

    public int findClientPositiveTotal(Client someClient) {
        int sum = 0;

        for (int i = 0; i < someClient.getBankAccounts().size(); i++) {
            if (!someClient.getBankAccounts().get(i).isAccountStatusBlocked()) {
                sum += someClient.getBankAccounts().get(i).getAccountBalance();
            }
        }
        return sum;
    }

    public int findClientNegativeTotal(Client someClient) {
        int sum = 0;
        for (int i = 0; i < someClient.getBankAccounts().size(); i++) {
            if (someClient.getBankAccounts().get(i).isAccountStatusBlocked()) {
                sum += someClient.getBankAccounts().get(i).getAccountBalance();
            }
        }
        return sum;
    }

    public void moneyTransaction(BankAccount senderAccount, BankAccount recipientAccount, long transferAmount) {
        if (!checkStatus(senderAccount)) {
            if (confirmTransfer(senderAccount, transferAmount)) {
                senderAccount.setAccountBalance(senderAccount.getAccountBalance() - transferAmount);
                changeStatus(senderAccount);
                recipientAccount.setAccountBalance(recipientAccount.getAccountBalance() + transferAmount);
                changeStatus(recipientAccount);
                returnSuccess(transferAmount);
            }
        }
    }

    private boolean checkStatus(BankAccount someAccount) {
        boolean status = someAccount.isAccountStatusBlocked();
        if (status) {
            System.out.println("The account is blocked, replenish the account to unlock and complete the transaction.");
            return status;
        }
        return status;
    }

    private void changeStatus(BankAccount someAccount) {
        if (someAccount.getAccountBalance() > someAccount.getLimits()){
            someAccount.setAccountStatusBlocked(false);
        }
            if (someAccount.getAccountBalance() == someAccount.getLimits()) {
            someAccount.setAccountStatusBlocked(true);
        }
    }

    private void returnSuccess(long transferAmount) {
        System.out.println("Transfer Amount: " + transferAmount);
        System.out.println("Success");
        System.out.println("___________________________________________________________________________________");
    }

    private boolean confirmTransfer(BankAccount someAccount, long amount) {
        boolean confirm = someAccount.getAccountBalance() - amount >= someAccount.getLimits();
        if(!confirm)    {
            System.out.println("There are not enough funds on the account.");
            return confirm;
        }
        return confirm;
    }


    private void sort(int i, int j, List<BankAccount> unsorted) {

        BankAccount temp = unsorted.get(j);
        unsorted.set(j, unsorted.get(i));
        unsorted.set(i, temp);
    }

    private List<BankAccount> getAccounts(Bank someBank, List<BankAccount> accounts) {

        for (int i = 0; i < someBank.getClientList().size(); i++) {
            accounts.addAll(someBank.getClientList().get(i).getBankAccounts());
        }
        return accounts;
    }

}
