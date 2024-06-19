package object;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_Bed_2 extends Entity {
    GamePanel gp;

    public OBJ_Bed_2(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = type_solid;
        name = "Bed";
        down1 = setup("/object/bed/bed.2", gp.tileSize, gp.tileSize);
        collision = true;

    }
}