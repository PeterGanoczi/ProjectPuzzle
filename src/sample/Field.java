package sample;

import java.util.Random;

public class Field {

    private Tile[][] tiles;

    public Field(){
        initField();
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[][] tiles) {
        this.tiles = tiles;
    }

    private void initField() {
        tiles=new Tile[4][4];
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles.length; j++){
                tiles[i][j]=new Tile();
            }
        }
    }
    public void toggleTiles(int code){
        int xcol=code%4;
        int yrow=code/4;

        for (int jrow=0; jrow<tiles.length;jrow++){
            for (int icol=0; icol<tiles.length; icol++){
                if (!(xcol == icol && yrow == jrow) && Math.abs(xcol-icol) <= 1 && Math.abs(yrow-jrow) <= 1){
                    tiles[icol][jrow].toggle();
                }
            }
        }
    }


    public boolean isWinner(){
        int count=0;
        for (int i=0; i< tiles.length;i++){
            for (int j=0; i<tiles.length;j++){
                if(tiles[i][j].isValue())
                    count++;
            }
        }
        return count==16;
    }

    public void shuffle(){
        Random random = new Random();
        do {
            for (int i = 0; i < 20; i++) {
                toggleTiles(random.nextInt(15));
            }
        }while(isWinner());

    }





}
