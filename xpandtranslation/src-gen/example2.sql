
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

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'James Dean', 'james.dean@gmail.com', 'sdffsdfdgfbvwfvsfdbcx', 'Montreal');

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Paco Alcacer', 'palcacer@gmail.com', 'sdffsdfdgfbvwfvsfdbcx', 'Dortmund');

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Will Byers', 'w.byers@gmail.com', 'sdffsdfdgfbvwfvsfdbcx', 'Colorado');

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Doug Stamper', 'dougstamper@gov.us', 'sdffsdfdgfbvwfvsfdbcx', 'Washington DC');

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Annette Shepherd', 'ashepherd@gmail.com', 'sdffsdfdgfbvwfvsfdbcx', 'Tallahassee');

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Karim Benzema', 'kbnueve@gmail.com', 'sdffsdfdgfbvwfvsfdbcx', 'Madrid');

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Antoine Griezmann', 'agriezmann@gmail.com', 'sdffsdfdgfbvwfvsfdbcx', 'Madrid');

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Lionel Messi', 'leo@gmail.com', 'sdffsdfdgfbvwfvsfdbcx', 'Barcelona');

INSERT INTO user (id, name, email, hashpass, address) VALUES(UUID(), 'Cristiano Ronaldo', 'cr7@gmail.com', 'sdffsdfdgfbvwfvsfdbcx', 'Turin');


INSERT INTO bank (id, name, country) VALUES(UUID(), 'CIBC', 'Canada');
	
	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC') , '1006 Sherbrooke Street, Montreal',false , true);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1006 Sherbrooke Street, Montreal'), 'John Smith', 165000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1006 Sherbrooke Street, Montreal'), 'James Doe', 100000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1006 Sherbrooke Street, Montreal'), 'Jane Hale', 65000, 'Teller');


	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC') , '600 Cathcart Street, Montreal',true , true);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '600 Cathcart Street, Montreal'), 'Toni Kroos', 140000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '600 Cathcart Street, Montreal'), 'James Rodriguez', 80000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '600 Cathcart Street, Montreal'), 'Francis Underwood', 75000, 'Teller');


	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC') , '1155 Rene-Levesque Boulevard, Montreal',true , true);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1155 Rene-Levesque Boulevard, Montreal'), 'Gareth Bale', 150000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1155 Rene-Levesque Boulevard, Montreal'), 'Peter Crouch', 90000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1155 Rene-Levesque Boulevard, Montreal'), 'Eden Hazard', 75000, 'Teller');


	
	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC'), (SELECT id FROM user where name = 'Lionel Messi'), 14562300, 'CA12345', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Savings', intRate = 4
 		WHERE accountNum = 'CA12345';
 	

	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC'), (SELECT id FROM user where name = 'Antoine Griezmann'), 144562300, 'CA67890', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Checking', debPerMonth = 10
 		WHERE accountNum = 'CA67890';
 	

	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC'), (SELECT id FROM user where name = 'Cristiano Ronaldo'), 944462300, 'CA54321', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Mortgage', loanPeriod = 'Start : 2014/10/18 End : 2020/10/18'
 		WHERE accountNum = 'CA54321';
 	

	
	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC'), (SELECT id FROM account where accountNum = 'CA12345'), 544,  false, 'FC Barcelona');

	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC'), (SELECT id FROM account where accountNum = 'CA67890'), 100,  true, 'Coca-Cola');

	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'CIBC'), (SELECT id FROM account where accountNum = 'CA54321'), 400,  false, 'McDonalds');


INSERT INTO bank (id, name, country) VALUES(UUID(), 'TD', 'Canada');
	
	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD') , '2001 Robert Bourrassa Boulevard, Montreal',false , true);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '2001 Robert Bourrassa Boulevard, Montreal'), 'Claire Underwood', 165000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '2001 Robert Bourrassa Boulevard, Montreal'), 'Dani Carvajal', 100000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '2001 Robert Bourrassa Boulevard, Montreal'), 'Jon Snow', 65000, 'Teller');


	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD') , '1130 Sherbrooke Street, Montreal',true , false);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1130 Sherbrooke Street, Montreal'), 'Walter White', 265000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1130 Sherbrooke Street, Montreal'), 'Jesse Pinkman', 90000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1130 Sherbrooke Street, Montreal'), 'Gustavo Fring', 60000, 'Teller');


	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD') , '1009 Maisonneuve Boulevard, Montreal',true , true);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1009 Maisonneuve Boulevard, Montreal'), 'Sergio Aguero', 145000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1009 Maisonneuve Boulevard, Montreal'), 'Mohamed Salah', 100000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1009 Maisonneuve Boulevard, Montreal'), 'Leroy Sane', 65000, 'Teller');


	
	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD'), (SELECT id FROM user where name = 'Karim Benzema'), 7979651, 'CA23456', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Savings', intRate = 6
 		WHERE accountNum = 'CA23456';
 	

	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD'), (SELECT id FROM user where name = 'Doug Stamper'), 5654, 'CA34567', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Checking', debPerMonth = 25
 		WHERE accountNum = 'CA34567';
 	

	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD'), (SELECT id FROM user where name = 'Annette Shepherd'), 12000, 'CA45678', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Mortgage', loanPeriod = 'Start : 2010/05/09 End : 2030/05/10'
 		WHERE accountNum = 'CA45678';
 	

	
	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD'), (SELECT id FROM account where accountNum = 'CA23456'), 39,  true, 'DHL');

	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD'), (SELECT id FROM account where accountNum = 'CA34567'), 64,  true, 'McGill University');

	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'TD'), (SELECT id FROM account where accountNum = 'CA45678'), 700,  true, 'Boston Celtics');


INSERT INTO bank (id, name, country) VALUES(UUID(), 'Scotia Bank', 'Canada');
	
	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank') , '601 Sainte-Catherine Avenue, Montreal',false , true);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '601 Sainte-Catherine Avenue, Montreal'), 'Kevin De Bruyne', 200000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '601 Sainte-Catherine Avenue, Montreal'), 'David Silva', 80000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '601 Sainte-Catherine Avenue, Montreal'), 'Olivier Giroud', 68000, 'Teller');


	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank') , '1130 Saint-Denis Street, Montreal',false , true);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1130 Saint-Denis Street, Montreal'), 'Robert Lewandowski', 300000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1130 Saint-Denis Street, Montreal'), 'Arjen Robben', 120000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1130 Saint-Denis Street, Montreal'), 'Kingsley Coman', 64000, 'Teller');


	INSERT INTO branch (id, bankID, address, hasVault, hasBooth) 
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank') , '1009 Saint-Dominique Street, Montreal',true , false);
	
INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1009 Saint-Dominique Street, Montreal'), 'Cristian Stuani', 250000, 'Manager');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1009 Saint-Dominique Street, Montreal'), 'Pablo Maffeo', 110000, 'Teller');

INSERT INTO employee(id, branchID, name, salary, currentRole)
VALUES (UUID(), (SELECT id FROM branch WHERE address= '1009 Saint-Dominique Street, Montreal'), 'Alex Telles', 120000, 'Teller');


	
	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank'), (SELECT id FROM user where name = 'Will Byers'), 3546, 'CA78901', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Savings', intRate = 1
 		WHERE accountNum = 'CA78901';
 	

	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank'), (SELECT id FROM user where name = 'Paco Alcacer'), 12000, 'CA89012', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Checking', debPerMonth = 10
 		WHERE accountNum = 'CA89012';
 	

	INSERT INTO account (id, bankID, userID, balance, accountNum, mfaType)
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank'), (SELECT id FROM user where name = 'James Dean'), 35000, 'CA90123', 'Telephone+PIN');
 	
 		UPDATE account
 		SET type = 'Mortgage', loanPeriod = 'Start : 2000/05/09 End : 2018/12/10'
 		WHERE accountNum = 'CA90123';
 	

	
	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank'), (SELECT id FROM account where accountNum = 'CA78901'), 64,  true, '7/11');

	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank'), (SELECT id FROM account where accountNum = 'CA89012'), 6454,  true, 'Intel');

	INSERT INTO transaction (id, bankID, accountID, amount, debit, vendorName)
	VALUES(UUID(), (SELECT id FROM bank where name = 'Scotia Bank'), (SELECT id FROM account where accountNum = 'CA90123'), 70555,  true, 'Huawei');

		
	