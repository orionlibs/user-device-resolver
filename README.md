# Orion User Device Resolver
Utility for web-based applications that resolves a user's device using a servlet request sent to the server.

Please check the wiki

https://github.com/orionlibs/user-device-resolver/wiki

You can import the library by using:  
```xml
<dependency>
    <groupId>io.github.orionlibs</groupId>
    <artifactId>user-device-resolver</artifactId>
    <version>1.0.0</version>
</dependency>
```

To use this service, you can do:
```java
UserDeviceType deviceType = UserDeviceService.resolveDevice(httpServletRequest);
```