/**
 * 1. Create 2 promises, one generates a value of x & another generates 
 * value of y. Write a program sum of x & y. (Use Promise.all)
 */

let x = 10;
let y = 20;

const promise1 = x;
const promise2 = y;

let generate = function () {
    Promise.all([promise1, promise2]).then((values) => {
        console.log(values.reduce((a: number, b: number) => a + b, 0));
    })
}

/**
 * 2. Write a class Account with attributes id, name, balance. Add two sub
 * class SavingAccount & CurrentAccount having specific attribute interest
 * & cash_credit respectively. Create multiple saving & current account
 * objects. Write a functionality to find out total balance in the bank.
 */

class Account {
    accID: number;
    ownerName: string;
    balance: number;
    static allBalances = [0];
    constructor(accID: number, ownerName: string, balance: number) {
        this.accID = accID;
        this.ownerName = ownerName;
        this.balance = balance;
        Account.allBalances.push(balance);
    }
    static totalBalance() {
        return Account.allBalances.reduce((a: number, b: number) => a + b, 0);
    }
}

class SavingAccount extends Account {
    interest: number;
    constructor(accID: number, ownerName: string, balance: number, interest: number) {
        super(accID, ownerName, balance);
        this.interest = interest;
    }
}

class CurrentAccount extends Account {
    cash_credit: number;
    constructor(accID: number, ownerName: string, balance: number, cash_credit: number) {
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

/**
 * 3. Write an interface Printable. Create 2 objects circle & employee
 * those implement Printable interface. Write a function printAll() that
 * takes all objects as argument & invoke print() method on every object.
 */

interface Printable {
    id_num: number;
    name?: string;
    radius?: number;
};

var printMethod = function (obj: Printable) {
    console.log(obj);
}

let employee = { id_num: 202, name: "Daniel" };
let circle = { id_num: 202, radius: 10 };

var print_ = printMethod;

var printAll_ = function (objs: any) {
    objs.forEach(element => {
        console.log(element);
    });
}

//print_(<circle or employee>)
//printAll_([circle, employee])