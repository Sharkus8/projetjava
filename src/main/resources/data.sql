-- Insérer des utilisateurs
INSERT INTO users (username, password, role) VALUES ('user1', 'hello', 'USER');
INSERT INTO users (username, password, role) VALUES ('admin', 'salem', 'ADMIN');

-- Insérer des tables
INSERT INTO tables (capacity) VALUES (4);
INSERT INTO tables (capacity) VALUES (2);
INSERT INTO tables (capacity) VALUES (6);

-- Insérer des réservations
INSERT INTO reservations (user_id, table_id, reservation_date, created_at) VALUES (1, 1, '2024-06-14 19:00:00', '2024-06-13 10:00:00');
INSERT INTO reservations (user_id, table_id, reservation_date, created_at) VALUES (1, 2, '2024-06-15 20:00:00', '2024-06-14 11:00:00');
