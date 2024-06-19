package object;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_Chair_1 extends Entity {
    GamePanel gp;

    public OBJ_Chair_1(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = type_solid;
        name = "Chair";
        down1 = setup("/object/chair.1", gp.tileSize, gp.tileSize);
        collision = true;

    }
}