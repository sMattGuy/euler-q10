import java.math.*;
public class SumPrimes{
	public static void main(String[] args){
		BigInteger summation = new BigInteger("2");
		for(int i=3;i<=2000000;i+=2){
			if(isPrime(i)){
				summation = summation.add(new BigInteger(Integer.toString(i)));
			}
			System.out.print("Progress:"+i+"/2000000\r");
		}
		System.out.println("\nAnswer:"+summation);
	}
	public static boolean isPrime(int input){
		for(int i=2;i<input;++i){
			if(input%i==0){
				return false;
			}
		}
		return true;
	}
}