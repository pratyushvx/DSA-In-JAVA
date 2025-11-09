public class largests {
    public static void main(String[] args) {
        String fruits[]={"apple","banana","mango"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
        largest=largest+'\0';
        int i=0;
        while(largest.charAt(i)!='\0'){
            i++;
        }
        System.out.println(i);
    }
    
    
}
