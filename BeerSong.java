public class BeerSong1 {
  public static void main(String[] args) {
    int beerNum = 99;
    String word = "bottles";

    //start while loop
    while (beerNum > 0) {

      //Changes "bottles" to "bottle" when 1 bottle is left.
      if (beerNum == 1) {
        word = "bottle";
      }

      System.out.println(beerNum + " " + word + " of beer on the wall,");
      System.out.println(beerNum + " " + word + " of beer.");
      System.out.println("Take one down.");
      System.out.println("Pass it around.");
      System.out.println(beerNum + " " + word + " of beer on the wall.");
      System.out.println(" ");

      beerNum = beerNum - 1;
    //end if
    } 

    if (beerNum == 0) {
      System.out.println("No more bottles of beer on the wall,");
      System.out.println("No more bottles of beer.");
      System.out.println("Go to the shops and buy some more.");
      System.out.println("99 Bottles of Beer on the wall.");
    }

  //end main method.
  }
//end class.
}

