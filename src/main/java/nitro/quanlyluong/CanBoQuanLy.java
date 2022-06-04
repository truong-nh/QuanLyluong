package nitro.quanlyluong;

/**
 *
 * @author Admin
 */
public class CanBoQuanLy extends CanBoCoHuu implements QuanLy {

    public CanBoQuanLy(double heSoLuong, String tenNhanVien) {
        super(heSoLuong, tenNhanVien);
    }

    public double tinhHoaHong() {
        return (double) CongTy.getLoiNhuan()* 0.2 / 100;
    }

    public double tinhLuong() {
        return (double) (super.tinhLuong() + tinhHoaHong());

    }

    public void inThongTin() {
        System.out.println("Ten can bo quan ly la:" + getTenNhanVien());
        System.out.println("luong cua can bo quan ly la:" + tinhLuong());
        System.out.println("hoa hong cua can bo quan ly la:" + tinhHoaHong());
    }

}
