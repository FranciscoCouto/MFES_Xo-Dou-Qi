package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  public static final Number XSize = 7L;
  public static final Number YSize = 9L;
  private VDMSeq board = SeqUtil.seq(SeqUtil.seq());
  private static Board boardInstance = new Board();

  public void buildBoard() {

    board =
        SeqUtil.seq(
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 1L), new Lion(quotes.BlueQuote.getInstance(), 7L)),
                new Tile(SeqUtil.seq(2L, 1L)),
                new Tile(SeqUtil.seq(3L, 1L)),
                new Tile(SeqUtil.seq(4L, 1L)),
                new Tile(SeqUtil.seq(5L, 1L)),
                new Tile(SeqUtil.seq(6L, 1L)),
                new Tile(SeqUtil.seq(7L, 1L), new Tiger(quotes.BlueQuote.getInstance(), 6L))),
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 2L)),
                new Tile(SeqUtil.seq(2L, 2L), new Dog(quotes.BlueQuote.getInstance(), 3L)),
                new Tile(SeqUtil.seq(3L, 2L)),
                new Tile(SeqUtil.seq(4L, 2L)),
                new Tile(SeqUtil.seq(5L, 2L)),
                new Tile(SeqUtil.seq(6L, 2L), new Cat(quotes.BlueQuote.getInstance(), 2L)),
                new Tile(SeqUtil.seq(7L, 2L))),
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 3L), new Rat(quotes.BlueQuote.getInstance(), 1L)),
                new Tile(SeqUtil.seq(2L, 3L)),
                new Tile(SeqUtil.seq(3L, 3L), new Leopard(quotes.BlueQuote.getInstance(), 5L)),
                new Tile(SeqUtil.seq(4L, 3L)),
                new Tile(SeqUtil.seq(5L, 3L), new Wolf(quotes.BlueQuote.getInstance(), 4L)),
                new Tile(SeqUtil.seq(6L, 3L)),
                new Tile(SeqUtil.seq(7L, 3L), new Elephant(quotes.BlueQuote.getInstance(), 8L))),
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 4L)),
                new Tile(SeqUtil.seq(2L, 4L)),
                new Tile(SeqUtil.seq(3L, 4L)),
                new Tile(SeqUtil.seq(4L, 4L)),
                new Tile(SeqUtil.seq(5L, 4L)),
                new Tile(SeqUtil.seq(6L, 4L)),
                new Tile(SeqUtil.seq(7L, 4L))),
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 5L)),
                new Tile(SeqUtil.seq(2L, 5L)),
                new Tile(SeqUtil.seq(3L, 5L)),
                new Tile(SeqUtil.seq(4L, 5L)),
                new Tile(SeqUtil.seq(5L, 5L)),
                new Tile(SeqUtil.seq(6L, 5L)),
                new Tile(SeqUtil.seq(7L, 5L))),
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 6L)),
                new Tile(SeqUtil.seq(2L, 6L)),
                new Tile(SeqUtil.seq(3L, 6L)),
                new Tile(SeqUtil.seq(4L, 6L)),
                new Tile(SeqUtil.seq(5L, 6L)),
                new Tile(SeqUtil.seq(6L, 6L)),
                new Tile(SeqUtil.seq(7L, 6L))),
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 7L), new Elephant(quotes.RedQuote.getInstance(), 8L)),
                new Tile(SeqUtil.seq(2L, 7L)),
                new Tile(SeqUtil.seq(3L, 7L), new Wolf(quotes.RedQuote.getInstance(), 4L)),
                new Tile(SeqUtil.seq(4L, 7L)),
                new Tile(SeqUtil.seq(5L, 7L), new Leopard(quotes.RedQuote.getInstance(), 5L)),
                new Tile(SeqUtil.seq(6L, 7L)),
                new Tile(SeqUtil.seq(7L, 7L), new Rat(quotes.RedQuote.getInstance(), 1L))),
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 8L)),
                new Tile(SeqUtil.seq(2L, 8L), new Cat(quotes.RedQuote.getInstance(), 2L)),
                new Tile(SeqUtil.seq(3L, 8L)),
                new Tile(SeqUtil.seq(4L, 8L)),
                new Tile(SeqUtil.seq(5L, 8L)),
                new Tile(SeqUtil.seq(6L, 8L), new Dog(quotes.RedQuote.getInstance(), 3L)),
                new Tile(SeqUtil.seq(7L, 8L))),
            SeqUtil.seq(
                new Tile(SeqUtil.seq(1L, 9L), new Tiger(quotes.RedQuote.getInstance(), 6L)),
                new Tile(SeqUtil.seq(2L, 9L)),
                new Tile(SeqUtil.seq(3L, 9L)),
                new Tile(SeqUtil.seq(4L, 9L)),
                new Tile(SeqUtil.seq(5L, 9L)),
                new Tile(SeqUtil.seq(6L, 9L)),
                new Tile(SeqUtil.seq(7L, 9L), new Lion(quotes.RedQuote.getInstance(), 7L))));
  }

  public static Board getBoard() {

    return Board.boardInstance;
  }

  public Tile getTile(final VDMSeq a_coords) {

    return ((Tile)
        Utils.get(
            ((VDMSeq) Utils.get(board, ((Number) Utils.get(a_coords, 2L)))),
            ((Number) Utils.get(a_coords, 1L))));
  }

  public Board() {}

  public String toString() {

    return "Board{"
        + "XSize = "
        + Utils.toString(XSize)
        + ", YSize = "
        + Utils.toString(YSize)
        + ", board := "
        + Utils.toString(board)
        + ", boardInstance := "
        + Utils.toString(boardInstance)
        + "}";
  }
}
