package com.example.demo.entity;
// Generated May 25, 2020 7:40:23 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DanhSachLopHoc generated by hbm2java
 */
@Entity
@Table(name = "danh_sach_lop_hoc", catalog = "db_fb")
public class DanhSachLopHoc implements java.io.Serializable {

	private Integer dslhMa;
	private LopHoc lopHoc;
	private TaiKhoan taiKhoan;

	public DanhSachLopHoc() {
	}

	public DanhSachLopHoc(LopHoc lopHoc, TaiKhoan taiKhoan) {
		this.lopHoc = lopHoc;
		this.taiKhoan = taiKhoan;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "dslh_ma", unique = true, nullable = false)
	public Integer getDslhMa() {
		return this.dslhMa;
	}

	public void setDslhMa(Integer dslhMa) {
		this.dslhMa = dslhMa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lh_ma")
	public LopHoc getLopHoc() {
		return this.lopHoc;
	}

	public void setLopHoc(LopHoc lopHoc) {
		this.lopHoc = lopHoc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "email")
	public TaiKhoan getTaiKhoan() {
		return this.taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

}
