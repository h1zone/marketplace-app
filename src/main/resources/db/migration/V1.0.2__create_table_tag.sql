CREATE TABLE IF NOT EXISTS ${flyway:defaultSchema}.tag (
    id UUID NOT NULL,
    created_date TIMESTAMP NOT NULL,
    modified_date TIMESTAMP,

    color	VARCHAR NOT NULL, -- Цвет тега
    name	VARCHAR NOT NULL, -- Название тега

    PRIMARY KEY (id)
);