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
  - Ví dụ 1: Nhà hàng chọn món (factory for dish).
    ```java
    abstract class Restaurant {
        public abstract Dish createDish();
    }
    class SaltyRestaurant extends Restaurant {
        public Dish createDish() { return new SaltyDish(); }
    }
    class SweetRestaurant extends Restaurant {
        public Dish createDish() { return new SweetDish(); }
    }
    interface Dish { String getType(); }
    class SaltyDish implements Dish { public String getType() { return "Salty"; } }
    class SweetDish implements Dish { public String getType() { return "Sweet"; } }
    // Sử dụng: Restaurant rest = new SaltyRestaurant(); Dish dish = rest.createDish();
    ```
  - Ví dụ 2: Xe buýt chọn loại xe (factory for bus).
    ```java
    abstract class BusRoute {
        public abstract Bus createBus();
    }
    class NormalBusRoute extends BusRoute {
        public Bus createBus() { return new NormalBus(); }
    }
    class ACBusRoute extends BusRoute {
        public Bus createBus() { return new ACBus(); }
    }
    interface Bus { String getType(); }
    class NormalBus implements Bus { public String getType() { return "Normal"; } }
    class ACBus implements Bus { public String getType() { return "AC"; } }
    // Sử dụng: BusRoute route = new NormalBusRoute(); Bus bus = route.createBus();
    ```
  - Ví dụ 3: Siêu thị chọn thanh toán (factory for payment).
    ```java
    abstract class Supermarket {
        public abstract Payment createPayment();
    }
    class CashPayment extends Supermarket {
        public Payment createPayment() { return new Cash(); }
    }
    class CardPayment extends Supermarket {
        public Payment createPayment() { return new Card(); }
    }
    interface Payment { String getMethod(); }
    class Cash implements Payment { public String getMethod() { return "Cash"; } }
    class Card implements Payment { public String getMethod() { return "Card"; } }
    // Sử dụng: Supermarket super = new CashPayment(); Payment pay = super.createPayment();
    ```
  - Ví dụ 4: Trường học chọn bài giảng (factory for lesson).
    ```java
    abstract class School {
        public abstract Lesson createLesson();
    }
    class MathSchool extends School {
        public Lesson createLesson() { return new MathLesson(); }
    }
    class HistorySchool extends School {
        public Lesson createLesson() { return new HistoryLesson(); }
    }
    interface Lesson { String getSubject(); }
    class MathLesson implements Lesson { public String getSubject() { return "Math"; } }
    class HistoryLesson implements Lesson { public String getSubject() { return "History"; } }
    // Sử dụng: School school = new MathSchool(); Lesson lesson = school.createLesson();
    ```
  - Ví dụ 5: Bệnh viện chọn khám (factory for exam).
    ```java
    abstract class Hospital {
        public abstract Exam createExam();
    }
    class InternalExam extends Hospital {
        public Exam createExam() { return new Internal(); }
    }
    class ExternalExam extends Hospital {
        public Exam createExam() { return new External(); }
    }
    interface Exam { String getType(); }
    class Internal implements Exam { public String getType() { return "Internal"; } }
    class External implements Exam { public String getType() { return "External"; } }
    // Sử dụng: Hospital hosp = new InternalExam(); Exam exam = hosp.createExam();
    ```
  - Ví dụ 6: Cửa hàng quần áo chọn kiểu (factory for style).
    ```java
    abstract class ClothingStore {
        public abstract Style createStyle();
    }
    class CasualStyle extends ClothingStore {
        public Style createStyle() { return new Casual(); }
    }
    class FormalStyle extends ClothingStore {
        public Style createStyle() { return new Formal(); }
    }
    interface Style { String getType(); }
    class Casual implements Style { public String getType() { return "Casual"; } }
    class Formal implements Style { public String getType() { return "Formal"; } }
    // Sử dụng: ClothingStore store = new CasualStyle(); Style style = store.createStyle();
    ```
  - Ví dụ 7: Xe tải chọn loại hàng (factory for cargo).
    ```java
    abstract class DeliveryTruck {
        public abstract Cargo createCargo();
    }
    class FragileCargo extends DeliveryTruck {
        public Cargo createCargo() { return new Fragile(); }
    }
    class NormalCargo extends DeliveryTruck {
        public Cargo createCargo() { return new Normal(); }
    }
    interface Cargo { String getType(); }
    class Fragile implements Cargo { public String getType() { return "Fragile"; } }
    class Normal implements Cargo { public String getType() { return "Normal"; } }
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
    abstract class Factory {
        public abstract Product createProduct();
    }
    class ElectronicsFactory extends Factory {
        public Product createProduct() { return new Electronics(); }
    }
    class ClothingFactory extends Factory {
        public Product createProduct() { return new Clothing(); }
    }
    interface Product { String getType(); }
    class Electronics implements Product { public String getType() { return "Electronics"; } }
    class Clothing implements Product { public String getType() { return "Clothing"; } }
    // Sử dụng: Factory fact = new ElectronicsFactory(); Product prod = fact.createProduct();
    ```

  **Câu hỏi để xác định sử dụng Factory Method**:
  - Bạn có subclass cần quyết định loại object tạo ra mà không ràng buộc client với concrete class?.
  - Ứng dụng có yêu cầu mở rộng framework với subclass mới mà không thay đổi code hiện tại?.
  - Có tình huống tạo object dựa trên input runtime (như config hoặc user choice)?.
  - Pattern có giúp tuân thủ Open-Closed Principle (mở rộng mà không sửa)?.
  - Bạn có chấp nhận thêm subclass để override method create mà không làm hierarchy quá sâu?.
