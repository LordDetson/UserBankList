drop table if exists account;
drop table if exists user;
create table account (
    account_id integer not null auto_increment,
    account integer not null,
    user_id integer,
    primary key (account_id)
) engine=MyISAM;
create table user (
    user_id integer not null auto_increment,
    name varchar(45),
    sure_name varchar(45),
    primary key (user_id)
) engine=MyISAM;
alter table account add constraint fk_account_user foreign key (user_id) references user (user_id);