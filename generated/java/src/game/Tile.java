package game;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tile {
  private Boolean traps;
  private Boolean river;
  private Boolean blue_lair;
  private Boolean red_lair;
  private VDMSeq coordinates;
  private Piece piece;

  public void cg_init_Tile_2(final VDMSeq coord, final Piece p) {

    coordinates = Utils.copy(coord);
    Boolean orResult_45 = false;

    Boolean andResult_48 = false;

    if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
      if (Utils.equals(((Number) Utils.get(coord, 2L)), 1L)) {
        andResult_48 = true;
      }
    }

    if (andResult_48) {
      orResult_45 = true;
    } else {
      Boolean orResult_46 = false;

      Boolean andResult_49 = false;

      if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
        if (Utils.equals(((Number) Utils.get(coord, 2L)), 1L)) {
          andResult_49 = true;
        }
      }

      if (andResult_49) {
        orResult_46 = true;
      } else {
        Boolean orResult_47 = false;

        Boolean andResult_50 = false;

        if (Utils.equals(((Number) Utils.get(coord, 1L)), 4L)) {
          if (Utils.equals(((Number) Utils.get(coord, 2L)), 2L)) {
            andResult_50 = true;
          }
        }

        if (andResult_50) {
          orResult_47 = true;
        } else {
          Boolean orResult_48 = false;

          Boolean andResult_51 = false;

          if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
            if (Utils.equals(((Number) Utils.get(coord, 2L)), 9L)) {
              andResult_51 = true;
            }
          }

          if (andResult_51) {
            orResult_48 = true;
          } else {
            Boolean orResult_49 = false;

            Boolean andResult_52 = false;

            if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
              if (Utils.equals(((Number) Utils.get(coord, 2L)), 9L)) {
                andResult_52 = true;
              }
            }

            if (andResult_52) {
              orResult_49 = true;
            } else {
              Boolean andResult_53 = false;

              if (Utils.equals(((Number) Utils.get(coord, 1L)), 4L)) {
                if (Utils.equals(((Number) Utils.get(coord, 2L)), 8L)) {
                  andResult_53 = true;
                }
              }

              orResult_49 = andResult_53;
            }

            orResult_48 = orResult_49;
          }

          orResult_47 = orResult_48;
        }

        orResult_46 = orResult_47;
      }

      orResult_45 = orResult_46;
    }

    traps = orResult_45;

    Boolean orResult_50 = false;

    Boolean andResult_54 = false;

    if (Utils.equals(((Number) Utils.get(coord, 1L)), 2L)) {
      if (Utils.equals(((Number) Utils.get(coord, 2L)), 4L)) {
        andResult_54 = true;
      }
    }

    if (andResult_54) {
      orResult_50 = true;
    } else {
      Boolean orResult_51 = false;

      Boolean andResult_55 = false;

      if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
        if (Utils.equals(((Number) Utils.get(coord, 2L)), 4L)) {
          andResult_55 = true;
        }
      }

      if (andResult_55) {
        orResult_51 = true;
      } else {
        Boolean orResult_52 = false;

        Boolean andResult_56 = false;

        if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
          if (Utils.equals(((Number) Utils.get(coord, 2L)), 4L)) {
            andResult_56 = true;
          }
        }

        if (andResult_56) {
          orResult_52 = true;
        } else {
          Boolean orResult_53 = false;

          Boolean andResult_57 = false;

          if (Utils.equals(((Number) Utils.get(coord, 1L)), 6L)) {
            if (Utils.equals(((Number) Utils.get(coord, 2L)), 4L)) {
              andResult_57 = true;
            }
          }

          if (andResult_57) {
            orResult_53 = true;
          } else {
            Boolean orResult_54 = false;

            Boolean andResult_58 = false;

            if (Utils.equals(((Number) Utils.get(coord, 1L)), 2L)) {
              if (Utils.equals(((Number) Utils.get(coord, 2L)), 5L)) {
                andResult_58 = true;
              }
            }

            if (andResult_58) {
              orResult_54 = true;
            } else {
              Boolean orResult_55 = false;

              Boolean andResult_59 = false;

              if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
                if (Utils.equals(((Number) Utils.get(coord, 2L)), 5L)) {
                  andResult_59 = true;
                }
              }

              if (andResult_59) {
                orResult_55 = true;
              } else {
                Boolean orResult_56 = false;

                Boolean andResult_60 = false;

                if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
                  if (Utils.equals(((Number) Utils.get(coord, 2L)), 5L)) {
                    andResult_60 = true;
                  }
                }

                if (andResult_60) {
                  orResult_56 = true;
                } else {
                  Boolean orResult_57 = false;

                  Boolean andResult_61 = false;

                  if (Utils.equals(((Number) Utils.get(coord, 1L)), 6L)) {
                    if (Utils.equals(((Number) Utils.get(coord, 2L)), 5L)) {
                      andResult_61 = true;
                    }
                  }

                  if (andResult_61) {
                    orResult_57 = true;
                  } else {
                    Boolean orResult_58 = false;

                    Boolean andResult_62 = false;

                    if (Utils.equals(((Number) Utils.get(coord, 1L)), 2L)) {
                      if (Utils.equals(((Number) Utils.get(coord, 2L)), 6L)) {
                        andResult_62 = true;
                      }
                    }

                    if (andResult_62) {
                      orResult_58 = true;
                    } else {
                      Boolean orResult_59 = false;

                      Boolean andResult_63 = false;

                      if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
                        if (Utils.equals(((Number) Utils.get(coord, 2L)), 6L)) {
                          andResult_63 = true;
                        }
                      }

                      if (andResult_63) {
                        orResult_59 = true;
                      } else {
                        Boolean orResult_60 = false;

                        Boolean andResult_64 = false;

                        if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
                          if (Utils.equals(((Number) Utils.get(coord, 2L)), 6L)) {
                            andResult_64 = true;
                          }
                        }

                        if (andResult_64) {
                          orResult_60 = true;
                        } else {
                          Boolean andResult_65 = false;

                          if (Utils.equals(((Number) Utils.get(coord, 1L)), 6L)) {
                            if (Utils.equals(((Number) Utils.get(coord, 2L)), 6L)) {
                              andResult_65 = true;
                            }
                          }

                          orResult_60 = andResult_65;
                        }

                        orResult_59 = orResult_60;
                      }

                      orResult_58 = orResult_59;
                    }

                    orResult_57 = orResult_58;
                  }

                  orResult_56 = orResult_57;
                }

                orResult_55 = orResult_56;
              }

              orResult_54 = orResult_55;
            }

            orResult_53 = orResult_54;
          }

          orResult_52 = orResult_53;
        }

        orResult_51 = orResult_52;
      }

      orResult_50 = orResult_51;
    }

    river = orResult_50;

    Boolean andResult_66 = false;

    if (Utils.equals(((Number) Utils.get(coord, 1L)), 4L)) {
      if (Utils.equals(((Number) Utils.get(coord, 2L)), 1L)) {
        andResult_66 = true;
      }
    }

    blue_lair = andResult_66;

    Boolean andResult_67 = false;

    if (Utils.equals(((Number) Utils.get(coord, 1L)), 4L)) {
      if (Utils.equals(((Number) Utils.get(coord, 2L)), 9L)) {
        andResult_67 = true;
      }
    }

    red_lair = andResult_67;

    piece = p;
    return;
  }

  public void cg_init_Tile_1(final VDMSeq coord) {

    coordinates = Utils.copy(coord);
    piece = null;
    Boolean orResult_29 = false;

    Boolean andResult_28 = false;

    if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
      if (Utils.equals(((Number) Utils.get(coord, 2L)), 1L)) {
        andResult_28 = true;
      }
    }

    if (andResult_28) {
      orResult_29 = true;
    } else {
      Boolean orResult_30 = false;

      Boolean andResult_29 = false;

      if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
        if (Utils.equals(((Number) Utils.get(coord, 2L)), 1L)) {
          andResult_29 = true;
        }
      }

      if (andResult_29) {
        orResult_30 = true;
      } else {
        Boolean orResult_31 = false;

        Boolean andResult_30 = false;

        if (Utils.equals(((Number) Utils.get(coord, 1L)), 4L)) {
          if (Utils.equals(((Number) Utils.get(coord, 2L)), 2L)) {
            andResult_30 = true;
          }
        }

        if (andResult_30) {
          orResult_31 = true;
        } else {
          Boolean orResult_32 = false;

          Boolean andResult_31 = false;

          if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
            if (Utils.equals(((Number) Utils.get(coord, 2L)), 9L)) {
              andResult_31 = true;
            }
          }

          if (andResult_31) {
            orResult_32 = true;
          } else {
            Boolean orResult_33 = false;

            Boolean andResult_32 = false;

            if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
              if (Utils.equals(((Number) Utils.get(coord, 2L)), 9L)) {
                andResult_32 = true;
              }
            }

            if (andResult_32) {
              orResult_33 = true;
            } else {
              Boolean andResult_33 = false;

              if (Utils.equals(((Number) Utils.get(coord, 1L)), 4L)) {
                if (Utils.equals(((Number) Utils.get(coord, 2L)), 8L)) {
                  andResult_33 = true;
                }
              }

              orResult_33 = andResult_33;
            }

            orResult_32 = orResult_33;
          }

          orResult_31 = orResult_32;
        }

        orResult_30 = orResult_31;
      }

      orResult_29 = orResult_30;
    }

    traps = orResult_29;

    Boolean orResult_34 = false;

    Boolean andResult_34 = false;

    if (Utils.equals(((Number) Utils.get(coord, 1L)), 2L)) {
      if (Utils.equals(((Number) Utils.get(coord, 2L)), 4L)) {
        andResult_34 = true;
      }
    }

    if (andResult_34) {
      orResult_34 = true;
    } else {
      Boolean orResult_35 = false;

      Boolean andResult_35 = false;

      if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
        if (Utils.equals(((Number) Utils.get(coord, 2L)), 4L)) {
          andResult_35 = true;
        }
      }

      if (andResult_35) {
        orResult_35 = true;
      } else {
        Boolean orResult_36 = false;

        Boolean andResult_36 = false;

        if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
          if (Utils.equals(((Number) Utils.get(coord, 2L)), 4L)) {
            andResult_36 = true;
          }
        }

        if (andResult_36) {
          orResult_36 = true;
        } else {
          Boolean orResult_37 = false;

          Boolean andResult_37 = false;

          if (Utils.equals(((Number) Utils.get(coord, 1L)), 6L)) {
            if (Utils.equals(((Number) Utils.get(coord, 2L)), 4L)) {
              andResult_37 = true;
            }
          }

          if (andResult_37) {
            orResult_37 = true;
          } else {
            Boolean orResult_38 = false;

            Boolean andResult_38 = false;

            if (Utils.equals(((Number) Utils.get(coord, 1L)), 2L)) {
              if (Utils.equals(((Number) Utils.get(coord, 2L)), 5L)) {
                andResult_38 = true;
              }
            }

            if (andResult_38) {
              orResult_38 = true;
            } else {
              Boolean orResult_39 = false;

              Boolean andResult_39 = false;

              if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
                if (Utils.equals(((Number) Utils.get(coord, 2L)), 5L)) {
                  andResult_39 = true;
                }
              }

              if (andResult_39) {
                orResult_39 = true;
              } else {
                Boolean orResult_40 = false;

                Boolean andResult_40 = false;

                if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
                  if (Utils.equals(((Number) Utils.get(coord, 2L)), 5L)) {
                    andResult_40 = true;
                  }
                }

                if (andResult_40) {
                  orResult_40 = true;
                } else {
                  Boolean orResult_41 = false;

                  Boolean andResult_41 = false;

                  if (Utils.equals(((Number) Utils.get(coord, 1L)), 6L)) {
                    if (Utils.equals(((Number) Utils.get(coord, 2L)), 5L)) {
                      andResult_41 = true;
                    }
                  }

                  if (andResult_41) {
                    orResult_41 = true;
                  } else {
                    Boolean orResult_42 = false;

                    Boolean andResult_42 = false;

                    if (Utils.equals(((Number) Utils.get(coord, 1L)), 2L)) {
                      if (Utils.equals(((Number) Utils.get(coord, 2L)), 6L)) {
                        andResult_42 = true;
                      }
                    }

                    if (andResult_42) {
                      orResult_42 = true;
                    } else {
                      Boolean orResult_43 = false;

                      Boolean andResult_43 = false;

                      if (Utils.equals(((Number) Utils.get(coord, 1L)), 3L)) {
                        if (Utils.equals(((Number) Utils.get(coord, 2L)), 6L)) {
                          andResult_43 = true;
                        }
                      }

                      if (andResult_43) {
                        orResult_43 = true;
                      } else {
                        Boolean orResult_44 = false;

                        Boolean andResult_44 = false;

                        if (Utils.equals(((Number) Utils.get(coord, 1L)), 5L)) {
                          if (Utils.equals(((Number) Utils.get(coord, 2L)), 6L)) {
                            andResult_44 = true;
                          }
                        }

                        if (andResult_44) {
                          orResult_44 = true;
                        } else {
                          Boolean andResult_45 = false;

                          if (Utils.equals(((Number) Utils.get(coord, 1L)), 6L)) {
                            if (Utils.equals(((Number) Utils.get(coord, 2L)), 6L)) {
                              andResult_45 = true;
                            }
                          }

                          orResult_44 = andResult_45;
                        }

                        orResult_43 = orResult_44;
                      }

                      orResult_42 = orResult_43;
                    }

                    orResult_41 = orResult_42;
                  }

                  orResult_40 = orResult_41;
                }

                orResult_39 = orResult_40;
              }

              orResult_38 = orResult_39;
            }

            orResult_37 = orResult_38;
          }

          orResult_36 = orResult_37;
        }

        orResult_35 = orResult_36;
      }

      orResult_34 = orResult_35;
    }

    river = orResult_34;

    Boolean andResult_46 = false;

    if (Utils.equals(((Number) Utils.get(coord, 1L)), 4L)) {
      if (Utils.equals(((Number) Utils.get(coord, 2L)), 1L)) {
        andResult_46 = true;
      }
    }

    blue_lair = andResult_46;

    Boolean andResult_47 = false;

    if (Utils.equals(((Number) Utils.get(coord, 1L)), 4L)) {
      if (Utils.equals(((Number) Utils.get(coord, 2L)), 9L)) {
        andResult_47 = true;
      }
    }

    red_lair = andResult_47;

    return;
  }

  public Tile(final VDMSeq coord) {

    cg_init_Tile_1(Utils.copy(coord));
  }

  public Tile(final VDMSeq coord, final Piece p) {

    cg_init_Tile_2(Utils.copy(coord), p);
  }

  public VDMSeq getCoordinates() {

    return Utils.copy(coordinates);
  }

  public Piece getPiece() {

    return piece;
  }

  public Boolean isTrap() {

    return traps;
  }

  public Boolean isRiver() {

    return river;
  }

  public void setPiece(final Piece p) {

    piece = p;
  }

  public Tile() {}

  public String toString() {

    return "Tile{"
        + "traps := "
        + Utils.toString(traps)
        + ", river := "
        + Utils.toString(river)
        + ", blue_lair := "
        + Utils.toString(blue_lair)
        + ", red_lair := "
        + Utils.toString(red_lair)
        + ", coordinates := "
        + Utils.toString(coordinates)
        + ", piece := "
        + Utils.toString(piece)
        + "}";
  }
}
