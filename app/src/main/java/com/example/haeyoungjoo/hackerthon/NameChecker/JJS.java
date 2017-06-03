package com.example.haeyoungjoo.hackerthon.NameChecker;

import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

/**
 * Created by hae young Joo on 2017-06-03.
 */

public class JJS extends AbstractProfessorName{

    public JJS() {

        NAME = "조재수";
        URL = "jjs";
        Averages = new Vector<Integer>();

        lectures.put(R.id.jjs_cplusplus,"jjs_cplusplus");
        lectures.put(R.id.jjs_c,"jjs_c");
        lectures.put(R.id.jjs_digitalsignal,"jjs_digitalsignal");
        lectures.put(R.id.jjs_digitall,"jjs_digitall");

        lectureName.addElement("jjs_cplusplus");
        lectureName.addElement("jjs_c");
        lectureName.addElement("jjs_digitalsignal");
        lectureName.addElement("jjs_digitall");

    }

    @Override
    public int getView(){
        return R.layout.jojaesu;
    }

    @Override
    public Vector<Integer> ratingBarControl(){

        Averages.addElement((R.id.jjs_c_Average) );
        Averages.addElement((R.id.jjs_cplusplus_Average) );
        Averages.addElement((R.id.jjs_digital_Average) );
        Averages.addElement((R.id.jjs_digitalsignal_Average) );

        return Averages;

    }

    public Map getLecture(){
        return lectures;
    }
    public String getCall(){
        return PhoneNumber.조재수.getphoneNumber();
    }
    public String getEmail(){
        return EmailAddress.조재수.getEmail();
    }
}
