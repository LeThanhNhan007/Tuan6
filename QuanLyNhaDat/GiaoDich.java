package QuanLyNhaDat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiaoDich {
    protected String maGiaoDich;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected double dienTich;

    // Constructor khởi tạo thông tin giao dịch
    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    // Phương thức trừu tượng - Lớp con bắt buộc phải override
    public abstract double thanhTien();

    // Các phương thức Getter cần thiết
    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    // Ghi đè toString() để định dạng chuỗi in ra màn hình
    @Override
    public String toString() {
        return String.format("Mã: %-6s | Ngày: %s | Đơn giá: %,.0f | DT: %.1f | Thành tiền: %,.0f",
            maGiaoDich,
            ngayGiaoDich.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
            donGia,
            dienTich,
            thanhTien());
    }
}