// File [Timer_java_BREAKOUTSwing.html] MAS - last created: Fri 28 Apr 2017 21:40:20 BST

/**
 * Make getting the time of day easier
 * @author Mike Smith University of Brighton
 */

class Timer
{
  private static long startTime;

  /**
   * Remember the current time
   */
  public static void startTimer()
  {
    startTime = getTimeInMills();
  }

  /**
   * How long since the previous call to startTimer in milliseconds
   * @return The time taken in milliseconds
   */
  public static long timeTaken()
  {
    return getTimeInMills() - startTime;
  }

  /**
   * Return time in milliseconds since the epoch
   * @return time in milliseconds
   */
  private static long getTimeInMills()
  {
    return System.currentTimeMillis();
  }
}