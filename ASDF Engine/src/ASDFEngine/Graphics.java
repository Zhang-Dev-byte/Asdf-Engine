package ASDFEngine;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_TRIANGLES;

public class Graphics {
	public static Sprite RenderTrangle(Vertex v1,Vertex v2,Vertex v3,Color color) {
		Vector2 _v1 = v1.pos;
		Vector2 _v2 = v2.pos;
		Vector2 _v3 = v3.pos;
		
		glBegin(GL_TRIANGLES);
		glColor4f(color.R,color.G,color.B,color.A);
		glVertex2f(_v1.x,_v1.y);
		glVertex2f(_v2.x,_v2.y);
		glVertex2f(_v3.x,_v3.y);
		glEnd();
		//glTranslatef(0.01f,0f,0f);
		return new Sprite();
	}
	public static Sprite RenderSquare(Vertex v1,Vertex v2,Vertex v3,Vertex v4,Color color) {
		Vector2 _v1 = v1.pos;
		Vector2 _v2 = v2.pos;
		Vector2 _v3 = v3.pos;
		Vector2 _v4 = v4.pos;
		
		glBegin(GL_QUADS);
		glColor4f(color.R,color.G,color.B,color.A);
		glVertex2f(_v1.x,_v1.y);
		glVertex2f(_v2.x,_v2.y);
		glVertex2f(_v3.x,_v3.y);
		glVertex2f(_v4.x,_v4.y);
		glEnd();
		//glTranslatef(0.01f,0f,0f);
		return new Sprite();
	}
	//TODO: Render Image Func
}
