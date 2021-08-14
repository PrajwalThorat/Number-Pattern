public class NumericPattern1 {
    public static void main(String[] args) {
        int row;
        int col;
        int count=0;
        for(row=1 ; row<=5 ; row++ ){
            for(col=1 ; col<=row ; col++){
                count = count+1;
                System.out.print(count);
            }System.out.println("");
        }

    }
    
}
