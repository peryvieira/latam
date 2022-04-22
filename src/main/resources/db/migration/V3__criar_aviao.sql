CREATE TABLE aviao (
                           id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
                           modelo varchar(255) NOT NULL,
                           capacidadePassageiros int NOT NULL,
                           capacidadeCarga decimal NOT NULL,
                           CONSTRAINT aviao_pkey PRIMARY KEY (id)
);

CREATE TABLE voo (
                     id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
                     aviao_id int8 NOT NULL REFERENCES aviao(id),
                     aeroporto_partida_id int8 NOT NULL REFERENCES aeroporto(id),
                     aeroporto_chegada_id int8 NOT NULL REFERENCES  aeroporto(id),
                     data_partida date NOT NULL,
                     data_chegada date NOT NULL,
                     quantidade_clientes int,
                     peso_carga decimal ,
                     valor_viagem decimal NOT NULL,
                     CONSTRAINT voo_pkey PRIMARY KEY (id)
);

insert into aviao(modelo,capacidadePassageiros,capacidadeCarga) values ('Airbus A350', 339, 16950.0);
insert into aviao(modelo,capacidadePassageiros,capacidadeCarga) values ('Boeing 767', 238, 7140.0);
insert into aviao(modelo,capacidadePassageiros,capacidadeCarga) values ('ATR 72', 68, 1360.0);