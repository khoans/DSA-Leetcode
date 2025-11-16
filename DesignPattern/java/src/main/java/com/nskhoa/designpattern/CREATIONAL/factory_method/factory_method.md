# Factory Method Design Pattern

**Cần lớp cha định nghĩa tạo nhưng lớp con quyết định loại?** → **Factory Method**: Hoãn khởi tạo cho subclass; phổ
biến trong framework. Các ví dụ hàng ngày:

1. Nhà hàng: menu chung, nhưng đầu bếp chọn món cụ thể (mặn/ngọt).
2. Xe buýt: tuyến đường chung, nhưng tài xế chọn loại xe (thường/điều hòa).
3. Siêu thị: quầy thu ngân chung, nhưng nhân viên chọn phương thức thanh toán (tiền mặt/thẻ).
4. Trường học: chương trình học chung, nhưng giáo viên chọn bài giảng cụ thể.
5. Bệnh viện: lịch khám chung, nhưng bác sĩ chọn loại khám (nội/ngoại).
6. Cửa hàng quần áo: kích cỡ chung, nhưng nhân viên chọn kiểu dáng.
7. Xe tải giao hàng: lộ trình chung, nhưng tài xế chọn loại hàng (dễ vỡ/bình thường).
8. Rạp phim: suất chiếu chung, nhưng nhân viên chọn ghế ngồi.
9. Ngân hàng: dịch vụ chung, nhưng nhân viên chọn loại tài khoản (tiết kiệm/vay).
10. Nhà máy: dây chuyền sản xuất chung, nhưng công nhân chọn sản phẩm cụ thể.
11. Database Connection Factory
12. Logger Factory
13. UI Button Factory
14. Notification Service Factory
15. Payment Processor Factory
16. Document Parser Factory
17. Cache Provider Factory
18. Auth Factory
19. Report Generator Factory
20. Serializer Factory

  **Câu hỏi để xác định sử dụng Factory Method**:
    - Bạn có subclass cần quyết định loại object tạo ra mà không ràng buộc client với concrete class?.
    - Ứng dụng có yêu cầu mở rộng framework với subclass mới mà không thay đổi code hiện tại?.
    - Có tình huống tạo object dựa trên input runtime (như config hoặc user choice)?.
    - Pattern có giúp tuân thủ Open-Closed Principle (mở rộng mà không sửa)?.
    - Bạn có chấp nhận thêm subclass để override method create mà không làm hierarchy quá sâu?.
