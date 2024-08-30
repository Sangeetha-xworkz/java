package com.xworkz.test;

import com.xworkz.test.hospita.Hospital;
import com.xworkz.test.hospita.SparshaHospital;
import com.xworkz.test.hospita.SsHospital;
import com.xworkz.test.patient.Patient;
import com.xworkz.test.teashop.TeaShop;

public class TeaRunner {
    public static void main(String[] args) {
        TeaShop teaShop=new TeaShop();
        teaShop.setId(1);
        teaShop.setTeaName("Lemon Tea");
        teaShop.setPrice(20.00);
        teaShop.setFlavour("Lemon");

        System.out.println("Tea Id: "+teaShop.getId());
        System.out.println("Tea Name: "+teaShop.getTeaName());
        System.out.println("Tea Price: "+teaShop.getPrice());
        System.out.println("Tea Flavour: "+teaShop.getFlavour());

        TeaShop teaShop1=new TeaShop();
        teaShop1.setId(2);
        teaShop1.setTeaName("Mint Tea");
        teaShop1.setPrice(25.00);
        teaShop1.setFlavour("mint");

        System.out.println("Tea Info: "+teaShop);
        System.out.println("Tea Info: "+teaShop1);

         teaShop=teaShop1;
        boolean isEql=teaShop1.equals(teaShop);//bec of method override Run time Polymorphism parent oblect is taking the ref of child Tea
        System.out.println(isEql);

        System.out.println("Inheritance and Polymorphism");
        Patient patient=new Patient();
        patient.id=1;
        patient.name="Sangeetha";
        patient.age=22;
        patient.bloodGroup="O+";


        //Inheritance and Polymorphism
        Hospital hospital=new SparshaHospital();
        hospital.addPatient(patient);

        //Run time polymorphism
        Hospital hospital1=new SparshaHospital();
        SparshaHospital spa=(SparshaHospital)hospital1;
        spa.fees=1000;
        hospital1.addPatient(patient);

        //method overloading compile time polymorphism
        Hospital hospital2=new SsHospital();
        hospital2.someMsg("Priya",22);

    }
}
