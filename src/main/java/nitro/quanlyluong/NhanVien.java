package nitro.quanlyluong;

/**
 *
 * @author Admin
 */
abstract class NhanVien {
    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    private String tenNhanVien;

    
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    abstract double tinhLuong();
    abstract void inThongTin();
    
}

