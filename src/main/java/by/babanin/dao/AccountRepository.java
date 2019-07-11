package by.babanin.dao;

import by.babanin.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query("select max(a.account) from Account a")
    Integer getMaxAccount();

    Account findFirstByAccount(int account);
}
