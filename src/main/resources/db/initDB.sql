DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS meals;
DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE users
(
  id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name       VARCHAR(255)            NOT NULL,
  email      VARCHAR(255)            NOT NULL,
  password   VARCHAR(255)            NOT NULL,
  registered TIMESTAMP DEFAULT now() NOT NULL
);
CREATE UNIQUE INDEX users_unique_email_idx
  ON USERS (email);

CREATE TABLE user_roles
(
  user_id INTEGER NOT NULL,
  role    VARCHAR(255),
  FOREIGN KEY (user_id) REFERENCES USERS (id)
  ON DELETE CASCADE
);

CREATE TABLE restaurants
(
  id      INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name    VARCHAR(255)      NOT NULL,
  votes   INT DEFAULT 0     NOT NULL
);

CREATE TABLE menu
(
  id   INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  dish1 VARCHAR(255) NOT NULL,
  dish2 VARCHAR(255) NOT NULL,
  dish3 VARCHAR(255) ,
  dish4 VARCHAR(255) ,
  dish5 VARCHAR(255)
);

CREATE TABLE restaurants_menu
(
  restaurant_id INTEGER NOT NULL,
  menu    INTEGER,
  CONSTRAINT user_roles_idx UNIQUE (restaurant_id, menu),
  FOREIGN KEY (restaurant_id) REFERENCES restaurants (id)
  ON DELETE CASCADE,
  FOREIGN KEY (menu) REFERENCES menu (id)
  ON DELETE CASCADE
);