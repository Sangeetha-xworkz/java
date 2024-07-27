package com.xworkz.billappln.dao;
import com.xworkz.billappln.dto.BillDto;

public class BillDao {
    BillDto ref;

    public boolean createBill(BillDto ref){
        boolean isBillCreated=false;
        boolean isBillIdGiven=false;
        boolean isBillIssueDate=false;
        boolean isBillDueDate=false;
        boolean isBillPaidd=false;
        boolean isLatestBilll=false;
        if(ref!=null){
            if (ref.billId>0)
                isBillIdGiven=true;
            else System.out.println("Bill Id con't be Zero");
            if (ref.billIssueDate!=null)
                isBillIssueDate=true;
            else System.out.println("Bill Issue Date Can not be null");
            if (ref.billDueDate!=null)
                isBillDueDate=true;
            else System.out.println("Bill Due con't be null");
            if (ref.isLatestBill!=false)
                isLatestBilll=true;
            else System.out.println("Provide Correct answer");
            if (ref.isBillPaid!=false)
                isBillPaidd=true;
            else System.out.println("Provide yes or no");
        }else {
            System.out.println("given data is invalid......");
        }

        if (isBillIdGiven==true&&isBillIssueDate==true&&isBillDueDate==true&&isBillPaidd==true&&isLatestBilll==true){
            this.ref=ref;
            isBillCreated=true;
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
