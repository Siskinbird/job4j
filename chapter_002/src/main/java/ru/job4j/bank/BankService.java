package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 /* Класс BankService реализует работу сервиса банка.
 * @author Dmitry Chizhov
 * @since 16.07.20
 * @version 1.00
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    private List<Account> accounts = new ArrayList<>();

    /**
     * Метод addUser реализует интеграцию нового пользователя в систему банка.
     *
     * @param user - Новый пользователь
     */
    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, accounts);
        }

    }

    /**
     * Метод addAccount  реализует интеграцию нового счета к пользователю
     *
     * @param passport - индивидуальный номер
     * @param account  - сомтояние счёта пользователя
     */
    public void addAccount(String passport, Account account) {
        if (findByPassport(passport) != null) {
            if (!passport.equals(account.getRequisite())) {
                account.setRequisite(passport);
            }
        }
    }

    /**
     * Метод findByPassport реализует поиск пользователя по уникальному номеру
     *
     * @param passport - уникальный номер пользователя
     * @return - возвращает найденого пользователя
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод findByRequisite ищет счет пользователя по реквезитам
     *
     * @param passport  - уникальный номер пользователя
     * @param requisite - реквизиты пользователя
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            String finduser = passport;
          if (finduser != null){
              for (Account account : accounts){
                  if (account.getRequisite().equals(requisite)){
                      return account;
                  }
              }
          }
        }
        return null;
    }

    /**
     * Метод transferMoney реализует перевод средств пользователя между его счетами
     * @param srcPassport - уникальный номер счета списания
     * @param srcRequisite - реквизиты счета списания
     * @param destPassport - уникальный номер счета пополнения
     * @param dеstRequisite - реквизиты счета пополнения
     * @param amount - количество переводимых средств
     * @return - результат перевода средств
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}