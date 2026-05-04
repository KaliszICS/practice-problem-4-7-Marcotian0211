import java.util.Random;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int randomNumber(int num,int num1){
     Random random =new Random();
     int num2;
	 num2=random.nextInt(num,num1+1);   
	return num2;
	}
	public static char randomChar(String word){
    Random random=new Random();
	int num;
	num=random.nextInt(word.length());
	char word2=word.charAt(num);
    return word2;
	}


public static int randomEvenNumber(int a, int b) {
    Random rand = new Random();
    
    int min = Math.min(a, b);
    int max = Math.max(a, b);
    
    int num;
    
    do {
        num = rand.nextInt(max - min + 1) + min;
    } while (num % 2 != 0); 
    
    return num;
}
}
