package Game;

import static org.lwjgl.opengl.GL11.glTranslatef;

import ASDFEngine.Color;
import ASDFEngine.Graphics;
import ASDFEngine.IRenderer;
import ASDFEngine.Sprite;
import ASDFEngine.Vector2;
import ASDFEngine.Vertex;

public class GameManager implements IRenderer{
	public static int width = 1920;
	public static int height = 1080;
	public static Color Background = new Color(0,0.5f,0.5f,1);
	@Override
	public void Update() {
		Sprite sprite = Graphics.RenderSquare(new Vertex(new Vector2(0.0f,0.5f)), new Vertex(new Vector2(0.5f,0.5f)), new Vertex(new Vector2(0.0f,-0.5f)),new Vertex(new Vector2(-0.5f,-0.5f)),new Color(1,0,0,1));
		Sprite.Translatef(0.01f,0f,0f);
		
	}
	@Override
	public void Start() {
		// TODO Auto-generated method stub
		//new Renderer(new Color(0,0,0,1),800,800,"Hello",new Hi());
		
	}
	
	
}
