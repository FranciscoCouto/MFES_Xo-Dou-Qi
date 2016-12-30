package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Wolf extends Piece {
  public void cg_init_Wolf_1(final Object a_color, final Number a_value) {

    cg_init_Piece_1(((Object) a_color), a_value);
  }

  public Wolf(final Object a_color, final Number a_value) {

    cg_init_Wolf_1(a_color, a_value);
  }

  public Boolean canMoveTo(final Tile ti, final Tile tf) {

    Boolean andResult_68 = false;

    Boolean orResult_61 = false;

    Boolean andResult_69 = false;

    if (Utils.equals(
        Utils.abs(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue()),
        1L)) {
      if (Utils.equals(
          ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
              - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue(),
          0L)) {
        andResult_69 = true;
      }
    }

    if (andResult_69) {
      orResult_61 = true;
    } else {
      Boolean andResult_70 = false;

      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
                  - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue()),
          1L)) {
        if (Utils.equals(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue(),
            0L)) {
          andResult_70 = true;
        }
      }

      orResult_61 = andResult_70;
    }

    if (orResult_61) {
      if (Utils.equals(tf.isRiver(), false)) {
        andResult_68 = true;
      }
    }

    if (andResult_68) {
      Boolean orResult_62 = false;

      if (Utils.equals(tf.getPiece(), null)) {
        orResult_62 = true;
      } else {
        Boolean orResult_63 = false;

        if (ti.getPiece().getValue().longValue() >= tf.getPiece().getValue().longValue()) {
          orResult_63 = true;
        } else {
          orResult_63 = Utils.equals(tf.isTrap(), true);
        }

        orResult_62 = orResult_63;
      }

      return orResult_62;

    } else {
      return false;
    }
  }

  public Wolf() {}

  public String toString() {

    return "Wolf{}";
  }
}
