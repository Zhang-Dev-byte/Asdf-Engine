package ASDFEngine;

import static org.lwjgl.opengl.GL11.glTranslatef;

public class Sprite {
	public String name;
	public static void Translatef(float x,float y,float z) {
		glTranslatef(x,y,z);
	}
	
}
