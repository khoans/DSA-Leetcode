### Abstract Factory Pattern Examples for Modern Software Architectures

The Abstract Factory pattern is highly applicable to complex software architectures like microservices, cloud-native applications, and security systems, where it creates families of interdependent components (e.g., clients and configurations) without exposing concrete implementations, enabling seamless switching between providers or modes. This promotes loose coupling in enterprise Java environments, such as Spring Boot for DI or Kubernetes for orchestration, aligning with patterns in frameworks like Spring and Apache. Below are simple Java code examples for the specified scenarios, each demonstrating a family of related objects for consistency across variants.[1][2][3][4]

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
