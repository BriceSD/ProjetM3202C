/*
 * Graphe.java
 * SAUNIER DEBES Brice
 * 25/11/15
 */


public class Graphe {
  int[][] sommets;

  public Graphe() {
    sommets = new int[10][10];
    sommets[0][0] = 0;
    sommets[0][1] = 85;
    sommets[0][2] = 217;
    sommets[0][3] = -1;
    sommets[0][4] = 173;
    sommets[0][5] = -1;
    sommets[0][6] = -1;
    sommets[0][7] = -1;
    sommets[0][8] = -1;
    sommets[0][9] = -1;

    sommets[1][0] = 85;
    sommets[1][1] = 0;
    sommets[1][2] = -1;
    sommets[1][3] = -1;
    sommets[1][4] = -1;
    sommets[1][5] = 80;
    sommets[1][6] = -1;
    sommets[1][7] = -1;
    sommets[1][8] = -1;
    sommets[1][9] = -1;

    sommets[2][0] = 217;
    sommets[2][1] = -1;
    sommets[2][2] = 0;
    sommets[2][3] = -1;
    sommets[2][4] = -1;
    sommets[2][5] = -1;
    sommets[2][6] = 186;
    sommets[2][7] = 103;
    sommets[2][8] = -1;
    sommets[2][9] = -1;

    sommets[3][0] = -1;
    sommets[3][1] = -1;
    sommets[3][2] = -1;
    sommets[3][3] = 0;
    sommets[3][4] = -1;
    sommets[3][5] = -1;
    sommets[3][6] = -1;
    sommets[3][7] = 183;
    sommets[3][8] = -1;
    sommets[3][9] = -1;

    sommets[4][0] = 173;
    sommets[4][1] = -1;
    sommets[4][2] = -1;
    sommets[4][3] = -1;
    sommets[4][4] = 0;
    sommets[4][5] = -1;
    sommets[4][6] = -1;
    sommets[4][7] = -1;
    sommets[4][8] = -1;
    sommets[4][9] = 502;

    sommets[5][0] = -1;
    sommets[5][1] = 80;
    sommets[5][2] = -1;
    sommets[5][3] = -1;
    sommets[5][4] = -1;
    sommets[5][5] = 0;
    sommets[5][6] = -1;
    sommets[5][7] = -1;
    sommets[5][8] = 250;
    sommets[5][9] = -1;

    sommets[6][0] = -1;
    sommets[6][1] = -1;
    sommets[6][2] = 186;
    sommets[6][3] = -1;
    sommets[6][4] = -1;
    sommets[6][5] = -1;
    sommets[6][6] = 0;
    sommets[6][7] = -1;
    sommets[6][8] = -1;
    sommets[6][9] = -1;

    sommets[7][0] = -1;
    sommets[7][1] = -1;
    sommets[7][2] = 103;
    sommets[7][3] = 103;
    sommets[7][4] = -1;
    sommets[7][5] = -1;
    sommets[7][6] = -1;
    sommets[7][7] = 0;
    sommets[7][8] = -1;
    sommets[7][9] = 167;

    sommets[8][0] = -1;
    sommets[8][1] = -1;
    sommets[8][2] = -1;
    sommets[8][3] = -1;
    sommets[8][4] = -1;
    sommets[8][5] = 250;
    sommets[8][6] = -1;
    sommets[8][7] = -1;
    sommets[8][8] = 0;
    sommets[8][9] = 84;

    sommets[9][0] = -1;
    sommets[9][1] = -1;
    sommets[9][2] = -1;
    sommets[9][3] = -1;
    sommets[9][4] = 502;
    sommets[9][5] = -1;
    sommets[9][6] = -1;
    sommets[9][7] = 167;
    sommets[9][8] = 84;
    sommets[9][9] = 0;

  }
}
