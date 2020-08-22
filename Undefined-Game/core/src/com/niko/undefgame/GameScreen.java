package com.niko.undefgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class GameScreen implements Screen {

	UndefinedCore game;
	GameWorld gameWorld;
	
	public GameScreen(UndefinedCore game) {
		this.game = game;
		gameWorld = new GameWorld();
		Gdx.input.setCursorCatched(true);
	}
	
	@Override
	public void render(float delta) {
		gameWorld.render(delta);
	}
	@Override
	public void resize(int width, int height) {
		gameWorld.resize(width, height);
	}
	@Override
	public void dispose() {
		gameWorld.dispose();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
}