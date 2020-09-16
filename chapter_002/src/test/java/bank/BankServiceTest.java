package bank;

import org.junit.Test;
import ru.job4j.bank.Account;
import ru.job4j.bank.BankService;
import ru.job4j.bank.User;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Класс тестов для сервиса BankService
 */
public class BankServiceTest {
    @Test
    public void findPassport() {
        User user = new User("6666", "Vasya");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("6666"), is(Optional.of(user)));
    }
    @Test
    public void noFindPassport() {
        User user = new User("6666", "Vasya");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("777"), is(Optional.empty()));
    }
    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(Optional.of(user)));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150D));
    }
    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("34", "5546"), is(Optional.empty()));
    }
    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").get().getBalance(), is(200D));
    }
}
