package by.babanin.service;

import by.babanin.dao.AccountRepository;
import by.babanin.dao.UserRepository;
import by.babanin.entity.Account;
import by.babanin.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

    public MainService(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    public User defineRichestUser() {
        int maxAccount = accountRepository.getMaxAccount();
        Account account = accountRepository.findFirstByAccount(maxAccount);
        return account.getUser();
    }

    public int accountsSum() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream()
                .map(Account::getAccount)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
