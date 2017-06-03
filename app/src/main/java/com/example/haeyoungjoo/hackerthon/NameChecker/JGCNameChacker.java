package com.example.haeyoungjoo.hackerthon.NameChecker;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

public class JGCNameChacker extends AbstractProfessorNameChecker {

    public JGCNameChacker(Context context) {

        super(context);
        NAME = "정구철";
        URL = "jgc";
        Averages = new Vector<RatingBar>();
        lectures.put(R.id.jgc_computerEngineerBasic,"jgc_computerEngineerBasic");
        lectures.put(R.id.jgc_C,"jgc_C");

        lectureName.addElement("jgc_computerEngineerBasic");
        lectureName.addElement("jgc_C");


    }
    @Override
    public void getView(){
        ((AppCompatActivity) vcontext).setContentView(R.layout.jgc);
    }

    @Override
    public Vector<RatingBar> ratingBarControl(){
        Averages.addElement((RatingBar)((AppCompatActivity) vcontext).findViewById(R.id.jgc_C_Average) );
        Averages.addElement((RatingBar)((AppCompatActivity) vcontext).findViewById(R.id.jgc_computerEngineerBasic_Average) );
        return Averages;
    }

    public Map getLecture(){
        return lectures;
    }
    public String getCall(){
        return PhoneNumber.정구철.getphoneNumber();
    }
    public String getNumber(){
        return EmailAddress.정구철.getEmail();
    }
}
