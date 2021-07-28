CREATE TABLE "users"
(
    id        bigserial PRIMARY KEY,
    login     text NOT NULL,
    password  text NOT NULL,
    firstname text NULL,
    lastname  text NULL
);
