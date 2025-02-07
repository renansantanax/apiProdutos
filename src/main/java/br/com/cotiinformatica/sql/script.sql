CREATE TABLE categoria (
	id				uuid			primary key,
	nome			varchar(50)		not null unique
);

CREATE TABLE produto (
	id				uuid			primary key,
	nome			varchar(100)	not null,
	preco			decimal(10,2)	not null,
	quantidade  	int				not null,
	categoria_id	uuid			not null,
	foreign key(categoria_id)
		references categoria(id)
);

INSERT INTO categoria(id, nome) VALUES(gen_random_uuid(), 'Informática');
INSERT INTO categoria(id, nome) VALUES(gen_random_uuid(), 'Eletrônicos');
INSERT INTO categoria(id, nome) VALUES(gen_random_uuid(), 'Livraria');
INSERT INTO categoria(id, nome) VALUES(gen_random_uuid(), 'Vestuário');
INSERT INTO categoria(id, nome) VALUES(gen_random_uuid(), 'Outros');

SELECT * FROM categoria;