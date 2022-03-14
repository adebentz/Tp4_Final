package com.isep.rpg;
import java.util.*;

public abstract class Hero {
    public int lifePoints;
    public int armor;
    public int weaponDamage;
    public List<Potion> potions;
    public List<Food> lembas;
    abstract void attack();
    abstract void defend();
    abstract void useConsumable(Consumable consumable);
}
