package com.xworkz.socialmediaapps;

import com.xworkz.socialmediaapps.facebook.FaceBook;
import com.xworkz.socialmediaapps.instagram.Instagram;
import com.xworkz.socialmediaapps.twitter.Twitter;
import com.xworkz.socialmediaapps.whatsapp.WhatsApp;

public class SocialMediaRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        FaceBook faceBook=new FaceBook();
        faceBook.Purpose();

        Instagram instagram=new Instagram();
        instagram.Purpose();

        Twitter twitter=new Twitter();
        twitter.Purpose();

        WhatsApp whatsApp=new WhatsApp();
        whatsApp.Purpose();

        System.out.println("main ended");
    }
}
