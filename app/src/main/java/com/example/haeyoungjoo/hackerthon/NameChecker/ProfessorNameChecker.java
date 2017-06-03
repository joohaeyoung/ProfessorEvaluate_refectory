package com.example.haeyoungjoo.hackerthon.NameChecker;

import android.widget.RatingBar;

import java.util.Map;
import java.util.Vector;

/**
 * Created by hae young Joo on 2017-05-30.
 */

public interface ProfessorNameChecker {

    public boolean isMatchName(String name);
    public boolean isMatchLecture(String lecture);//해당강의가 맞는지 체크.
    public String getUrl();
    public void getView();
    public Vector<RatingBar> ratingBarControl();
    public Map getLecture();//강의 평가를 위해서
    public String getCall();
    public String getEmail();
    public String getName();

}