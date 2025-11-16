# Factory Method Design Pattern

**Cần lớp cha định nghĩa tạo nhưng lớp con quyết định loại?** → **Factory Method**: Hoãn khởi tạo cho subclass; phổ
biến trong framework. Các ví dụ hàng ngày:

- Nhà hàng: menu chung, nhưng đầu bếp chọn món cụ thể (mặn/ngọt).
- Xe buýt: tuyến đường chung, nhưng tài xế chọn loại xe (thường/điều hòa).
- Siêu thị: quầy thu ngân chung, nhưng nhân viên chọn phương thức thanh toán (tiền mặt/thẻ).
- Trường học: chương trình học chung, nhưng giáo viên chọn bài giảng cụ thể.
- Bệnh viện: lịch khám chung, nhưng bác sĩ chọn loại khám (nội/ngoại).
- Cửa hàng quần áo: kích cỡ chung, nhưng nhân viên chọn kiểu dáng.
- Xe tải giao hàng: lộ trình chung, nhưng tài xế chọn loại hàng (dễ vỡ/bình thường).
- Rạp phim: suất chiếu chung, nhưng nhân viên chọn ghế ngồi.
- Ngân hàng: dịch vụ chung, nhưng nhân viên chọn loại tài khoản (tiết kiệm/vay).
- Nhà máy: dây chuyền sản xuất chung, nhưng công nhân chọn sản phẩm cụ thể.
- Database Connection Factory
- Logger Factory
- UI Button Factory
- Notification Service Factory
- Payment Processor Factory
- Document Parser Factory
- Cache Provider Factory
- Auth Factory
- Report Generator Factory
- Serializer Factory

  **Ví dụ code Java (10 ví dụ đơn giản)**:
=
\

    - Ví dụ 7: Xe tải chọn loại hàng (factory for cargo).
      ```java
      public abstract class DeliveryTruck {
          public abstract Cargo createCargo();
      }
      public class FragileCargo extends DeliveryTruck {
          public Cargo createCargo() { return new Fragile(); }
      }
      public class NormalCargo extends DeliveryTruck {
          public Cargo createCargo() { return new Normal(); }
      }
      public interface Cargo { String getType(); }
      public class Fragile implements Cargo { public String getType() { return "Fragile"; } }
      public class Normal implements Cargo { public String getType() { return "Normal"; } }
      // Sử dụng: DeliveryTruck truck = new FragileCargo(); Cargo cargo = truck.createCargo();
      ```
    - Ví dụ 8: Rạp phim chọn ghế (factory for seat).
      ```java
      abstract class Cinema {
          public abstract Seat createSeat();
      }
      class FrontSeat extends Cinema {
          public Seat createSeat() { return new Front(); }
      }
      class BackSeat extends Cinema {
          public Seat createSeat() { return new Back(); }
      }
      interface Seat { String getLocation(); }
      class Front implements Seat { public String getLocation() { return "Front"; } }
      class Back implements Seat { public String getLocation() { return "Back"; } }
      // Sử dụng: Cinema cinema = new FrontSeat(); Seat seat = cinema.createSeat();
      ```
    - Ví dụ 9: Ngân hàng chọn tài khoản (factory for account).
      ```java
      abstract class Bank {
          public abstract Account createAccount();
      }
      class SavingsAccount extends Bank {
          public Account createAccount() { return new Savings(); }
      }
      class LoanAccount extends Bank {
          public Account createAccount() { return new Loan(); }
      }
      interface Account { String getType(); }
      class Savings implements Account { public String getType() { return "Savings"; } }
      class Loan implements Account { public String getType() { return "Loan"; } }
      // Sử dụng: Bank bank = new SavingsAccount(); Account acc = bank.createAccount();
      ```
    - Ví dụ 10: Nhà máy chọn sản phẩm (factory for product).
      ```java
      public abstract class Factory {
          public abstract Product createProduct();
      }
      public class ElectronicsFactory extends Factory {
          public Product createProduct() { return new Electronics(); }
      }
      public class ClothingFactory extends Factory {
          public Product createProduct() { return new Clothing(); }
      }
      public interface Product { String getType(); }
      public class Electronics implements Product { public String getType() { return "Electronics"; } }
      public class Clothing implements Product { public String getType() { return "Clothing"; } }
      // Sử dụng: Factory fact = new ElectronicsFactory(); Product prod = fact.createProduct();
      ```

  **Câu hỏi để xác định sử dụng Factory Method**:
    - Bạn có subclass cần quyết định loại object tạo ra mà không ràng buộc client với concrete class?.
    - Ứng dụng có yêu cầu mở rộng framework với subclass mới mà không thay đổi code hiện tại?.
    - Có tình huống tạo object dựa trên input runtime (như config hoặc user choice)?.
    - Pattern có giúp tuân thủ Open-Closed Principle (mở rộng mà không sửa)?.
    - Bạn có chấp nhận thêm subclass để override method create mà không làm hierarchy quá sâu?.
