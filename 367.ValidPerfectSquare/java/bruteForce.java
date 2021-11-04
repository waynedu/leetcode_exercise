class bruteForce {
    public boolean isPerfectSquare(int num) {
        int square = 1;
        for (int i = 1 ; i <= num ; ++i){
            square = i * i;
            if (square == num){   
                
                return true; 
            }
        }
        return false;
    }
}
