package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Lion extends Piece {
  public void cg_init_Lion_1(final Object a_color, final Number a_value) {

    cg_init_Piece_1(((Object) a_color), a_value);
  }

  public Lion(final Object a_color, final Number a_value) {

    cg_init_Lion_1(a_color, a_value);
  }

  public Boolean canMoveTo(final Tile ti, final Tile tf) {

    Boolean andResult_18 = false;

    Boolean orResult_13 = false;

    Boolean andResult_19 = false;

    if (Utils.equals(
        Utils.abs(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue()),
        1L)) {
      if (Utils.equals(
          ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
              - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue(),
          0L)) {
        andResult_19 = true;
      }
    }

    if (andResult_19) {
      orResult_13 = true;
    } else {
      Boolean andResult_20 = false;

      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
                  - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue()),
          1L)) {
        if (Utils.equals(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue(),
            0L)) {
          andResult_20 = true;
        }
      }

      orResult_13 = andResult_20;
    }

    if (orResult_13) {
      if (Utils.equals(tf.isRiver(), false)) {
        andResult_18 = true;
      }
    }

    if (andResult_18) {
      Boolean orResult_14 = false;

      if (Utils.equals(tf.getPiece(), null)) {
        orResult_14 = true;
      } else {
        Boolean orResult_15 = false;

        if (ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue()) {
          orResult_15 = true;
        } else {
          orResult_15 = Utils.equals(tf.isTrap(), true);
        }

        orResult_14 = orResult_15;
      }

      return orResult_14;

    } else {
      Boolean orResult_16 = false;

      if (isAllRiverH(ti, tf)) {
        orResult_16 = true;
      } else {
        orResult_16 = isAllRiverV(ti, tf);
      }

      if (orResult_16) {
        Boolean orResult_17 = false;

        if (Utils.equals(tf.getPiece(), null)) {
          orResult_17 = true;
        } else {
          orResult_17 =
              ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue();
        }

        return orResult_17;

      } else {
        return false;
      }
    }
  }

  public Lion() {}

  public String toString() {

    return "Lion{}";
  }
}
