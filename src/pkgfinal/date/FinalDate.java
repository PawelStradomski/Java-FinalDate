
package pkgfinal.date;
/**
 * @author pawelstradomski
 */

import java.util.Date;




public class FinalDate {

    
    public static void main(String[] args) {
        
        final int x = 5; // final = const - nie mozna zmienic, wartosc zmiennej ostateczna
//        x = 6;                          - z final nie zmienimy wartosci z 5 na 6
        System.out.println(x);
        
        
        
        Pracownik p = new Pracownik();
        System.out.println(p.dataZatrudnienia);
       
        
    }
    
}
class Osoba
{
    //final class Osoba - oznacza, ze klasy nie mozna rozszerzac/dziedziczyc
}

class Pracownik extends Osoba
{
//  final Date dataZatrudnienia = new Date(); // lub mozna to wykonac za pomoca KONSTRUKTORA: Pracownik()
    
    final Date dataZatrudnienia;
    
    Pracownik()
    {
        this.dataZatrudnienia = new Date(); 
    }
    Pracownik(Date data) // lub inny konstruktor do ktorego mozna przyslac date
    {
        this.dataZatrudnienia = data;
    }
    Date getDataZatrudnienia() // jezeli damy final - Programista nie bedzie mogl dziedziczyc
    {
        return this.dataZatrudnienia;
    }
}
class Programista extends Pracownik
{
    @Override
    Date getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }
}
// control+spacja - wywoluje np: public static void main
// command+shift+i - importuje java.util.Date - klase z datami
// Date            - zmienna, klasa przechowujaca daty