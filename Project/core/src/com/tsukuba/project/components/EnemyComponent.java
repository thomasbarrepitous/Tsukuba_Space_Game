package com.tsukuba.project.components;

import com.badlogic.ashley.core.Component;

public class EnemyComponent implements Component {
    public enum EnemyType {MINE,SHOOTER,BOSS}

    public EnemyType type;
    public int contactDamage = 0;
}
