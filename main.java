import java.util.Scanner;
public class RepeatSayi {
    public static void main(String[] args) {
        int sayac=0;
                
                int[]dizi={10, 20, 20, 10, 10, 20, 5, 20};
                        
                Scanner input = new Scanner(System.in);
                System.out.print("Dizide Aratmak İstediğiniz Sayıyı Giriniz :");
                int ara=input.nextInt();
                
                for(int i=0;i<dizi.length;i++){
                    if (ara==dizi[i])
                    sayac = sayac+1;          
                }    
                    
                System.out.print("Dizide Tekrar Edilme Sayısı : " + sayac);               
                            
        
    }
    
}
