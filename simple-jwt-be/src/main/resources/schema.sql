-- users
create table if not exists users
(
    id UUID primary key,
    username varchar(200) not null,
    password varchar(500) not null
);

-- authorities
create table if not exists authorities
(
    id UUID primary key,
    name varchar(50) not null
);

-- users_authorities
create table if not exists users_authorities
(
    user_id UUID not null,
    authority_id UUID not null,
    constraint fk_users foreign key (user_id) references users (id) on delete cascade,
    constraint fk_authorities foreign key (authority_id) references authorities (id) on delete cascade,
    constraint pk_users_authorities primary key (user_id, authority_id)
);
