package nitro.quanlyluong;

/**
 *
 * @author Admin
 */
public class NewClass {
       public static void main(String[] args) {
        CongTy Doctor = new CongTy("Doctor", 0, 2000000);
        
        
      CanBoCoHuu a = new CanBoCoHuu(2, "anc");
        Doctor.themNV(a);
      TruongPhong b = new TruongPhong(3, 20, "hung");
        Doctor.themNV(b);
        Doctor.inThongTin();
        
    }
}
