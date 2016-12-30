package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Elephant extends Piece {
  public void cg_init_Elephant_1(final Object a_color, final Number a_value) {

    cg_init_Piece_1(((Object) a_color), a_value);
  }

  public Elephant(final Object a_color, final Number a_value) {

    cg_init_Elephant_1(a_color, a_value);
  }

  public Boolean canMoveTo(final Tile ti, final Tile tf) {

    Boolean andResult_7 = false;

    Boolean orResult_7 = false;

    Boolean andResult_8 = false;

    if (Utils.equals(
        Utils.abs(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue()),
        1L)) {
      if (Utils.equals(
          ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
              - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue(),
          0L)) {
        andResult_8 = true;
      }
    }

    if (andResult_8) {
      orResult_7 = true;
    } else {
      Boolean andResult_9 = false;

      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(ti.getCoordinates(), 2L)).longValue()
                  - ((Number) Utils.get(tf.getCoordinates(), 2L)).longValue()),
          1L)) {
        if (Utils.equals(
            ((Number) Utils.get(ti.getCoordinates(), 1L)).longValue()
                - ((Number) Utils.get(tf.getCoordinates(), 1L)).longValue(),
            0L)) {
          andResult_9 = true;
        }
      }

      orResult_7 = andResult_9;
    }

    if (orResult_7) {
      if (Utils.equals(tf.isRiver(), false)) {
        andResult_7 = true;
      }
    }

    if (andResult_7) {
      return true;

    } else {
      return false;
    }
  }

  public Elephant() {}

  public String toString() {

    return "Elephant{}";
  }
}
