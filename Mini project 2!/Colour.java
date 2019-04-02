// File [Colour_java_BREAKOUTSwing.html] MAS - last created: Fri 28 Apr 2017 21:40:19 BST

import java.awt.Color;

/**
 * Hide the specific internal representation of colours
 *  from most of the program.
 * Map to Swing color when required.
 */
public enum Colour  
{ 
  RED(Color.RED), BLUE(Color.BLUE), GRAY(Color.GRAY);

  private final Color c;

  Colour( Color c ) { this.c = c; }

  public Color forSwing() { return c; }
}
