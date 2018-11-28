
DROP DATABASE bankSystem;
CREATE DATABASE banksystem;
CREATE TABLE bank(
 	id varchar(36) PRIMARY KEY,
 	name varchar(36),
 	country varchar(36)
);
 CREATE TABLE user(
 	id varchar(36) PRIMARY KEY,
 	name varchar(36),
 	email varchar(64),
 	hashpass varchar(64),
 	address varchar(128)
 );
CREATE TABLE account(
	id varchar(36) PRIMARY KEY,
	bankId varchar(36),
 	userId varchar(36),
 	balance DOUBLE,
 	accountNum varchar(36),
 	mfaType varchar(36),
 	type ENUM('Mortgage', 'Savings', 'Checking'),
 	intRate INT,
 	loanPeriod varchar(36),
 	debPerMonth INT,
 	FOREIGN KEY (bankId) REFERENCES bank(id),
 	FOREIGN KEY (userId) REFERENCES user(id)
 );
 CREATE TABLE branch(
 	id varchar(36) PRIMARY KEY,
 	bankId varchar(36),
 	address varchar(128),
 	hasVault BOOLEAN,
 	hasBooth BOOLEAN,
 	FOREIGN KEY (bankId) REFERENCES bank(id)
 );
  CREATE TABLE employee(
 	id varchar(36) PRIMARY KEY,
 	branchId varchar(36),
 	name varchar(36),
 	salary DOUBLE,
 	currentRole ENUM('Manager', 'Teller'),
 	 FOREIGN KEY (branchId) REFERENCES branch(id)
 );
 CREATE TABLE Transaction(
 	id varchar(36) PRIMARY KEY,
 	bankId varchar(36),
 	accountID varchar(36),
	amount DOUBLE,
 	debit BOOLEAN,
 	vendorName varchar(256),
 	FOREIGN KEY (bankId) REFERENCES bank(id),
 	FOREIGN KEY (accountID) REFERENCES account(id)
 );			

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Nathan', 'nathan@mail.com', 'sdsqsq', 'qsdqs');


INSERT INTO bank (id, name, country) VALUES(UUID(), 'bnp', 'Belgium');
	
	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'bnp') , 'Brussels',false , true);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= 'Brussels'), 'manager', 54000, 'Manager');


	
	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'bnp'), (SELECT id FROM user where name = 'Nathan'), 12, 'BE65468746', 'sdsdc');
 	
 		UPDATE account
 		SET type = 'Savings', intRate = 5
 		WHERE accountNum = 'BE65468746';
 	

	
		
	