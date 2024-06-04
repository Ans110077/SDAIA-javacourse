package day3;

import day2.Account;

public class CheckAccount extends Account {

    public CheckAccount(String name, double balance) {
        super(name, balance);
    }
    @Override
    public void withdrow(double a){
        if(getBalance()-a>=0) {
            super.withdrow(a);
}

    }
}
