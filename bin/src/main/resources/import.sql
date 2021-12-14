insert into cozinha (nome) values ('Japonesa');
insert into cozinha (nome) values ('Tailandesa');
insert into cozinha (nome) values ('Alemã');
insert into cozinha (nome) values ('Mexicana');
insert into cozinha (nome) values ('Mineira');

insert into restaurante (nome, taxa_frete, cozinha_codigo) values ('KaiZen Sushi', 14.99, 1);
insert into restaurante (nome, taxa_frete, cozinha_codigo) values ('ThaiLanches', 0, 2);
insert into restaurante (nome, taxa_frete, cozinha_codigo) values ('Hailander', 20, 3);
insert into restaurante (nome, taxa_frete, cozinha_codigo) values ('AndaLê', 15, 4);
insert into restaurante (nome, taxa_frete, cozinha_codigo) values ('Jubeba e Limão', 9.99, 5);

insert into forma_pagamento (descricao) values ('Cartão de Crédito')
insert into forma_pagamento (descricao) values ('Cartão de Débito')
insert into forma_pagamento (descricao) values ('Dinheiro')
insert into forma_pagamento (descricao) values ('pix')

insert into permissao (nome, descricao) values ('Inserir Restaurante', 'Permite inserir restaurantes no sistema')
insert into permissao (nome, descricao) values ('Inserir Cozinha', 'Permite inserir cozinhas no sistema')
insert into permissao (nome, descricao) values ('Apagar Cliente', 'Permite desativar um cliente no sistema')
insert into permissao (nome, descricao) values ('Inserir Forma de Pagamento', 'Permite inserir nova forma de pagamento')

insert into estado (nome) values ('Minas Gerais')
insert into estado (nome) values ('Goiás')
insert into estado (nome) values ('São Paulo')
insert into estado (nome) values ('Paraná')

insert into cidade (nome, estado_codigo) values ('Uberlândia', 1)
insert into cidade (nome, estado_codigo) values ('Monte Carmelo', 1)
insert into cidade (nome, estado_codigo) values ('Itajubá', 1)
insert into cidade (nome, estado_codigo) values ('Caldas Novas', 2)
insert into cidade (nome, estado_codigo) values ('Goiânia', 2)
insert into cidade (nome, estado_codigo) values ('Presidente Prudente', 3)
insert into cidade (nome, estado_codigo) values ('São Paulo', 3)
insert into cidade (nome, estado_codigo) values ('Mogi das Cruzes', 3)
insert into cidade (nome, estado_codigo) values ('Bertioga', 3)
insert into cidade (nome, estado_codigo) values ('São José do Rio Preto', 3)
insert into cidade (nome, estado_codigo) values ('Curitiba', 4)
insert into cidade (nome, estado_codigo) values ('Cascavel', 4)
insert into cidade (nome, estado_codigo) values ('Maringá', 4)