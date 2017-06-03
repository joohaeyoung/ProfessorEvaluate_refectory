package com.example.haeyoungjoo.hackerthon.NameChecker;

import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

import static com.example.haeyoungjoo.hackerthon.R.id.cyg_datastructure;

public class CYG extends AbstractProfessorName {

    public CYG( ) {
        super();
        NAME = "최영규";
        URL = "cyg";
        Averages = new Vector<Integer>();

        lectures.put(R.id.cyg_cplusplus,"cyg_cplusplus");
        lectures.put(cyg_datastructure,"cyg_datastructure");
        lectures.put(R.id.cyg_graphic,"cyg_graphic");

        lectureName.addElement("cyg_cplusplus");
        lectureName.addElement("cyg_datastructure");
        lectureName.addElement("cyg_graphic");

    }
    @Override
    public int getView(){
        return R.layout.cyg;
    }

    @Override
    public Vector<Integer> ratingBarControl(){

        Averages.addElement(R.id.cyg_cplusplus_Average);
        Averages.addElement(R.id.cyg_datastructure_Average);
        Averages.addElement(R.id.cyg_graphic_Average);
        return Averages;
    }
    public Map getLecture(){
        return lectures;
    }
    public String getCall(){
        return PhoneNumber.최영규.getphoneNumber();
    }
    public String getEmail(){
        return EmailAddress.최영규.getEmail();
    }

}

