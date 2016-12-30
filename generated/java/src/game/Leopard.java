package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Leopard extends Piece {
  public void cg_init_Leopard_1(final Object a_color, final Number a_value) {

    cg_init_Piece_1(((Object) a_color), a_value);
  }

  public Leopard(final Object a_color, final Number a_value) {

    cg_init_Leopard_1(a_color, a_value);
  }

  public Boolean canMoveTo(final Tile ti, final Tile tf) {

    Boolean andResult_15 = false;

    Boolean orResult_10 = false;

    Boolean andResult_16 = false;

    if (Utils.equals(
        Utils.abs(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue()),
        1L)) {
      if (Utils.equals(
          ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
              - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue(),
          0L)) {
        andResult_16 = true;
      }
    }

    if (andResult_16) {
      orResult_10 = true;
    } else {
      Boolean andResult_17 = false;

      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
                  - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue()),
          1L)) {
        if (Utils.equals(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue(),
            0L)) {
          andResult_17 = true;
        }
      }

      orResult_10 = andResult_17;
    }

    if (orResult_10) {
      if (Utils.equals(tf.isRiver(), false)) {
        andResult_15 = true;
      }
    }

    if (andResult_15) {
      Boolean orResult_11 = false;

      if (Utils.equals(tf.getPiece(), null)) {
        orResult_11 = true;
      } else {
        Boolean orResult_12 = false;

        if (ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue()) {
          orResult_12 = true;
        } else {
          orResult_12 = Utils.equals(tf.isTrap(), true);
        }

        orResult_11 = orResult_12;
      }

      return orResult_11;

    } else {
      return false;
    }
  }

  public Leopard() {}

  public String toString() {

    return "Leopard{}";
  }
}
