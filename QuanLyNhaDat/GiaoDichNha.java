package QuanLyNhaDat;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha; // "cao cấp" hoặc "thường"
    private String diaChi;

    // Constructor gọi constructor của lớp cha
    public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    // Ghi đè phương thức tính thành tiền theo loại nhà
    @Override
    public double thanhTien() {
        if (loaiNha.equalsIgnoreCase("cao cấp")) {
            return dienTich * donGia;
        }
        return dienTich * donGia * 0.9; // Loại thường giảm còn 90%
    }

    // Ghi đè toString() bổ sung loại nhà và địa chỉ
    @Override
    public String toString() {
        return "[NHÀ] " + super.toString() + " | Loại: " + loaiNha + " | ĐC: " + diaChi;
    }
}