/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermekkombinacioja;

/**
 *
 * @author Hoffmann József
 */
public class ErmekKombinacioja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ermek = {1, 2};
        int teljesOsszeg = 4;

        System.out.println(kombinacioSzamitas(ermek, teljesOsszeg, 0));
    }

    public static int kombinacioSzamitas(int[] ermek, int osszeg, int aktualisIndex) {

        if (osszeg == 0) {
            return 1;
			}
			
	if (osszeg < 0) {
            return 0;
        }

        int kombinaciok = 0;
        for (int i = aktualisIndex; i < ermek.length; i++) {
            kombinaciok += kombinacioSzamitas(ermek, osszeg - ermek[i], i);            
        }
        return kombinaciok;
    }    
    


}
