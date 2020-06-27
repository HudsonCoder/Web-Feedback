package com.example.demo.model;

import com.example.demo.entity.KhoaHoc;
import com.example.demo.entity.NoiDungKhoaHoc;

public class KhoahocModel {
    private Integer khMa;
    private String khTen;
    private String khNoiDung;

    public KhoahocModel(){}

    public static KhoahocModel toKhoaHocModel(KhoaHoc khoaHoc){
        KhoahocModel model = new KhoahocModel();
        model.setKhMa(khoaHoc.getKhMa());
        model.setKhTen(khoaHoc.getKhTen());

        NoiDungKhoaHoc noiDungKhoaHoc = khoaHoc.getNoiDungKhoaHoc();
        if (noiDungKhoaHoc != null){
            model.setKhNoiDung(noiDungKhoaHoc.getNdNoiDung());
        }

        return model;
    }

    public String getKhNoiDung() {
        return khNoiDung;
    }

    public void setKhNoiDung(String khNoiDung) {
        this.khNoiDung = khNoiDung;
    }

    public Integer getKhMa() {
        return khMa;
    }

    public void setKhMa(Integer khMa) {
        this.khMa = khMa;
    }

    public String getKhTen() {
        return khTen;
    }

    public void setKhTen(String khTen) {
        this.khTen = khTen;
    }

    @Override
    public String toString() {
        return "KhoahocModel{" +
                "khMa=" + khMa +
                ", khTen='" + khTen + '\'' +
                ", khNoiDung='" + khNoiDung + '\'' +
                '}';
    }
}
