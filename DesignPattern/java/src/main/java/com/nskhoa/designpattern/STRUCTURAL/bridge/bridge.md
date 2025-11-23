# Bridge Design Pattern
## 📘 **1. Mô tả (Description) về Bridge Design Pattern**

**Bridge Pattern** là một **Structural Design Pattern**, giúp **tách rời phần trừu tượng (abstraction)** khỏi **cài đặt (implementation)**, sao cho cả hai có thể **phát triển độc lập** mà không ảnh hưởng lẫn nhau.

### 🧱 Cấu trúc chính:

- **Abstraction**: Lớp trừu tượng định nghĩa giao diện cấp cao cho client.
- **Implementation (Implementor)**: Giao diện định nghĩa các phương thức cài đặt.
- **Refined Abstraction**: Mở rộng Abstraction.
- **Concrete Implementor**: Cài đặt cụ thể của giao diện `Implementation`.

---

## ❓ **2. Những câu hỏi nên hỏi để quyết định có dùng Bridge Pattern hay không?**

Bạn nên xem xét sử dụng Bridge nếu bạn trả lời **"Có"** cho một hoặc nhiều câu hỏi sau:

1. ✅ Bạn có **nhiều lớp con** đang tăng theo cấp số nhân do sự kết hợp giữa **trừu tượng và cài đặt**?
2. ✅ Bạn muốn **mở rộng cả trừu tượng và cài đặt độc lập** mà không làm vướng víu hệ thống?
3. ✅ Bạn muốn **thay đổi cài đặt tại runtime** mà không ảnh hưởng đến lớp trừu tượng?
4. ✅ Bạn có nhiều cách **cài đặt khác nhau cho cùng một chức năng** (ví dụ: vẽ hình tròn theo nhiều nền tảng: Windows, Linux, Web)?
5. ✅ Bạn muốn **tách biệt phần giao diện người dùng và phần logic xử lý**?

Nếu có, **Bridge Pattern** là lựa chọn phù hợp.

---

## 🎯 **3. Bridge Pattern được dùng cho việc gì?**

- **Tách trừu tượng khỏi cài đặt** để cả hai có thể thay đổi độc lập.
- **Giảm sự phụ thuộc giữa lớp trừu tượng và lớp cài đặt**.
- **Hỗ trợ mở rộng hệ thống dễ dàng** mà không làm vướng víu.
- **Giảm số lượng lớp con** phát sinh do sự kết hợp giữa các lớp.
- **Hỗ trợ thiết kế hệ thống đa nền tảng** (ví dụ: giao diện, đồ họa, v.v...).

