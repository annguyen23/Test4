package edu.uwb;

public class Adder {
    public int AddPositiveInts(int a, int b)
    {
        if ((a < 0) || (b < 0)) { return -1; }
        return a + b;
    }
    
    public int Square(int a)
    {
        return a * a;
    }
}
