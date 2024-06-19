package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Lancer extends Entity {
    GamePanel gp;

    public OBJ_Lancer(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = type_comsumable;
        name = "SQ";
        down1 = setup("/object/lancer1", gp.tileSize, gp.tileSize);
        description = "Just a SQ";
        price = 100;

    }

}