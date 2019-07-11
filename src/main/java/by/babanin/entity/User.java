package by.babanin.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Length(max = 45)
    private String name;
    @Length(max = 45)
    private String sureName;
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private Account account;

    public User() {
    }

    public User(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
