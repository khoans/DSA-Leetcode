# Builder Pattern

**Cần xây dựng đối tượng phức tạp từng bước, thay đổi biểu diễn?** → **Builder**: Xây dựng qua director và interface
builder; xử lý constructor telescoping. Các ví dụ hàng ngày:

- Xây dựng bữa ăn: chọn nguyên liệu, gia vị, cách nấu từng bước.
- Thiết kế CV: thêm phần học vấn, kinh nghiệm, kỹ năng dần dần.
- Lập kế hoạch đám cưới: chọn địa điểm, thực đơn, trang trí từng phần.
- Xây nhà: chọn nền móng, tường, mái, nội thất theo thứ tự.
- Tạo báo cáo bán hàng: thêm dữ liệu, biểu đồ, kết luận từng bước.
- Lập lịch du lịch: chọn phương tiện, chỗ ở, hoạt động dần.
- Xây dựng giỏ hàng mua sắm: thêm sản phẩm, số lượng, ưu đãi.
- Thiết kế bài thuyết trình: thêm slide, nội dung, hình ảnh từng phần.
- Lập ngân sách gia đình: phân bổ chi phí ăn uống, giải trí, tiết kiệm.
- Xây dựng hồ sơ xin visa: thêm giấy tờ, thông tin cá nhân từng bước.
- Xây dựng config cho database connection
- Xây dựng HTTP Request Object cho API Call
- Xây dựng Email Message cho Notification Service
- Xây dựng User DTO cho Spring Boot Entity
- Xây dựng Query Criteria cho Database Search

**Câu hỏi để xác định sử dụng Builder**:

- Đối tượng có nhiều thuộc tính tùy chọn hoặc bắt buộc, dẫn đến constructor telescoping (nhiều overload)?.
- Bạn cần xây dựng object immutable (không thay đổi sau tạo) với các bước linh hoạt?.
- Ứng dụng có yêu cầu tạo biến thể của object mà không thay đổi class gốc?.
- Có lo ngại về readability code khi khởi tạo object phức tạp?.
- Pattern có phù hợp với việc tách logic xây dựng khỏi class chính để dễ bảo trì?.


The core components of the Builder pattern are:

1. **Product**: The complex object that is being constructed step by step. This class has multiple attributes and represents the final assembled object.

2. **Builder (Abstract Builder)**: An interface or abstract class that declares methods for creating the different parts of the product. Typically, these methods return the builder itself for chaining.

3. **ConcreteBuilder**: Implements the Builder interface to provide specific implementations for building parts of the product. It also maintains the representation of the current product being built and provides a method to retrieve the finished product.

4. **Director**: (Optional) Controls the construction process by invoking builder methods in a particular sequence. It directs the building steps but is decoupled from the concrete builders and products.

5. **Client**: Creates the builder and director, then uses the director to construct the product or directly controls the builder to retrieve the desired object.

This pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
