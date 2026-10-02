package QuanLyNhaDat;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat; // Loại đất: "A", "B", hoặc "C"

    // Constructor gọi constructor của lớp cha
    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    // Ghi đè phương thức tính thành tiền theo loại đất
    @Override
    public double thanhTien() {
        if (loaiDat.equalsIgnoreCase("A")) {
            return dienTich * donGia * 1.5;
        }
        return dienTich * donGia; // Loại B và C
    }

    // Ghi đè toString() bổ sung thông tin loại đất
    @Override
    public String toString() {
        return "[ĐẤT] " + super.toString() + " | Loại: " + loaiDat;
    }
}