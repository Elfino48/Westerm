package com.packtub.libgdx.westerm.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.packtub.libgdx.westerm.Westerm;

public class DesktopLauncher {
	public static void main (String[] arg) {
		System.setProperty("user.name","global");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Westerm(), config);
	}
}
