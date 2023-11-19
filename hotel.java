
public class hotel {
    public static void main(String[] args) {
        char [][] kamar = {
            {'*','*','*','x','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','x'}
        };
        kamar[0][3] = 'x';
        kamar[3][4] = 'x';
        
        int JumlahKamarKosong = 0;
        for (int lantai = 0; lantai<4; lantai++){
            for (int nomorKamar = 0; nomorKamar < 5; nomorKamar++){
                if (kamar[lantai][nomorKamar] == '*'){
                    JumlahKamarKosong++;
                
                }
            
            }
        
        }
        System.out.println("Jumlah kamar yang tersedia adalah" + JumlahKamarKosong + " kamar ");
    }
}
