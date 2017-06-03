package com.example.haeyoungjoo.hackerthon.NameChecker;

/**
 * Created by hae young Joo on 2017-06-02.
 */

public enum EmailAddress {

    최영규("mailto:ykchoi@koreatech.ac.kr"),
    정구철("mailto:jeong@koreatech.ac.kr"),
    장경식("mailto:ksjang@koreatech.ac.kr"),
    김윤상("mailto:yoonsang@koreatech.ac.kr"),
    이재협("mailto:jae@koreatech.ac.kr"),
    윤한경("mailto:yhhan@koreatech.ac.kr"),
    헌연희("mailto:jaesoo27@koreatech.ac.kr"),
    조재수("mailto:ybjoo@koreatech.ac.kr"),
    주영복("mailto:ybjoo@koreatech.ac.kr"),
    조태훈("mailto:thcho@koreatech.ac.kr"),
    이강환("mailto:hjkang@koreatech.ac.kr"),
    강승우("mailto:kwlee@koreatech.ac.kr"),
    kekcall("mailto:egkim@koreatech.ac.kr"),
    김상진("mailto:sangjin@koreatech.ac.kr"),
    김상연("mailto:sykim@koreatech.ac.kr"),
    김원태("mailto:wtkim@koreatech.ac.kr"),
    권오영("mailto:oykwon@koreatech.ac.kr"),
    민준기("mailto:jkmin@koreatech.ac.kr"),
    무하마드("mailto:tariq@koreatech.ac.kr"),
    문일영("mailto:iymoon@koreatech.ac.kr");

    private String email;

    EmailAddress(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

}
