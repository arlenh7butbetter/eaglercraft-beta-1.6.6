package net.minecraft.src;


public class OpenGlCapsChecker {
	private static boolean tryCheckOcclusionCapable = true;

	public boolean checkARBOcclusion() {
		return tryCheckOcclusionCapable;
	}
}
