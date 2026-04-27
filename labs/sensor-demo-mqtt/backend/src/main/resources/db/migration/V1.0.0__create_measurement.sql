create table measurement (
    id         bigserial    primary key,
    sensor     varchar(100) not null,
    value      double precision not null,
    unit       varchar(20)  not null,
    timestamp  timestamp    not null
);

create index idx_measurement_sensor on measurement(sensor);
create index idx_measurement_timestamp on measurement(timestamp desc);
