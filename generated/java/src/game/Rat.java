package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Rat extends Piece {
  public void cg_init_Rat_1(final Object a_color, final Number a_value) {

    cg_init_Piece_1(((Object) a_color), a_value);
  }

  public Rat(final Object a_color, final Number a_value) {

    cg_init_Rat_1(a_color, a_value);
  }

  public Boolean canMoveTo(final Tile ti, final Tile tf) {

    Boolean orResult_20 = false;

    Boolean andResult_21 = false;

    if (Utils.equals(
        Utils.abs(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue()),
        1L)) {
      if (Utils.equals(
          ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
              - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue(),
          0L)) {
        andResult_21 = true;
      }
    }

    if (andResult_21) {
      orResult_20 = true;
    } else {
      Boolean andResult_22 = false;

      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
                  - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue()),
          1L)) {
        if (Utils.equals(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue(),
            0L)) {
          andResult_22 = true;
        }
      }

      orResult_20 = andResult_22;
    }

    if (orResult_20) {
      Boolean orResult_21 = false;

      Boolean orResult_22 = false;

      if (Utils.equals(tf.getPiece(), null)) {
        orResult_22 = true;
      } else {
        orResult_22 = ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue();
      }

      if (orResult_22) {
        orResult_21 = true;
      } else {
        Boolean orResult_23 = false;

        Boolean andResult_23 = false;

        if (Utils.is_(ti.getPiece(), Rat.class)) {
          Boolean andResult_24 = false;

          if (Utils.is_(tf.getPiece(), Elephant.class)) {
            if (Utils.equals(ti.isRiver(), false)) {
              andResult_24 = true;
            }
          }

          if (andResult_24) {
            andResult_23 = true;
          }
        }

        if (andResult_23) {
          orResult_23 = true;
        } else {
          orResult_23 = Utils.equals(tf.isTrap(), true);
        }

        orResult_21 = orResult_23;
      }

      return orResult_21;

    } else {
      return false;
    }
  }

  public Rat() {}

  public String toString() {

    return "Rat{}";
  }
}
