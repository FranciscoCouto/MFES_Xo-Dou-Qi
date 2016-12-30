package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
abstract public class Piece {
  public Object color;
  public Number value;

  public void cg_init_Piece_1(final Object a_color, final Number a_value) {

    color = a_color;
    value = a_value;
  }

  public Piece(final Object a_color, final Number a_value) {

    cg_init_Piece_1(a_color, a_value);
  }

  public Object getColor() {

    return this.color;
  }

  public Number getValue() {

    return this.value;
  }

  public abstract Boolean canMoveTo(final Tile ti, final Tile tf);

  public Boolean isAllRiverH(final Tile ti, final Tile tf) {

    if (Utils.equals(
        ((Number) Utils.get(ti.getCoordinates(), 2L)),
        ((Number) Utils.get(tf.getCoordinates(), 2L)))) {
      Number tempx = ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue() + 1L;
      Boolean whileCond_1 = true;
      while (whileCond_1) {
        whileCond_1 = tempx.longValue() < ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue();
        if (!(whileCond_1)) {
          break;
        }

        {
          Tile tempT = new Tile(SeqUtil.seq(tempx, ((Number) Utils.get(ti.getCoordinates(), 2L))));
          Boolean orResult_18 = false;

          if (Utils.equals(tempT.isRiver(), false)) {
            orResult_18 = true;
          } else {
            orResult_18 = Utils.is_(tempT.getPiece(), Rat.class);
          }

          if (orResult_18) {
            return false;

          } else {
            tempx = tempx.longValue() + 1L;
          }
        }
      }

      return true;

    } else {
      return false;
    }
  }

  public Boolean isAllRiverV(final Tile ti, final Tile tf) {

    if (Utils.equals(
        ((Number) Utils.get(ti.getCoordinates(), 1L)),
        ((Number) Utils.get(tf.getCoordinates(), 1L)))) {
      Number tempy = ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue() + 1L;
      Boolean whileCond_2 = true;
      while (whileCond_2) {
        whileCond_2 = tempy.longValue() < ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue();
        if (!(whileCond_2)) {
          break;
        }

        {
          Tile tempT = new Tile(SeqUtil.seq(((Number) Utils.get(ti.getCoordinates(), 1L)), tempy));
          Boolean orResult_19 = false;

          if (Utils.equals(tempT.isRiver(), false)) {
            orResult_19 = true;
          } else {
            orResult_19 = Utils.is_(tempT.getPiece(), Rat.class);
          }

          if (orResult_19) {
            return false;

          } else {
            tempy = tempy.longValue() + 1L;
          }
        }
      }

      return true;

    } else {
      return false;
    }
  }

  public Boolean movePieceTo(final Tile ti, final Tile tf) {

    if (ti.getPiece().canMoveTo(ti, tf)) {
      tf.setPiece(ti.getPiece());
      ti.setPiece(null);
      return true;

    } else {
      return false;
    }
  }

  public Piece() {}

  public String toString() {

    return "Piece{"
        + "color := "
        + Utils.toString(color)
        + ", value := "
        + Utils.toString(value)
        + "}";
  }
}
