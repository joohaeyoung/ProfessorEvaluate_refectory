package com.example.haeyoungjoo.hackerthon.NameChecker;

import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

/**
 * Created by hae young Joo on 2017-05-30.
 */

public class JGS extends AbstractProfessorName {

    public JGS( ) {


        NAME = "장경식";
        URL = "jgs";
        Averages = new Vector<Integer>();
        lectures.put(R.id.jgs_embedded,"jgs_embedded");
        lectures.put(R.id.jgs_microprocessor,"jgs_microprocessor");
        lectureName.addElement("jgs_embedded");
        lectureName.addElement("jgs_microprocessor");

    }
    @Override
    public int getView(){
        return R.layout.jgs;
    }

    @Override
    public Vector<Integer> ratingBarControl(){

        Averages.addElement((R.id.jgs_embedded_Average) );
        Averages.addElement((R.id.jgs_microprocessor_Average) );
        return Averages;

    }

    public Map getLecture(){
        return lectures;
    }
    public String getCall(){
        return PhoneNumber.장경식.getphoneNumber();
    }
    public String getEmail(){
        return EmailAddress.장경식.getEmail();
    }


}
