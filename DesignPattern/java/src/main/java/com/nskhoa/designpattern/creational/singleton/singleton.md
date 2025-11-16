# Singleton Pattern

**Cần đúng một instance toàn cục?** → **Singleton**: Đảm bảo lớp chỉ có một instance với truy cập toàn cục; hữu ích
  cho tài nguyên như quản lý cấu hình. Các ví dụ hàng ngày:
    
- Quản lý ví tiền chung của gia đình, chỉ một người quyết định chi tiêu lớn.
- Lịch làm việc cá nhân, chỉ một bản duy nhất để tránh trùng lịch.
- Máy in tại văn phòng, chỉ một hàng đợi in chung.
- Tài khoản ngân hàng chính, tránh tạo nhiều tài khoản giả mạo.
- Danh sách mua sắm hàng tuần, chỉ một bản để cập nhật.
- Chìa khóa nhà chính, chỉ một bộ để tránh mất mát.
- Hộp thư email cá nhân, chỉ một hộp để nhận thư.
- Lịch tiêm chủng gia đình, chỉ một lịch thống nhất.
- Quỹ tiết kiệm chung của nhóm bạn.
- Bảng theo dõi sức khỏe hàng ngày, chỉ một bản để theo dõi.
- Quản lý connection pool trong ứng dụng.
- Quản lý cấu hình ứng dụng.
- Quản lý logging trong hệ thống.
- Quản lý cache dữ liệu.
- Quản lý phiên làm việc người dùng.
- Quản lý tài nguyên hệ thống.
- Quản lý kết nối cơ sở dữ liệu.

**Câu hỏi để xác định sử dụng Singleton**:
- Bạn có cần đảm bảo chỉ một instance duy nhất cho toàn bộ ứng dụng (như quản lý tài nguyên toàn cục) để tránh lãng
phí bộ nhớ?.
- Ứng dụng có yêu cầu truy cập toàn cục dễ dàng mà không cần truyền tham chiếu?.
- Có lo ngại về thread-safety trong môi trường đa luồng, và bạn sẵn sàng xử lý lazy initialization?.
- Pattern có phù hợp với yêu cầu đơn giản hóa quản lý trạng thái chung mà không over-engineering?.
- Bạn có tránh được các vấn đề như testability kém do instance toàn cục?.
