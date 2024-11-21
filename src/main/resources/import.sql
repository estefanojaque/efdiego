INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO users(username, password) VALUES ('user1','$2a$12$bwTRZnWk3nSHbSi28g1lr.yc77mEuQGqAJm8ulyU2./Y20IJl9n4K');
INSERT INTO users(username, password) VALUES ('admin','$2a$12$bwTRZnWk3nSHbSi28g1lr.yc77mEuQGqAJm8ulyU2./Y20IJl9n4K');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1); -- user1 with ROLE_USER
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2); -- admin with ROLE_ADMIN
INSERT INTO gama(g5name) VALUES ('Baja');
INSERT INTO gama(g5name) VALUES ('Media');
INSERT INTO gama(g5name) VALUES ('Alta');
INSERT INTO auto(g5datefabrication, g5price, gama_id, g5brand, g5model, g5placanumber) VALUES ('2023-01-01', 20000, 1 , 'Toyota', 'Yaris', 'ABC333');
INSERT INTO auto(g5datefabrication, g5price, gama_id, g5brand, g5model, g5placanumber) VALUES ('2024-01-01', 15000, 1 , 'Nissan', 'Safari', 'GRT543');
INSERT INTO auto(g5datefabrication, g5price, gama_id, g5brand, g5model, g5placanumber) VALUES ('2021-01-01', 40000, 2 , 'Volkswagen', 'Turbo', 'HHT665');
INSERT INTO auto(g5datefabrication, g5price, gama_id, g5brand, g5model, g5placanumber) VALUES ('2022-10-01', 50000, 3 , 'VMW', 'A3', 'TYG654');
INSERT INTO auto(g5datefabrication, g5price, gama_id, g5brand, g5model, g5placanumber) VALUES ('2022-10-01', 50000, 3 , 'Mercedes', 'Swing', 'KLO667');
INSERT INTO auto(g5datefabrication, g5price, gama_id, g5brand, g5model, g5placanumber) VALUES ('2022-10-01', 50000, 3 , 'Volvo', 'President', 'FGE443');