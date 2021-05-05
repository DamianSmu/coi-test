# TEST WIEDZY W ZAKRESIE TECHNOLOGII BACKEND 

Imię i nazwisko: Damian Smugorzewski

Data: 05.05.2021

1.	Czym różni się obiekt od klasy?

2.	Czym różni się klasa abstrakcyjna od interfejsu?

3.	Proszę wyjaśnić mechanizm dziedziczenia w Javie. 

4.	Co należy zdefiniować w klasie podrzędnej:
		
    a.	Nic
   
    b.	Tylko różnice między klasą podrzędną, a nadrzędną
   
    c.	Wszystko co dotyczy tej klasy

5.	W którym miejscu klasy można deklarować zmienne

    a.	W dowolnym miejscu

    b.	Po deklaracji klasy, ale przed pierwszą metodą

    c.	Poza metodami klasy

6.	Proszę omówić modyfikatory dostępu w Javie.

7.	Które ze słów kluczowych powoduje przeskoczenie z bloku try do bloku finally
    
    a.	return

    b.	catch
    
    c.	while

8.	Mając listę `String[] drzewa = {„brzoza”, „modrzew”, „grab”, „buk”, „wierzba” }` proszę zaproponować wyświetlenie jej na ekranie za pomocą iteratora i za pomocą generyków. 

9.	Proszę zaproponować kod źródłowy metody weryfikującej czy podane 2 wyrazy składają się z tych samych liter np.

MARA – składa się z 1 litery M, 2 liter A, 1 litery R

RAMA – składa się z 1 litery R, 2 liter A, 1 litery M

Podane przykłady składają się z tych samych liter.
Napisać podstawowe testy jednostkowe dla tej metody (jUnit).

10.	Proszę przedstawić wysokopoziomowy diagram systemu dostępnego przez przeglądarkę internetową, przechowującego informacje o sukcesach sportowych osób znajdujących się w systemie. 
Proszę zaproponować model logiczny bazy danych, oraz wysokopoziomowo komponenty systemu. Nie ma potrzeby schodzić na poziom kodu źródłowego.
W sytuacji wymagającej doszczegółowienia wymagań proszę przyjąć własne założenia i opisać je.


11.Napisać test dla poniższego fragmentu kodu.
```java
public void wyslijSms(String numerTel, String trescSms) { 
  smsGateway.send(new Sms(numerTel, trescSms));
}
```
Bramka rzuca wyjątek SMSGatewayException(„Bramka przeciążona”) w momencie, gdy jest zbyt duże obciążenie bramk.

12.	Zaprojektować kontrakt usługi REST w formacie OpenApi oraz małą aplikację springbootową, która zwraca listę książek (bez użycia bazy danych). Usługa powinna umożliwiać filtrowanie po części nazwy książki oraz po numerze IBAN.

13.	Czy zbiór (Set) może zawierać duplikaty?  
   
    a.	Tak

    b.	Nie

14.	 Zaznaczyć metody należące do java.util.Set:
     
    a.	addAll
      
    b.	contains 
    
    c.	isEmpty 
    
    d.	size
    
    e.	remove
    
    f.	indexOf
    
    g.	lastIndexOf

15.	Napisać zapytanie zwracające ilość praconików bez przełożonych z poniższej tabeli.

16.	Z powyższej tabeli napisać zapytanie zwracające kwotę najmniejszego wynagrodzenia. 

17.	Napisz fragment kodu w języku Java, który sprawdzi pełnoletność osoby. Parametrem wejściowym do obliczeń jest numer PESEL w postaci String.

18.	Poniższa metoda:
```java
private static String getElement(Object list, Integer number) {
  return ((List)list).get(number).toString();
}
```

```java
public static void main(String[] args) {
  List<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");
  list.add("C");
  System.out.print(getElement(list, 1));
}
```

zadziała dla poniższych danych

W jakich przypadkach (dla innych danych wejściowych) metoda getElement może spowodować błąd i jak się przed tym zabezpieczyć?

19.	Czym różnią się poniższe zapisy i który jest preferowany oraz dlaczego:

```java
public void test(String wartosc) {
    /*1*/if (wartosc.equals(""));
    /*2*/if ("".equals(wartosc));
    /*3*/if (wartosc == "");
```

20.	Co to są obiekty immutable? Czy final sprawia że obiekt jest immutable i dlaczego?

21.	Czym różni się metoda http POST od GET?

22.	Jak powinna wyglądac sygnatura metody do której można przekazać dowolną ilość parametrów tego samego typu?
