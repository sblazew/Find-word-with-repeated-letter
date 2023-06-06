//Algorithm for finding word which has the greatest number of repeated leters

public class Main {

    public static void main(String[] args) {
    String s = "Jakieś losowe/ [zdanie] z (dziwnymi) {znakami}, przecinkami itp.";
   String s2= s.replaceAll("[(),/\\[\\].{}]", "");

      String[] words = s2.split("\\s");

      int counter = 1;
      int ans = 0;
      String winningWord = "";
      for(String item: words) {
          for (int i = 0; i < item.length(); i++) {
            counter = 0;
              for (int j = 0; j < item.length(); j++) {
                  if (item.charAt(i) == item.charAt(j)) {
                      counter++;
                      if (counter > ans) {
                          ans = counter;
                          winningWord = item;
                      }
                  }
              }
          }
      }
      if (ans <= 1){
          System.out.println("no repeats");
      } else {
          System.out.println("Number of repeats: " + ans);
          System.out.println("Winner: " + winningWord);
      }
    }
}
