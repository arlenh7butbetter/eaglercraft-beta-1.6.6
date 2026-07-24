package net.minecraft.src;

import java.util.Random;

import net.lax1dude.eaglercraft.internal.IAudioHandle;
import net.lax1dude.eaglercraft.internal.vfs2.VFile2;

public class SoundManager {
	private SoundPool soundPoolSounds = new SoundPool();
	private SoundPool soundPoolStreaming = new SoundPool();
	private SoundPool soundPoolMusic = new SoundPool();
	private int field_587_e = 0;
	private GameSettings options;

	private IAudioHandle musicHandle;
	private static boolean loaded = false;
	private Random rand = new Random();
	private int ticksBeforeMusic = this.rand.nextInt(12000);

	public void loadSoundSettings(GameSettings var1) {

	}


	public void onSoundOptionsChanged() {
		if(this.options.musicVolume == 0.0F) {
			if(this.musicHandle != null && !this.musicHandle.shouldFree()) {
				musicHandle.end();
			}
		} else {
			if(this.musicHandle != null && !this.musicHandle.shouldFree()) {
				musicHandle.gain(this.options.musicVolume);
			}
		}

	}

	public void closeMinecraft() {


	}

	public void addSound(String var1, VFile2 var2) {

	}

	public void addStreaming(String var1, VFile2 var2) {

	}

	public void addMusic(String var1, VFile2 var2) {

	}

	public void playRandomMusicIfReady() {
		//TODO: DO THIS SHIT
		/*
		if(loaded && this.options.musicVolume != 0.0F) {
			if(!sndSystem.playing("BgMusic") && !sndSystem.playing("streaming")) {
				if(this.ticksBeforeMusic > 0) {
					--this.ticksBeforeMusic;
					return;
				}

				SoundPoolEntry var1 = this.soundPoolMusic.getRandomSound();
				if(var1 != null) {
					this.ticksBeforeMusic = this.rand.nextInt(12000) + 12000;
					sndSystem.backgroundMusic("BgMusic", var1.soundUrl, var1.soundName, false);
					sndSystem.setVolume("BgMusic", this.options.musicVolume);
					PlatformAudio.beginPlayback("BgMusic");
				}
			}

		}

		 */
	}

	public void func_338_a(EntityLiving var1, float var2) {
		//TODO: DO THIS SHIT
		/*
		if(loaded && this.options.soundVolume != 0.0F) {
			if(var1 != null) {
				float var3 = var1.prevRotationYaw + (var1.rotationYaw - var1.prevRotationYaw) * var2;
				double var4 = var1.prevPosX + (var1.posX - var1.prevPosX) * (double)var2;
				double var6 = var1.prevPosY + (var1.posY - var1.prevPosY) * (double)var2;
				double var8 = var1.prevPosZ + (var1.posZ - var1.prevPosZ) * (double)var2;
				float var10 = MathHelper.cos(-var3 * ((float)Math.PI / 180.0F) - (float)Math.PI);
				float var11 = MathHelper.sin(-var3 * ((float)Math.PI / 180.0F) - (float)Math.PI);
				float var12 = -var11;
				float var13 = 0.0F;
				float var14 = -var10;
				float var15 = 0.0F;
				float var16 = 1.0F;
				float var17 = 0.0F;
				sndSystem.setListenerPosition((float)var4, (float)var6, (float)var8);
				sndSystem.setListenerOrientation(var12, var13, var14, var15, var16, var17);
			}
		}

		 */
	}

	public void playStreaming(String var1, float var2, float var3, float var4, float var5, float var6) {

		//TODO: STOP BEING A LAZY BUM
		/*
		if(loaded && this.options.soundVolume != 0.0F) {
			String var7 = "streaming";
			if(sndSystem.playing("streaming")) {
				sndSystem.stop("streaming");
			}

			if(var1 != null) {
				SoundPoolEntry var8 = this.soundPoolStreaming.getRandomSoundFromSoundPool(var1);
				if(var8 != null && var5 > 0.0F) {
					if(sndSystem.playing("BgMusic")) {
						sndSystem.stop("BgMusic");
					}

					float var9 = 16.0F;
					sndSystem.newStreamingSource(true, var7, var8.soundUrl, var8.soundName, false, var2, var3, var4, 2, var9 * 4.0F);
					sndSystem.setVolume(var7, 0.5F * this.options.soundVolume);
					sndSystem.play(var7);
				}

			}
		}

		 */
	}

	public void playSound(String var1, float var2, float var3, float var4, float var5, float var6) {
		//TODO: STOP BEING LAZY
		/*
		if(loaded && this.options.soundVolume != 0.0F) {
			SoundPoolEntry var7 = this.soundPoolSounds.getRandomSoundFromSoundPool(var1);
			if(var7 != null && var5 > 0.0F) {
				this.field_587_e = (this.field_587_e + 1) % 256;
				String var8 = "sound_" + this.field_587_e;
				float var9 = 16.0F;
				if(var5 > 1.0F) {
					var9 *= var5;
				}

				sndSystem.newSource(var5 > 1.0F, var8, var7.soundUrl, var7.soundName, false, var2, var3, var4, 2, var9);
				sndSystem.setPitch(var8, var6);
				if(var5 > 1.0F) {
					var5 = 1.0F;
				}

				sndSystem.setVolume(var8, var5 * this.options.soundVolume);
				sndSystem.play(var8);
			}

		}

		 */
	}

	public void playSoundFX(String var1, float var2, float var3) {
		//TODO: not be a BUM
		/*
		if(loaded && this.options.soundVolume != 0.0F) {
			SoundPoolEntry var4 = this.soundPoolSounds.getRandomSoundFromSoundPool(var1);
			if(var4 != null) {
				this.field_587_e = (this.field_587_e + 1) % 256;
				String var5 = "sound_" + this.field_587_e;
				sndSystem.newSource(false, var5, var4.soundUrl, var4.soundName, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
				if(var2 > 1.0F) {
					var2 = 1.0F;
				}

				var2 *= 0.25F;
				sndSystem.setPitch(var5, var3);
				sndSystem.setVolume(var5, var2 * this.options.soundVolume);
				sndSystem.play(var5);
			}

		}

		 */
	}
}
