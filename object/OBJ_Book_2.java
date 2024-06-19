package object;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_Book_2 extends Entity {
    GamePanel gp;

    public OBJ_Book_2(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = type_solid;
        name = "Book";
        down1 = setup("/object/bookshelf/book.2", gp.tileSize, gp.tileSize);
        collision = true;

    }
}