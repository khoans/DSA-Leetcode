# Abstract Factory Pattern

**Cần tạo họ đối tượng liên quan mà không chỉ định lớp cụ thể?** → **Abstract Factory**: Tạo họ đối tượng liên quan;
hữu ích cho UI toolkit. Các ví dụ hàng ngày:
1. Bộ đồ ăn: chọn bộ đĩa, thìa, đũa cùng phong cách (hiện đại/cổ điển).
2. Trang phục đi làm: chọn áo, quần, giày cùng chủ đề (thể thao/chính thức).
3. Bộ dụng cụ sửa chữa: chọn cờ lê, tua vít, kìm cùng loại (chuyên dụng/hộ gia đình).
4. Bộ sách giáo khoa: chọn sách toán, lý, hóa cùng cấp độ (cơ bản/nâng cao).
5. Bộ đồ chơi trẻ em: chọn xe, búp bê, khối gỗ cùng chủ đề (vui nhộn/giáo dục).
6. Bộ gia vị nấu ăn: chọn muối, tiêu, ớt cùng loại (hữu cơ/thông thường).
7. Bộ nội thất phòng: chọn bàn, ghế, tủ cùng phong cách (Scandinavia/Á Đông).
8. Bộ tài liệu văn phòng: chọn giấy, bút, kẹp cùng kích cỡ (A4/cá nhân).
9. Bộ dụng cụ làm vườn: chọn xẻng, kéo, bình tưới cùng loại (chuyên nghiệp/amateur).
10. Bộ phụ kiện xe máy: chọn mũ bảo hiểm, găng tay, khóa cùng kích cỡ.
11. GUI toolkit factory
12. Database Driver Family Factory
13. Logging System Factory
14. XML Parser Family Factory
15. Computer Configuration Factory
16. Game Kingdom Factory
17. Payment Gateway Family Factory
18. Network Protocol Factory
19. Chart Visualization Factory
20. Theme Styling Factory
21. Cloud Provider Factory
22. Serialization Pipeline Factory
23. Testing Framework Factory
24. Email Service Factory
25. Message Queue Factory
26. Security Authentication Factory
27. Configuration Management Factory
28. Image Processing Factory
29. Metrics Monitoring Factory
30. Plugin Loader Factory
31. Vehicle Parts Factory
32. API Client Factory
33. Mobile UI Component Factory
34. Build Tool Factory
35. Document Generation Factory
36. Web Framework Factory
37. Data Validation Factory
38. Task Scheduling Factory
39. Audio Processing Factory
40. Caching Strategy Factory
41. Search Engine Factory
42. ORM Framework Factory
43. Compression Algorithm Factory
44. Payment Validator Factory
45. Notification Channel Factory
46. Graph Database Factory
47. Video Streaming Factory
48. Blockchain Client Factory
49. ML Model Factory
50. Encryption Algorithm Factory
51. Transformer Factory
52. XPath Evaluator Factory
53. Hash Function Factory
54. Signature Provider Factory
55. Document Builder Factory
56. Furniture Assembly Factory
57. JDBC Driver Factory
58. Spring Bean Factory
59. REST Client Factory
60. Thread Pool Factory
61. Event Bus Factory
62. File IO Factory
63. Cache Loader Factory
64. Messaging Protocol Factory
65. Aspect Oriented Factory
66. Dependency Injection Factory
67. Microservice Client Factory
68. Data Pipeline Factory
69. API Gateway Factory
70. Service Discovery Factory
71. Load Balancer Factory
72. Circuit Breaker Factory
73. Rate Limiter Factory
74. Feature Toggle Factory
75. Cloud Storage Factory
76. CDN Provider Factory
77. DNS Resolver Factory
78. Email Template Factory
79. SMS Gateway Factory
80. Push Notification Factory
81. Payment Processor Factory
82. Fraud Detection Factory
83. Identity Provider Factory
84. Access Control Factory
85. Data Masking Factory
86. Data Encryption Factory 
87. Key Management Factory 
88. Secret Management Factory 
89. Certificate Authority Factory 
90. Network Security Factory 
91. Application Firewall Factory 
92. DDoS Protection Factory 
93. Bot Detection Factory 
94. Security Information Factory 
95. Event Correlation Factory 
96. VPC Configuration Factory 
97. Container Orchestration Factory 
98. Serverless Function Factory 
99. DevOps Toolchain Factory

**Ví dụ code Java (10 ví dụ đơn giản)**:
- Ví dụ 1: Bộ đồ ăn (abstract factory for dinner set).
```java
interface DinnerSetFactory {
    Plate createPlate(); Fork createFork();
}
class ModernFactory implements DinnerSetFactory {
    public Plate createPlate() { return new ModernPlate(); }
    public Fork createFork() { return new ModernFork(); }
}
class ClassicFactory implements DinnerSetFactory {
    public Plate createPlate() { return new ClassicPlate(); }
    public Fork createFork() { return new ClassicFork(); }
}
interface Plate { String getStyle(); } class ModernPlate implements Plate { public String getStyle() { return "Modern"; } }
interface Fork { String getStyle(); } class ModernFork implements Fork { public String getStyle() { return "Modern"; } }
// Sử dụng: DinnerSetFactory factory = new ModernFactory(); Plate plate = factory.createPlate();
```
- Ví dụ 2: Trang phục đi làm (factory for outfit).
```java
interface OutfitFactory {
    Shirt createShirt(); Pants createPants();
}
class SportFactory implements OutfitFactory {
    public Shirt createShirt() { return new SportShirt(); }
    public Pants createPants() { return new SportPants(); }
}
class FormalFactory implements OutfitFactory {
    public Shirt createShirt() { return new FormalShirt(); }
    public Pants createPants() { return new FormalPants(); }
}
interface Shirt { String getType(); } class SportShirt implements Shirt { public String getType() { return "Sport"; } }
interface Pants { String getType(); } class SportPants implements Pants { public String getType() { return "Sport"; } }
// Sử dụng: OutfitFactory factory = new SportFactory(); Shirt shirt = factory.createShirt();
```
- Ví dụ 3: Bộ dụng cụ sửa chữa (factory for tools).
```java
interface ToolFactory {
    Wrench createWrench(); Screwdriver createScrewdriver();
}
class ProfessionalFactory implements ToolFactory {
    public Wrench createWrench() { return new ProWrench(); }
    public Screwdriver createScrewdriver() { return new ProScrewdriver(); }
}
class HomeFactory implements ToolFactory {
    public Wrench createWrench() { return new HomeWrench(); }
    public Screwdriver createScrewdriver() { return new HomeScrewdriver(); }
}
interface Wrench { String getType(); } class ProWrench implements Wrench { public String getType() { return "Pro"; } }
interface Screwdriver { String getType(); } class ProScrewdriver implements Screwdriver { public String getType() { return "Pro"; } }
// Sử dụng: ToolFactory factory = new ProfessionalFactory(); Wrench wrench = factory.createWrench();
```
- Ví dụ 4: Bộ sách giáo khoa (factory for books).
```java
interface BookFactory {
    MathBook createMathBook(); PhysicsBook createPhysicsBook();
}
class BasicFactory implements BookFactory {
    public MathBook createMathBook() { return new BasicMath(); }
    public PhysicsBook createPhysicsBook() { return new BasicPhysics(); }
}
class AdvancedFactory implements BookFactory {
    public MathBook createMathBook() { return new AdvancedMath(); }
    public PhysicsBook createPhysicsBook() { return new AdvancedPhysics(); }
}
interface MathBook { String getLevel(); } class BasicMath implements MathBook { public String getLevel() { return "Basic"; } }
interface PhysicsBook { String getLevel(); } class BasicPhysics implements PhysicsBook { public String getLevel() { return "Basic"; } }
// Sử dụng: BookFactory factory = new BasicFactory(); MathBook math = factory.createMathBook();
```
- Ví dụ 5: Bộ đồ chơi trẻ em (factory for toys).
```java
interface ToyFactory {
    Car createCar(); Doll createDoll();
}
class FunFactory implements ToyFactory {
    public Car createCar() { return new FunCar(); }
    public Doll createDoll() { return new FunDoll(); }
}
class EduFactory implements ToyFactory {
    public Car createCar() { return new EduCar(); }
    public Doll createDoll() { return new EduDoll(); }
}
interface Car { String getTheme(); } class FunCar implements Car { public String getTheme() { return "Fun"; } }
interface Doll { String getTheme(); } class FunDoll implements Doll { public String getTheme() { return "Fun"; } }
// Sử dụng: ToyFactory factory = new FunFactory(); Car car = factory.createCar();
```
- Ví dụ 6: Bộ gia vị nấu ăn (factory for spices).
```java
interface SpiceFactory {
    Salt createSalt(); Pepper createPepper();
}
class OrganicFactory implements SpiceFactory {
    public Salt createSalt() { return new OrganicSalt(); }
    public Pepper createPepper() { return new OrganicPepper(); }
}
class RegularFactory implements SpiceFactory {
    public Salt createSalt() { return new RegularSalt(); }
    public Pepper createPepper() { return new RegularPepper(); }
}
interface Salt { String getType(); } class OrganicSalt implements Salt { public String getType() { return "Organic"; } }
interface Pepper { String getType(); } class OrganicPepper implements Pepper { public String getType() { return "Organic"; } }
// Sử dụng: SpiceFactory factory = new OrganicFactory(); Salt salt = factory.createSalt();
```
- Ví dụ 7: Bộ nội thất phòng (factory for furniture).
```java
interface FurnitureFactory {
    Table createTable(); Chair createChair();
}
class ScandinavianFactory implements FurnitureFactory {
    public Table createTable() { return new ScanTable(); }
    public Chair createChair() { return new ScanChair(); }
}
class AsianFactory implements FurnitureFactory {
    public Table createTable() { return new AsianTable(); }
    public Chair createChair() { return new AsianChair(); }
}
interface Table { String getStyle(); } class ScanTable implements Table { public String getStyle() { return "Scandinavian"; } }
interface Chair { String getStyle(); } class ScanChair implements Chair { public String getStyle() { return "Scandinavian"; } }
// Sử dụng: FurnitureFactory factory = new ScandinavianFactory(); Table table = factory.createTable();
```
- Ví dụ 8: Bộ tài liệu văn phòng (factory for office supplies).
```java
interface OfficeFactory {
    Paper createPaper(); Pen createPen();
}
class A4Factory implements OfficeFactory {
    public Paper createPaper() { return new A4Paper(); }
    public Pen createPen() { return new A4Pen(); }
}
class PersonalFactory implements OfficeFactory {
    public Paper createPaper() { return new PersonalPaper(); }
    public Pen createPen() { return new PersonalPen(); }
}
interface Paper { String getSize(); } class A4Paper implements Paper { public String getSize() { return "A4"; } }
interface Pen { String getSize(); } class A4Pen implements Pen { public String getSize() { return "A4"; } }
// Sử dụng: OfficeFactory factory = new A4Factory(); Paper paper = factory.createPaper();
```
- Ví dụ 9: Bộ dụng cụ làm vườn (factory for garden tools).
```java
interface GardenFactory {
    Shovel createShovel(); Scissors createScissors();
}
class ProFactory implements GardenFactory {
    public Shovel createShovel() { return new ProShovel(); }
    public Scissors createScissors() { return new ProScissors(); }
}
class AmateurFactory implements GardenFactory {
    public Shovel createShovel() { return new AmateurShovel(); }
    public Scissors createScissors() { return new AmateurScissors(); }
}
interface Shovel { String getLevel(); } class ProShovel implements Shovel { public String getLevel() { return "Pro"; } }
interface Scissors { String getLevel(); } class ProScissors implements Scissors { public String getLevel() { return "Pro"; } }
// Sử dụng: GardenFactory factory = new ProFactory(); Shovel shovel = factory.createShovel();
```
- Ví dụ 10: Bộ phụ kiện xe máy (factory for accessories).
```java
interface AccessoryFactory {
    Helmet createHelmet(); Glove createGlove();
}
class SmallSizeFactory implements AccessoryFactory {
    public Helmet createHelmet() { return new SmallHelmet(); }
    public Glove createGlove() { return new SmallGlove(); }
}
class LargeSizeFactory implements AccessoryFactory {
    public Helmet createHelmet() { return new LargeHelmet(); }
    public Glove createGlove() { return new LargeGlove(); }
}
interface Helmet { String getSize(); } class SmallHelmet implements Helmet { public String getSize() { return "Small"; } }
interface Glove { String getSize(); } class SmallGlove implements Glove { public String getSize() { return "Small"; } }
// Sử dụng: AccessoryFactory factory = new SmallSizeFactory(); Helmet helmet = factory.createHelmet();
```

**Câu hỏi để xác định sử dụng Abstract Factory**:
- Bạn có cần tạo họ object liên quan (families) mà không chỉ định concrete class, như bộ UI components?.
- Ứng dụng có yêu cầu thay đổi toàn bộ họ object theo config (ví dụ: theme hoặc OS)?.
- Có tình huống nhiều factory subclass để tạo product variants?.
- Pattern có giúp đảm bảo tính nhất quán giữa các object trong họ?.
- Bạn có chấp nhận thêm abstract product interfaces để mở rộng?.
