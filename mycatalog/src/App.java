public class App {
    public static void main(String[] args) throws Exception {
       

        int year = 2009;
        boolean includedInPlan = true;
        double media = (9.9 + 7.6 + 8.7)/3;
        double movieRating = 8.5;
        String sinopse = "A bitch is broken heart a man";
        
        
        System.out.println("500 Days of Summer was realeased in "+year+"\nWith rating:" +media+"\nSinopse:"+sinopse);
        
        int classification = (int) (media / 2);
        System.out.println("Classification: " + classification);
       


    }
}
