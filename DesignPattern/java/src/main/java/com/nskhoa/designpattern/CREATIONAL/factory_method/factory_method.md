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


The core components of the Factory Method pattern are:

1. **Product**: This declares the interface or abstract class for the objects the factories create. It defines the common behavior that all concrete products must implement.

2. **Concrete Product**: These are the actual implementations of the Product interface. Each concrete product corresponds to a specific type of object created by the factory method.

3. **Creator (Factory interface or abstract class)**: Declares the factory method, which returns an object of the Product type. The Creator may also contain some core business logic that uses the product object returned by the factory method.

4. **Concrete Creator (Concrete Factory)**: Implements the factory method to instantiate and return specific concrete products. These subclasses control which concrete product is created.

**Summary**:
- The Factory Method pattern defines an interface for creating an object, allowing subclasses to decide which class to instantiate.
- It encapsulates object instantiation, promoting loose coupling between client code and concrete classes.
- It supports adding new product types by subclassing without modifying existing code.
- The pattern often uses inheritance: Creator defines the factory method, while subclasses override it.
