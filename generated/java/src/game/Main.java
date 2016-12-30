package game;

import java.util.Scanner;

import org.overture.codegen.runtime.SeqUtil;

public class Main {
	
	// The game board and the game status
	   public static final int ROWS = 9, COLS = 7; // number of rows and columns
	
	private static Game game = new Game();
	
	public static Scanner in = new Scanner(System.in); // the input Scanner
	
	public static void main(String[] args) {
		
		printBoard();
		do {
	         playerMove(); // update currentRow and currentCol
	         printBoard();
	         game.changePlayer();
	 
	      } while (!game.checkGameOver()); // repeat if not game-over
	}
	
	public static void playerMove() {
		
		boolean validInput = false;  // for input validation
	      do {
	    	  if (game.getcurrentPlayer().toString().equals("<Player1>")) {
	              System.out.print("Player 1, enter your move (xi,yi and xf,yf): ");
	           } else {
	        	   System.out.print("Player 2, enter your move (xi,yi and xf,yf): ");
	           }

	         int ix = in.nextInt();  // array index starts at 0 instead of 1
	         int iy = in.nextInt();
	         int fx = in.nextInt();  // array index starts at 0 instead of 1
	         int fy = in.nextInt();
	         
	         if(game.movePieceTo(SeqUtil.seq(ix, iy), SeqUtil.seq(fx, fy))
	        		 && ix >= 1 && ix <= COLS && iy >= 1 && iy <= ROWS 
	        		 && fx >= 1 && fx <= COLS && fy >= 1 && fy <= ROWS ){
	        	   validInput = true;  // input okay, exit loop
	         } else {
	            System.out.println("This move is not valid. Try again...");
	         }
		
	      } while (!validInput);  // repeat until input is valid
		
	}
	
	/** Print the game board */
	   public static void printBoard() {
		   
	      for (int row = 1; row <= game.getBoard().YSize.intValue(); ++row) {
	         for (int col = 1; col <= game.getBoard().XSize.intValue(); ++col) {
	        	 if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() != null &&
	        		game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece().getValue().intValue() == 7)
	        	 	printCell(1); // print each of the cells
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() != null &&
	        			 game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece().getValue().intValue() == 6)
	 	        	 	printCell(2);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() != null &&
	        			 game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece().getValue().intValue() == 3)
		 	        	 	printCell(3);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() != null &&
	        			 game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece().getValue().intValue() == 2)
		 	        	 	printCell(4);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() != null &&
	        			 game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece().getValue().intValue() == 1)
		 	        	 	printCell(5);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() != null &&
	        			 game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece().getValue().intValue() == 5)
		 	        	 	printCell(6);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() != null &&
	        			 game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece().getValue().intValue() == 4)
		 	        	 	printCell(7);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() != null &&
	        			 game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece().getValue().intValue() == 8)
		 	        	 	printCell(8);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() == null &&
		 	        		game.getBoard().getTile(SeqUtil.seq(col, row)).isTrap())
		 	        	 	printCell(9);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() == null &&
		 	        		game.getBoard().getTile(SeqUtil.seq(col, row)).isRiver())
		 	        	 	printCell(10);
	        	 else if(game.getBoard().getTile(SeqUtil.seq(col, row)).getPiece() == null &&
		 	        		(row == 1 && col == 4 || row == 9 && col == 4))
		 	        	 	printCell(11);
	        	 else printCell(0);
	        	 
	        	 if (col != COLS ) {
	                 System.out.print("|");   // print vertical partition
	              }

	         }
	         System.out.println();
	      }
	      System.out.println();
	   }
	   
	   /** Print a cell with the specified "content" */
	   public static void printCell(int content) {
	      switch (content) {
	         case 0:  System.out.print("   "); break; //Tile Vazia
	         case 1: System.out.print(" L "); break; //Tile Leão
	         case 2: System.out.print(" T "); break; //Tile Tigre
	         case 3: System.out.print(" D "); break; //Tile Cão
	         case 4: System.out.print(" C "); break; //Tile Gato
	         case 5: System.out.print(" M "); break; //Tile Rato
	         case 6: System.out.print(" J "); break; //Tile Leopardo
	         case 7: System.out.print(" W "); break; //Tile Lobo
	         case 8: System.out.print(" E "); break; //Tile Elefante
	         case 9: System.out.print(" X "); break; //Tile Armadilha
	         case 10: System.out.print(" R "); break; //Tile Rio
	         case 11: System.out.print(" H "); break; //Tile Toca
	      }
	   }

}
