class Problem_3_rev{
	public final static long MAX_NUMBER =  600851475143L;
	public static void main(String [] args){

		long largestPF = MAX_NUMBER;

		for(long testNum = MAX_NUMBER; testNum > 1; testNum -=2){
			if(MAX_NUMBER % testNum == 0 & is_prime(testNum)){
				largestPF = testNum;
				break;
			}
		}

		System.out.println(largestPF);

	}
	public static boolean is_prime(long testNum){
        if( testNum % 2 == 0 && testNum != 2){
            return false;
        }
        else if(testNum == 2){
            return true;
        }
        else{
            boolean result = true;
            for(long i = 3; i < (Math.sqrt(testNum)+2); i+=2){
                if(testNum % i == 0){
                    result = false;
                    break;
                }
            }
            return result;
        }
    }

    public static boolean is_divisible(long testNum){
        boolean status = false;
        if(MAX_NUMBER % testNum == 0) status = true;
        return status;
    }
}