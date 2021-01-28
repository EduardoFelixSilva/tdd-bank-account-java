package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void checkInitialBalance() {
        Account account = new Account();
        assertThat(account.getBalance() == 0D);
    }

    @Test
    public void addBalance() {
        Account account = new Account();
        account.setBalance(25D);
        account.addBalance(125D);
        assertThat(account.getBalance() == 150D);
    }

}
