package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class GameTest {
  private void assertTrue(final Boolean cond) {

    return;
  }

  private void testCatMovement() {

    Piece c = new Cat(quotes.RedQuote.getInstance(), 2L);
    Piece r = new Rat(quotes.BlueQuote.getInstance(), 1L);
    Piece l = new Lion(quotes.BlueQuote.getInstance(), 7L);
    Tile t1 = new Tile(SeqUtil.seq(1L, 1L), c);
    Tile t2 = new Tile(SeqUtil.seq(1L, 2L));
    Tile t3 = new Tile(SeqUtil.seq(2L, 1L));
    Tile t4 = new Tile(SeqUtil.seq(2L, 2L));
    Tile t5 = new Tile(SeqUtil.seq(1L, 2L), r);
    Tile t6 = new Tile(SeqUtil.seq(1L, 2L), l);
    assertTrue(c.canMoveTo(t1, t2));
    assertTrue(c.canMoveTo(t1, t3));
    assertTrue(Utils.equals(c.canMoveTo(t1, t4), false));
    assertTrue(c.canMoveTo(t1, t5));
    assertTrue(Utils.equals(c.canMoveTo(t1, t6), false));
  }

  private void testDogMovement() {

    Piece d = new Dog(quotes.RedQuote.getInstance(), 3L);
    Piece r = new Rat(quotes.BlueQuote.getInstance(), 1L);
    Piece l = new Lion(quotes.BlueQuote.getInstance(), 7L);
    Tile t1 = new Tile(SeqUtil.seq(1L, 1L), d);
    Tile t2 = new Tile(SeqUtil.seq(1L, 2L));
    Tile t3 = new Tile(SeqUtil.seq(2L, 1L));
    Tile t4 = new Tile(SeqUtil.seq(2L, 2L));
    Tile t5 = new Tile(SeqUtil.seq(1L, 2L), r);
    Tile t6 = new Tile(SeqUtil.seq(1L, 2L), l);
    assertTrue(d.canMoveTo(t1, t2));
    assertTrue(d.canMoveTo(t1, t3));
    assertTrue(Utils.equals(d.canMoveTo(t1, t4), false));
    assertTrue(d.canMoveTo(t1, t5));
    assertTrue(Utils.equals(d.canMoveTo(t1, t6), false));
  }

  private void testElephantMovement() {

    Piece e = new Elephant(quotes.RedQuote.getInstance(), 8L);
    Piece r = new Rat(quotes.BlueQuote.getInstance(), 1L);
    Piece l = new Lion(quotes.BlueQuote.getInstance(), 7L);
    Tile t1 = new Tile(SeqUtil.seq(1L, 1L), e);
    Tile t2 = new Tile(SeqUtil.seq(1L, 2L));
    Tile t3 = new Tile(SeqUtil.seq(2L, 1L));
    Tile t4 = new Tile(SeqUtil.seq(2L, 2L));
    Tile t5 = new Tile(SeqUtil.seq(1L, 2L), r);
    Tile t6 = new Tile(SeqUtil.seq(1L, 2L), l);
    assertTrue(e.canMoveTo(t1, t2));
    assertTrue(e.canMoveTo(t1, t3));
    assertTrue(Utils.equals(e.canMoveTo(t1, t4), false));
    assertTrue(e.canMoveTo(t1, t5));
    assertTrue(e.canMoveTo(t1, t6));
  }

  private void testLeopardMovement() {

    Piece leo = new Leopard(quotes.RedQuote.getInstance(), 5L);
    Piece r = new Rat(quotes.BlueQuote.getInstance(), 1L);
    Piece l = new Lion(quotes.BlueQuote.getInstance(), 7L);
    Tile t1 = new Tile(SeqUtil.seq(1L, 1L), leo);
    Tile t2 = new Tile(SeqUtil.seq(1L, 2L));
    Tile t3 = new Tile(SeqUtil.seq(2L, 1L));
    Tile t4 = new Tile(SeqUtil.seq(2L, 2L));
    Tile t5 = new Tile(SeqUtil.seq(1L, 2L), r);
    Tile t6 = new Tile(SeqUtil.seq(1L, 2L), l);
    assertTrue(leo.canMoveTo(t1, t2));
    assertTrue(leo.canMoveTo(t1, t3));
    assertTrue(Utils.equals(leo.canMoveTo(t1, t4), false));
    assertTrue(leo.canMoveTo(t1, t5));
    assertTrue(Utils.equals(leo.canMoveTo(t1, t6), false));
  }

  private void testLionMovement() {

    Piece l = new Lion(quotes.RedQuote.getInstance(), 7L);
    Piece r = new Rat(quotes.BlueQuote.getInstance(), 1L);
    Piece e = new Elephant(quotes.BlueQuote.getInstance(), 8L);
    Tile t1 = new Tile(SeqUtil.seq(2L, 3L), l);
    Tile t8 = new Tile(SeqUtil.seq(1L, 4L), l);
    Tile t10 = new Tile(SeqUtil.seq(1L, 5L), l);
    Tile t2 = new Tile(SeqUtil.seq(2L, 2L));
    Tile t3 = new Tile(SeqUtil.seq(3L, 3L));
    Tile t4 = new Tile(SeqUtil.seq(1L, 4L));
    Tile t5 = new Tile(SeqUtil.seq(2L, 7L));
    Tile t6 = new Tile(SeqUtil.seq(3L, 3L), r);
    Tile t7 = new Tile(SeqUtil.seq(3L, 3L), e);
    Tile t9 = new Tile(SeqUtil.seq(4L, 4L));
    Tile t11 = new Tile(SeqUtil.seq(4L, 5L), r);
    assertTrue(l.canMoveTo(t1, t2));
    assertTrue(l.canMoveTo(t1, t3));
    assertTrue(Utils.equals(l.canMoveTo(t1, t4), false));
    assertTrue(l.canMoveTo(t1, t5));
    assertTrue(l.canMoveTo(t8, t9));
    assertTrue(l.canMoveTo(t10, t11));
    assertTrue(l.canMoveTo(t1, t6));
    assertTrue(Utils.equals(l.canMoveTo(t1, t7), false));
  }

  private void testRatMovement() {

    Piece r1 = new Rat(quotes.RedQuote.getInstance(), 1L);
    Piece r2 = new Rat(quotes.RedQuote.getInstance(), 1L);
    Piece e = new Elephant(quotes.BlueQuote.getInstance(), 8L);
    Piece l = new Lion(quotes.BlueQuote.getInstance(), 7L);
    Tile t1 = new Tile(SeqUtil.seq(2L, 3L), r1);
    Tile t2 = new Tile(SeqUtil.seq(2L, 2L));
    Tile t3 = new Tile(SeqUtil.seq(3L, 3L));
    Tile t4 = new Tile(SeqUtil.seq(1L, 4L));
    Tile t5 = new Tile(SeqUtil.seq(2L, 4L), r2);
    Tile t6 = new Tile(SeqUtil.seq(2L, 3L), e);
    Tile t7 = new Tile(SeqUtil.seq(3L, 3L), e);
    Tile t8 = new Tile(SeqUtil.seq(3L, 3L), l);
    Tile t9 = new Tile(SeqUtil.seq(2L, 5L));
    assertTrue(r1.canMoveTo(t1, t2));
    assertTrue(r1.canMoveTo(t1, t3));
    assertTrue(Utils.equals(r1.canMoveTo(t1, t4), false));
    assertTrue(Utils.equals(r2.canMoveTo(t5, t6), false));
    assertTrue(r2.canMoveTo(t5, t9));
    assertTrue(r1.canMoveTo(t1, t7));
    assertTrue(Utils.equals(r1.canMoveTo(t1, t8), false));
  }

  private void testTigerMovement() {

    Piece t = new Tiger(quotes.RedQuote.getInstance(), 6L);
    Piece r = new Rat(quotes.BlueQuote.getInstance(), 1L);
    Piece e = new Elephant(quotes.BlueQuote.getInstance(), 8L);
    Tile t1 = new Tile(SeqUtil.seq(2L, 3L), t);
    Tile t8 = new Tile(SeqUtil.seq(1L, 4L), t);
    Tile t10 = new Tile(SeqUtil.seq(1L, 5L), t);
    Tile t2 = new Tile(SeqUtil.seq(2L, 2L));
    Tile t3 = new Tile(SeqUtil.seq(3L, 3L));
    Tile t4 = new Tile(SeqUtil.seq(1L, 4L));
    Tile t5 = new Tile(SeqUtil.seq(2L, 7L));
    Tile t6 = new Tile(SeqUtil.seq(3L, 3L), r);
    Tile t7 = new Tile(SeqUtil.seq(3L, 3L), e);
    Tile t9 = new Tile(SeqUtil.seq(4L, 4L));
    Tile t11 = new Tile(SeqUtil.seq(4L, 5L), r);
    Tile t12 = new Tile(SeqUtil.seq(3L, 4L));
    Tile t13 = new Tile(SeqUtil.seq(2L, 5L));
    assertTrue(t.canMoveTo(t1, t2));
    assertTrue(t.canMoveTo(t1, t3));
    assertTrue(Utils.equals(t.canMoveTo(t1, t4), false));
    assertTrue(t.canMoveTo(t1, t5));
    assertTrue(t.canMoveTo(t1, t13));
    assertTrue(t.canMoveTo(t8, t9));
    assertTrue(t.canMoveTo(t8, t12));
    assertTrue(t.canMoveTo(t10, t11));
    assertTrue(t.canMoveTo(t1, t6));
    assertTrue(Utils.equals(t.canMoveTo(t1, t7), false));
  }

  private void testWolfMovement() {

    Piece w = new Wolf(quotes.RedQuote.getInstance(), 4L);
    Piece r = new Rat(quotes.BlueQuote.getInstance(), 1L);
    Piece l = new Lion(quotes.BlueQuote.getInstance(), 7L);
    Tile t1 = new Tile(SeqUtil.seq(1L, 1L), w);
    Tile t2 = new Tile(SeqUtil.seq(1L, 2L));
    Tile t3 = new Tile(SeqUtil.seq(2L, 1L));
    Tile t4 = new Tile(SeqUtil.seq(2L, 2L));
    Tile t5 = new Tile(SeqUtil.seq(1L, 2L), r);
    Tile t6 = new Tile(SeqUtil.seq(1L, 2L), l);
    assertTrue(w.canMoveTo(t1, t2));
    assertTrue(w.canMoveTo(t1, t3));
    assertTrue(Utils.equals(w.canMoveTo(t1, t4), false));
    assertTrue(w.canMoveTo(t1, t5));
    assertTrue(Utils.equals(w.canMoveTo(t1, t6), false));
  }

  private void testMovement() {

    Piece p = new Lion(quotes.BlueQuote.getInstance(), 7L);
    Piece p2 = new Rat(quotes.RedQuote.getInstance(), 1L);
    Piece p3 = new Wolf(quotes.RedQuote.getInstance(), 4L);
    Piece p4 = new Lion(quotes.BlueQuote.getInstance(), 7L);
    Tile tl1 = new Tile(SeqUtil.seq(1L, 1L), p);
    Tile tl2 = new Tile(SeqUtil.seq(2L, 1L));
    Tile tl3 = new Tile(SeqUtil.seq(1L, 1L), p2);
    Tile tl4 = new Tile(SeqUtil.seq(2L, 1L));
    Tile tl5 = new Tile(SeqUtil.seq(1L, 1L), p3);
    Tile tl6 = new Tile(SeqUtil.seq(2L, 2L));
    Tile tl7 = new Tile(SeqUtil.seq(1L, 2L));
    Tile tl8 = new Tile(SeqUtil.seq(2L, 3L), p4);
    Tile tl9 = new Tile(SeqUtil.seq(2L, 7L));
    Tile tl12 = new Tile(SeqUtil.seq(2L, 8L));
    Tile tl10 = new Tile(SeqUtil.seq(1L, 4L), p4);
    Tile tl11 = new Tile(SeqUtil.seq(4L, 4L));
    Tile tl13 = new Tile(SeqUtil.seq(5L, 4L));
    assertTrue(p.movePieceTo(tl1, tl2));
    assertTrue(Utils.equals(Utils.equals(tl2.getPiece(), null), false));
    assertTrue(Utils.equals(tl1.getPiece(), null));
    assertTrue(p2.movePieceTo(tl3, tl4));
    assertTrue(Utils.equals(Utils.equals(tl4.getPiece(), null), false));
    assertTrue(Utils.equals(tl3.getPiece(), null));
    assertTrue(Utils.equals(p3.movePieceTo(tl5, tl6), false));
    assertTrue(p3.movePieceTo(tl5, tl7));
    assertTrue(Utils.equals(Utils.equals(tl7.getPiece(), null), false));
    assertTrue(Utils.equals(tl5.getPiece(), null));
    assertTrue(p3.movePieceTo(tl7, tl6));
    assertTrue(Utils.equals(Utils.equals(tl6.getPiece(), null), false));
    assertTrue(Utils.equals(tl7.getPiece(), null));
    assertTrue(p4.isAllRiverV(tl8, tl9));
    assertTrue(Utils.equals(p4.isAllRiverV(tl8, tl12), false));
    assertTrue(p4.isAllRiverH(tl10, tl11));
    assertTrue(Utils.equals(p4.isAllRiverH(tl10, tl13), false));
  }

  private void testGameTurns() {

    Game g = new Game();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(Utils.equals(g.getcurrentPlayer(), quotes.Player1Quote.getInstance()));
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(Utils.equals(g.getcurrentPlayer(), quotes.Player2Quote.getInstance()));
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(Utils.equals(g.getcurrentPlayer(), quotes.Player1Quote.getInstance()));
    assertTrue(Utils.equals(g.movePieceTo(SeqUtil.seq(2L, 1L), SeqUtil.seq(2L, 2L)), false));
  }

  private void testGameEndPlayer1() {

    Game g = new Game();
    assertTrue(g.getBoard().getTile(SeqUtil.seq(3L, 3L)).getPiece() instanceof Leopard);
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(3L, 3L), SeqUtil.seq(4L, 3L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 3L), SeqUtil.seq(4L, 4L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 4L), SeqUtil.seq(4L, 5L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 5L), SeqUtil.seq(4L, 6L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 6L), SeqUtil.seq(4L, 7L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 7L), SeqUtil.seq(4L, 8L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 8L), SeqUtil.seq(4L, 9L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(g.checkGameOver());
  }

  private void testGameEndPlayer2() {

    Game g = new Game();
    g.changePlayer();
    assertTrue(g.getBoard().getTile(SeqUtil.seq(3L, 7L)).getPiece() instanceof Wolf);
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(3L, 7L), SeqUtil.seq(4L, 7L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 7L), SeqUtil.seq(4L, 6L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 6L), SeqUtil.seq(4L, 5L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 5L), SeqUtil.seq(4L, 4L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 4L), SeqUtil.seq(4L, 3L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 3L), SeqUtil.seq(4L, 2L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(Utils.equals(g.checkGameOver(), false));
    assertTrue(g.movePieceTo(SeqUtil.seq(4L, 2L), SeqUtil.seq(4L, 1L)));
    g.changePlayer();
    g.changePlayer();
    assertTrue(g.checkGameOver());
  }

  public static void main() {

    new GameTest().testCatMovement();
    new GameTest().testDogMovement();
    new GameTest().testElephantMovement();
    new GameTest().testTigerMovement();
    new GameTest().testRatMovement();
    new GameTest().testLionMovement();
    new GameTest().testLeopardMovement();
    new GameTest().testWolfMovement();
    new GameTest().testMovement();
    new GameTest().testGameTurns();
    new GameTest().testGameEndPlayer1();
    new GameTest().testGameEndPlayer2();
  }

  public GameTest() {}

  public String toString() {

    return "GameTest{}";
  }
}
