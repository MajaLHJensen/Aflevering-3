int [][] board = new int [8][8];

void setup()
{ 
  size(350, 350);
      for(int row = 0; row < 8; row++)
      {
  //we are testing if the rows are equal to each other
      for(int column = 0; column < 8; column++)
      {
      if((row + column) %2 == 0)
      {
      board[row][column]=0;
      }
      else
      {
      board[row][column] = 1;
      }
    }
  }
}

void draw()
{
  CreatingBoard();
}
    void CreatingBoard()
{
  int sideLength = 40;
      for(int row = 0; row < 8; row++)
      {
      for(int column = 0; column < 8; column++)
      {
        if(board[row][column] == 1)
        {
          fill(255);
        }
        if (board[row][column] == 0)
        {
          fill(0);
        }
      rect(row * sideLength, column * sideLength, sideLength, sideLength);
    } 
    
  }
}
