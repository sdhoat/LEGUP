package edu.rpi.legup.puzzle.nurikabe.elements;

import edu.rpi.legup.model.elements.PlaceableElement;

public class NumberTile extends PlaceableElement {
    private int object_num;

    public NumberTile() {
        super(
                "NURI-ELEM-0002",
                "Number Tile",
                "A numbered tile",
                "edu/rpi/legup/images/nurikabe/tiles/NumberTile.png");
        object_num = 0;
    }

    /**
     * @return this object's tile number...
     */
    public int getTileNumber() {
        return object_num;
    }

    /**
     * @param num Amount to set tile object to.
     */
    public void setTileNumber(int num) {
        object_num = num;
    }
}
