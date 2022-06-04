package nitro.quanlyluong;

/**
 *
 * @author Admin
 */
class CanBoHopDong extends NhanVien {

    public CanBoHopDong(double luongHopDong, String tenNhanVien) {
        super(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }
    private double luongHopDong;

    public double getLuongHopDong() {
        return luongHopDong;
    }

    public void setLuongHopDong(double luongHopDong) {
        this.luongHopDong = luongHopDong;
    }
    public double tinhLuong() {
    return luongHopDong;
    }
    public void inThongTin() {
        System.out.println(getTenNhanVien());
        System.out.println(luongHopDong);
    }

}
