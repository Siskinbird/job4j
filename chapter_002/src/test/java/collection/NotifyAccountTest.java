package collection;

import org.junit.Test;
import ru.job4j.collection.Account;
import ru.job4j.collection.NotifyAccount;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 /* Тесты для метода sent возвращающего список аккаунтов клиентов банка без дубликатов
 * @author Dmitry Chizhov
 * @since 14.07.20
 * @version 1
 */
public class NotifyAccountTest {
    /**
     * Когда нет дубликатов
     */
    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
    /**
     * Когда есть дубликатов
     */
    @Test
    public void sentWhitOutClones() {
        List<Account> accounts = Arrays.asList(
                new Account("0066600", "βεελζεβοὺλ", "666666666666666"),
                new Account("0000001", "Jesus Christ", "00000000000001"),
                new Account("0066600", "βεελζεβοὺλ", "666666666666666"),
                new Account("0000001", "Jesus Christ", "00000000000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("0066600", "βεελζεβοὺλ", "666666666666666"),
                        new Account("0000001", "Jesus Christ", "00000000000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}