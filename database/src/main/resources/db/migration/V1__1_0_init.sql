CREATE SCHEMA IF NOT EXISTS booking;

CREATE TABLE IF NOT EXISTS booking.users (
    id uuid primary key,
    "name" varchar(50) NOT NULL ,
    "password" varchar(200) NOT NULL
);

COMMENT ON TABLE booking.users IS 'таблица пользователей';
COMMENT ON COLUMN booking.users.id IS 'Уникальный идентификатор';
COMMENT ON COLUMN booking.users.name IS 'Имя пользователя';
COMMENT ON COLUMN booking.users.password IS 'Пароль пользователя';

CREATE INDEX booking_user_index_idx ON booking.users(id);

CREATE TABLE IF NOT EXISTS booking.roles (
    id uuid primary key,
    "type" varchar(30) NOT NULL,
    description varchar(50) NOT NULL
);

COMMENT ON TABLE booking.roles IS 'таблица ролей';
COMMENT ON COLUMN booking.roles.id IS 'Уникальный идентификатор';
COMMENT ON COLUMN booking.roles.type IS 'Тип роли';
COMMENT ON COLUMN booking.roles.description IS 'Описание роли';

CREATE TABLE IF NOT EXISTS booking.user_role (
    id uuid primary key,
    user_id uuid NOT NULL REFERENCES booking.users(id),
    role_id uuid NOT NULL REFERENCES booking.roles(id)
);

CREATE INDEX booking_user_role_index ON booking.user_role(id);

COMMENT ON TABLE booking.user_role IS 'таблица ролей пользователей';
COMMENT ON COLUMN booking.user_role.id IS 'Уникальный идентификатор';
COMMENT ON COLUMN booking.user_role.user_id IS 'id пользователя';
COMMENT ON COLUMN booking.user_role.role_id IS 'id роли';






