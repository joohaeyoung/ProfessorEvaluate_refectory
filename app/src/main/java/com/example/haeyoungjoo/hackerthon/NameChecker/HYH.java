package com.example.haeyoungjoo.hackerthon.NameChecker;

import android.content.Context;

import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

/**
 * Created by hae young Joo on 2017-06-03.
 */

public class HYH extends AbstractProfessorName{
    public HYH(Context context) {

        NAME = "한연희";
        URL = "hyh";
        Averages = new Vector<Integer>();

        lectures.put(R.id.hyh_network,"hyh_network");
        lectures.put(R.id.hyh_script,"hyh_script");
        lectures.put(R.id.hyh_spring,"hyh_spring");

        lectureName.addElement("hyh_network");
        lectureName.addElement("hyh_script");
        lectureName.addElement("hyh_spring");

    }

    @Override
    public int getView(){
        return R.layout.hanyunhee;
    }

    @Override
    public Vector<Integer> ratingBarControl(){

        Averages.addElement(R.id.hyh_network_Average);
        Averages.addElement(R.id.hyh_script_Average);
        Averages.addElement(R.id.hyh_spring_Average);
        return Averages;

    }

    public Map getLecture(){
        return lectures;
    }
    public String getCall(){
        return PhoneNumber.한연희.getphoneNumber();
    }
    public String getEmail(){
        return EmailAddress.한연희.getEmail();
    }
}
