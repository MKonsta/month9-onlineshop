create table cart
(
    id        int          not null
        primary key,
    item_id   int          null,
    item_name varchar(255) null,
    user_id   bigint       null
);

create table hibernate_sequence
(
    next_val bigint null
);

create table item
(
    id       int          not null
        primary key,
    category varchar(255) null,
    count    int          not null,
    file     varchar(255) null,
    name     varchar(255) null,
    price    int          not null
);

create table usr
(
    id       bigint       not null
        primary key,
    active   bit          not null,
    password varchar(255) null,
    username varchar(255) null,
    email    varchar(255) null
);

create table user_role
(
    user_id bigint       not null,
    roles   varchar(255) null,
    constraint FKfpm8swft53ulq2hl11yplpr5
        foreign key (user_id) references usr (id)
);

