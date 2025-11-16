### Abstract Factory in Software Development

The Abstract Factory pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes, ensuring consistency across the product variants. It is particularly useful in software for scenarios like cross-platform UI toolkits or configurable systems where entire sets of components must align. Below are 10 simple Java code examples applied to software development contexts, each illustrating the pattern's role in producing cohesive object families.[1][4][5]

### Example 1: GUI Toolkit Factory
In cross-platform GUI applications, an abstract factory creates families of UI components (e.g., buttons and windows) tailored to operating systems like Windows or macOS.[5]
```java
interface GUIAbstractFactory {
    Button createButton();
    Window createWindow();
}

class WindowsFactory implements GUIAbstractFactory {
    public Button createButton() { return new WindowsButton(); }
    public Window createWindow() { return new WindowsWindow(); }
}

class MacFactory implements GUIAbstractFactory {
    public Button createButton() { return new MacButton(); }
    public Window createWindow() { return new MacWindow(); }
}

interface Button { void render(); }
class WindowsButton implements Button { public void render() { System.out.println("Windows Button"); } }
class MacButton implements Button { public void render() { System.out.println("Mac Button"); } }

interface Window { void draw(); }
class WindowsWindow implements Window { public void draw() { System.out.println("Windows Window"); } }
class MacWindow implements Window { public void draw() { System.out.println("Mac Window"); } }

// Usage: GUIAbstractFactory factory = new WindowsFactory(); Button btn = factory.createButton(); btn.render();
```
This ensures platform-consistent UI elements without client-side modifications.[4]

### Example 2: Database Driver Family Factory
Database access layers use abstract factories to produce families of drivers and connections for different databases, such as MySQL or Oracle.[2]
```java
interface DatabaseAbstractFactory {
    Driver createDriver();
    Connection createConnection();
}

class MySQLFactory implements DatabaseAbstractFactory {
    public Driver createDriver() { return new MySQLDriver(); }
    public Connection createConnection() { return new MySQLConnection(); }
}

class OracleFactory implements DatabaseAbstractFactory {
    public Driver createDriver() { return new OracleDriver(); }
    public Connection createConnection() { return new OracleConnection(); }
}

interface Driver { void load(); }
class MySQLDriver implements Driver { public void load() { System.out.println("MySQL Driver Loaded"); } }
class OracleDriver implements Driver { public void load() { System.out.println("Oracle Driver Loaded"); } }

interface Connection { void connect(); }
class MySQLConnection implements Connection { public void connect() { System.out.println("MySQL Connected"); } }
class OracleConnection implements Connection { public void connect() { System.out.println("Oracle Connected"); } }

// Usage: DatabaseAbstractFactory factory = new MySQLFactory(); Driver driver = factory.createDriver(); driver.load();
```
It maintains compatibility between drivers and connections for seamless database switching.[6]

### Example 3: Logging System Factory
Logging frameworks employ abstract factories to generate families of loggers and appenders for different environments, like console or file-based.[1]
```java
interface LoggingAbstractFactory {
    Logger createLogger();
    Appender createAppender();
}

class ConsoleFactory implements LoggingAbstractFactory {
    public Logger createLogger() { return new ConsoleLogger(); }
    public Appender createAppender() { return new ConsoleAppender(); }
}

class FileFactory implements LoggingAbstractFactory {
    public Logger createLogger() { return new FileLogger(); }
    public Appender createAppender() { return new FileAppender(); }
}

interface Logger { void log(String message); }
class ConsoleLogger implements Logger { public void log(String message) { System.out.println("Console Log: " + message); } }
class FileLogger implements Logger { public void log(String message) { System.out.println("File Log: " + message); } }

interface Appender { void append(String data); }
class ConsoleAppender implements Appender { public void append(String data) { System.out.println("Console Append: " + data); } }
class FileAppender implements Appender { public void append(String data) { System.out.println("File Append: " + data); } }

// Usage: LoggingAbstractFactory factory = new ConsoleFactory(); Logger logger = factory.createLogger(); logger.log("Error");
```
This pattern supports consistent logging across varied output targets.[4]

### Example 4: XML Parser Family Factory
XML processing libraries use abstract factories to create families of parsers and validators for different schemas, such as DOM or SAX.[9]
```java
interface XMLAbstractFactory {
    Parser createParser();
    Validator createValidator();
}

class DOMFactory implements XMLAbstractFactory {
    public Parser createParser() { return new DOMParser(); }
    public Validator createValidator() { return new DOMValidator(); }
}

class SAXFactory implements XMLAbstractFactory {
    public Parser createParser() { return new SAXParser(); }
    public Validator createValidator() { return new SAXValidator(); }
}

interface Parser { void parse(String xml); }
class DOMParser implements Parser { public void parse(String xml) { System.out.println("DOM Parsed: " + xml); } }
class SAXParser implements Parser { public void parse(String xml) { System.out.println("SAX Parsed: " + xml); } }

interface Validator { boolean validate(String schema); }
class DOMValidator implements Validator { public boolean validate(String schema) { return true; } }
class SAXValidator implements Validator { public boolean validate(String schema) { return true; } }

// Usage: XMLAbstractFactory factory = new DOMFactory(); Parser parser = factory.createParser(); parser.parse("<doc/>");
```
It ensures parsers and validators work cohesively for XML handling.[6]

### Example 5: Computer Configuration Factory
Hardware abstraction in system builders uses abstract factories to assemble families of components like RAM and CPU for PCs or servers.[2]
```java
interface ComputerAbstractFactory {
    RAM createRAM();
    CPU createCPU();
}

class PCFactory implements ComputerAbstractFactory {
    public RAM createRAM() { return new PCRAM(); }
    public CPU createCPU() { return new PCCPU(); }
}

class ServerFactory implements ComputerAbstractFactory {
    public RAM createRAM() { return new ServerRAM(); }
    public CPU createCPU() { return new ServerCPU(); }
}

interface RAM { String getSize(); }
class PCRAM implements RAM { public String getSize() { return "8GB"; } }
class ServerRAM implements RAM { public String getSize() { return "64GB"; } }

interface CPU { String getSpeed(); }
class PCCPU implements CPU { public String getSpeed() { return "3.0GHz"; } }
class ServerCPU implements CPU { public String getSpeed() { return "4.0GHz"; } }

// Usage: ComputerAbstractFactory factory = new PCFactory(); RAM ram = factory.createRAM(); System.out.println(ram.getSize());
```
This facilitates building balanced hardware configurations dynamically.[4]

### Example 6: Game Kingdom Factory
Game engines apply abstract factories to create families of entities (e.g., armies and castles) for different themes like elf or orc kingdoms.[4]
```java
interface KingdomAbstractFactory {
    Army createArmy();
    Castle createCastle();
}

class ElfFactory implements KingdomAbstractFactory {
    public Army createArmy() { return new ElfArmy(); }
    public Castle createCastle() { return new ElfCastle(); }
}

class OrcFactory implements KingdomAbstractFactory {
    public Army createArmy() { return new OrcArmy(); }
    public Castle createCastle() { return new OrcCastle(); }
}

interface Army { String getDescription(); }
class ElfArmy implements Army { public String getDescription() { return "Elf Archers"; } }
class OrcArmy implements Army { public String getDescription() { return "Orc Warriors"; } }

interface Castle { String getDescription(); }
class ElfCastle implements Castle { public String getDescription() { return "Elf Tree Castle"; } }
class OrcCastle implements Castle { public String getDescription() { return "Orc Stone Fortress"; } }

// Usage: KingdomAbstractFactory factory = new ElfFactory(); Army army = factory.createArmy(); System.out.println(army.getDescription());
```
It maintains thematic consistency in game world generation.[1]

### Example 7: Payment Gateway Family Factory
E-commerce platforms use abstract factories to produce families of processors and validators for gateways like Stripe or PayPal.[6]
```java
interface PaymentAbstractFactory {
    Processor createProcessor();
    Validator createValidator();
}

class StripeFactory implements PaymentAbstractFactory {
    public Processor createProcessor() { return new StripeProcessor(); }
    public Validator createValidator() { return new StripeValidator(); }
}

class PayPalFactory implements PaymentAbstractFactory {
    public Processor createProcessor() { return new PayPalProcessor(); }
    public Validator createValidator() { return new PayPalValidator(); }
}

interface Processor { void process(double amount); }
class StripeProcessor implements Processor { public void process(double amount) { System.out.println("Stripe Processed: " + amount); } }
class PayPalProcessor implements Processor { public void process(double amount) { System.out.println("PayPal Processed: " + amount); } }

interface Validator { boolean validate(String card); }
class StripeValidator implements Validator { public boolean validate(String card) { return true; } }
class PayPalValidator implements Validator { public boolean validate(String card) { return true; } }

// Usage: PaymentAbstractFactory factory = new StripeFactory(); Processor proc = factory.createProcessor(); proc.process(50.0);
```
This ensures secure, integrated payment flows across providers.[5]

### Example 8: Network Protocol Factory
Networking libraries create families of protocols and handlers for HTTP or FTP using abstract factories, based on transport needs.[4]
```java
interface NetworkAbstractFactory {
    Protocol createProtocol();
    Handler createHandler();
}

class HTTPFactory implements NetworkAbstractFactory {
    public Protocol createProtocol() { return new HTTPProtocol(); }
    public Handler createHandler() { return new HTTPHandler(); }
}

class FTPFactory implements NetworkAbstractFactory {
    public Protocol createProtocol() { return new FTPProtocol(); }
    public Handler createHandler() { return new FTPHandler(); }
}

interface Protocol { void send(String data); }
class HTTPProtocol implements Protocol { public void send(String data) { System.out.println("HTTP Sent: " + data); } }
class FTPProtocol implements Protocol { public void send(String data) { System.out.println("FTP Sent: " + data); } }

interface Handler { void receive(String data); }
class HTTPHandler implements Handler { public void receive(String data) { System.out.println("HTTP Received: " + data); } }
class FTPHandler implements Handler { public void receive(String data) { System.out.println("FTP Received: " + data); } }

// Usage: NetworkAbstractFactory factory = new HTTPFactory(); Protocol proto = factory.createProtocol(); proto.send("data");
```
It guarantees protocol-handler synchronization for reliable communication.[6]

### Example 9: Chart Visualization Factory
Data visualization tools use abstract factories to generate families of charts and renderers for types like bar or pie.[1]
```java
interface ChartAbstractFactory {
    Chart createChart();
    Renderer createRenderer();
}

class BarFactory implements ChartAbstractFactory {
    public Chart createChart() { return new BarChart(); }
    public Renderer createRenderer() { return new BarRenderer(); }
}

class PieFactory implements ChartAbstractFactory {
    public Chart createChart() { return new PieChart(); }
    public Renderer createRenderer() { return new PieRenderer(); }
}

interface Chart { void draw(String data); }
class BarChart implements Chart { public void draw(String data) { System.out.println("Bar Chart Drawn: " + data); } }
class PieChart implements Chart { public void draw(String data) { System.out.println("Pie Chart Drawn: " + data); } }

interface Renderer { void render(); }
class BarRenderer implements Renderer { public void render() { System.out.println("Bar Rendered"); } }
class PieRenderer implements Renderer { public void render() { System.out.println("Pie Rendered"); } }

// Usage: ChartAbstractFactory factory = new BarFactory(); Chart chart = factory.createChart(); chart.draw("sales");
```
This supports consistent rendering for diverse chart families.[4]

### Example 10: Theme Styling Factory
Web application theming systems apply abstract factories to create families of styles and components for light or dark themes.[5]
```java
interface ThemeAbstractFactory {
    Style createStyle();
    Component createComponent();
}

class LightFactory implements ThemeAbstractFactory {
    public Style createStyle() { return new LightStyle(); }
    public Component createComponent() { return new LightComponent(); }
}

class DarkFactory implements ThemeAbstractFactory {
    public Style createStyle() { return new DarkStyle(); }
    public Component createComponent() { return new DarkComponent(); }
}

interface Style { String getColor(); }
class LightStyle implements Style { public String getColor() { return "White"; } }
class DarkStyle implements Style { public String getColor() { return "Black"; } }

interface Component { void display(); }
class LightComponent implements Component { public void display() { System.out.println("Light Component"); } }
class DarkComponent implements Component { public void display() { System.out.println("Dark Component"); } }

// Usage: ThemeAbstractFactory factory = new LightFactory(); Style style = factory.createStyle(); System.out.println(style.getColor());
```
It enforces uniform theming across UI elements for user experience consistency.[9]

[1](https://refactoring.guru/design-patterns/abstract-factory/java/example)
[2](https://www.digitalocean.com/community/tutorials/abstract-factory-design-pattern-in-java)
[3](https://gpcoder.com/4365-huong-dan-java-design-pattern-abstract-factory/)
[4](https://java-design-patterns.com/patterns/abstract-factory/)
[5](https://dzone.com/articles/design-patterns-abstract-factory)
[6](https://www.geeksforgeeks.org/system-design/abstract-factory-pattern/)
[7](https://viblo.asia/p/abstract-factory-design-pattern-trong-java-RnB5p3bblPG)
[8](https://saigontechnology.com/blog/factory-design-pattern-in-java/)
[9](https://www.baeldung.com/java-abstract-factory-pattern)
