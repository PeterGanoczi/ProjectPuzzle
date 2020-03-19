package sample;

public class Field {

    private Tile[][] tiles;

    public Field(){
        initField();
    }

    private void initField() {
        tiles=new Tile[4][4];
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles.length; j++){
                tiles[i][j]=new Tile();
            }
        }

    }
}
