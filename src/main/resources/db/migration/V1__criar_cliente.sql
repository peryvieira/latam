CREATE TABLE cliente (
                         id int8 NOT NULL GENERATED ALWAYS AS IDENTITY ,
                         nome varchar(255) NOT NULL,
                         cpf varchar(255) NOT NULL,
                         CONSTRAINT cliente_pkey PRIMARY KEY (id)
);

insert into cliente(nome, cpf) values ('Pery', '02763313388');