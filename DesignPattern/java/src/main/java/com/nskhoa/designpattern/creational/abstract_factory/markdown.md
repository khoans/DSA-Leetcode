### Abstract Factory Pattern Examples for Modern Software Architectures

The Abstract Factory pattern is highly applicable to complex software architectures like microservices, cloud-native applications, and security systems, where it creates families of interdependent components (e.g., clients and configurations) without exposing concrete implementations, enabling seamless switching between providers or modes. This promotes loose coupling in enterprise Java environments, such as Spring Boot for DI or Kubernetes for orchestration, aligning with patterns in frameworks like Spring and Apache. Below are simple Java code examples for the specified scenarios, each demonstrating a family of related objects for consistency across variants.[1][2][3][4]

### 66. Dependency Injection Factory
In IoC containers like Spring, abstract factories create families of injectors and resolvers for constructor or setter injection.[5][3]
```java
interface DIAbstractFactory {
    Injector createInjector();
    Resolver createResolver();
}

class ConstructorFactory implements DIAbstractFactory {
    public Injector createInjector() { return new ConstructorInjector(); }
    public Resolver createResolver() { return new ConstructorResolver(); }
}

class SetterFactory implements DIAbstractFactory {
    public Injector createInjector() { return new SetterInjector(); }
    public Resolver createResolver() { return new SetterResolver(); }
}

interface Injector { void inject(Object bean); }
class ConstructorInjector implements Injector { public void inject(Object bean) { System.out.println("Constructor Injected: " + bean); } }
class SetterInjector implements Injector { public void inject(Object bean) { System.out.println("Setter Injected: " + bean); } }

interface Resolver { Object resolve(String dependency); }
class ConstructorResolver implements Resolver { public Object resolve(String dependency) { return new Object(); } }
class SetterResolver implements Resolver { public Object resolve(String dependency) { return new Object(); } }

// Usage: DIAbstractFactory factory = new ConstructorFactory(); Injector injector = factory.createInjector(); injector.inject(new Object());
```
This mirrors Spring's BeanFactory for flexible injection strategies.[1]

### 67. Microservice Client Factory
Microservices architectures use abstract factories to produce families of clients and load balancers for REST or gRPC communication.[6]
```java
interface MicroserviceAbstractFactory {
    Client createClient();
    LoadBalancer createLoadBalancer();
}

class RESTFactory implements MicroserviceAbstractFactory {
    public Client createClient() { return new RESTClient(); }
    public LoadBalancer createLoadBalancer() { return new RESTLoadBalancer(); }
}

class GRPCFactory implements MicroserviceAbstractFactory {
    public Client createClient() { return new GRPCClient(); }
    public LoadBalancer createLoadBalancer() { return new GRPCLoadBalancer(); }
}

interface Client { String call(String service); }
class RESTClient implements Client { public String call(String service) { return "REST Response from " + service; } }
class GRPCClient implements Client { public String call(String service) { return "gRPC Response from " + service; } }

interface LoadBalancer { String selectInstance(String service); }
class RESTLoadBalancer implements LoadBalancer { public String selectInstance(String service) { return "REST Instance 1"; } }
class GRPCLoadBalancer implements LoadBalancer { public String selectInstance(String service) { return "gRPC Instance 1"; } }

// Usage: MicroserviceAbstractFactory factory = new RESTFactory(); Client client = factory.createClient(); String resp = client.call("order-service");
```
It ensures protocol-consistent service invocation.[6]

### 68. Data Pipeline Factory
Data processing pipelines apply abstract factories to create families of processors and transformers for batch or streaming modes.[7]
```java
interface PipelineAbstractFactory {
    Processor createProcessor();
    Transformer createTransformer();
}

class BatchFactory implements PipelineAbstractFactory {
    public Processor createProcessor() { return new BatchProcessor(); }
    public Transformer createTransformer() { return new BatchTransformer(); }
}

class StreamingFactory implements PipelineAbstractFactory {
    public Processor createProcessor() { return new StreamingProcessor(); }
    public Transformer createTransformer() { return new StreamingTransformer(); }
}

interface Processor { void process(String data); }
class BatchProcessor implements Processor { public void process(String data) { System.out.println("Batch Processed: " + data); } }
class StreamingProcessor implements Processor { public void process(String data) { System.out.println("Streaming Processed: " + data); } }

interface Transformer { String transform(String input); }
class BatchTransformer implements Transformer { public String transform(String input) { return "Batch Transformed: " + input; } }
class StreamingTransformer implements Transformer { public String transform(String input) { return "Streaming Transformed: " + input; } }

// Usage: PipelineAbstractFactory factory = new BatchFactory(); Processor proc = factory.createProcessor(); proc.process("raw data");
```
This aligns with Apache Beam's pipeline stages for modular data flows.[7]

### 69. API Gateway Factory
API gateways in cloud environments use abstract factories for families of routers and authenticators for proxy or direct routing.[4]
```java
interface GatewayAbstractFactory {
    Router createRouter();
    Authenticator createAuthenticator();
}

class ProxyFactory implements GatewayAbstractFactory {
    public Router createRouter() { return new ProxyRouter(); }
    public Authenticator createAuthenticator() { return new ProxyAuthenticator(); }
}

class DirectFactory implements GatewayAbstractFactory {
    public Router createRouter() { return new DirectRouter(); }
    public Authenticator createAuthenticator() { return new DirectAuthenticator(); }
}

interface Router { String route(String path); }
class ProxyRouter implements Router { public String route(String path) { return "Proxied to " + path; } }
class DirectRouter implements Router { public String route(String path) { return "Direct to " + path; } }

interface Authenticator { boolean auth(String token); }
class ProxyAuthenticator implements Authenticator { public boolean auth(String token) { return true; } }
class DirectAuthenticator implements Authenticator { public boolean auth(String token) { return true; } }

// Usage: GatewayAbstractFactory factory = new ProxyFactory(); Router router = factory.createRouter(); String endpoint = router.route("/api/users");
```
It supports Spring Cloud Gateway's routing consistency.[4]

### 70. Service Discovery Factory
Service discovery in distributed systems employs abstract factories to instantiate families of registries and watchers for Consul or Eureka.[8]
```java
interface DiscoveryAbstractFactory {
    Registry createRegistry();
    Watcher createWatcher();
}

class ConsulFactory implements DiscoveryAbstractFactory {
    public Registry createRegistry() { return new ConsulRegistry(); }
    public Watcher createWatcher() { return new ConsulWatcher(); }
}

class EurekaFactory implements DiscoveryAbstractFactory {
    public Registry createRegistry() { return new EurekaRegistry(); }
    public Watcher createWatcher() { return new EurekaWatcher(); }
}

interface Registry { void register(String service); }
class ConsulRegistry implements Registry { public void register(String service) { System.out.println("Consul Registered: " + service); } }
class EurekaRegistry implements Registry { public void register(String service) { System.out.println("Eureka Registered: " + service); } }

interface Watcher { String discover(String service); }
class ConsulWatcher implements Watcher { public String discover(String service) { return "Consul Found: " + service; } }
class EurekaWatcher implements Watcher { public String discover(String service) { return "Eureka Found: " + service; } }

// Usage: DiscoveryAbstractFactory factory = new ConsulFactory(); Registry reg = factory.createRegistry(); reg.register("payment-service");
```
This emulates Spring Cloud's discovery mechanisms.[8]

### 71. Load Balancer Factory
Load balancing layers use abstract factories for families of distributors and health checkers for round-robin or least-connections.[4]
```java
interface LoadBalancerAbstractFactory {
    Distributor createDistributor();
    HealthChecker createHealthChecker();
}

class RoundRobinFactory implements LoadBalancerAbstractFactory {
    public Distributor createDistributor() { return new RoundRobinDistributor(); }
    public HealthChecker createHealthChecker() { return new RoundRobinHealthChecker(); }
}

class LeastConnectionsFactory implements LoadBalancerAbstractFactory {
    public Distributor createDistributor() { return new LeastConnectionsDistributor(); }
    public HealthChecker createHealthChecker() { return new LeastConnectionsHealthChecker(); }
}

interface Distributor { String distribute(String request); }
class RoundRobinDistributor implements Distributor { public String distribute(String request) { return "Round-Robin Instance"; } }
class LeastConnectionsDistributor implements Distributor { public String distribute(String request) { return "Least Connections Instance"; } }

interface HealthChecker { boolean check(String instance); }
class RoundRobinHealthChecker implements HealthChecker { public boolean check(String instance) { return true; } }
class LeastConnectionsHealthChecker implements HealthChecker { public boolean check(String instance) { return true; } }

// Usage: LoadBalancerAbstractFactory factory = new RoundRobinFactory(); Distributor dist = factory.createDistributor(); String instance = dist.distribute("req");
```
It integrates with Netflix Ribbon-like balancers.[4]

### 72. Circuit Breaker Factory
Resilience patterns apply abstract factories to create families of breakers and fallbacks for synchronous or asynchronous circuits.[6]
```java
interface CircuitBreakerAbstractFactory {
    Breaker createBreaker();
    Fallback createFallback();
}

class SyncFactory implements CircuitBreakerAbstractFactory {
    public Breaker createBreaker() { return new SyncBreaker(); }
    public Fallback createFallback() { return new SyncFallback(); }
}

class AsyncFactory implements CircuitBreakerAbstractFactory {
    public Breaker createBreaker() { return new AsyncBreaker(); }
    public Fallback createFallback() { return new AsyncFallback(); }
}

interface Breaker { boolean allowCall(String service); }
class SyncBreaker implements Breaker { public boolean allowCall(String service) { return true; } }
class AsyncBreaker implements Breaker { public boolean allowCall(String service) { return true; } }

interface Fallback { String fallback(String service); }
class SyncFallback implements Fallback { public String fallback(String service) { return "Sync Fallback for " + service; } }
class AsyncFallback implements Fallback { public String fallback(String service) { return "Async Fallback for " + service; } }

// Usage: CircuitBreakerAbstractFactory factory = new SyncFactory(); Breaker breaker = factory.createBreaker(); boolean open = breaker.allowCall("db-service");
```
This supports Resilience4j's circuit breaker families.[6]

### 73. Rate Limiter Factory
API throttling systems use abstract factories for families of limiters and enforcers for token bucket or sliding window.[4]
```java
interface RateLimiterAbstractFactory {
    Limiter createLimiter();
    Enforcer createEnforcer();
}

class TokenBucketFactory implements RateLimiterAbstractFactory {
    public Limiter createLimiter() { return new TokenBucketLimiter(); }
    public Enforcer createEnforcer() { return new TokenBucketEnforcer(); }
}

class SlidingWindowFactory implements RateLimiterAbstractFactory {
    public Limiter createLimiter() { return new SlidingWindowLimiter(); }
    public Enforcer createEnforcer() { return new SlidingWindowEnforcer(); }
}

interface Limiter { boolean acquire(String key); }
class TokenBucketLimiter implements Limiter { public boolean acquire(String key) { return true; } }
class SlidingWindowLimiter implements Limiter { public boolean acquire(String key) { return true; } }

interface Enforcer { void enforce(String action); }
class TokenBucketEnforcer implements Enforcer { public void enforce(String action) { System.out.println("Token Bucket Enforced: " + action); } }
class SlidingWindowEnforcer implements Enforcer { public void enforce(String action) { System.out.println("Sliding Window Enforced: " + action); } }

// Usage: RateLimiterAbstractFactory factory = new TokenBucketFactory(); Limiter limiter = factory.createLimiter(); boolean allowed = limiter.acquire("user-api");
```
It enables consistent rate limiting in Spring Cloud Gateway.[4]

### 74. Feature Toggle Factory
Configuration management tools employ abstract factories to generate families of toggles and evaluators for runtime or config-based features.[9]
```java
interface FeatureToggleAbstractFactory {
    Toggle createToggle();
    Evaluator createEvaluator();
}

class RuntimeFactory implements FeatureToggleAbstractFactory {
    public Toggle createToggle() { return new RuntimeToggle(); }
    public Evaluator createEvaluator() { return new RuntimeEvaluator(); }
}

class ConfigFactory implements FeatureToggleAbstractFactory {
    public Toggle createToggle() { return new ConfigToggle(); }
    public Evaluator createEvaluator() { return new ConfigEvaluator(); }
}

interface Toggle { boolean isEnabled(String feature); }
class RuntimeToggle implements Toggle { public boolean isEnabled(String feature) { return true; } }
class ConfigToggle implements Toggle { public boolean isEnabled(String feature) { return true; } }

interface Evaluator { boolean evaluate(String user); }
class RuntimeEvaluator implements Evaluator { public boolean evaluate(String user) { return true; } }
class ConfigEvaluator implements Evaluator { public boolean evaluate(String user) { return true; } }

// Usage: FeatureToggleAbstractFactory factory = new RuntimeFactory(); Toggle toggle = factory.createToggle(); boolean active = toggle.isEnabled("new-ui");
```
This supports Spring Boot's feature flag integrations.[9]

### 75. Cloud Storage Factory
Cloud storage abstractions use abstract factories for families of storages and uploaders for S3 or Azure Blob.[4]
```java
interface CloudStorageAbstractFactory {
    Storage createStorage();
    Uploader createUploader();
}

class S3Factory implements CloudStorageAbstractFactory {
    public Storage createStorage() { return new S3Storage(); }
    public Uploader createUploader() { return new S3Uploader(); }
}

class AzureFactory implements CloudStorageAbstractFactory {
    public Storage createStorage() { return new AzureStorage(); }
    public Uploader createUploader() { return new AzureUploader(); }
}

interface Storage { String store(String file); }
class S3Storage implements Storage { public String store(String file) { return "S3 Stored: " + file; } }
class AzureStorage implements Storage { public String store(String file) { return "Azure Stored: " + file; } }

interface Uploader { void upload(String data); }
class S3Uploader implements Uploader { public void upload(String data) { System.out.println("S3 Uploaded: " + data); } }
class AzureUploader implements Uploader { public void upload(String data) { System.out.println("Azure Uploaded: " + data); } }

// Usage: CloudStorageAbstractFactory factory = new S3Factory(); Storage storage = factory.createStorage(); String key = storage.store("doc.pdf");
```
It facilitates Spring Cloud AWS integrations.[4]

### 76. CDN Provider Factory
Content delivery networks apply abstract factories to create families of distributors and cachers for CloudFront or Akamai.[6]
```java
interface CDNAbstractFactory {
    Distributor createDistributor();
    Cacher createCacher();
}

class CloudFrontFactory implements CDNAbstractFactory {
    public Distributor createDistributor() { return new CloudFrontDistributor(); }
    public Cacher createCacher() { return new CloudFrontCacher(); }
}

class AkamaiFactory implements CDNAbstractFactory {
    public Distributor createDistributor() { return new AkamaiDistributor(); }
    public Cacher createCacher() { return new AkamaiCacher(); }
}

interface Distributor { String deliver(String content); }
class CloudFrontDistributor implements Distributor { public String deliver(String content) { return "CloudFront Delivered: " + content; } }
class AkamaiDistributor implements Distributor { public String deliver(String content) { return "Akamai Delivered: " + content; } }

interface Cacher { void cache(String url); }
class CloudFrontCacher implements Cacher { public void cache(String url) { System.out.println("CloudFront Cached: " + url); } }
class AkamaiCacher implements Cacher { public void cache(String url) { System.out.println("Akamai Cached: " + url); } }

// Usage: CDNAbstractFactory factory = new CloudFrontFactory(); Distributor dist = factory.createDistributor(); String response = dist.deliver("image.jpg");
```
This ensures provider-consistent content delivery.[6]

### 77. DNS Resolver Factory
Networking layers use abstract factories for families of resolvers and caches for local or cloud DNS.[4]
```java
interface DNSAbstractFactory {
    Resolver createResolver();
    Cache createCache();
}

class LocalFactory implements DNSAbstractFactory {
    public Resolver createResolver() { return new LocalResolver(); }
    public Cache createCache() { return new LocalCache(); }
}

class CloudFactory implements DNSAbstractFactory {
    public Resolver createResolver() { return new CloudResolver(); }
    public Cache createCache() { return new CloudCache(); }
}

interface Resolver { String resolve(String domain); }
class LocalResolver implements Resolver { public String resolve(String domain) { return "Local IP for " + domain; } }
class CloudResolver implements Resolver { public String resolve(String domain) { return "Cloud IP for " + domain; } }

interface Cache { void store(String domain, String ip); }
class LocalCache implements Cache { public void store(String domain, String ip) { System.out.println("Local Cached: " + domain + " -> " + ip); } }
class CloudCache implements Cache { public void store(String domain, String ip) { System.out.println("Cloud Cached: " + domain + " -> " + ip); } }

// Usage: DNSAbstractFactory factory = new LocalFactory(); Resolver resolver = factory.createResolver(); String ip = resolver.resolve("example.com");
```
It supports Java's InetAddress resolver patterns.[4]

### 78. Email Template Factory
Communication services employ abstract factories to produce families of templates and renderers for HTML or plain text emails.[9]
```java
interface EmailTemplateAbstractFactory {
    Template createTemplate();
    Renderer createRenderer();
}

class HTMLFactory implements EmailTemplateAbstractFactory {
    public Template createTemplate() { return new HTMLTemplate(); }
    public Renderer createRenderer() { return new HTMLRenderer(); }
}

class PlainTextFactory implements EmailTemplateAbstractFactory {
    public Template createTemplate() { return new PlainTextTemplate(); }
    public Renderer createRenderer() { return new PlainTextRenderer(); }
}

interface Template { String getContent(String data); }
class HTMLTemplate implements Template { public String getContent(String data) { return "<html><body>" + data + "</body></html>"; } }
class PlainTextTemplate implements Template { public String getContent(String data) { return "Plain: " + data; } }

interface Renderer { String render(String template); }
class HTMLRenderer implements Renderer { public String render(String template) { return "Rendered HTML: " + template; } }
class PlainTextRenderer implements Renderer { public String render(String template) { return "Rendered Plain: " + template; } }

// Usage: EmailTemplateAbstractFactory factory = new HTMLFactory(); Template temp = factory.createTemplate(); String content = temp.getContent("Welcome");
```
This coordinates Spring Mail's template rendering.[9]

### 79. SMS Gateway Factory
SMS services use abstract factories for families of gateways and formatters for Twilio or Nexmo providers.[6]
```java
interface SMSAbstractFactory {
    Gateway createGateway();
    Formatter createFormatter();
}

class TwilioFactory implements SMSAbstractFactory {
    public Gateway createGateway() { return new TwilioGateway(); }
    public Formatter createFormatter() { return new TwilioFormatter(); }
}

class NexmoFactory implements SMSAbstractFactory {
    public Gateway createGateway() { return new NexmoGateway(); }
    public Formatter createFormatter() { return new NexmoFormatter(); }
}

interface Gateway { void send(String message); }
class TwilioGateway implements Gateway { public void send(String message) { System.out.println("Twilio Sent: " + message); } }
class NexmoGateway implements Gateway { public void send(String message) { System.out.println("Nexmo Sent: " + message); } }

interface Formatter { String format(String text); }
class TwilioFormatter implements Formatter { public String format(String text) { return "Twilio Formatted: " + text; } }
class NexmoFormatter implements Formatter { public String format(String text) { return "Nexmo Formatted: " + text; } }

// Usage: SMSAbstractFactory factory = new TwilioFactory(); Gateway gateway = factory.createGateway(); gateway.send("OTP: 123456");
```
It enables multi-provider SMS consistency.[6]

### 80. Push Notification Factory
Notification platforms apply abstract factories to create families of pushers and handlers for FCM or APNS.[4]
```java
interface PushNotificationAbstractFactory {
    Pusher createPusher();
    Handler createHandler();
}

class FCMFactory implements PushNotificationAbstractFactory {
    public Pusher createPusher() { return new FCMPusher(); }
    public Handler createHandler() { return new FCMHandler(); }
}

class APNSFactory implements PushNotificationAbstractFactory {
    public Pusher createPusher() { return new APNSPusher(); }
    public Handler createHandler() { return new APNSHandler(); }
}

interface Pusher { void push(String message); }
class FCMPusher implements Pusher { public void push(String message) { System.out.println("FCM Pushed: " + message); } }
class APNSPusher implements Pusher { public void push(String message) { System.out.println("APNS Pushed: " + message); } }

interface Handler { void handle(String notification); }
class FCMHandler implements Handler { public void handle(String notification) { System.out.println("FCM Handled: " + notification); } }
class APNSHandler implements Handler { public void handle(String notification) { System.out.println("APNS Handled: " + notification); } }

// Usage: PushNotificationAbstractFactory factory = new FCMFactory(); Pusher pusher = factory.createPusher(); pusher.push("New message");
```
This supports Firebase and Apple Push integrations.[4]

### 81. Payment Processor Factory
Payment systems use abstract factories for families of processors and validators for Stripe or PayPal.[10]
```java
interface PaymentProcessorAbstractFactory {
    Processor createProcessor();
    Validator createValidator();
}

class StripeFactory implements PaymentProcessorAbstractFactory {
    public Processor createProcessor() { return new StripeProcessor(); }
    public Validator createValidator() { return new StripeValidator(); }
}

class PayPalFactory implements PaymentProcessorAbstractFactory {
    public Processor createProcessor() { return new PayPalProcessor(); }
    public Validator createValidator() { return new PayPalValidator(); }
}

interface Processor { void process(double amount); }
class StripeProcessor implements Processor { public void process(double amount) { System.out.println("Stripe Processed: " + amount); } }
class PayPalProcessor implements Processor { public void process(double amount) { System.out.println("PayPal Processed: " + amount); } }

interface Validator { boolean validate(String card); }
class StripeValidator implements Validator { public boolean validate(String card) { return true; } }
class PayPalValidator implements Validator { public boolean validate(String card) { return true; } }

// Usage: PaymentProcessorAbstractFactory factory = new StripeFactory(); Processor proc = factory.createProcessor(); proc.process(99.99);
```
It ensures secure payment flows across gateways.[10]

### 82. Fraud Detection Factory
Security services employ abstract factories to produce families of detectors and alertors for rule-based or ML-based fraud.[9]
```java
interface FraudDetectionAbstractFactory {
    Detector createDetector();
    Alertor createAlertor();
}

class RuleBasedFactory implements FraudDetectionAbstractFactory {
    public Detector createDetector() { return new RuleBasedDetector(); }
    public Alertor createAlertor() { return new RuleBasedAlertor(); }
}

class MLFactory implements FraudDetectionAbstractFactory {
    public Detector createDetector() { return new MLDetector(); }
    public Alertor createAlertor() { return new MLAlertor(); }
}

interface Detector { boolean detect(String transaction); }
class RuleBasedDetector implements Detector { public boolean detect(String transaction) { return false; } }
class MLDetector implements Detector { public boolean detect(String transaction) { return false; } }

interface Alertor { void alert(String reason); }
class RuleBasedAlertor implements Alertor { public void alert(String reason) { System.out.println("Rule Alert: " + reason); } }
class MLAlertor implements Alertor { public void alert(String reason) { System.out.println("ML Alert: " + reason); } }

// Usage: FraudDetectionAbstractFactory factory = new RuleBasedFactory(); Detector detector = factory.createDetector(); boolean fraudulent = detector.detect("high-value tx");
```
This coordinates fraud prevention strategies.[9]

### 83. Identity Provider Factory
Authentication systems use abstract factories for families of providers and tokenizers for OAuth or SAML.[6]
```java
interface IdentityProviderAbstractFactory {
    Provider createProvider();
    Tokenizer createTokenizer();
}

class OAuthFactory implements IdentityProviderAbstractFactory {
    public Provider createProvider() { return new OAuthProvider(); }
    public Tokenizer createTokenizer() { return new OAuthTokenizer(); }
}

class SAMLFactory implements IdentityProviderAbstractFactory {
    public Provider createProvider() { return new SAMLProvider(); }
    public Tokenizer createTokenizer() { return new SAMLTokenizer(); }
}

interface Provider { String authenticate(String user); }
class OAuthProvider implements Provider { public String authenticate(String user) { return "OAuth Auth for " + user; } }
class SAMLProvider implements Provider { public String authenticate(String user) { return "SAML Auth for " + user; } }

interface Tokenizer { String generateToken(String id); }
class OAuthTokenizer implements Tokenizer { public String generateToken(String id) { return "OAuth Token: " + id; } }
class SAMLTokenizer implements Tokenizer { public String generateToken(String id) { return "SAML Token: " + id; } }

// Usage: IdentityProviderAbstractFactory factory = new OAuthFactory(); Provider prov = factory.createProvider(); String token = prov.authenticate("user@domain.com");
```
It supports Spring Security's identity providers.[6]

### 84. Access Control Factory
Authorization modules apply abstract factories to create families of controllers and enforcers for RBAC or ABAC.[4]
```java
interface AccessControlAbstractFactory {
    Controller createController();
    Enforcer createEnforcer();
}

class RBACFactory implements AccessControlAbstractFactory {
    public Controller createController() { return new RBACController(); }
    public Enforcer createEnforcer() { return new RBACEnforcer(); }
}

class ABACTFactory implements AccessControlAbstractFactory {
    public Controller createController() { return new ABACController(); }
    public Enforcer createEnforcer() { return new ABACEnforcer(); }
}

interface Controller { boolean checkRole(String user); }
class RBACController implements Controller { public boolean checkRole(String user) { return true; } }
class ABACController implements Controller { public boolean checkRole(String user) { return true; } }

interface Enforcer { void enforce(String resource); }
class RBACEnforcer implements Enforcer { public void enforce(String resource) { System.out.println("RBAC Enforced: " + resource); } }
class ABACEnforcer implements Enforcer { public void enforce(String resource) { System.out.println("ABAC Enforced: " + resource); } }

// Usage: AccessControlAbstractFactory factory = new RBACFactory(); Controller ctrl = factory.createController(); boolean access = ctrl.checkRole("admin");
```
This aligns with Spring Security's ACL models.[4]

### 85. Data Masking Factory
Privacy tools use abstract factories for families of maskers and validators for PII or sensitive data.[9]
```java
interface DataMaskingAbstractFactory {
    Masker createMasker();
    Validator createValidator();
}

class PIIFactory implements DataMaskingAbstractFactory {
    public Masker createMasker() { return new PIIMasker(); }
    public Validator createValidator() { return new PIIValidator(); }
}

class SensitiveFactory implements DataMaskingAbstractFactory {
    public Masker createMasker() { return new SensitiveMasker(); }
    public Validator createValidator() { return new SensitiveValidator(); }
}

interface Masker { String mask(String data); }
class PIIMasker implements Masker { public String mask(String data) { return "***" + data.substring(3); } }
class SensitiveMasker implements Masker { public String mask(String data) { return data.replaceAll(".", "*"); } }

interface Validator { boolean isMasked(String data); }
class PIIValidator implements Validator { public boolean isMasked(String data) { return data.contains("***"); } }
class SensitiveValidator implements Validator { public boolean isMasked(String data) { return data.matches("\\*+"); } }

// Usage: DataMaskingAbstractFactory factory = new PIIFactory(); Masker masker = factory.createMasker(); String masked = masker.mask("123-45-6789");
```
It ensures compliance in data handling.[9]

### 86. Data Encryption Factory
Data protection layers employ abstract factories to instantiate families of encryptors and key generators for AES or RSA.[11]
```java
interface DataEncryptionAbstractFactory {
    Encryptor createEncryptor();
    KeyGenerator createKeyGenerator();
}

class AESFactory implements DataEncryptionAbstractFactory {
    public Encryptor createEncryptor() { return new AESEncryptor(); }
    public KeyGenerator createKeyGenerator() { return new AESKeyGenerator(); }
}

class RSAFactory implements DataEncryptionAbstractFactory {
    public Encryptor createEncryptor() { return new RSAEncryptor(); }
    public KeyGenerator createKeyGenerator() { return new RSAKeyGenerator(); }
}

interface Encryptor { String encrypt(String data); }
class AESEncryptor implements Encryptor { public String encrypt(String data) { return "AES Encrypted: " + data; } }
class RSAEncryptor implements Encryptor { public String encrypt(String data) { return "RSA Encrypted: " + data; } }

interface KeyGenerator { String generateKey(); }
class AESKeyGenerator implements KeyGenerator { public String generateKey() { return "AES Key 256"; } }
class RSAKeyGenerator implements KeyGenerator { public String generateKey() { return "RSA Key 2048"; } }

// Usage: DataEncryptionAbstractFactory factory = new AESFactory(); Encryptor enc = factory.createEncryptor(); String ciphertext = enc.encrypt("sensitive data");
```
This supports JCE's encryption families.[11]

### 87. Key Management Factory
Key management systems use abstract factories for families of managers and rotators for hardware or software keys.[4]
```java
interface KeyManagementAbstractFactory {
    Manager createManager();
    Rotator createRotator();
}

class HardwareFactory implements KeyManagementAbstractFactory {
    public Manager createManager() { return new HardwareManager(); }
    public Rotator createRotator() { return new HardwareRotator(); }
}

class SoftwareFactory implements KeyManagementAbstractFactory {
    public Manager createManager() { return new SoftwareManager(); }
    public Rotator createRotator() { return new SoftwareRotator(); }
}

interface Manager { String storeKey(String key); }
class HardwareManager implements Manager { public String storeKey(String key) { return "Hardware Stored: " + key; } }
class SoftwareManager implements Manager { public String storeKey(String key) { return "Software Stored: " + key; } }

interface Rotator { void rotate(String oldKey); }
class HardwareRotator implements Rotator { public void rotate(String oldKey) { System.out.println("Hardware Rotated from " + oldKey); } }
class SoftwareRotator implements Rotator { public void rotate(String oldKey) { System.out.println("Software Rotated from " + oldKey); } }

// Usage: KeyManagementAbstractFactory factory = new HardwareFactory(); Manager mgr = factory.createManager(); String id = mgr.storeKey("key123");
```
It coordinates key lifecycle in Spring Vault.[4]

### 88. Secret Management Factory
Secret storage tools apply abstract factories to create families of vaults and retrievers for HashiCorp or AWS Secrets.[9]
```java
interface SecretManagementAbstractFactory {
    Vault createVault();
    Retriever createRetriever();
}

class HashiCorpFactory implements SecretManagementAbstractFactory {
    public Vault createVault() { return new HashiCorpVault(); }
    public Retriever createRetriever() { return new HashiCorpRetriever(); }
}

class AWSFactory implements SecretManagementAbstractFactory {
    public Vault createVault() { return new AWSVault(); }
    public Retriever createRetriever() { return new AWSRetriever(); }
}

interface Vault { void store(String secret); }
class HashiCorpVault implements Vault { public void store(String secret) { System.out.println("HashiCorp Stored: " + secret); } }
class AWSVault implements Vault { public void store(String secret) { System.out.println("AWS Stored: " + secret); } }

interface Retriever { String retrieve(String id); }
class HashiCorpRetriever implements Retriever { public String retrieve(String id) { return "HashiCorp Secret: " + id; } }
class AWSRetriever implements Retriever { public String retrieve(String id) { return "AWS Secret: " + id; } }

// Usage: SecretManagementAbstractFactory factory = new HashiCorpFactory(); Vault vault = factory.createVault(); vault.store("db-password");
```
This integrates with Spring Cloud Vault.[9]

### 89. Certificate Authority Factory
PKI systems use abstract factories for families of issuers and validators for internal or public CAs.[11]
```java
interface CertificateAuthorityAbstractFactory {
    Issuer createIssuer();
    Validator createValidator();
}

class InternalFactory implements CertificateAuthorityAbstractFactory {
    public Issuer createIssuer() { return new InternalIssuer(); }
    public Validator createValidator() { return new InternalValidator(); }
}

class PublicFactory implements CertificateAuthorityAbstractFactory {
    public Issuer createIssuer() { return new PublicIssuer(); }
    public Validator createValidator() { return new PublicValidator(); }
}

interface Issuer { String issue(String csr); }
class InternalIssuer implements Issuer { public String issue(String csr) { return "Internal Cert for " + csr; } }
class PublicIssuer implements Issuer { public String issue(String csr) { return "Public Cert for " + csr; } }

interface Validator { boolean validate(String cert); }
class InternalValidator implements Validator { public boolean validate(String cert) { return true; } }
class PublicValidator implements Validator { public boolean validate(String cert) { return true; } }

// Usage: CertificateAuthorityAbstractFactory factory = new InternalFactory(); Issuer issuer = factory.createIssuer(); String cert = issuer.issue("csr-data");
```
It supports Java KeyStore's CA handling.[11]

### 90. Network Security Factory
Firewall configurations employ abstract factories to produce families of monitors and blockers for intrusion or firewall rules.[4]
```java
public interface NetworkSecurityAbstractFactory {
    Monitor createMonitor();

    Blocker createBlocker();
}

public class IntrusionFactory implements NetworkSecurityAbstractFactory {
    public Monitor createMonitor() {
        return new IntrusionMonitor();
    }

    public Blocker createBlocker() {
        return new IntrusionBlocker();
    }
}

public class FirewallFactory implements NetworkSecurityAbstractFactory {
    public Monitor createMonitor() {
        return new FirewallMonitor();
    }

    public Blocker createBlocker() {
        return new FirewallBlocker();
    }
}

public interface Monitor {
    boolean detect(String packet);
}

public class IntrusionMonitor implements Monitor {
    public boolean detect(String packet) {
        return false;
    }
}

public class FirewallMonitor implements Monitor {
    public boolean detect(String packet) {
        return false;
    }
}

public interface Blocker {
    void block(String ip);
}

public class IntrusionBlocker implements Blocker {
    public void block(String ip) {
        System.out.println("Intrusion Blocked: " + ip);
    }
}

public class FirewallBlocker implements Blocker {
    public void block(String ip) {
        System.out.println("Firewall Blocked: " + ip);
    }
}

// NetworkSecurityAbstractFactory factory = new IntrusionFactory(); 
// Monitor monitor = factory.createMonitor(); 
// boolean threat = monitor.detect("suspicious packet");
```
This coordinates network protection layers.[4]

