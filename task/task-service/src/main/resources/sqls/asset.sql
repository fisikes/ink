create table asset
(
    id         varchar(32)  not null
        primary key,
    asset_name varchar(255) null,
    tenant_id  char(32)
);

