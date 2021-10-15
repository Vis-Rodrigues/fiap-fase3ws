insert into tb_product (name,brand,description,is_vegan,is_vegetarian,is_gluten_free,price,url_image) values ('Pacoquinha', 'SantaHelena', 'Description', TRUE, TRUE, TRUE, 0.5,'http://localhost');
insert into tb_product (name,brand,description,is_vegan,is_vegetarian,is_gluten_free,price,url_image) values ('Abóbora', 'SantaHelena', 'Description', TRUE, TRUE, TRUE, 0.5,'http://localhost');
insert into tb_product (name,brand,description,is_vegan,is_vegetarian,is_gluten_free,price,url_image) values ('Maça', 'SantaHelena', 'Description', TRUE, TRUE, FALSE, 0.5,'http://localhost');
insert into tb_product (name,brand,description,is_vegan,is_vegetarian,is_gluten_free,price,url_image) values ('Brocolis', 'PaoDeAcucar', 'Description', FALSE, TRUE, TRUE, 0.5,'http://localhost');
insert into tb_product (name,brand,description,is_vegan,is_vegetarian,is_gluten_free,price,url_image) values ('Alface', 'PaoDeAcucar', 'Description', TRUE, FALSE, TRUE, 0.5,'http://localhost');

insert into tb_cart (cart_id, created_date) values (1, sysdate);

insert into tb_cart_product (cart_id, product_id) values (1,1);
insert into tb_cart_product (cart_id, product_id) values (1,2);
insert into tb_cart_product (cart_id, product_id) values (1,3);
insert into tb_cart_product (cart_id, product_id) values (1,5);