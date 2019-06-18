import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

class app {


    private static Multimap<Kierunki, Student> multimap = ArrayListMultimap.create();


//    static void walidujStudenta(String imie, String nazwisko, int wiek){
//         if(imie.isEmpty())
//             throw new ValidationException("Imie nie moze byc puste");
//         if(nazwisko.isEmpty())
//             throw new ValidationException("Nazwisko nie moze byc puste");
//         if(wiek<18)
//             throw new ValidationException("Niepoprawy wiek");
//     }
//
//     public static void main(String[] args) {
//         String imie = "Adam";
//         String nazwisko = "Kowalski";
//         int wiek = 11;
//
//         try{
//             walidujStudenta(imie, nazwisko, wiek);
//             System.out.println("Walidacja przeszla pozytywnie, mozna zapisac studenta");
//             // tutaj zapisujemy studenta
//         }catch (ValidationException e){
//             System.out.println("Blad walidacji: "+e.getMessage());
//         }
//     }

    public static void main(String[] args) throws IOException {


        List<Przedmioty> map1 = Arrays.asList(
                (new Przedmioty(4.5, "Anatomia")),
                (new Przedmioty(4.4, "Biochemia")),
                (new Przedmioty(5.0, "Biofizyka")),
                (new Przedmioty(3.9, "Fizjologia")),
                (new Przedmioty(4.6, "Chirurgia")),
                (new Przedmioty(4.2, "Choroby Wewnętrzne")));


        List<Przedmioty> map2 = Arrays.asList(
                (new Przedmioty(3.5, "Anatomia")),
                (new Przedmioty(3.9, "Biochemia")),
                (new Przedmioty(4.0, "Biofizyka")),
                (new Przedmioty(3.5, "Fizjologia")),
                (new Przedmioty(4.1, "Chirurgia")),
                (new Przedmioty(4.5, "Choroby Wewnętrzne")));

        List<Przedmioty> map3 = new ArrayList<>();
        map3.add(new Przedmioty(4.5, "Anatomia"));
        map3.add(new Przedmioty(4.9, "Biochemia"));
        map3.add(new Przedmioty(5.0, "Biofizyka"));
        map3.add(new Przedmioty(4.5, "Fizjologia"));
        map3.add(new Przedmioty(4.6, "Chirurgia"));
        map3.add(new Przedmioty(4.5, "Choroby Wewnętrzne"));

        List<Przedmioty> map4 = new ArrayList<>();
        map4.add(new Przedmioty(3.5, "Anatomia"));
        map4.add(new Przedmioty(3.3, "Biochemia"));
        map4.add(new Przedmioty(3.0, "Biofizyka"));
        map4.add(new Przedmioty(3.5, "Fizjologia"));
        map4.add(new Przedmioty(3.2, "Chirurgia"));
        map4.add(new Przedmioty(3.5, "Choroby Wewnętrzne"));

        List<Przedmioty> map5 = new ArrayList<>();
        map5.add(new Przedmioty(3.9, "Anatomia"));
        map5.add(new Przedmioty(3.7, "Biochemia"));
        map5.add(new Przedmioty(3.6, "Biofizyka"));
        map5.add(new Przedmioty(4.5, "Fizjologia"));
        map5.add(new Przedmioty(4.2, "Chirurgia"));
        map5.add(new Przedmioty(4.5, "Choroby Wewnętrzne"));

        List<Przedmioty> map6 = new ArrayList<>();
        map6.add(new Przedmioty(4.5, "Anatomia"));
        map6.add(new Przedmioty(4.3, "Biochemia"));
        map6.add(new Przedmioty(4.0, "Biofizyka"));
        map6.add(new Przedmioty(4.5, "Fizjologia"));
        map6.add(new Przedmioty(4.2, "Chirurgia"));
        map6.add(new Przedmioty(4.5, "Choroby Wewnętrzne"));

// Who is studying Medicine...
        multimap.put(Kierunki.Lekarski,
                new Student("Marian", "Popowicz", 23, "Marian@gmail.com", "686-584-585", "Lekarski", map1, RokStudiów.Perwszy));
        multimap.put(Kierunki.Lekarski,
                new Student("Mateusz", "Woczz", 23, "Mateusz@gmail.com", "486-584-585", "Lekarski", map2, RokStudiów.Piąty));
        multimap.put(Kierunki.Lekarski,
                new Student("Salomon", "Soczek", 23, "Salomon@gmail.com", "586-524-585", "Lekarski", map3, RokStudiów.Trzecji));
        multimap.put(Kierunki.Lekarski,
                new Student("Arek", "Pop", 23, "Arek@gmail.com", "586-584-385", "Lekarski", map4, RokStudiów.Perwszy));
        multimap.put(Kierunki.Lekarski,
                new Student("Marek", "Arek", 23, "Marek@gmail.com", "586-344-585", "Lekarski", map5, RokStudiów.Piąty));
        multimap.put(Kierunki.Lekarski,

                new Student("Marian", "Sorenka", 23, "Opole", "Marian@gmail.com", "lekarski", map6, RokStudiów.Szósty));

//        // Who is studying Physiotherapy...
////        multimap.put(Kierunki.Fizjoterapia, new Student("Marian", "Popowicz", 23, "Opole", "Marian@gmail.com", "lekarski", 4.3));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Marianna", "Segowicka", 22, "Opole", "Marianna@gmail.com", "lekarski", 4.5));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Szymon", "Strzegomski", 23, "Zakopane", "Szymonstrzegomski@gmail.com", "fizjoterapia", 4.1));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Sanya", "Antonowicz", 23, "Warszawa", "Sanya@gmail.com", "fizjoterapia", 3.5));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Marcin", "Fator", 23, "Oława", "Marcin@gmail.com", "fizjoterapia", 3.8));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Arkadiusz", "Marsak", 22, "Dęblin", "Arek@gmail.com", "fizjoterapia", 4.1));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Tadeusz", "Brzowski", 23, "Wrocłąw", "Tadeusz@gmail.com", "fizjoterapia", 4.8));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Paweł", "Sworowski", 23, "Lublin", "Sworowski@gmail.com", "fizjoterapia", 5.0));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Piotr", "Samowich", 24, "Gdańsk", "Piotr123@gmail.com", "fizjoterapia", 3.8));
////        multimap.put(Kierunki.Fizjoterapia, new Student("Georg", "Sartowski", 23, "Poznań", "Starowski@wp.pl", "fizjoterapia", 4.0));
////// Who is studying Pharmacy...
////        multimap.put(Kierunki.Farmacja, new Student("Imie", "Nazwisko", 0, "Email", "12345678", "farmacja", 5));
////        multimap.put(Kierunki.Farmacja, new Student("Imie1", "Nazwisko1", 0, "Email1", "12345678", "farmacja", 4));
////        multimap.put(Kierunki.Farmacja, new Student("Imie2", "Nazwisko2", 0, "Email2", "12345678", "farmacja", 3.5));
////        multimap.put(Kierunki.Farmacja, new Student("Imie3", "Nazwisko3", 0, "Email3", "12345678", "farmacja", 3));
////        multimap.put(Kierunki.Farmacja, new Student("Imie4", "Nazwisko4", 0, "Email4", "12345678", "farmacja", 5));
////        multimap.put(Kierunki.Farmacja, new Student("Imie5", "Nazwisko5", 0, "Email5", "12345678", "farmacja", 4.5));
////        multimap.put(Kierunki.Farmacja, new Student("Imie6", "Nazwisko6", 0, "Email6", "12345678", "farmacja", 3));
////


//         // 11.
////
//
// 12.
//
//
//
//
//
//

//        try{
//              int z =  wiek;
//              int r = 18;
//            System.out.println(z>r);
//        }catch (ArithmeticException e){
//            System.out.println("dsf");
//        }finally {
//            System.out.println("dfsadf");
//        }


//        if (ss.isEmpty()&& sp.isEmpty())
//        {
//            throw new IOException("Nie ma danych");
//           // System.out.println("Nie ma Imienia");
//
//        } else {
//            System.out.println(multimap.get(Kierunki.Lekarski));
//
//        }


//    }


        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Koniec.");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Wybierz: \n " +
                            "1 - zobaczyc studentów" + "\n" +
                            "0 - wyjdź");

                {
                    int p = scanner.nextInt();
                    scanner.nextLine();
                    switch (p) {

                        case 0:
                            System.out.println("Koniec.");
                            quit = true;
                            break;

                        case 1:

                            System.out.println("======================================================================");
                            System.out.println(multimap.size());
                            System.out.println("======================================================================");
                            break;
                    }
                }
                case 2:
                    System.out.println("1 - ludzi na kierunku" + "\n" + "2 - zobaczyć średnią ocene studentów na kierunku " + "\n" + "0 - wyjdź");

                    int L = scanner.nextInt();
                    switch (L) {
                        case 0:
                            System.out.println("Koniec.");
                            quit = true;
                            break;
                        case 1:
                            System.out.println("======================================================================");
                            System.out.println("\f" + multimap.get(Kierunki.Lekarski).toString().replaceAll("[\\[\\],]", ""));
                            System.out.println("======================================================================");
                            System.out.println("Ludzi na Kierunku: " + multimap.get(Kierunki.Lekarski).size());
                            System.out.println("======================================================================");
                            break;

                    }
                {
                    int z = scanner.nextInt();
                    scanner.nextLine();
                    switch (z) {

                        case 0:
                            System.out.println("Koniec.");
                            quit = true;
                            break;

                        case 1:
                            for (Student student : multimap.get(Kierunki.Lekarski)) {
                                double Ocena = student.getMap().iterator().next().getOcenaPrzedmiotu();
                                for (int i = 1; i <= 1; i++)
                                    System.out.println("======================================================================");
                                System.out.println(student.getImie() + " " + student.getNazwisko() + ":" + "|" + Ocena + "|");
                                System.out.println("======================================================================");
                            }
                            break;
                    }
                }
                break;
                case 3:
                    System.out.println("======================================================================");
                    System.out.println("\f" + multimap.get(Kierunki.Fizjoterapia).toString().replaceAll("[\\[\\],]", ""));
                    System.out.println("======================================================================");
                    System.out.println("1 - zobaczyć średnią ocene studentów na kierunku " + "2 - zobacz średnią na kierunku " + "\n" + "0 - wyjdź");
                    break;

                        case 4:
                            System.out.println("======================================================================");
                            System.out.println("\f" + multimap.get(Kierunki.Farmacja).toString().replaceAll("[\\[\\],]", ""));
                            System.out.println("=======================================================================");
                            System.out.println("1 - zobaczyć średnią ocene studentów na kierunku " + "\n" + "0 - wyjdź");

                        break;

                        case 5:
                            System.out.println("==========================================================================");
                            System.out.println();
                            System.out.println("==========================================================================");
                            break;

                        case 6:
                            map1.stream()
                                    .sorted((Comparator.comparing(Przedmioty::getNazwa)))
                                    .forEach(System.out::println);
                            break;
                        case 7:
                            String jedenString = map1.stream().map(Przedmioty::getNazwa).collect(Collectors.joining(","));
                            System.out.println(jedenString);
                            break;

                        case 8:
                            multimap.get(Kierunki.Lekarski).iterator().next().getMap().stream().map(Przedmioty::getOcenaPrzedmiotu);

                            double sum = 0;
                            Iterator<Student> iterator = multimap.get(Kierunki.Lekarski).iterator();
                            while(iterator.hasNext()) {
                                Student student = iterator.next();
                                double bb = student.getMap().stream().filter(p -> p.getNazwa() == "Biochemia")
                                        .mapToDouble(p -> p.getOcenaPrzedmiotu()).average().getAsDouble();
                                sum+=bb;
                            }
                            System.out.printf("Srednia z Biochemii : " + sum/6);
                            break;
                          case 9:
                              System.out.println(map1.stream().mapToDouble(Przedmioty::getOcenaPrzedmiotu).average().orElse(Double.NaN));
////
                               System.out.println(map2.stream().mapToDouble(Przedmioty::getOcenaPrzedmiotu).average().orElse(Double.NaN));
                               System.out.println(map3.stream().mapToDouble(Przedmioty::getOcenaPrzedmiotu).average().orElse(Double.NaN));
                               System.out.println(map4.stream().mapToDouble(Przedmioty::getOcenaPrzedmiotu).average().orElse(Double.NaN));
                               System.out.println(map5.stream().mapToDouble(Przedmioty::getOcenaPrzedmiotu).average().orElse(Double.NaN));
                               System.out.println(map6.stream().mapToDouble(Przedmioty::getOcenaPrzedmiotu).average().orElse(Double.NaN));
                            break;

                           case 10:
                                System.out.println( "Studentów na pierwszym roku: " + multimap.get(Kierunki.Lekarski).stream().filter(p->p.getRokStudiów() == RokStudiów.Perwszy).count());
                                  multimap.get(Kierunki.Lekarski).stream().filter(p->p.getRokStudiów() == RokStudiów.Drugi).forEach(System.out::println);
                                  multimap.get(Kierunki.Lekarski).stream().filter(p->p.getRokStudiów() == RokStudiów.Trzecji).forEach(System.out::println);
                                  multimap.get(Kierunki.Lekarski).stream().filter(p->p.getRokStudiów() == RokStudiów.Czwarty).forEach(System.out::println);
                                  multimap.get(Kierunki.Lekarski).stream().filter(p->p.getRokStudiów() == RokStudiów.Piąty).forEach(System.out::println);
                                  multimap.get(Kierunki.Lekarski).stream().filter(p->p.getRokStudiów() == RokStudiów.Szósty).forEach(System.out::println);
                                   break;

                            case 11:
                               multimap.get(Kierunki.Lekarski).stream().filter(p->p.getNazwisko().startsWith("Po")).forEach(System.out::println);
                                  break;


                            case 12:
                             Scanner scanners = new Scanner(System.in);
                              String s = scanner.nextLine();
                               int p = scanners.nextInt();
                                Iterator<Student> iterators = multimap.values().iterator();

                               while(iterators.hasNext()){
                             Student student = iterators.next();
                             if(student.getNazwisko().contentEquals(s)){
                             student.setWiek(p);
                            }
                             System.out.println(student.getNazwisko()+ " "+student.getWiek());}
                             break;
                        case 13:
                            multimap.get(Kierunki.Lekarski).stream().collect(Collectors.groupingBy(Student::getRokStudiów));
                            System.out.println( multimap.get(Kierunki.Lekarski).stream().collect(Collectors.groupingBy(Student::getRokStudiów)));
                          break;

                          case 14:
                              Scanner scanner1 = new Scanner(System.in);
                              String ss = scanner1.nextLine();
                              String sp = scanner1.nextLine();
                               multimap.get(Kierunki.Lekarski).iterator().next().setImie(ss);
                               multimap.get(Kierunki.Lekarski).iterator().next().setNazwisko(sp);
                                  int wiek = scanner.nextInt();
                               multimap.get(Kierunki.Lekarski).iterator().next().setWiek(wiek);
                               System.out.println(multimap.get(Kierunki.Lekarski));
                               break;
                    }
                }

            }



    private static void printMenu() {
            System.out.println("Wybierz funkcje:\nnaciśni");
            System.out.println("0 - wyjść\n" +
                    "1 - Ilosć Studentów na Wydziale\n" +
                    "2 - Studenci Lekarskiego\n" +
                    "3 - Studenci Fizjoterapii\n" +
                    "4 - Sudenci Farmacji\n" +
                    "5 - Wykładowcy  \n" +
                    "============================== \n"+
                    "Perwsza Lista \n" +
                    "============================== \n" +
                    "6 - Posortowana lista Przedmiotów \n"+
                    "7 - Lista przedmiotów jako jeden String \n" +
                    "8 - Pobierz posortowana liste studentów po nazwisku i Imieniu \n" +
                    "9 - Pobierz średnia ocene z przedmiotu \n" +
                    "10 - Pobierz ludzi na danym roku\n" +
                    "11 - Wyszukaj studentów czyje nazwisko sie zaczyna na 'Po' \n" +
                    "12 - Z aktulizuj wiek osoby z danym nazwieskiem \n" +
                    "13 - Grupowanie Studentw po roku studiów\n" +
                    "14 - Pobierz najleprzego studenta");
        }
    }



