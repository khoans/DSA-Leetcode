# Chain of Responsibility Design Pattern

The Chain of Responsibility (CoR) pattern is a behavioral design pattern that allows a request to be passed along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain. This pattern helps decouple sender and receiver and promotes flexible request processing.

### What is the Chain of Responsibility pattern used for?
- To allow multiple objects a chance to handle a request without coupling the sender to the receiver.
- To organize processing objects into a chain to handle different types or conditions of requests.
- To enable dynamically building and modifying chains of handlers.
- To avoid explicit condition-based logic (like long if-else or switch statements) in processing requests.
- To allow flexibility in assigning responsibilities to objects at runtime.

### Questions to determine if you should use Chain of Responsibility
- Do multiple handlers potentially handle a request, but the exact handler cannot be predetermined?
- Do you want to avoid coupling the request sender to specific request processors?
- Is the request processing conditionally hierarchical or sequential, such as approval workflows or logging chains?
- Do you want the ability to dynamically assemble or change the chain of handlers?
- Do you want each handler to decide either to process or forward the request?

***

### 20 Examples of Chain of Responsibility Pattern

1. **Leave Request Approval System**: Different managers approve leave requests depending on days requested (team lead → manager → director).
2. **Customer Support Ticket Routing**: Level 1, 2, and 3 support handle tickets sequentially based on complexity.
3. **ATM Cash Dispensing**: Denominations handled one by one to dispense correct amount.
4. **Email Spam Filtering**: Multiple filters scan and optionally block spam emails in sequence.
5. **Authentication Filters**: Chain of authentication handlers validate credentials in sequence (e.g., username/password, OAuth token).
6. **Logging Framework**: Different loggers handle logs of various severity levels and either process or pass the log on.
7. **Order Validation Pipeline**: Multiple validators check different parts of an order sequentially.
8. **UI Event Handling**: Events propagate through a chain of UI elements that can consume or propagate the event further.
9. **Document Processing**: Multiple steps (parsing, validation, format conversion) chained to process document.
10. **Network Packet Filtering**: Multiple filters apply rules one after another to incoming packets.
11. **Exception Handling Chains**: Sequential exception handlers for different error types.
12. **Middleware Chains in Web Servers**: Each middleware handles part of a request or response, passing it forward.
13. **Access Control**: Authorization checks performed in sequence until allowed or denied.
14. **Discount Processing**: Sales discounts applied in order, each deciding if applicable.
15. **Workflow Approval Chains**: Steps in complex workflows where each can approve or escalate.
16. **Promotion Campaign Eligibility**: Checks different eligibility criteria sequentially and applies promotions.
17. **Event Processing**: Events handled by a chain of listeners in order.
18. **Message Processing Pipelines**: Middleware chain processes messages/event data.
19. **Bug Triage in Issue Tracking**: Issues passed through levels of triage or assignment responsibility.
20. **UI Command Processing**: Commands routed through chain of handlers for execution or rejection.
21. **File Upload Validation**: A chain of validators checks file size, type, and virus scan sequentially before allowing upload.
22. **API Request Authentication:** Request goes through a chain of authenticators (API key, OAuth token, JWT) until validated or rejected.
23. **Input Sanitization Pipeline**: Multiple sanitizers clean input data in sequence to prevent injection attacks or invalid data.
24. **Error Logging Systems**: A chain of loggers handle errors by severity or type, e.g., critical logs trigger alerts; minor logs get stored.
25. **Notification Dispatching**: Notifications pass through channels (email, SMS, push) until successfully delivered or all fail.
26. **Document Validation Framework**: Different validators (schema, business rules, reference integrity) process document validation in order.
27. **Payment Processing Chains**: Payment requests routed through fraud detection, credit limit check, and transaction recording handlers.
28. **Resource Cleanup Handlers**: A chain ensures that resource cleanup steps (close streams, commit transactions, release locks) execute in proper order.
29. **Chat Message Moderation**: Messages filtered through profanity filter, spam detection, and policy enforcement handlers sequentially.
30. **Data Transformation Pipelines**: Data passes through a series of transformers (normalization, enrichment, formatting) before final output.
31. **Command Line Parsing**: Command arguments are parsed and validated by a chain of option handlers supporting different flags and parameters.
32. **Workflow Task Processing**: Tasks in a workflow are processed by a chain of handlers that can approve, reject, or escalate tasks based on conditions.
33. **Content Delivery Networks (CDN)**: Requests for content are processed through a chain of caching, compression, and delivery handlers to optimize performance.
34. **IoT Device Command Handling**: Commands sent to IoT devices are processed through a chain of handlers that validate, log, and execute commands.
35. **E-commerce Order Fulfillment**: Orders are processed through a chain of handlers for inventory check, payment processing, packaging, and shipping.
36. **Social Media Content Moderation**: User-generated content is reviewed by a chain of moderation handlers for spam, offensive content, and policy violations.
37. **API Rate Limiting**: Incoming API requests are processed through a chain of rate limiters that enforce different thresholds based on user roles or request types.
38. **Video Streaming Quality Adjustment**: Video streams are processed through a chain of handlers that adjust quality based on network conditions and device capabilities.
39. Ecommerce Return Processing: Return requests are handled by a chain of handlers that verify eligibility, process refunds, and update inventory.
40. Software Installation Wizards: Installation steps are processed through a chain of handlers that check system requirements, copy files, and configure settings.
41. Network Request Handlers: Incoming network requests are processed through a chain of handlers that perform authentication, logging, and routing to appropriate services.
42. Package Shipping Workflow: Shipping requests are processed through a chain of handlers that validate addresses, calculate shipping costs, and schedule pickups.
43. Medical Diagnosis Systems: Patient symptoms are processed through a chain of diagnostic handlers that evaluate conditions and suggest treatments.
44. Automated Code Review: Code changes are processed through a chain of review handlers that check for style, security vulnerabilities, and performance issues.
45. Financial Transaction Processing: Transactions are processed through a chain of handlers that perform fraud detection, compliance checks, and settlement.
46. Online Exam Proctoring: Exam sessions are monitored through a chain of handlers that check for cheating, log activity, and enforce time limits.
47. Smart Home Automation: Commands from users are processed through a chain of handlers that control lighting, temperature, and security systems.
48. Content Recommendation Engines: User interactions are processed through a chain of handlers that analyze behavior, filter content, and generate recommendations.
49. Supply Chain Management: Orders are processed through a chain of handlers that manage inventory, coordinate suppliers, and track shipments.
50. Automated Marketing Campaigns: Marketing actions are processed through a chain of handlers that segment audiences, personalize messages, and schedule deliveries.
51. Fraud Detection Systems: Transactions are processed through a chain of handlers that analyze patterns, flag suspicious activity, and escalate for review.
52. Cloud Resource Provisioning: Resource requests are processed through a chain of handlers that validate quotas, allocate resources, and configure settings.
53. Online Booking Systems: Booking requests are processed through a chain of handlers that check availability, process payments, and send confirmations.
54. Data Backup and Recovery: Backup requests are processed through a chain of handlers that validate data, compress files, and store backups.
55. Virtual Assistant Command Processing: User commands are processed through a chain of handlers that interpret intent, fetch information, and execute actions.
56. Automated Testing Frameworks: Test cases are processed through a chain of handlers that set up environments, execute tests, and report results.
57. Real-time Data Analytics: Data streams are processed through a chain of handlers that filter, aggregate, and visualize data.
58. Online Voting Systems: Votes are processed through a chain of handlers that validate voter eligibility, record votes, and tally results.
59. Digital Rights Management (DRM): Content access requests are processed through a chain of handlers that verify licenses, enforce restrictions, and log usage.
60. Smart Traffic Management: Traffic data is processed through a chain of handlers that analyze flow, adjust signals, and provide route recommendations.
