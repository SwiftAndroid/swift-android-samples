package net.zhuoweizhang.swifthello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SwiftHello extends Activity
{
	/** Called when the activity is first created. */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		loadNativeDependencies();
		TextView myText = (TextView) findViewById(R.id.mytext);
		myText.setText("Result of swift return42() function is "
			+ return42());
	}

	private static void loadNativeDependencies() {
		// Load libraries
		// Libc++
		System.loadLibrary("c++_shared");
		// Libicu
		System.loadLibrary("icudata");
		System.loadLibrary("icui18n");
		System.loadLibrary("icuuc");
		// Swift
		System.loadLibrary("swiftCore");
		System.loadLibrary("swiftGlibc");
		// Our library
		System.loadLibrary("swifthello");
	}

	/** Returns 42. Implemented in swiftproject/Source/main.swift. */
	public static native int return42();

}
