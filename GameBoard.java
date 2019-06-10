package Avatar;

public class GameBoard {
    boolean[][][] gameboard;
    Player p1, p2;
    public GameBoard(Player p1, Player p2){
        this.p1 = p1; this.p2 = p2;
        gameboard = new boolean[3][4][2];
        //Default position
        gameboard[1][0][0] = true;
        gameboard[1][3][1] = true;
    }
    public void setPlayerPos(Player p, boolean isP1, int y, int x){
        int[] curPos = this.getPlayerPos((isP1) ? true : false);
        gameboard[curPos[0]][curPos[1]][(isP1) ? 0 : 1] = false;
        gameboard[y][x][(isP1) ? 0 : 1] = true;

    }
    public int[] getPlayerPos(boolean isP1){
        int[] pos = {-1, -1};
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                if (gameboard[i][j][(isP1) ? 0 : 1]){
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }

        return pos;
    }

    public void showBoard(){
        System.out.println("= = = = = = = = =");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                if (true){
                    System.out.printf("|%s %s", gameboard[i][j][0] == true? "1" : " ", gameboard[i][j][1] == true ? "2" : " ");
                }

            }
            System.out.printf("|\n= = = = = = = = =\n");
        }
    }
}
