# Prototype Design Pattern

**Cần sao chép/clone đối tượng mà không biết chi tiết lớp?** → **Prototype**: Tạo bản sao qua cloning; tốt cho việc
tạo đối tượng đắt đỏ như sao chép sâu trong game hoặc mô phỏng. Các ví dụ hàng ngày:

- Sao chép công thức nấu ăn từ sách để thử nghiệm biến tấu.
- Nhân bản lịch trình tập gym từ tuần trước để điều chỉnh.
- Clone mẫu CV xin việc cho các vị trí khác nhau.
- Sao chép danh sách khách mời tiệc từ sự kiện trước.
- Nhân bản kế hoạch du lịch cho chuyến đi tương tự.
- Clone mẫu email chào hàng cho khách mới.
- Sao chép thiết kế nội thất phòng từ phòng mẫu.
- Nhân bản quy trình kiểm kê kho từ tháng trước.
- Clone lịch học nhóm cho lớp mới.
- Sao chép mẫu báo cáo tài chính hàng quý.
- Sao chép configuration file cho môi trường dev/staging/prod.
- Clone database schema cho testing environment.
- Sao chép template website cho dự án mới.
- Nhân bản user session khi chuyển device.
- Sao chép API request template với parameters khác nhau.
 
**Câu hỏi để xác định sử dụng Prototype**:

- Bạn có cần tạo nhiều bản sao đối tượng với cấu trúc tương tự nhưng chi tiết khác, mà tạo mới quá tốn kém?.
- Ứng dụng có yêu cầu cloning sâu (deep copy) để tránh chia sẻ trạng thái không mong muốn?.
- Có tình huống class có constructor phức tạp hoặc phụ thuộc bên ngoài, làm clone hiệu quả hơn?.
- Pattern có giúp giảm thời gian khởi tạo so với new object từ đầu?.
- Bạn có thể xử lý Cloneable interface và exception mà không làm code phức tạp?.
