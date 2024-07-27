package com.xworkz.billappln;
import com.xworkz.billappln.dto.BillDto;
import com.xworkz.billappln.dao.BillDao;
public class billRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        BillDto ref=new BillDto();
         ref.billId=2343;
         ref.billIssueDate="22/05/2024";
         ref.billDueDate="03/07/2024";
         ref.isBillPaid=true;
         ref.isLatestBill=true;

         BillDao bill=new BillDao();
         boolean som= bill.createBill(ref);
        System.out.println("Bill Created: "+som);

        bill.getBillDetails();
    }
}
