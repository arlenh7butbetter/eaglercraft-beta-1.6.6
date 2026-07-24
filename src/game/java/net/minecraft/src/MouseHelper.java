package net.minecraft.src;

import net.lax1dude.eaglercraft.internal.buffer.IntBuffer;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;

public class MouseHelper {
	public int deltaX;
	public int deltaY;
	private int field_1115_e = 10;

	public void grabMouseCursor() {
		Mouse.setGrabbed(true);
		this.deltaX = 0;
		this.deltaY = 0;
	}

	public void ungrabMouseCursor() {
		Mouse.setGrabbed(false);
	}

	public void mouseXYChange() {
		this.deltaX = Mouse.getDX();
		this.deltaY = Mouse.getDY();
	}
}
