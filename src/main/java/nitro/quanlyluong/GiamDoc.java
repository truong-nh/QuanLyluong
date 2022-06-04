package nitro.quanlyluong;

/**
 *
 * @author Admin
 */
public class GiamDoc extends CanBoCoHuu implements QuanLy {

    public GiamDoc(double phuCap, double heSoLuong, String tenNhanVien) {
        super(heSoLuong, tenNhanVien);
        this.phuCap = phuCap;
    }

    private double phuCap;

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double tinhHoaHong() {
        return (double) (CongTy.getLoiNhuan() * 5 / 100);
    }

    public double tinhLuong() {
        return (double) (super.tinhLuong() + phuCap + tinhHoaHong());
    }

    public void inThongTin() {
        System.out.println("ten giam doc la:" + getTenNhanVien());
        System.out.println("luong cua giam doc la: " + tinhLuong());
        System.out.println("hoa hong cua giam doc la: " + tinhHoaHong());
        System.out.println("phu cap cua giam doc la: " + phuCap);
    }

}
