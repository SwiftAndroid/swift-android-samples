package net.zhuoweizhang.swifthello;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class net.zhuoweizhang.swifthello.SwiftHelloTest \
 * net.zhuoweizhang.swifthello.tests/android.test.InstrumentationTestRunner
 */
public class SwiftHelloTest extends ActivityInstrumentationTestCase2<SwiftHello> {

    public SwiftHelloTest() {
        super("net.zhuoweizhang.swifthello", SwiftHello.class);
    }

}
