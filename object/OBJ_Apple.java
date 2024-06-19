package object;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_Apple extends Entity {
    GamePanel gp;

    public OBJ_Apple(GamePanel gp) {
        super(gp);
        this.gp = gp;
        name = "Apple";
        type = type_comsumable;
        value = 1;
        down1 = setup("/object/apple", gp.tileSize, gp.tileSize);
        description = "[Apple]\nA sweat apple";
        price = 5;
        stackable = true;
    }

    public boolean use(Entity entity) {
        gp.playSE(9);
        gp.ui.showMessage("HP + " + value);
        entity.HP += value;
        return true;
    }

}
