package io.ochubey.appium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.ochubey.utils.ConfigurationValidator.getDevicePoolTimeoutMills;
import static java.lang.Thread.sleep;

/**
 * Created by ochubey on 1/12/18.
 */
public class DeviceWaiter {

    private static final Logger LOG = LoggerFactory.getLogger(DeviceWaiter.class);

    private DeviceWaiter() {
        throw new IllegalStateException("Utility class");
    }

    public static void doSleep() {
        try {
            sleep(getDevicePoolTimeoutMills());
        } catch (InterruptedException e) {
            LOG.trace(e.getMessage(), e);
            Thread.currentThread().interrupt();
        }
    }
}
