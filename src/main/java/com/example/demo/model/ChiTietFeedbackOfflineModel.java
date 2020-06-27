package com.example.demo.model;

import com.example.demo.entity.ChiTietFeedback;

public class ChiTietFeedbackOfflineModel {
    private String ctCauHoi1;
    private String ctCauHoi2;
    private Integer ctCauHoi3;
    private Integer ctCauHoi4;
    private Integer ctCauHoi5;
    private Integer ctCauHoi6;
    private Integer ctCauHoi7;
    private Integer ctCauHoi8;
    private Integer ctCauHoi9;
    private Integer ctCauHoi10;
    private Integer ctCauHoi11;
    private Integer ctCauHoi12;
    private Integer ctCauHoi13;
    private Integer ctCauHoi14;
    private Boolean ctCauHoi15;

    public ChiTietFeedbackOfflineModel() {
    }

    public static ChiTietFeedbackOfflineModel toChiTietFeedbackOfflineModel(ChiTietFeedback ct){
        ChiTietFeedbackOfflineModel model = new ChiTietFeedbackOfflineModel();
        // 2 Text
        model.setCtCauHoi1(ct.getCtText1());
        model.setCtCauHoi2(ct.getCtText2());
        // 12 int
        model.setCtCauHoi3(ct.getCtInt1());
        model.setCtCauHoi4(ct.getCtInt2());
        model.setCtCauHoi5(ct.getCtInt3());
        model.setCtCauHoi6(ct.getCtInt4());
        model.setCtCauHoi7(ct.getCtInt5());
        model.setCtCauHoi8(ct.getCtInt6());
        model.setCtCauHoi9(ct.getCtInt7());
        model.setCtCauHoi10(ct.getCtInt8());
        model.setCtCauHoi11(ct.getCtInt9());
        model.setCtCauHoi12(ct.getCtInt10());
        model.setCtCauHoi13(ct.getCtInt11());
        model.setCtCauHoi14(ct.getCtInt12());
        // 1 bool
        model.setCtCauHoi15(ct.getCtBool());

        return model;
    }

    public static ChiTietFeedback toChiTietFeedback(ChiTietFeedbackOfflineModel model){
        ChiTietFeedback ct = new ChiTietFeedback();
        // 2 text
        ct.setCtText1(model.ctCauHoi1);
        ct.setCtText2(model.ctCauHoi2);
        // 12 int
        ct.setCtInt1(model.ctCauHoi3);
        ct.setCtInt2(model.ctCauHoi4);
        ct.setCtInt3(model.ctCauHoi5);
        ct.setCtInt4(model.ctCauHoi6);
        ct.setCtInt5(model.ctCauHoi7);
        ct.setCtInt6(model.ctCauHoi8);
        ct.setCtInt7(model.ctCauHoi9);
        ct.setCtInt8(model.ctCauHoi10);
        ct.setCtInt9(model.ctCauHoi11);
        ct.setCtInt10(model.ctCauHoi12);
        ct.setCtInt11(model.ctCauHoi13);
        ct.setCtInt12(model.ctCauHoi14);
        // 1 bool
        ct.setCtBool(model.ctCauHoi15);

        return ct;
    }


    public String getCtCauHoi1() {
        return ctCauHoi1;
    }

    public void setCtCauHoi1(String ctCauHoi1) {
        this.ctCauHoi1 = ctCauHoi1;
    }

    public String getCtCauHoi2() {
        return ctCauHoi2;
    }

    public void setCtCauHoi2(String ctCauHoi2) {
        this.ctCauHoi2 = ctCauHoi2;
    }

    public Integer getCtCauHoi3() {
        return ctCauHoi3;
    }

    public void setCtCauHoi3(Integer ctCauHoi3) {
        this.ctCauHoi3 = ctCauHoi3;
    }

    public Integer getCtCauHoi4() {
        return ctCauHoi4;
    }

    public void setCtCauHoi4(Integer ctCauHoi4) {
        this.ctCauHoi4 = ctCauHoi4;
    }

    public Integer getCtCauHoi5() {
        return ctCauHoi5;
    }

    public void setCtCauHoi5(Integer ctCauHoi5) {
        this.ctCauHoi5 = ctCauHoi5;
    }

    public Integer getCtCauHoi6() {
        return ctCauHoi6;
    }

    public void setCtCauHoi6(Integer ctCauHoi6) {
        this.ctCauHoi6 = ctCauHoi6;
    }

    public Integer getCtCauHoi7() {
        return ctCauHoi7;
    }

    public void setCtCauHoi7(Integer ctCauHoi7) {
        this.ctCauHoi7 = ctCauHoi7;
    }

    public Integer getCtCauHoi8() {
        return ctCauHoi8;
    }

    public void setCtCauHoi8(Integer ctCauHoi8) {
        this.ctCauHoi8 = ctCauHoi8;
    }

    public Integer getCtCauHoi9() {
        return ctCauHoi9;
    }

    public void setCtCauHoi9(Integer ctCauHoi9) {
        this.ctCauHoi9 = ctCauHoi9;
    }

    public Integer getCtCauHoi10() {
        return ctCauHoi10;
    }

    public void setCtCauHoi10(Integer ctCauHoi10) {
        this.ctCauHoi10 = ctCauHoi10;
    }

    public Integer getCtCauHoi11() {
        return ctCauHoi11;
    }

    public void setCtCauHoi11(Integer ctCauHoi11) {
        this.ctCauHoi11 = ctCauHoi11;
    }

    public Integer getCtCauHoi12() {
        return ctCauHoi12;
    }

    public void setCtCauHoi12(Integer ctCauHoi12) {
        this.ctCauHoi12 = ctCauHoi12;
    }

    public Integer getCtCauHoi13() {
        return ctCauHoi13;
    }

    public void setCtCauHoi13(Integer ctCauHoi13) {
        this.ctCauHoi13 = ctCauHoi13;
    }

    public Integer getCtCauHoi14() {
        return ctCauHoi14;
    }

    public void setCtCauHoi14(Integer ctCauHoi14) {
        this.ctCauHoi14 = ctCauHoi14;
    }

    public Boolean getCtCauHoi15() {
        return ctCauHoi15;
    }

    public void setCtCauHoi15(Boolean ctCauHoi15) {
        this.ctCauHoi15 = ctCauHoi15;
    }

    @Override
    public String toString() {
        return "ChiTietFeedbackOfflineModel{" +
                "ctCauHoi1='" + ctCauHoi1 + '\'' +
                ", ctCauHoi2='" + ctCauHoi2 + '\'' +
                ", ctCauHoi3=" + ctCauHoi3 +
                ", ctCauHoi4=" + ctCauHoi4 +
                ", ctCauHoi5=" + ctCauHoi5 +
                ", ctCauHoi6=" + ctCauHoi6 +
                ", ctCauHoi7=" + ctCauHoi7 +
                ", ctCauHoi8=" + ctCauHoi8 +
                ", ctCauHoi9=" + ctCauHoi9 +
                ", ctCauHoi10=" + ctCauHoi10 +
                ", ctCauHoi11=" + ctCauHoi11 +
                ", ctCauHoi12=" + ctCauHoi12 +
                ", ctCauHoi13=" + ctCauHoi13 +
                ", ctCauHoi14=" + ctCauHoi14 +
                ", ctCauHoi15=" + ctCauHoi15 +
                '}';
    }
}
