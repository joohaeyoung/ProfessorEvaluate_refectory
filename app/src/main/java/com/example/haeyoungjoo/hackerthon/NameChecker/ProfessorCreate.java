package com.example.haeyoungjoo.hackerthon.NameChecker;

/**
 * Created by hae young Joo on 2017-06-03.
 */

 public  class ProfessorCreate {

    ProfessorName[] nameCheckers;

    public  void ComputerProfessor(){
        nameCheckers =new ProfessorName[]{

                new CYG(),
                new JGC(),
                new JGS()

        };
    }
}
