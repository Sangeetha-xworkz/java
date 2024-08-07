package com.xworkz.university;

import com.xworkz.university.banarashindu.BanarasHindhu;
import com.xworkz.university.jawaharlalneharu.JawaharlalNeharu;
import com.xworkz.university.stanford.Stanford;
import com.xworkz.university.universityy.Universityy;
import com.xworkz.university.vellore.Vellore;
import com.xworkz.university.vtu.Vtu;

public class UniversityRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        BanarasHindhu banarasHindhu=new BanarasHindhu();
        banarasHindhu.purpose();

        JawaharlalNeharu jawaharlalNeharu=new JawaharlalNeharu();
        jawaharlalNeharu.purpose();

        Stanford stanford=new Stanford();
        stanford.purpose();

        Vellore vellore=new Vellore();
        vellore.purpose();

        Vtu vtu=new Vtu();
        vtu.purpose();

        System.out.println("main ended");
    }
}
