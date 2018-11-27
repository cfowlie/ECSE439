
CREATE DATABASE banksystem;
CREATE TABLE bank(
 	id UUID() ,
 	name varchar(36),
 	country varchar(36)
);
CREATE TABLE account(
	id UUID(),
	bankId UUID() FOREIGN KEY bank(id),
 	userId UUID() FOREIGN KEY user(id),
 	balance DOUBLE,
 	accountNum varchar(36),
 	mfaType varchar(36),
 	type ENUM('Mortgage', 'Savings', 'Checking'),
 	intRate INT,
 	loanPeriod varchar(36),
 	debPerMonth INT
 );
 CREATE TABLE user(
 	id UUID(),
 	name varchar(36),
 	email varchar(64),
 	address varchar(128)
 );
 CREATE TABLE employee(
 	id UUID(),
 	branchId UUID() FOREIGN KEY branch(id),
 	name varchar(36),
 	salary DOUBLE,
 	currentRole ENUM('Manager', 'Teller')
 );
 CREATE TABLE branch(
 	id UUID(),
 	bankId UUID() FOREIGN KEY bank(id),
 	address varchar(128),
 	hasVault BOOLEAN,
 	hasBooth BOOLEAN
 );
 CREATE TABLE Transaction(
 	id UUID(),
 	bankId UUID() FOREIGN KEY bank(id),
 	accountID UUID() FOREIGN KEY account(id),
	amount DOUBLE,
 	debit BOOLEAN,
 	vendorName varchar(256)
 );
 		
		
INSERT INTO bank (name, country) VALUES('bnp', 'Belgium');
	

	
	

		
INSERT INTO bank (name, email, hashpass, address) VALUES('Nathan', 'nathan@mail.com', 'sdsqsq', 'qsdqs');

	