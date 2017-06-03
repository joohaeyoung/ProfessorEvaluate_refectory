package com.example.haeyoungjoo.hackerthon.NameChecker;

import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

/**
 * Created by hae young Joo on 2017-06-03.
 */

public class JTH extends AbstractProfessorName{
    public JTH( ) {

        NAME = "조태훈";
        URL = "jth";
        Averages = new Vector<Integer>();

        lectures.put(R.id.jth_c,"jth_c");
        lectures.put(R.id.jth_computervision,"jth_computervision");


        lectureName.addElement("jth_c");
        lectureName.addElement("jth_computervision");


    }

    @Override
    public int getView(){
        return R.layout.jth;
    }

    @Override
    public Vector<Integer> ratingBarControl(){

        Averages.addElement((R.id.jth_c_Average) );
        Averages.addElement((R.id.jth_computervision_Average) );

        return Averages;

    }

    public Map getLecture(){
        return lectures;
    }
    public String getCall(){
        return PhoneNumber.조태훈.getphoneNumber();
    }
    public String getEmail(){
        return EmailAddress.조태훈.getEmail();
    }

}
