package com.tsukuba.project.entities;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.tsukuba.project.Assets;
import com.tsukuba.project.components.AIComponent;
import com.tsukuba.project.components.DrawableComponent;
import com.tsukuba.project.components.HealthComponent;
import com.tsukuba.project.components.MovementComponent;
import com.tsukuba.project.components.TransformComponent;

public class PlanetFactory {
	public static Entity create(PooledEngine engine, float x, float y, int size, int id) {
		
		DrawableComponent drawable = engine.createComponent(DrawableComponent.class);			
        TransformComponent transform = engine.createComponent(TransformComponent.class);
        
        transform.position.set(x,y,0);
        transform.scale.set(size,size);
        
        switch(size) {
        case 0 :
        	drawable.sprite = new TextureRegion(Assets.asteroid);
        	transform.scale.set(0.2f,0.2f);
        	break;
        case 1 :
        	drawable.sprite = new TextureRegion(Assets.planet);
        	break;
        case 2 :
        	drawable.sprite = new TextureRegion(Assets.planet);
        	break;
        case 3 :
        	drawable.sprite = new TextureRegion(Assets.planetHangar);
        	break;
        case 4 :
        	drawable.sprite = new TextureRegion(Assets.planetHangar);
        	break;
        }
        	              
        Entity planet = engine.createEntity();
        planet.add(drawable);
        planet.add(transform);

        engine.addEntity(planet);
		
		return planet;
	}
}
