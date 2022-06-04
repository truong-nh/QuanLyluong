package nitro.quanlyluong;

/**
 *
 * @author Admin
 */
class CanBoCoHuu extends NhanVien {
    private static double luongCoBan=2000000;
    private static final double LUONG_MAX=100000000;
    private double heSoLuong;
     public CanBoCoHuu(double heSoLuong, String tenNhanVien) {
        super(tenNhanVien);
        this.heSoLuong = heSoLuong;
    }
    public static double getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(double luongCoBan) {
        CanBoCoHuu.luongCoBan = luongCoBan;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    @Override
    public double tinhLuong() {
    return luongCoBan*heSoLuong;    
    }
    @Override
    public void inThongTin() {
        System.out.println("tenNhanVien"+getTenNhanVien());
        System.out.println("luong cua nhan vien:"+tinhLuong());
    }
    public boolean tangHeSoLuong(double tang) {
        tang = tang + this.heSoLuong;
        if (tinhLuong()>LUONG_MAX) {
            return false;
        } else {
            this.heSoLuong = tang;
            return true;
        }
    }
    
}
