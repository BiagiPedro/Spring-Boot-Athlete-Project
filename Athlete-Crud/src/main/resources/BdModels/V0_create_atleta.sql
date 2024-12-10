create table clube
(
    id_clube      int auto_increment
        primary key,
    nome_clube    varchar(100) not null,
    data_fundacao varchar(100) not null
);

create table atleta
(
    id_atleta      int auto_increment
        primary key,
    tx_nome        varchar(100) not null,
    int_idade      int          not null,
    tx_posico      varchar(100) not null,
    clube_id_clube int          not null,
    constraint fk_atleta_clube
        foreign key (clube_id_clube) references clube (id_clube)
);
