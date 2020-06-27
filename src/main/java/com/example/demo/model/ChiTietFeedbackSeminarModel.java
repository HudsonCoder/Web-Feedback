package com.example.demo.model;

import com.example.demo.entity.ChiTietFeedback;

public class ChiTietFeedbackSeminarModel {
    private String ctCauHoi1;
    private String ctCauHoi2;
    private String ctCauHoi3;
    private String ctCauHoi4;
    private String ctCauHoi5;
    private Integer ctCauHoi6;
    private Integer ctCauHoi7;
    private Integer ctCauHoi8;
    private Integer ctCauHoi9;
    private Integer ctCauHoi10;
    private Integer ctCauHoi11;
    private Integer ctCauHoi12;

    public ChiTietFeedbackSeminarModel(){}

    public static ChiTietFeedbackSeminarModel toChiTietFeedbackSeminarModel(ChiTietFeedback ct) {
        ChiTietFeedbackSeminarModel model = new ChiTietFeedbackSeminarModel();
        // 5 text
        model.setCtCauHoi1(ct.getCtText1());
        model.setCtCauHoi2(ct.getCtText2());
        model.setCtCauHoi3(ct.getCtText3());
        model.setCtCauHoi4(ct.getCtText4());
        model.setCtCauHoi5(ct.getCtText5());
        // 7 int
        model.setCtCauHoi6(ct.getCtInt1());
        model.setCtCauHoi7(ct.getCtInt2());
        model.setCtCauHoi8(ct.getCtInt3());
        model.setCtCauHoi9(ct.getCtInt4());
        model.setCtCauHoi10(ct.getCtInt5());
        model.setCtCauHoi11(ct.getCtInt6());
        model.setCtCauHoi12(ct.getCtInt7());

        return model;
    }

    public static ChiTietFeedback toChiTietFeedback(ChiTietFeedbackSeminarModel model){
        ChiTietFeedback ct = new ChiTietFeedback();
        // 5 text
        ct.setCtText1(model.ctCauHoi1);
        ct.setCtText2(model.ctCauHoi2);
        ct.setCtText3(model.ctCauHoi3);
        ct.setCtText4(model.ctCauHoi4);
        ct.setCtText5(model.ctCauHoi5);
        // 7 int
        ct.setCtInt1(model.ctCauHoi6);
        ct.setCtInt2(model.ctCauHoi7);
        ct.setCtInt3(model.ctCauHoi8);
        ct.setCtInt4(model.ctCauHoi9);
        ct.setCtInt5(model.ctCauHoi10);
        ct.setCtInt6(model.ctCauHoi11);
        ct.setCtInt7(model.ctCauHoi12);

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

    public String getCtCauHoi3() {
        return ctCauHoi3;
    }

    public void setCtCauHoi3(String ctCauHoi3) {
        this.ctCauHoi3 = ctCauHoi3;
    }

    public String getCtCauHoi4() {
        return ctCauHoi4;
    }

    public void setCtCauHoi4(String ctCauHoi4) {
        this.ctCauHoi4 = ctCauHoi4;
    }

    public String getCtCauHoi5() {
        return ctCauHoi5;
    }

    public void setCtCauHoi5(String ctCauHoi5) {
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

    @Override
    public String toString() {
        return "ChiTietFeedbackSeminarModel{" +
                "ctCauHoi1='" + ctCauHoi1 + '\'' +
                ", ctCauHoi2='" + ctCauHoi2 + '\'' +
                ", ctCauHoi3='" + ctCauHoi3 + '\'' +
                ", ctCauHoi4='" + ctCauHoi4 + '\'' +
                ", ctCauHoi5='" + ctCauHoi5 + '\'' +
                ", ctCauHoi6=" + ctCauHoi6 +
                ", ctCauHoi7=" + ctCauHoi7 +
                ", ctCauHoi8=" + ctCauHoi8 +
                ", ctCauHoi9=" + ctCauHoi9 +
                ", ctCauHoi10=" + ctCauHoi10 +
                ", ctCauHoi11=" + ctCauHoi11 +
                ", ctCauHoi12=" + ctCauHoi12 +
                '}';
    }
}
