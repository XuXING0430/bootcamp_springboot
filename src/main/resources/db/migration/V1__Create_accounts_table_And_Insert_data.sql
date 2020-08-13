DROP TABLE IF EXISTS bootcamp.accounts;

<<<<<<< HEAD
CREATE TABLE IF NOT EXISTS accounts  (
	user_id bigserial PRIMARY KEY NOT NULL,
=======
CREATE TABLE accounts  (
	user_id bigserial PRIMARY KEY,
>>>>>>> dev_branch
	username text UNIQUE NOT NULL,
	password text NOT NULL
);

Insert into accounts(username,password) values ('livepool', ENCODE('18942020', 'base64'));
Insert into accounts(username,password) values ('Rome',ENCODE('19272020', 'base64'));