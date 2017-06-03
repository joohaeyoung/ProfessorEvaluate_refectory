package com.example.haeyoungjoo.hackerthon.NameChecker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

/**
 * Created by hae young Joo on 2017-05-30.
 */

public class JGSNameChacker extends AbstractProfessorNameChecker {

    public JGSNameChacker(Context context) {

        super(context);
        NAME = "장경식";
        URL = "jgs";
        Averages = new Vector<RatingBar>();
        lectures.put(R.id.jgs_embedded,"jgs_embedded");
        lectures.put(R.id.jgs_microprocessor,"jgs_microprocessor");

        lectureName.addElement("jgs_embedded");
        lectureName.addElement("jgs_microprocessor");

    }
    @Override
    public void getView(){
        ((AppCompatActivity) vcontext).setContentView(R.layout.jgs);
    }
    @Override
    public Vector<RatingBar> ratingBarControl(){
        Averages.addElement((RatingBar)((AppCompatActivity) vcontext).findViewById(R.id.jgs_embedded_Average) );
        Averages.addElement((RatingBar)((AppCompatActivity) vcontext).findViewById(R.id.jgs_microprocessor_Average) );
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
