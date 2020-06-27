package com.example.demo.model;

import com.example.demo.entity.TaiKhoan;

public class TaiKhoanModel {
    private String email;
    private String tkRole;
    private String tkDiaChi;
    private String tkGioiTinh;
    private String tkHovaTen;
    private String tkSdt;
    private String tkTrangThai;

    public TaiKhoanModel(){}

    public static TaiKhoanModel toTaiKhoanModel(TaiKhoan taiKhoan){
        TaiKhoanModel model = new TaiKhoanModel();
        model.setEmail(taiKhoan.getEmail());
        model.setTkDiaChi(taiKhoan.getTkDiaChi());
        model.setTkGioiTinh(taiKhoan.getTkGioiTinh());
        model.setTkHovaTen(taiKhoan.getTkHovaTen());
        model.setTkSdt(taiKhoan.getTkSdt());
        model.setTkTrangThai(taiKhoan.getTkTrangThai());
        model.setTkRole(taiKhoan.getUserRole().getUrRole());

        return model;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTkRole() {
        return tkRole;
    }

    public void setTkRole(String tkRole) {
        this.tkRole = tkRole;
    }

    public String getTkDiaChi() {
        return tkDiaChi;
    }

    public void setTkDiaChi(String tkDiaChi) {
        this.tkDiaChi = tkDiaChi;
    }

    public String getTkGioiTinh() {
        return tkGioiTinh;
    }

    public void setTkGioiTinh(String tkGioiTinh) {
        this.tkGioiTinh = tkGioiTinh;
    }

    public String getTkHovaTen() {
        return tkHovaTen;
    }

    public void setTkHovaTen(String tkHovaTen) {
        this.tkHovaTen = tkHovaTen;
    }

    public String getTkSdt() {
        return tkSdt;
    }

    public void setTkSdt(String tkSdt) {
        this.tkSdt = tkSdt;
    }

    public String getTkTrangThai() {
        return tkTrangThai;
    }

    public void setTkTrangThai(String tkTrangThai) {
        this.tkTrangThai = tkTrangThai;
    }

    @Override
    public String toString() {
        return "TaiKhoanModel{" +
                "email='" + email + '\'' +
                ", tkRole='" + tkRole + '\'' +
                ", tkDiaChi='" + tkDiaChi + '\'' +
                ", tkGioiTinh='" + tkGioiTinh + '\'' +
                ", tkHovaTen='" + tkHovaTen + '\'' +
                ", tkSdt='" + tkSdt + '\'' +
                ", tkTrangThai='" + tkTrangThai + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaiKhoanModel model = (TaiKhoanModel) o;

        if (!email.equals(model.email)) return false;
        if (!tkRole.equals(model.tkRole)) return false;
        if (!tkDiaChi.equals(model.tkDiaChi)) return false;
        if (!tkGioiTinh.equals(model.tkGioiTinh)) return false;
        if (!tkHovaTen.equals(model.tkHovaTen)) return false;
        if (!tkSdt.equals(model.tkSdt)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + tkRole.hashCode();
        result = 31 * result + tkDiaChi.hashCode();
        result = 31 * result + tkGioiTinh.hashCode();
        result = 31 * result + tkHovaTen.hashCode();
        result = 31 * result + tkSdt.hashCode();
        result = 31 * result + tkTrangThai.hashCode();
        return result;
    }
}
