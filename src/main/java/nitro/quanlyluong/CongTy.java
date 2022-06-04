package nitro.quanlyluong;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CongTy {

    public CongTy(String tenCongTy, int soNhanVien, double loiNhuan) {
        this.tenCongTy = tenCongTy;
        this.soNhanVien = soNhanVien;
        this.loiNhuan = loiNhuan;
    }

    private String tenCongTy;
    private int soNhanVien;
    private static final int SO_NV_MAX=100;
    private static double loiNhuan;
    static List<NhanVien> nv = new ArrayList<>();

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public static double getLoiNhuan() {
        return loiNhuan;
    }

    public static void setLoiNhuan(double loiNhuan) {
        CongTy.loiNhuan=loiNhuan;
    }

    public boolean themNV(NhanVien a) {
        if (soNhanVien < SO_NV_MAX) {
            nv.add(a);
            soNhanVien++;
            return true;
        } else {
            return false;
        }
    }

    public void inThongTin() {
        // in ra tenCongTy va thong tin toan bo nhan vien cong ty
        for (NhanVien str : nv) {
            str.inThongTin();
        }
    }

    public double tinhTongLuong() {
        //tra ve tong luong cua toan bo nhan vien
        double tongLuong = 0;
        for (NhanVien str : nv) {
            tongLuong = tongLuong + str.tinhLuong();
        }
        return tongLuong;
    }

}
