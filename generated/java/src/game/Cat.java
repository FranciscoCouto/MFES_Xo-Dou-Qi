package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Cat extends Piece {
  public void cg_init_Cat_1(final Object a_color, final Number a_value) {

    cg_init_Piece_1(((Object) a_color), a_value);
  }

  public Cat(final Object a_color, final Number a_value) {

    cg_init_Cat_1(a_color, a_value);
  }

  public Boolean canMoveTo(final Tile ti, final Tile tf) {

    Boolean andResult_1 = false;

    Boolean orResult_1 = false;

    Boolean andResult_2 = false;

    if (Utils.equals(
        Utils.abs(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue()),
        1L)) {
      if (Utils.equals(
          ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
              - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue(),
          0L)) {
        andResult_2 = true;
      }
    }

    if (andResult_2) {
      orResult_1 = true;
    } else {
      Boolean andResult_3 = false;

      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
                  - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue()),
          1L)) {
        if (Utils.equals(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue(),
            0L)) {
          andResult_3 = true;
        }
      }

      orResult_1 = andResult_3;
    }

    if (orResult_1) {
      if (Utils.equals(tf.isRiver(), false)) {
        andResult_1 = true;
      }
    }

    if (andResult_1) {
      Boolean orResult_2 = false;

      if (Utils.equals(tf.getPiece(), null)) {
        orResult_2 = true;
      } else {
        Boolean orResult_3 = false;

        if (ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue()) {
          orResult_3 = true;
        } else {
          orResult_3 = Utils.equals(tf.isTrap(), true);
        }

        orResult_2 = orResult_3;
      }

      return orResult_2;

    } else {
      return false;
    }
  }

  public Cat() {}

  public String toString() {

    return "Cat{}";
  }
}
