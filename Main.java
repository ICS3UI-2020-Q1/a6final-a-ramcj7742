import java.util.Scanner;
/**
 * computes the grade for a 5 multiple choice question
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //creates array for the correct answers
    String correctAns[] = new String[5];

    //gets correct answers an puts them into array
    System.out.println("Please enter the answers to the test:");
    for(int i = 0; i < correctAns.length; i++){
      correctAns[i] = input.nextLine();
    }

    //creates array for student answers
    String studentAns[] = new String[5];

    //gets student answers and puts them into array
    System.out.println("Please enter the student answers:");
    for(int i = 0; i < studentAns.length; i++){
      studentAns[i] = input.nextLine();
    }

    //creates score variable
    int score = 0;

    //compares student answers to correct answers
    for(int i = 0; i < studentAns.length; i++){
      if(studentAns[i].equals(correctAns[i])){
        //adds 1 to score if answer is correct
        score = score + 1;
      }
    }
    //displays score to user
    System.out.println("Score: " + score);
    
  }
}
