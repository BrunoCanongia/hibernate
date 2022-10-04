drop table if exists credencial;
drop table if exists pessoa;

create table pessoa (
  pessoa_id int auto_increment not null,
  nome varchar(32) not null,
  nascimento datetime not null,
  
  primary key(pessoa_id)
);

create table credencial (
  credencial_id int auto_increment not null,
  pessoa_id int not null,
  acesso varchar(32),
  
  primary key(credencial_id),
  foreign key(pessoa_id) references pessoa(pessoa_id)
);
