package io.github.orionlibs.user_device_resolver;

import jakarta.servlet.http.HttpServletRequest;

public class UserDeviceService
{
    public static UserDeviceType resolveDevice(HttpServletRequest request)
    {
        return UserDeviceResolver.resolveDeviceType(request);
    }
}
