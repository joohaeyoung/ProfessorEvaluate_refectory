package com.example.haeyoungjoo.hackerthon.NameChecker;

/**
 * Created by hae young Joo on 2017-06-02.
 */

public enum PhoneNumber {

    최영규("tel:(+82)0415601353"),
    정구철("tel:(+82)0415601181"),
    장경식("tel:(+82)0415601352"),
    김윤상("tel:(+82)0415601496"),
    이재협("tel:(+82)0415601184"),
    윤한경("tel:(+82)0415601182"),
    한연희("tel:(+82)0415601486"),
    조재수("tel:(+82)0415601491"),
    주영복("tel:(+82)01048207038"),
    조태훈("tel:(+82)0415601351"),
    이강환("tel:(+82)0415601356"),
    강승우("tel:(+82)0415601406"),
    kekcall("tel:(+82)0415601350"),
    김상진("tel:(+82)0415601350"),
    김상연("tel:(+82)0415601484"),
    김원태("tel:(+82)0415601485"),
    권오영("tel:(+82)0415601354"),
    민준기("tel:(+82)0415601494"),
    무하마드("tel:(+82)0415601483"),
    문일영("tel:(+82)0415601493");

    private String number;

    PhoneNumber(String number) {
        this.number = number;
    }

    public String getphoneNumber() {
        return this.number;
    }

}
