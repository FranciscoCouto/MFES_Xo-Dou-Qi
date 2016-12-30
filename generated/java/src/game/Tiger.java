package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tiger extends Piece {
  public void cg_init_Tiger_1(final Object a_color, final Number a_value) {

    cg_init_Piece_1(((Object) a_color), a_value);
  }

  public Tiger(final Object a_color, final Number a_value) {

    cg_init_Tiger_1(a_color, a_value);
  }

  public Boolean canMoveTo(final Tile ti, final Tile tf) {

    Boolean andResult_25 = false;

    Boolean orResult_24 = false;

    Boolean andResult_26 = false;

    if (Utils.equals(
        Utils.abs(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue()),
        1L)) {
      if (Utils.equals(
          ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
              - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue(),
          0L)) {
        andResult_26 = true;
      }
    }

    if (andResult_26) {
      orResult_24 = true;
    } else {
      Boolean andResult_27 = false;

      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
                  - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue()),
          1L)) {
        if (Utils.equals(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue(),
            0L)) {
          andResult_27 = true;
        }
      }

      orResult_24 = andResult_27;
    }

    if (orResult_24) {
      if (Utils.equals(tf.isRiver(), false)) {
        andResult_25 = true;
      }
    }

    if (andResult_25) {
      Boolean orResult_25 = false;

      if (Utils.equals(tf.getPiece(), null)) {
        orResult_25 = true;
      } else {
        Boolean orResult_26 = false;

        if (ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue()) {
          orResult_26 = true;
        } else {
          orResult_26 = Utils.equals(tf.isTrap(), true);
        }

        orResult_25 = orResult_26;
      }

      return orResult_25;

    } else {
      Boolean orResult_27 = false;

      if (isAllRiverH(ti, tf)) {
        orResult_27 = true;
      } else {
        orResult_27 = isAllRiverV(ti, tf);
      }

      if (orResult_27) {
        Boolean orResult_28 = false;

        if (Utils.equals(tf.getPiece(), null)) {
          orResult_28 = true;
        } else {
          orResult_28 =
              ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue();
        }

        return orResult_28;

      } else {
        return false;
      }
    }
  }

  public Tiger() {}

  public String toString() {

    return "Tiger{}";
  }
}
