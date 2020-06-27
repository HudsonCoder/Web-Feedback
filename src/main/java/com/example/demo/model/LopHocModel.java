package com.example.demo.model;

import com.example.demo.entity.DanhSachLopHoc;
import com.example.demo.entity.KhoaHoc;
import com.example.demo.entity.LopHoc;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LopHocModel {
    private int maLop;
    private String tenLop;
    private int maKhoa;
    private List<String> listGV;
    private String tenKhoa;

    public LopHocModel() {
    }

    public static LopHocModel toLopHocModel(LopHoc lopHoc){
        LopHocModel model = new LopHocModel();
        model.setMaLop(lopHoc.getLhMa());
        model.setTenLop(lopHoc.getLhTen());

        Set<DanhSachLopHoc> danhSachLopHoc = lopHoc.getDanhSachLopHocs();
        if (danhSachLopHoc != null){

            List<String> names = danhSachLopHoc.stream()
                    .map(i -> i.getTaiKhoan())
                    .filter(i -> i.getUserRole().getUrRole().equals(UserModel.TEACHER))
                    .map(i -> i.getTkHovaTen())
                    .collect(Collectors.toList());

            model.setListGV(names);
        }

        KhoaHoc kh = lopHoc.getKhoaHoc();
        if (kh != null){
            model.setMaKhoa(kh.getKhMa());
            model.setTenKhoa(kh.getKhTen());
        }
        return model;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public List<String> getListGV() {
        return listGV;
    }

    public void setListGV(List<String> listGV) {
        this.listGV = listGV;
    }

    public int getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(int maKhoa) {
        this.maKhoa = maKhoa;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "LopHocModel{" +
                "maLop=" + maLop +
                ", tenLop='" + tenLop + '\'' +
                ", maKhoa=" + maKhoa +
                ", listGV=" + listGV +
                '}';
    }
}
