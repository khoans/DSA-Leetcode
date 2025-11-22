# Prototype Design Pattern

**Cần sao chép/clone đối tượng mà không biết chi tiết lớp?** → **Prototype**: Tạo bản sao qua cloning; tốt cho việc
tạo đối tượng đắt đỏ như sao chép sâu trong game hoặc mô phỏng. Các ví dụ hàng ngày:

1. Sao chép công thức nấu ăn từ sách để thử nghiệm biến tấu.
2. Nhân bản lịch trình tập gym từ tuần trước để điều chỉnh.
3. Clone mẫu CV xin việc cho các vị trí khác nhau.
4. Sao chép danh sách khách mời tiệc từ sự kiện trước.
5. Nhân bản kế hoạch du lịch cho chuyến đi tương tự.
6. Clone mẫu email chào hàng cho khách mới.
7. Sao chép thiết kế nội thất phòng từ phòng mẫu.
8. Nhân bản quy trình kiểm kê kho từ tháng trước.
9. Clone lịch học nhóm cho lớp mới.
10. Sao chép mẫu báo cáo tài chính hàng quý.
11. Sao chép configuration file cho môi trường dev/staging/prod.
12. Clone database schema cho testing environment.
13. Sao chép template website cho dự án mới.
14. Nhân bản user session khi chuyển device.
15. Sao chép API request template với parameters khác nhau.
 
**Câu hỏi để xác định sử dụng Prototype**:

- Bạn có cần tạo nhiều bản sao đối tượng với cấu trúc tương tự nhưng chi tiết khác, mà tạo mới quá tốn kém?.
- Ứng dụng có yêu cầu cloning sâu (deep copy) để tránh chia sẻ trạng thái không mong muốn?.
- Có tình huống class có constructor phức tạp hoặc phụ thuộc bên ngoài, làm clone hiệu quả hơn?.
- Pattern có giúp giảm thời gian khởi tạo so với new object từ đầu?.
- Bạn có thể xử lý Cloneable interface và exception mà không làm code phức tạp?.


The core components of the Prototype pattern are:

1. **Prototype Interface (or Abstract Class)**: Declares a cloning method, typically `clone()`, which returns a new instance that is a copy of the current object. This interface defines the minimal contract required for cloning.

2. **Concrete Prototype**: Implements the Prototype interface, providing a concrete implementation of the cloning method. It handles copying its own state, including deep copies if necessary, and manages any internal object references or dependencies.

3. **Client**: The component that works with prototypes to create new objects by cloning existing prototype instances instead of instantiating new objects from classes directly. The client remains decoupled from the concrete classes.

Optionally, there can be:

4. **Prototype Registry (optional)**: A centralized storage for pre-built prototype objects. The client can retrieve a prototype from the registry and clone it, helping manage a catalog of prototypical objects.

This pattern facilitates creating new objects efficiently by copying existing instances, useful when object creation is expensive or complex configuration is needed.
