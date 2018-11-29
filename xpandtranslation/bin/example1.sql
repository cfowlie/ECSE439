
DROP DATABASE bankSystem;
CREATE DATABASE banksystem;
USE banksystem;
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
 	hiringdate DATE,
 	 FOREIGN KEY (branchId) REFERENCES branch(id)
 );
 CREATE TABLE Transaction(
 	id varchar(36) PRIMARY KEY,
 	bankId varchar(36),
 	accountID varchar(36),
	amount DOUBLE,
 	debit BOOLEAN,
 	vendorName varchar(256),
 	date DATE,
 	FOREIGN KEY (bankId) REFERENCES bank(id),
 	FOREIGN KEY (accountID) REFERENCES account(id)
 );			

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Nathan', 'nathan@mail.com', 'sdsqsq', 'qsdqs');


INSERT INTO bank (id, name, country) VALUES(UUID(), 'bnp', 'Belgium');
	
	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'bnp') , 'Brussels',false , false);
	
INSERT INTO employee(id, branchID, name, salary, currentRole, hiringdate)
VALUES (UUID(), (SELECT id FROM branch WHERE address= 'Brussels'), 'John Smith', 54000, 'Manager', '2018/4/7');


	
	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'bnp'), (SELECT id FROM user where name = 'Nathan'), 12, 'BE65468746', 'sdsdc');
 	
 		UPDATE account
 		SET type = 'Savings', intRate = 5
 		WHERE accountNum = 'BE65468746';
 	

	
	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName, date)
	VALUES(UUID(), (SELECT id FROM bank where name = 'bnp'), (SELECT id FROM account where accountNum = 'BE65468746'), 12,  true, 'John', '2018/4/18');

		
	