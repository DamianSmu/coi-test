# TEST WIEDZY W ZAKRESIE TECHNOLOGII BACKEND 

Imię i nazwisko: Damian Smugorzewski

Data: 05.05.2021

1.	Czym różni się obiekt od klasy?

	Klasa definiuje strukturę oraz zachowanie (pola, metody) obiektu. Obiekt jest instancją klasy, czyli jej fizyczną reprezentacją posiadającą wszystkie cechy opisane przez klasę.

2.	Czym różni się klasa abstrakcyjna od interfejsu?

	W najnowszych wersjach języka Java interfejsy mogą zawierać metody default, statyczne oraz prywatne, zatem główną różnicą jest to, że klasy abstrakcyjne mogą przechowywać stan. Kolejną różnicą jest fakt, że klasa może dziedziczyć tylko po jednej klasie abstrakcyjnej, natomiast może implementować wiele interfejsów.

3.	Proszę wyjaśnić mechanizm dziedziczenia w Javie. 

	Dziedziczenie jest jednym z fundamentów programowania obiektowego. Polega ono na przekazywaniu cech klasy nadrzędnej do klasy pochodnej, umożliwiając generalizację oraz tworzenie hierarchii klas. W języku Java występuje dziedziczenie jednokrotne, to znaczy że klasa pochodna może rozszarzać tylko jedną klasę nadrzędną, a dziedziczeniu podlegają zarówno pola, jak i metody.  Klasą bazową, po której dziedziczą (niejawnie) wszystkie inne klasy jest klasa `Object`.

4.	Co należy zdefiniować w klasie podrzędnej:
		
      a.	Nic
   
- [x] b. Tylko różnice między klasą podrzędną, a nadrzędną
   
    c.	Wszystko co dotyczy tej klasy

5.	W którym miejscu klasy można deklarować zmienne

      a.	W dowolnym miejscu

-[x] b. Po deklaracji klasy, ale przed pierwszą metodą

    c.	Poza metodami klasy

6.	Proszę omówić modyfikatory dostępu w Javie.

	W Javie istnieją 4 modyfikatory dostępu:
	* `private` dostęp do elementu tylko w obrębie klasy, w której się on znajduje.
	* `public` swobodny dostęp do elementu z całego projektu.
	* `protected` dostęp możliwy w tym samym pakiecie oraz we wszystkich dziedziczących klasach.
	* modyfikator domyślny (brak modyfikatora) - dostęp możliwy tylko w tym samym pakiecie.

7.	Które ze słów kluczowych powoduje przeskoczenie z bloku try do bloku finally
      
      a.	return
 
-[x] b.catch
  
    c.	while

8.	Mając listę `String[] drzewa = {„brzoza”, „modrzew”, „grab”, „buk”, „wierzba” }` proszę zaproponować wyświetlenie jej na ekranie za pomocą iteratora i za pomocą generyków. 

    Rozwiązanie znajduje się w:
    zadania/src/main/java/zadania/z8.java

9.	Proszę zaproponować kod źródłowy metody weryfikującej czy podane 2 wyrazy składają się z tych samych liter np.

MARA – składa się z 1 litery M, 2 liter A, 1 litery R

RAMA – składa się z 1 litery R, 2 liter A, 1 litery M

Podane przykłady składają się z tych samych liter.
Napisać podstawowe testy jednostkowe dla tej metody (jUnit).

    Rozwiązanie znajduje się w:
    zadania/src/main/java/zadania/z9.java
    Testy:
    zadania/src/test/java/Z9tests.java

10.	Proszę przedstawić wysokopoziomowy diagram systemu dostępnego przez przeglądarkę internetową, przechowującego informacje o sukcesach sportowych osób znajdujących się w systemie. 
Proszę zaproponować model logiczny bazy danych, oraz wysokopoziomowo komponenty systemu. Nie ma potrzeby schodzić na poziom kodu źródłowego.
W sytuacji wymagającej doszczegółowienia wymagań proszę przyjąć własne założenia i opisać je.

![diagram](https://octodex.github.com/smugorzd/coi-test/diagram.png)


11.Napisać test dla poniższego fragmentu kodu.
```java
public void wyslijSms(String numerTel, String trescSms) { 
  smsGateway.send(new Sms(numerTel, trescSms));
}
```
Bramka rzuca wyjątek SMSGatewayException(„Bramka przeciążona”) w momencie, gdy jest zbyt duże obciążenie bramki.

```java
    @Test
    public void shouldThrowExceptionWhenGatewayOverloaded() {
        String nrTel = "555666777";
        String tresc = "Tresc"
        SmsGateway smsGateway = new SmsGateway();
        smsGateway.setOverloaded(true);
        SmsSender smsSender = new SmsSender(smsGateway);
        Assertions.assertThrows(SMSGatewayException.class, () -> smsSender.wyslijSms(numerTel, trescSms), "Bramka przeciążona");
    }
```

12.	Zaprojektować kontrakt usługi REST w formacie OpenApi oraz małą aplikację springbootową, która zwraca listę książek (bez użycia bazy danych). Usługa powinna umożliwiać filtrowanie po części nazwy książki oraz po numerze IBAN.

    Rozwiązanie znajduje się w katalogu zadanie12.

13.	Czy zbiór (Set) może zawierać duplikaty?
       
       a. Tak
- [x] b. Nie

14.	 Zaznaczyć metody należące do java.util.Set:
     
- [x] a. addAll
      
- [x] b. contains 
    
- [x] c. isEmpty 
    
- [x] d. size
    
- [x] e. remove
    
    f.	indexOf
    
    g.	lastIndexOf

15.	Napisać zapytanie zwracające ilość praconików bez przełożonych z poniższej tabeli.

    Rozwiązanie znajduje się w:
    zadania/src/main/java/zadania/z15.sql

16.	Z powyższej tabeli napisać zapytanie zwracające kwotę najmniejszego wynagrodzenia. 

    Rozwiązanie znajduje się w:
    zadania/src/main/java/zadania/z16.sql

17.	Napisz fragment kodu w języku Java, który sprawdzi pełnoletność osoby. Parametrem wejściowym do obliczeń jest numer PESEL w postaci String.

    Rozwiązanie znajduje się w:
    zadania/src/main/java/zadania/z17.java

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

    Należy sprawdzić czy zerówno `list` jak i `number` są zainicjowane, czyli nie są `null`.

    W przypadku gdy będziemy próbować odwołać się do ujemnego indeksu listy lub indeksu większego bądź równego wielkości listy zostanie wyrzucony wyjątek `IndexOutOfBoundsException`. Należy zatem sprawdzić przed wyywołaniem metody get() czy spełnione są powyższe warunki oraz zaimplementować działanie w przypadku gdy warunki nie są spełnione (w zależności od oczekiwanego rezultatu można zwrócić jakąś wartość domyślną, zmienić liczbę tak, aby mieściła się w przedziale wykonując operację modulo, bądź podobne).  

19.	Czym różnią się poniższe zapisy i który jest preferowany oraz dlaczego:

```java
public void test(String wartosc) {
    /*1*/if (wartosc.equals(""));
    /*2*/if ("".equals(wartosc));
    /*3*/if (wartosc == "");
```

    Operator == porównuje referencje obiektów, a nie ich wartość, natomiast implementacja metody `equals` w klasie String porównuje ich rzeczywistą wartość. Zwrócenie wartości true przez operator == implikuje również wartość true z metody `equals` dla 2 tych samych obiektów. Z reguły nie należy porównywać typów obiektowych za pomocą operatora ==.

    W przypadku zapisu 1. może zostać zgłoszony `NullPointerException` gdy `wartosc` to `null`. Jest to jedyna różnica między zapisem 2.

    Preferowany zapis to 1. gdy chcemy, aby wyjątek był zgłaszany lub 2. gdy `wartosc` może być `null` i nie jest to błąd.

20.	Co to są obiekty immutable? Czy final sprawia że obiekt jest immutable i dlaczego?

	Obiekty immutable to obiekty, które po zainicjalizowaniu nie mogą zmieniać swojej wartości. Aby obiekt był immutable wszystkie jego pola muszą być prywatne i oznaczone jako final oraz nie może mieć setterów.

21.	Czym różni się metoda http POST od GET?

	Metoda GET z reguły służy do otrzymywania danych, a POST do ich wysyłania. Metoda POST może zawierać również `body`, gdzie zapisane są wysyłane informacja. Zgodnie z zasadami metoda GET nie powinna posiadać "skutków ubocznych" (side effects, nie powinna zmieniać stanu aplikacji/serwisu).

22.	Jak powinna wyglądac sygnatura metody do której można przekazać dowolną ilość parametrów tego samego typu?

```
TypMetody metoda(TypArgumentu... argumenty) {
	/*
	Ciało metody
	*/
}
Parametr o zmiennej liczebność musi być ostatnim parametrem metody.
```
