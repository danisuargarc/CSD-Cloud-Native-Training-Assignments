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
        console.log(values.reduce((a, b) => a + b, 0));
    });
};
/**
 * 2. Write a class Account with attributes id, name, balance. Add two sub
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
;
var printMethod = function (obj) {
    console.log(obj);
};
let employee = { id_num: 202, name: "Daniel" };
let circle = { id_num: 202, radius: 10 };
var print_ = printMethod;
var printAll_ = function (objs) {
    objs.forEach(element => {
        console.log(element);
    });
};
//print_(<circle or employee>)
//printAll_([circle, employee])
