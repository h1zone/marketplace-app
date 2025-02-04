CREATE TABLE IF NOT EXISTS ${flyway:defaultSchema}.good (
    id UUID NOT NULL,
    created_date TIMESTAMP NOT NULL,
    modified_date TIMESTAMP,

    good_name VARCHAR NOT NULL,
    article_seller VARCHAR NOT NULL,
    article_wb VARCHAR NOT NULL,
    barcode VARCHAR NOT NULL,

    PRIMARY KEY (id)
);