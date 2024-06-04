package day3;

import day2.Account;


public class SavaingAccount extends Account {
    int limit;

    public SavaingAccount(String name, double balance, int limit) {
        super(name, balance);
        this.limit = limit;
    }

    public SavaingAccount(String name, double balance ) {
        super(name, balance);
    }
    @Override
    public void withdrow(double a){
       if(getBalance()-a>=limit) {
           super.withdrow(a);
       }
       }


    }

