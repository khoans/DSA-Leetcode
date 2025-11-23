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

## Ví dụ thực tế:
1. Payment Systems: Tách rời phương thức thanh toán (Credit Card, PayPal) khỏi giao diện người dùng.
2. GUI Frameworks: Tách rời giao diện người dùng khỏi nền tảng đồ họa (Windows, Linux).
3. Remote Controls: Tách rời điều khiển từ xa khỏi thiết bị (TV, Radio).
4. Document Generation: Tách rời định dạng tài liệu (PDF, HTML) khỏi nội dung tài liệu.
5. Logging Systems: Tách rời giao diện ghi log khỏi phương thức lưu trữ (File, Database).
6. Game Development: Tách rời logic game khỏi nền tảng đồ họa (2D, 3D).
7. Audio Systems: Tách rời giao diện âm thanh khỏi thiết bị phát (Speakers, Headphones).
8. Network Protocols: Tách rời giao thức mạng khỏi giao diện người dùng.
9. Data Persistence: Tách rời giao diện lưu trữ dữ liệu khỏi phương thức lưu trữ (SQL, NoSQL).
10. Vehicle Control Systems: Tách rời hệ thống điều khiển khỏi loại phương tiện (Car, Bike).
11. E-commerce Platforms: Tách rời giao diện người dùng khỏi hệ thống quản lý sản phẩm.
12. Media Players: Tách rời giao diện người dùng khỏi định dạng media (MP3, MP4).
13. Smart Home Systems: Tách rời giao diện điều khiển khỏi thiết bị thông minh (Lights, Thermostat).
14. Cloud Services: Tách rời giao diện người dùng khỏi dịch vụ đám mây (AWS, Azure).
15. Robotics: Tách rời giao diện điều khiển khỏi loại robot (Wheeled, Humanoid).
16. Content Management Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý nội dung.
17. Social Media Platforms: Tách rời giao diện người dùng khỏi hệ thống quản lý bài đăng.
18. Financial Applications: Tách rời giao diện người dùng khỏi hệ thống xử lý giao dịch.
19. Healthcare Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý bệnh nhân.
20. Educational Software: Tách rời giao diện người dùng khỏi hệ thống quản lý khóa học.
21. Travel Booking Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý đặt chỗ.
22. Food Delivery Apps: Tách rời giao diện người dùng khỏi hệ thống quản lý đơn hàng.
23. Fitness Tracking Apps: Tách rời giao diện người dùng khỏi hệ thống theo dõi sức khỏe.
24. Real Estate Platforms: Tách rời giao diện người dùng khỏi hệ thống quản lý bất động sản.
25. Event Management Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý sự kiện.
26. Job Portals: Tách rời giao diện người dùng khỏi hệ thống quản lý việc làm.
27. Online Marketplaces: Tách rời giao diện người dùng khỏi hệ thống quản lý sản phẩm.
28. News Aggregators: Tách rời giao diện người dùng khỏi hệ thống quản lý tin tức.
29. Video Streaming Services: Tách rời giao diện người dùng khỏi hệ thống quản lý video.
30. Music Streaming Services: Tách rời giao diện người dùng khỏi hệ thống quản lý âm nhạc.
31. Ride Sharing Apps: Tách rời giao diện người dùng khỏi hệ thống quản lý chuyến đi.
32. Car Rental Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý xe.
33. Hotel Booking Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý khách sạn.
34. Online Learning Platforms: Tách rời giao diện người dùng khỏi hệ thống quản lý khóa học.
35. Virtual Reality Applications: Tách rời giao diện người dùng khỏi hệ thống quản lý VR.
36. Augmented Reality Applications: Tách rời giao diện người dùng khỏi hệ thống quản lý AR.
37. Cryptocurrency Wallets: Tách rời giao diện người dùng khỏi hệ thống quản lý tiền điện tử.
38. Stock Trading Platforms: Tách rời giao diện người dùng khỏi hệ thống quản lý giao dịch chứng khoán.
39. Personal Finance Apps: Tách rời giao diện người dùng khỏi hệ thống quản lý tài chính cá nhân.
40. Budgeting Tools: Tách rời giao diện người dùng khỏi hệ thống quản lý ngân sách.
41. Tax Preparation Software: Tách rời giao diện người dùng khỏi hệ thống quản lý thuế.
42. Invoicing Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý hóa đơn.
43. Payroll Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý lương.
44. Human Resource Management Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý nhân sự.
45. Customer Relationship Management Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý khách hàng.
46. Enterprise Resource Planning Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý tài nguyên doanh nghiệp.
47. Supply Chain Management Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý chuỗi cung ứng.
48. Inventory Management Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý tồn kho.
49. Warehouse Management Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý kho.
50. Logistics Management Systems: Tách rời giao diện người dùng khỏi hệ thống quản lý logistics.

## Khác biệt Bridge Pattern và Adapter Pattern:
- **Mục đích**: Bridge nhằm tách rời trừu tượng và cài đặt để cả hai có thể phát triển độc lập, trong khi Adapter nhằm kết nối hai giao diện không tương thích.
- **Cấu trúc**: Bridge sử dụng hai lớp riêng biệt (Abstraction và Implementor), trong khi Adapter thường là một lớp duy nhất thực hiện giao diện của lớp cần thích nghi.
- **Sử dụng**: Bridge thường được sử dụng khi có nhiều biến thể của cả trừu tượng và cài đặt, trong khi Adapter thường được sử dụng để tích hợp các hệ thống hiện có.
- **Mối quan hệ**: Bridge tạo ra một cầu nối giữa hai phần, trong khi Adapter chuyển đổi giao diện của một phần để phù hợp với phần khác.
