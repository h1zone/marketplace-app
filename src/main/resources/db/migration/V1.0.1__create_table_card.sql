CREATE TABLE IF NOT EXISTS ${flyway:defaultSchema}.card (
    id UUID NOT NULL,
    created_date TIMESTAMP NOT NULL,
    modified_date TIMESTAMP,

    nmID	    INT4    NOT NULL,--Артикул WB
    imtID	    INT4    NOT NULL, --ID карточки товара. (Артикулы WB из одной карточки товара будут иметь одинаковый imtID)
    nmUUID	    UUID    NOT NULL, -- Внутренний технический ID товара
    subjectID   INT4    NOT NULL, --ID предмета
    vendorCode	VARCHAR NOT NULL, --Артикул продавца
    subjectName	VARCHAR NOT NULL, --Название предмета
    brand	    VARCHAR NOT NULL, --Бренд
    title	    VARCHAR NOT NULL, --Наименование товара
    createdAt	VARCHAR NOT NULL, --Дата создания
    updatedAt	VARCHAR NOT NULL, --Дата изменения

    PRIMARY KEY (id)
);
