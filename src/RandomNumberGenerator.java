package src;

public class RandomNumberGenerator {
    long modulus;
    long coefficient;
    long output;

    RandomNumberGenerator(){
        this.modulus = 2147483647;
        this.coefficient = 16807;
        this.output = System.currentTimeMillis() % modulus; //seed
    }

    public long generate(long range){ // randomize a number in [0..range-1]
        this.output = (coefficient * output) % modulus;
        return (this.output % range);
    }
}
