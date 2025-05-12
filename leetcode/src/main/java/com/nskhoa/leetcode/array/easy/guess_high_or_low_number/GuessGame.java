package com.nskhoa.leetcode.array.easy.guess_high_or_low_number;


public class GuessGame
{
    private int pick;

    // Constructor to initialize the picked number
    public GuessGame(int pick)
    {
        this.pick = pick;
    }

    // The guess method that compares the input with the picked number
    public int guess(int num)
    {
        if (num == pick)
        {
            return 0;  // Correct guess
        }
        else if (num < pick)
        {
            return 1;  // Guess is lower
        }
        else
        {
            return -1; // Guess is higher
        }
    }
}

