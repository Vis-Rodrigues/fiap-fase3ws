create table TB_PRODUCTS
(

	id 				    bigint NOT NULL AUTO_INCREMENT,
	name			    varchar(200) NOT NULL,
	brand   		  varchar(200) NOT NULL,
	isVegan			  boolean NOT NULL,
	isVegetarian  boolean NOT NULL,
	isGlutenFree  boolean NOT NULL,
	primary key (id)
	
)

insert into TB_PRODUCTS (name, brand, isVegan, isVegetarian, isGlutenFree) VALUES ('Pacoquinha', 'SantaHelena', TRUE, TRUE, TRUE);
insert into TB_PRODUCTS (name, brand, isVegan, isVegetarian, isGlutenFree) VALUES ('Abóbora', 'Teste', TRUE, FALSE, FALSE);
insert into TB_PRODUCTS (name, brand, isVegan, isVegetarian, isGlutenFree) VALUES ('Maça', 'Valor', FALSE, TRUE, FALSE);
insert into TB_PRODUCTS (name, brand, isVegan, isVegetarian, isGlutenFree) VALUES ('Alface', 'PaoDeAcucar', FALSE, TRUE, TRUE);
insert into TB_PRODUCTS (name, brand, isVegan, isVegetarian, isGlutenFree) VALUES ('Brocolis', 'PaoDeAcucar', TRUE, TRUE, TRUE);