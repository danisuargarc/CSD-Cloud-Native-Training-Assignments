"use strict";
/**
 * 1. Declare a constant & confirm its value cannot be changed.
 */
const var1 = 0;
//throws "Cannot assign to 'x' because it is a constant."
//x = 10;
/**
 * 2. Declare a variable inside if condition & make sure that it is not
 * accessible outside if condition.
 */
if (true) {
    let var2 = 0;
}
//throws "Cannot find name 'var2'."
//var2 = 1;
/**
 * 3. Create an 'Order' object having data members 'id', 'title', 'price'.
 * Add the methods printOrder() & getPrice(). Now, copy the order object
 * using Object.assign().
 */
let order = {
    id: 1,
    title: "Starbucks Drink",
    price: 4.10,
    printOrder: function () {
        console.log(`${this.id}, ${this.title}, ${this.price}`);
    },
    getPrice: function () {
        return this.price;
    }
};
let orderCopy = Object.assign({}, order);
/**
 * 4. Take an array of strings & convert it into another array of object
 * which has two properties {string, string_length}. For example:
 *
 * let names = ['Tom', 'Ivan', 'Jerry']
 *
 * Output: [{name: 'Tom', length: 3},
 * {name: 'Ivan', length: 4},
 * {name: 'Jerry', length: 5}]
 */
let names = ['Tom', 'Ivan', 'Jerry'];
let output = [];
names.forEach(name => output.push({ "name": name, "length": name.length }));
/**
 * 5.
 * a. Write a add() with default values.
 *
 * b. Write a function userFriend() that takes 2 arguments username & array
 * of user friends. The function should print username & his list of
 * friends. (Use rest parameters)
 *
 * c. Write a function printCapitalNames() that takes five names as
 * argument & prints them in capital letter. Use spread operator in order
 * to call printCapitalNames() function.
 */
let add = function (a = 10, b = 20) {
    return a + b;
};
let userFriend = function (username, ...friends) {
    console.log(username);
    for (let friend of friends) {
        console.log(friend);
    }
};
let printCapitalNames = function (...fiveNames) {
    for (let name of fiveNames) {
        console.log(name);
    }
};
let fiveNames = ['Rachel', 'Monica', 'Phoebe', 'Chandler', 'Joey'];
//printCapitalNames(...fiveNames);
/**
 * 6. Draft a ticket to Sysnet that describes problem with your laptop. Use
 * 'template literals' to add value of laptop model, your desk no, your
 * name etc.
 */
let laptopModel = "HP EliteBook 840";
let deskNo = 13;
let myName = "Daniel Garcia";
let ticket = `Name: ${myName}\nDesk: ${deskNo}\nLaptop Model: ${laptopModel}\nDescription: This laptop doesn't write code for me so I want a new one.`;
/**
 * 7.
 * a. Suppose there is a javascript array with 4 elements. Print the value
 * of 3rd element using array matching.
 *
 * b. Create an organization object having attributes name, address. Write
 * a program to retrieve pin code of an address using object deep matching.
 */
let printThirdElement = function (...elements) {
    for (let x = 0; x < elements.length; x++) {
        if (elements[x] === elements[2]) {
            console.log(elements[x]);
        }
    }
};
let organization = {
    name: "Capgemini Atlanta",
    address: {
        street: "3475 Piedmont Rd NE #1400",
        city: "Atlanta",
        state: "GA",
        zipcode: 30305
    }
};
let retrievePin = function (org) {
    return org.address.zipcode;
};
/**
 * 8. Write a class Account with attributes id, name, balance. Add two sub
 * class SavingAccount & CurrentAccount having specific attribute interest
 * & cash_credit respectively. Create multiple saving & current account
 * objects. Write a functionality to find out total balance in the bank.
 */
class Account {
    constructor(accID, ownerName, balance) {
        this.accID = accID;
        this.ownerName = ownerName;
        this.balance = balance;
        Account.allBalances.push(balance);
    }
    static totalBalance() {
        return Account.allBalances.reduce((a, b) => a + b, 0);
    }
}
Account.allBalances = [0];
class SavingAccount extends Account {
    constructor(accID, ownerName, balance, interest) {
        super(accID, ownerName, balance);
        this.interest = interest;
    }
}
class CurrentAccount extends Account {
    constructor(accID, ownerName, balance, cash_credit) {
        super(accID, ownerName, balance);
        this.cash_credit = cash_credit;
    }
}
let sav1 = new SavingAccount(1, "Daniel", 29, .05);
let sav2 = new SavingAccount(2, "Joel", 21, .10);
let sav3 = new SavingAccount(3, "Nataly", 15, .15);
let curr1 = new CurrentAccount(4, "Liz", 13, 20);
let curr2 = new CurrentAccount(5, "Maya", 22, 25);
let totalBalanceInBank = Account.totalBalance();
