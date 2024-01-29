public class GameEntity {
    private int entityHealth;
    private int entityAttack;

    public GameEntity() {
    }

    public GameEntity(int entityHealth, int entityAttack) {
    }

    public int getEntityAttack() {
        return this.entityAttack;
    }

    public void setEntityAttack(int entityAttack) {
        this.entityAttack = entityAttack;
    }

    public int getEntityHealth() {
        return entityHealth;
    }

    public void setEntityHealth(int entityHealth) {
        this.entityHealth = entityHealth;
    }


    protected void info() {
        return;
    }
}
