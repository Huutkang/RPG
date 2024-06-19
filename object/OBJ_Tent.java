package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Tent extends Entity {
    GamePanel gp;

    public OBJ_Tent(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = type_comsumable;
        name = "Tent";
        down1 = setup("/object/tent", gp.tileSize, gp.tileSize);
        price = 300;
        stackable = true;
        description = "[Tent]\nYou can sleep inside.";

    }

    public boolean use(Entity entity) {
        gp.gameState = gp.sleepState;
        gp.music.stop();
        gp.playSE(15);
        gp.playMusic(16);
        gp.player.HP = gp.player.maxHP;
        gp.player.MP = gp.player.maxMP;
        return true;

    }
}
