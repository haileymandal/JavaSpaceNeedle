//Hailey Mandal, CS 210, Winter 2022, 1/17/2022, Chapter 02 (SpaceNeedle) //

public class SpaceNeedle {

   //Class constant to set Space Needle height
   public static final int SPACE_NEEDLE_HEIGHT = 5;
  
   public static void main(String[] args) {
      //These are all the static method calls needed to create SpaceNeedle
      line();
      needleTop();
      needleBottom();
      line();
      stem();
      needleTop();
   }
   
   /*Static method to create the antenna and neck of the needle.
   It will include for loops to assist with the redundancy */  
   public static void line() {
      for(int line = 1; line <= SPACE_NEEDLE_HEIGHT; line++) {
      
         for(int space = 1; space <= SPACE_NEEDLE_HEIGHT*3; space++) {
            System.out.print(" ");
         }
         
         System.out.println("||");
      }
   }
   
   /*Static method to create the top of the needle and base.
   It will include for loops to assist with the redundancy */   
   public static void needleTop() {
      for(int line = 1; line <= SPACE_NEEDLE_HEIGHT; line++) {
         
         for(int space = 1; space <= (line * -3 + (SPACE_NEEDLE_HEIGHT*3)); space++) {
            System.out.print(" ");
         }
         
         System.out.print("__/");
         
         for(int colon = 1; colon <= (3 * line - 3); colon++){
            System.out.print(":");
         }
         
         System.out.print("||");
         
         for(int colon = 1; colon <= (3 * line - 3); colon++){
            System.out.print(":");
         }
         
/*
             __/||\__      1,12  -3 + 15
         __/:::||:::\__            2,9   -6 + 15
      __/::::::||::::::\__         3,6   -9 + 15
   __/:::::::::||:::::::::\__      4,3   -12 + 15
__/::::::::::::||::::::::::::\__   5,0   -15 + 15 
|""""""""""""""""""""""""""""""|   k * (line + 1) + C, k*line + k + C, k=-3, 
 
Height:   k:    c:
5         -3    15
6         -3    18
 
*/
         
       System.out.println("\\__");
      }
      
      System.out.print("|");
      
      for(int quote = 1; quote <= (SPACE_NEEDLE_HEIGHT*6); quote++) {
         System.out.print("\"");
      }
      
      System.out.println("|");
   }
   
   /*Static method to create the stem of the needle.
   It will include for loops to assist with the redundancy */      
   public static void stem() {
      for(int line = 1; line <= SPACE_NEEDLE_HEIGHT * SPACE_NEEDLE_HEIGHT; line++) {
         
         for(int space = 1; space <= (SPACE_NEEDLE_HEIGHT * 3 - 3); space++) {
            System.out.print(" ");
         }
         
         System.out.println("|%%||%%|");
      }
   }
      

   /*Static method to create the bottom of the needle.
   It will include for loops to assist with the redundancy */
   public static void needleBottom() {
      for(int line = 1; line <= SPACE_NEEDLE_HEIGHT; line++) {
         
         for(int space = 1; space <= (line * 2 - 2); space++) {
            System.out.print(" ");
         }
         
         System.out.print("\\_");
         
         for(int slash = 1; slash <= (line *-2 + (SPACE_NEEDLE_HEIGHT *3 + 1)); slash++) {
            System.out.print("/\\");
         }
         
         System.out.println("_/" );     
      }
   }
}