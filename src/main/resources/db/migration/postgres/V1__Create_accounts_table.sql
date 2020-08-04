CREATE TABLE accounts  (
	user_id bigserial PRIMARY KEY,
	username text UNIQUE NOT NULL,
	password text NOT NULL
);