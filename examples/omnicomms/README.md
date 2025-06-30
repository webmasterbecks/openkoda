# Omni Comms Example

This example demonstrates how to extend **Openkoda** with a minimal Twilio integration. It exposes a `/api/send-sms` endpoint that sends SMS messages using Twilio's REST API.

Set the following properties to configure the integration:

```
twilio.account_sid=ACXXXXXXXX
twilio.auth_token=your_auth_token
twilio.from_number=+15555555555
```

Run the application with:

```
mvn install spring-boot:repackage
java -Dloader.path=/BOOT-INF/classes -Dspring.profiles.active=openkoda,omnicomms -jar target/omnicomms-1.0.0.jar
```
