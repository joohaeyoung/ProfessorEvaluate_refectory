package com.example.haeyoungjoo.hackerthon.NameChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by hae young Joo on 2017-05-30.
 */

public abstract class AbstractProfessorName implements ProfessorName {

    protected String NAME;
    protected String URL;
    protected Vector<Integer> Averages;
    protected Map< Integer, String > lectures = new HashMap<>();//강의 평가 액티비티로 넘어가기 위해서 .
    Vector<String> lectureName = new Vector<>();
    public AbstractProfessorName(){
    }
    @Override
    public boolean isMatchName(String name) {
        return name.equals(NAME);
    }
    @Override
    public boolean isMatchLecture(String templecturename){

        for(String lecturename : lectureName){
            if( lecturename.compareTo(templecturename)==0 )
                return true;
        }
        return false;
    }
    @Override
    public String getUrl() {
        return "http://jhy753.dothome.co.kr/avgCalculater.php?professorName=" + URL;
    }
    public String getName(){
        return NAME;
    }

}
