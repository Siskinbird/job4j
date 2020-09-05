package ru.job4j.bank;

import java.util.*;


/**
 /* Класс BankService реализует работу сервиса банка.
 * @author Dmitry Chizhov
 * @since 17.07.20
 * @version 1.21
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
        users.putIfAbsent(user, accounts);
    }

    /**
     * Метод findByPassport реализует поиск пользователя по уникальному номеру
     *
     * @param passport - уникальный номер пользователя
     * @return - возвращает найденого пользователя
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream().filter(u -> u.getPassport().equals(passport)).findFirst();
    }

    /**
     * Метод findByRequisite ищет счет пользователя по реквезитам
     *
     * @param passport  - уникальный номер пользователя
     * @param requisite - реквизиты пользователя
     * @return - возвращает найденный счёт, или null
     */
    public Account findByRequisite(String passport, String requisite) {
        Optional<Account> rst = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            users.get(user).stream().filter(u -> u.getRequisite().equals(requisite)).findFirst();
        }
        return rst.get();
    }
// return users.get(findByPassport(passport)).stream().filter
//               (u -> u.getRequisite().equals(requisite)).findFirst().orElse(null);

    /**
     * Метод addAccount  реализует интеграцию нового счета к пользователю
     * @param passport - индивидуальный номер
     * @param account  - счёт пользователя
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод transferMoney реализует перевод средств пользователя между его счетами
     * @param srcPassport - уникальный номер счета списания
     * @param srcRequisite - реквизиты счета списания
     * @param destPassport - уникальный номер счета пополнения
     * @param destRequisite - реквизиты счета пополнения
     * @param amount - количество переводимых средств
     * @return - результат перевода средств
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
       Account srcAccount = findByRequisite(srcPassport, srcRequisite);
       Account destAccount = findByRequisite(destPassport, destRequisite);
       if (srcAccount != null && destAccount != null) {
          if (srcAccount.getBalance() - amount >= 0.00) {
              srcAccount.setBalance(srcAccount.getBalance() - amount);
              destAccount.setBalance(destAccount.getBalance() + amount);
              return true;
          }
          return rsl;
       }

        return rsl;
    }
}