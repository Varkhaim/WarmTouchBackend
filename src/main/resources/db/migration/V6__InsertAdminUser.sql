INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

INSERT INTO users(username,password,email,name,active,roles,created_at,updated_at)
        VALUES('admin','$2a$04$DAf3PLEzUw1ce3nTthCKHuEtIWhtt0pzBIHRR/.oqUotyozBbSoa.','admin@admin.pl','admin','true','ROLE_ADMIN', '1990-01-01', '1990-01-01');