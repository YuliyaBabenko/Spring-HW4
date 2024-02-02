CREATE TABLE IF NOT EXISTS products (
    title varchar(256) NOT NULL,
    article varchar(50) NOT NULL PRIMARY KEY,
    description text NOT NULL,
    cost float,
    imageURL varchar(256));

insert into products (title, article, description, cost, imageURL)
VALUES
    ('Медвежонок плюшевый', '12345', 'Описание продукта 1', 1099.99, '/img/no-photo.jgp'),
    ('Радиоуправляемый вертолёт', '54321', 'Описание продукта 2', 7045.60, '/img/no-photo.jgp'),
    ('Неваляшка', '98765', 'Описание продукта 3', 847.20, '/img/no-photo.jgp'),
    ('Кукла "Маша"', '43210', 'Описание продукта 4', 3196.35, '/img/no-photo.jgp'),
    ('Конструктор "Lego"', '87654', 'Описание продукта 5', 2963.89, '/img/no-photo.jgp');