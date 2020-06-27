package com.example.demo.model;

import com.example.demo.entity.ChiTietFeedback;

public class ChiTietFeedbackOnlineModel {
    private String ctCauHoi1;
    private String ctCauHoi2;
    private Integer ctCauHoi3;
    private Integer ctCauHoi4;
    private Integer ctCauHoi5;
    private Integer ctCauHoi6;
    private Boolean ctCauHoi7;

    public ChiTietFeedbackOnlineModel(){}

    public static ChiTietFeedbackOnlineModel toChiTietFeedbackOnlineModel(ChiTietFeedback ct) {
        ChiTietFeedbackOnlineModel model = new ChiTietFeedbackOnlineModel();
        // 2 text
        model.setCtCauHoi1(ct.getCtText1());
        model.setCtCauHoi2(ct.getCtText2());
        // 4 int
        model.setCtCauHoi3(ct.getCtInt1());
        model.setCtCauHoi4(ct.getCtInt2());
        model.setCtCauHoi5(ct.getCtInt3());
        model.setCtCauHoi6(ct.getCtInt4());
        // 1 bool
        model.setCtCauHoi7(ct.getCtBool());

        return model;
    }

    public static ChiTietFeedback toChiTietFeedback(ChiTietFeedbackOnlineModel model){
        ChiTietFeedback ct = new ChiTietFeedback();
        // 2 text
        ct.setCtText1(model.ctCauHoi1);
        ct.setCtText2(model.ctCauHoi2);
        // 4 int
        ct.setCtInt1(model.ctCauHoi3);
        ct.setCtInt2(model.ctCauHoi4);
        ct.setCtInt3(model.ctCauHoi5);
        ct.setCtInt4(model.ctCauHoi6);
        // 1 bool
        ct.setCtBool(model.ctCauHoi7);
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

    public Boolean getCtCauHoi7() {
        return ctCauHoi7;
    }

    public void setCtCauHoi7(Boolean ctCauHoi7) {
        this.ctCauHoi7 = ctCauHoi7;
    }

    @Override
    public String toString() {
        return "ChiTietFeedbackOnlineModel{" +
                "ctCauHoi1='" + ctCauHoi1 + '\'' +
                ", ctCauHoi2='" + ctCauHoi2 + '\'' +
                ", ctCauHoi3=" + ctCauHoi3 +
                ", ctCauHoi4=" + ctCauHoi4 +
                ", ctCauHoi5=" + ctCauHoi5 +
                ", ctCauHoi6=" + ctCauHoi6 +
                ", ctCauHoi7=" + ctCauHoi7 +
                '}';
    }
}
