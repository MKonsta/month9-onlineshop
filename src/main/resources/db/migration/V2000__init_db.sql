INSERT INTO shop.cart (id, item_id, item_name, user_id) VALUES (4, 3, 'Отвертка', 2);
INSERT INTO shop.cart (id, item_id, item_name, user_id) VALUES (5, 1, 'Дрель электрическая', 2);
INSERT INTO shop.cart (id, item_id, item_name, user_id) VALUES (11, 3, 'Отвертка', 10);
INSERT INTO shop.cart (id, item_id, item_name, user_id) VALUES (15, 2, 'Сварочный аппарат', 2);

INSERT INTO shop.hibernate_sequence (next_val) VALUES (17);

INSERT INTO shop.item (id, category, count, file, name, price) VALUES (1, 'Электоро', 10, 'drill.jpg', 'Дрель электрическая', 3500);
INSERT INTO shop.item (id, category, count, file, name, price) VALUES (2, 'Электоро', 25, 'swar.jpg', 'Сварочный аппарат', 10000);
INSERT INTO shop.item (id, category, count, file, name, price) VALUES (3, 'инструмент', 100, 'otvert.jpg', 'Отвертка', 30);
INSERT INTO shop.item (id, category, count, file, name, price) VALUES (4, 'инструмент', 15, 'ploskogubsi.jpg', 'Плоскогубцы', 120);
INSERT INTO shop.item (id, category, count, file, name, price) VALUES (5, 'Электоро', 23, 'bolgarka.jpg', 'Болгарка', 4000);

INSERT INTO shop.usr (id, active, password, username, email) VALUES (1, true, 'sd', 'sd', 'asd@ff.ru');
INSERT INTO shop.usr (id, active, password, username, email) VALUES (2, true, 'ww', 'ww', 'ww@mail.ru');
INSERT INTO shop.usr (id, active, password, username, email) VALUES (10, true, 'qq', 'qq', 'qq@m.ru');

INSERT INTO shop.user_role (user_id, roles) VALUES (1, 'USER');
INSERT INTO shop.user_role (user_id, roles) VALUES (2, 'USER');
INSERT INTO shop.user_role (user_id, roles) VALUES (10, 'USER');

