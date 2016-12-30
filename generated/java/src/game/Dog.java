package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Dog extends Piece {
  public void cg_init_Dog_1(final Object a_color, final Number a_value) {

    cg_init_Piece_1(((Object) a_color), a_value);
  }

  public Dog(final Object a_color, final Number a_value) {

    cg_init_Dog_1(a_color, a_value);
  }

  public Boolean canMoveTo(final Tile ti, final Tile tf) {

    Boolean andResult_4 = false;

    Boolean orResult_4 = false;

    Boolean andResult_5 = false;

    if (Utils.equals(
        Utils.abs(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue()),
        1L)) {
      if (Utils.equals(
          ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
              - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue(),
          0L)) {
        andResult_5 = true;
      }
    }

    if (andResult_5) {
      orResult_4 = true;
    } else {
      Boolean andResult_6 = false;

      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
                  - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue()),
          1L)) {
        if (Utils.equals(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue(),
            0L)) {
          andResult_6 = true;
        }
      }

      orResult_4 = andResult_6;
    }

    if (orResult_4) {
      if (Utils.equals(tf.isRiver(), false)) {
        andResult_4 = true;
      }
    }

    if (andResult_4) {
      Boolean orResult_5 = false;

      if (Utils.equals(tf.getPiece(), null)) {
        orResult_5 = true;
      } else {
        Boolean orResult_6 = false;

        if (ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue()) {
          orResult_6 = true;
        } else {
          orResult_6 = Utils.equals(tf.isTrap(), true);
        }

        orResult_5 = orResult_6;
      }

      return orResult_5;

    } else {
      return false;
    }
  }

  public Dog() {}

  public String toString() {

    return "Dog{}";
  }
}
