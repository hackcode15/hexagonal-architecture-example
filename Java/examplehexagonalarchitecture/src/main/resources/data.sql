DROP TABLE IF EXISTS tbl_product;

CREATE TABLE tbl_product (
    id UUID PRIMARY KEY,
    product_id VARCHAR(50),
    name VARCHAR(100),
    description TEXT,
    price DECIMAL(10,2),
    currency VARCHAR(1)
);

CREATE INDEX idx_productId ON tbl_product (product_id);

INSERT INTO tbl_product (id, product_id, name, description, price, currency) VALUES
    ('550e8400-e29b-41d4-a716-446655440001', 'camiseta-1234', 'Camiseta Blanca', 'Description 1', 10.0, '€'),
    ('550e8400-e29b-41d4-a716-446655440002', 'pantalon-111', 'Pantalón negro', 'Description 2', 20.0, '$');