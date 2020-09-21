import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void fizzBuzzConvertor0(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1",fizzBuzz.fizzbuzz(1));
        assertEquals("2",fizzBuzz.fizzbuzz(2));
    }

    @Test
    public void fizzBuzzConvertor1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz",fizzBuzz.fizzbuzz(3));
    }

    @Test
    public void fizzBuzzConvertor2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz",fizzBuzz.fizzbuzz(5));
    }

    @Test
    public void fizzBuzzConvertor3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz",fizzBuzz.fizzbuzz(15));
    }

//    @Test
//    public void fizzBuzzConvertor(){
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        assertEquals("null",fizzBuzz.fizzbuzz(26));
//    }
}