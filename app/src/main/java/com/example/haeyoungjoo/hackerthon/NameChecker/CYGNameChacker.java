package com.example.haeyoungjoo.hackerthon.NameChecker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

import com.example.haeyoungjoo.hackerthon.R;

import java.util.Map;
import java.util.Vector;

import static com.example.haeyoungjoo.hackerthon.R.id.cyg_datastructure;

public class CYGNameChacker extends AbstractProfessorNameChecker {

    public CYGNameChacker(Context context) {

        super(context);
        NAME = "최영규";
        URL = "cyg";
        Averages = new Vector<RatingBar>();

        lectures.put(R.id.cyg_cplusplus,"cyg_cplusplus");
        lectures.put(cyg_datastructure,"cyg_datastructure");
        lectures.put(R.id.cyg_graphic,"cyg_graphic");

        lectureName.addElement("cyg_cplusplus");
        lectureName.addElement("cyg_datastructure");
        lectureName.addElement("cyg_graphic");

    }
    @Override
    public void getView(){
        ((AppCompatActivity) vcontext).setContentView(R.layout.cyg);
    }

    @Override
    public Vector<RatingBar> ratingBarControl(){

        Averages.addElement((RatingBar)((AppCompatActivity) vcontext).findViewById(R.id.cyg_cplusplus_Average) );
        Averages.addElement((RatingBar)((AppCompatActivity) vcontext).findViewById(R.id.cyg_datastructure_Average) );
        Averages.addElement((RatingBar)((AppCompatActivity) vcontext).findViewById(R.id.cyg_graphic_Average) );
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

