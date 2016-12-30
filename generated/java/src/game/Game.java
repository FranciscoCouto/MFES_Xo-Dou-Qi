package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Game {
  private Board board = new Board();
  private Object currentPlayer;

  public void cg_init_Game_1() {

    board = Board.getBoard();
    board.buildBoard();
    currentPlayer = quotes.Player1Quote.getInstance();
  }

  public Game() {

    cg_init_Game_1();
  }

  public void changePlayer() {

    if (Utils.equals(currentPlayer, quotes.Player1Quote.getInstance())) {
      currentPlayer = quotes.Player2Quote.getInstance();
    } else {
      currentPlayer = quotes.Player1Quote.getInstance();
    }
  }

  public Boolean movePieceTo(final VDMSeq i_coords, final VDMSeq f_coords) {

    Boolean andResult_10 = false;

    if (!(Utils.equals(board.getTile(Utils.copy(i_coords)).getPiece(), null))) {
      Boolean orResult_8 = false;

      Boolean andResult_11 = false;

      if (Utils.equals(
          board.getTile(Utils.copy(i_coords)).getPiece().getColor(),
          quotes.BlueQuote.getInstance())) {
        if (Utils.equals(currentPlayer, quotes.Player1Quote.getInstance())) {
          andResult_11 = true;
        }
      }

      if (andResult_11) {
        orResult_8 = true;
      } else {
        Boolean andResult_12 = false;

        if (Utils.equals(
            board.getTile(Utils.copy(i_coords)).getPiece().getColor(),
            quotes.RedQuote.getInstance())) {
          if (Utils.equals(currentPlayer, quotes.Player2Quote.getInstance())) {
            andResult_12 = true;
          }
        }

        orResult_8 = andResult_12;
      }

      if (orResult_8) {
        andResult_10 = true;
      }
    }

    if (andResult_10) {
      return board
          .getTile(Utils.copy(i_coords))
          .getPiece()
          .movePieceTo(board.getTile(Utils.copy(i_coords)), board.getTile(Utils.copy(f_coords)));

    } else {
      return false;
    }
  }

  public Boolean checkGameOver() {

    Boolean orResult_9 = false;

    Boolean andResult_13 = false;

    if (!(Utils.equals(board.getTile(SeqUtil.seq(4L, 1L)).getPiece(), null))) {
      if (Utils.equals(
          board.getTile(SeqUtil.seq(4L, 1L)).getPiece().getColor(),
          quotes.RedQuote.getInstance())) {
        andResult_13 = true;
      }
    }

    if (andResult_13) {
      orResult_9 = true;
    } else {
      Boolean andResult_14 = false;

      if (!(Utils.equals(board.getTile(SeqUtil.seq(4L, 9L)).getPiece(), null))) {
        if (Utils.equals(
            board.getTile(SeqUtil.seq(4L, 9L)).getPiece().getColor(),
            quotes.BlueQuote.getInstance())) {
          andResult_14 = true;
        }
      }

      orResult_9 = andResult_14;
    }

    if (orResult_9) {
      return true;
    }

    return false;
  }

  public Board getBoard() {

    return board;
  }

  public Object getcurrentPlayer() {

    return currentPlayer;
  }

  public String toString() {

    return "Game{"
        + "board := "
        + Utils.toString(board)
        + ", currentPlayer := "
        + Utils.toString(currentPlayer)
        + "}";
  }
}
