package com.example.haeyoungjoo.hackerthon.NameChecker;


import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

public class JGC extends AbstractProfessorName {

    public JGC() {


        NAME = "정구철";
        URL = "jgc";
        Averages = new Vector<Integer>();
        lectures.put(R.id.jgc_computerEngineerBasic,"jgc_computerEngineerBasic");
        lectures.put(R.id.jgc_C,"jgc_C");

        lectureName.addElement("jgc_computerEngineerBasic");
        lectureName.addElement("jgc_C");


    }
    @Override
    public int getView(){
        return R.layout.jgc;
    }

    @Override
    public Vector<Integer> ratingBarControl(){

        Averages.addElement((R.id.jgc_C_Average));
        Averages.addElement((R.id.jgc_computerEngineerBasic_Average) );
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
