CREATE TYPE Rol AS ENUM ('ADMIN', 'USER');

CREATE TABLE IF NOT EXISTS Usuario(
    id INT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);