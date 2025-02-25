use projetoaula06;

create table funcionario(
    id            char(36)           primary key,
    nome          varchar(100)       not null,
    cpf           varchar(11)        not null,
    matricula     varchar(10)        not null,
    cargo         varchar(50)        not null
);

create table dependente(
     id                           char(36)       primary key,
     nome                         varchar(100)   not null,
     parentesco                   varchar(25)    not null,
     funcionario_id               char(36)       not null,
     foreign key(funcionario_id)
     references funcionario(id)
);

desc funcionario;
desc dependente;