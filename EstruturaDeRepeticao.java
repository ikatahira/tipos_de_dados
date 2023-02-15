public class EstruturaDeRepeticao {
    

    public static void main(String args[]){
        int fatResult = 1;
        for(int i=0;i>1;i--){
            if(i ==0){
                fatResult = 1;
                break;
            }else{
                fatResult = i * fatResult;
            }
        }

        System.out.println(fatResult);

    }
    
}
