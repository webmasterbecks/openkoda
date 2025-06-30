# Omni Communications Platform Design

This document outlines a minimal Openkoda-based solution inspired by [SpokePhone](https://spokephone.com/).

## Website observation

A simple cURL request shows the meta description of SpokePhone:

```
<meta name="description" content="Tailored business calls, SMS, and WhatsApp conversations to fit your unique way of operating—because your business is one of a kind." />
```

This indicates that SpokePhone focuses on customized business calls, SMS and WhatsApp communications.

## Proposed implementation

* Use Openkoda as the base application platform.
* Integrate Twilio for voice, SMS and WhatsApp messaging.
* Provide REST endpoints to send messages and start calls.
* Store communication history in Openkoda's data model.
* Configure Twilio credentials in `application.properties`.

A starting point is provided in the `examples/omnicomms` module.
