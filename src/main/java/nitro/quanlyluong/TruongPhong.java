package nitro.quanlyluong;

/**
 *
 * @author Admin
 */
public class TruongPhong extends CanBoCoHuu{

    public TruongPhong(double phuCap, double heSoLuong, String tenNhanVien) {
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
    
    @Override
    public double tinhLuong() {
        return (double) (super.tinhLuong()+phuCap);
    }
    
    @Override
   public void inThongTin() {
       System.out.println("Ten truong phong:"+ getTenNhanVien());
       System.out.println("luong cua truong phong:"+tinhLuong());
       System.out.println("phu cap cua truong phong:"+phuCap);
   }
}
