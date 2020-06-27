package com.example.demo.model;

import com.example.demo.entity.CauHoi;

public class CauHoiModel {
    private String noiDung;
    private int thuTu;

    public CauHoiModel(){}

    public static CauHoiModel toCauHoiModel(CauHoi cauHoi){
        CauHoiModel model = new CauHoiModel();
        model.setNoiDung(cauHoi.getChNoiDung());
        model.setThuTu(cauHoi.getChThuTu());
        return model;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getThuTu() {
        return thuTu;
    }

    public void setThuTu(int thuTu) {
        this.thuTu = thuTu;
    }

    @Override
    public String toString() {
        return "CauHoiModel{" +
                "noiDung='" + noiDung + '\'' +
                ", thuTu=" + thuTu +
                '}';
    }
}
