package com.xworkz.billappln.dao;
import com.xworkz.billappln.dto.BillDto;

public class BillDao {
    BillDto ref;

    public boolean createBill(BillDto ref){
        boolean isBillCreated=false;
        if(ref.billId>0){
            this.ref=ref;
            isBillCreated=true;
        }else {
            System.out.println("Enter Correct Bill Id");
        }
        return isBillCreated;
    }

    public void getBillDetails(){
        System.out.println("Bill Id: "+ref.billId);
        System.out.println("Bill Issue Date: "+ref.billIssueDate);
        System.out.println("Bill Due Date: "+ref.billDueDate);
        System.out.println("Bill Paid: "+ref.isBillPaid);
        System.out.println("Bill is Latest: "+ref.isLatestBill);
    }
}
