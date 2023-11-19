package com.lilbrocodes.hkgrimflame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.lilbrocodes.hkgrimflame.HollowKnightGrimflame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Hollow Knight Grimflame");
		new Lwjgl3Application(new HollowKnightGrimflame(), config);
	}
}
