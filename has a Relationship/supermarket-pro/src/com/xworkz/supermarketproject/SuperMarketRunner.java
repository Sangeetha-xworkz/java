package com.xworkz.supermarketproject;

import com.xworkz.supermarketproject.supermarket.SuperMarket;
import com.xworkz.supermarketproject.workers.Workers;

public class SuperMarketRunner {
    public static void main(String[] args) {
        SuperMarket superMarket=new SuperMarket();
        superMarket.superMarketName="More";

        Workers workers=new Workers();
        workers.workerId=1;
        workers.workerSection="Cashier";
        workers.workingHrs="12hrs";
        workers.salary=10000.00;

        superMarket.allow(workers);
    }
}
