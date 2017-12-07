//Daniel Gelfand
//APCS1 pd2
//HW48 -- Keep Guessing
//2017-12-06

/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) 
    {
	_lo = a;
	_hi = b;
	_guessCtr = 1;
	_target = (int) (Math.random()*(b-a)) + a;
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() 
    {
	System.out.println("Guess a number from " + _lo + "-" + _hi );
	int guess = Keyboard.readInt(); 

	//make sure user gives valid inpit(within range)
	if(guess > _hi || guess < _lo){
	    System.out.println("Input a number within the given range!");
	    playRec();
	}
    
	//call playRec() until user guesses right
	if(guess > _target){
	    System.out.println("Guess too high");
	    _hi = guess - 1;
	    _guessCtr += 1;
	    playRec();
		
	}

	else if(_target > guess){
	    System.out.println("Guess too low");
	    _lo = 1 + guess;
	    _guessCtr += 1;
	    playRec();
	}

	else{		
	    System.out.println("You guessed right after " + (_guessCtr) + " guesses");
	}
	   
    }
   
	    



    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() 
    {
	int guess = 0;

	//keep playing until the guess matches that random int
	while(guess != _target){

		
	    System.out.println("Guess a number from " + _lo + "-" + _hi );
	    guess = Keyboard.readInt();
	    //make sure the user gives valid input(within range)
	    if(guess > _hi || guess < _lo){
		System.out.println("Guess within the range!");
	    }
	    
	    else if(guess > _target){
		System.out.println("Guess too high");
		_hi = guess - 1;
		_guessCtr += 1;

	    }

	    else{
		System.out.println("Guess too low");
		_lo = 1 + guess;
		_guessCtr += 1;
	    }
	   
	}
	//started with _guessCtr = 1 so we subtract 1 
	System.out.println("You guessed right after " + (_guessCtr-1) + " guesses");
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	//	playRec();
        playIter();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {

	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class
