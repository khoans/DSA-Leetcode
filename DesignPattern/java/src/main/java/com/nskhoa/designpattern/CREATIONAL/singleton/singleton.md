# Singleton Pattern

**Cần đúng một instance toàn cục?** → **Singleton**: Đảm bảo lớp chỉ có một instance với truy cập toàn cục; hữu ích
cho tài nguyên như quản lý cấu hình. Các ví dụ hàng ngày:

1. Quản lý ví tiền chung của gia đình, chỉ một người quyết định chi tiêu lớn.
2. Lịch làm việc cá nhân, chỉ một bản duy nhất để tránh trùng lịch.
3. Máy in tại văn phòng, chỉ một hàng đợi in chung.
4. Tài khoản ngân hàng chính, tránh tạo nhiều tài khoản giả mạo.
5. Danh sách mua sắm hàng tuần, chỉ một bản để cập nhật.
6. Chìa khóa nhà chính, chỉ một bộ để tránh mất mát.
7. Hộp thư email cá nhân, chỉ một hộp để nhận thư.
8. Lịch tiêm chủng gia đình, chỉ một lịch thống nhất.
9. Quỹ tiết kiệm chung của nhóm bạn.
10. Bảng theo dõi sức khỏe hàng ngày, chỉ một bản để theo dõi.
11. Quản lý connection pool trong ứng dụng.
12. Quản lý cấu hình ứng dụng.
13. Quản lý logging trong hệ thống.
14. Quản lý cache dữ liệu.
15. Quản lý phiên làm việc người dùng.
16. Quản lý tài nguyên hệ thống.
17. Quản lý kết nối cơ sở dữ liệu.

**Câu hỏi để xác định sử dụng Singleton**:

- Bạn có cần đảm bảo chỉ một instance duy nhất cho toàn bộ ứng dụng (như quản lý tài nguyên toàn cục) để tránh lãng
  phí bộ nhớ?.
- Ứng dụng có yêu cầu truy cập toàn cục dễ dàng mà không cần truyền tham chiếu?.
- Có lo ngại về thread-safety trong môi trường đa luồng, và bạn sẵn sàng xử lý lazy initialization?.
- Pattern có phù hợp với yêu cầu đơn giản hóa quản lý trạng thái chung mà không over-engineering?.
- Bạn có tránh được các vấn đề như testability kém do instance toàn cục?.


The core components of the Singleton pattern are:

1. **Private Static Instance**: A static member within the class that holds the single instance of the Singleton. This ensures that memory is allocated only once for the instance.

2. **Private Constructor**: The constructor is made private to prevent others from instantiating the class directly. This restricts object creation strictly to within the class itself.

3. **Public Static Access Method (Factory Method)**: A static method (commonly named `getInstance()`) that provides a global access point to the single instance. This method creates the instance on the first call (lazy initialization) and returns the existing instance on subsequent calls.

These components ensure:

- **Single Instance Guarantee**: Only one instance of the class exists during the lifetime of the application.

- **Global Access Point**: The instance is globally accessible but controlled.

This pattern is commonly used for shared resources like configuration managers, loggers, or connection pools.
