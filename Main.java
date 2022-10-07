import java.util.*;

public class Main {
    private static int choice;
    private static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Добро пожаловать в библиотеку.");
            System.out.println("Выберите нужный вам раздел:\n1. Поиск книги.\n2. Персонал библиотеки.\n3. Должники.\n4. Время работы библиотеки.");
            choice = sc.nextInt();
            if(choice < 1 || choice > 4) System.out.println("Нет такой команды.");
        }while(choice < 1 || choice > 4);
        switch(choice){
            case 1://Поиск книг
                int inner1;
                do{
                    System.out.println("1. Поиск по автору.\n2. Поиск по названию.");
                    inner1 = sc.nextInt();
                    if(inner1 < 1 || inner1 > 2) System.out.println("Нет такой команды.");
                }while(inner1 < 1 || inner1 > 2);
                Books books = new Books();
                if(inner1 == 1){
                    String s;//обычная просто для разнообразия
                    System.out.print("Введите имя и фамилию автора: ");
                    do{
                        s = sc.nextLine();
                    }while (s.isEmpty());
                    System.out.println(books.researchA(s) + ".");
                }
                else if(inner1 == 2){
                    System.out.print("Введите произведение автора: ");
                    do{
                        s = sc.nextLine();
                    }while (s.isEmpty());
                    System.out.println(books.researchB(s) + ".");
                }
                break;
            case 2://Персонал
                Info staff = new Staff();
                staff.show();
                System.out.print(((Staff) staff).getStaff());//Юзаю ссылку на сам класс с помощью приведение типов
                System.out.println(((Staff) staff).getValueS() + " человека.");
                System.out.print(((Staff) staff).getBibliotekar());
                System.out.println(((Staff) staff).getValueB() + " человека.");
                ((Staff) staff).getHash().get("Библиотекари").add("Анна Петровна Качан");//Обращаемся к методу в классе Staff
                //и таким образом получаем ссылку на словарь Hstaff. Добавляем в массив ФИО по ключу
                ((Staff) staff).getHash().get("Библиотекари").add("Екатерина Алексеевна Дударь");
                System.out.println("Старший по залу: " + ((Staff) staff).getHash().get("Библиотекари").get(0) + ".");
                System.out.println("Помощник: " + ((Staff) staff).getHash().get("Библиотекари").get(1) + ".");
                break;
            case 3://Клиенты-должники
                String fio;
                System.out.print("Введите ФИО: ");
                do{
                    fio = sc.nextLine();
                }while (fio.isEmpty());
                Info client = new Client(fio);
                client.show();
                break;
                //Логика
            case 4://Время работы
                Info workTime = new WorkTime();
                workTime.show();
                break;
                //Логика
        }
        Info f = new Information(1987, "Якуба Коласа", "67");
        f.show();
        sc.close();
    }
}

interface Info{
    public void show();
}

enum DAY{
    ПОНЕДЕЛЬНИК,ВТОРНИК,СРЕДА,ЧЕТВЕРГ,ПЯТНИЦА,СУББОТА,ВОСКРЕСЕНЬЕ
}

class Books{
    HashMap<String, ArrayList<String>> books = new HashMap<>();

    {//Блок инициализации конструктора
        books.put("Михаил Булгаков",new ArrayList<String>());
        books.put("Лев Толстой", new ArrayList<String>());
        books.get("Лев Толстой").add("Война и мир");
        books.get("Лев Толстой").add("Воскресение");
        books.get("Лев Толстой").add("Казаки");
        books.get("Лев Толстой").add("Анна Каренина");
        books.get("Михаил Булгаков").add("Мастер и Маргарита");
        books.get("Михаил Булгаков").add("Собачье сердце");
    }

    public String researchA(String nameA){
        //Set<String> keys = books.keySet();
        //if(keys.contains(nameA)) return books.get(nameA).toString();
        if(books.containsKey(nameA)) return "Произведения автора: " + String.join(", ", books.get(nameA));
        //String.join помогает скрепить массив с помощью разделителя
        return "Нет такого автора. Или проверьте правильность написания";
    }

    public String researchB(String nameB){
        /*Collection<ArrayList<String>> values = books.values();
        for(ArrayList<String> a : values) {
            if (a.contains(nameB)) return a.toString();
        }*/
        for(Map.Entry<String, ArrayList<String>> item : books.entrySet()){
            if(item.getValue().contains(nameB)) {
                return "Автор этого произведения: " + item.getKey();
            }
        }
        return "Нет такого произведения. Или проверьте правильность написания";
    }
}

abstract class Personal implements Info{
    private DAY[] days = DAY.values();

    public DAY[] getDays() {
        return days;
    }

    abstract public void show();
}

class Staff extends Personal{
    private final static String staff;
    private static final String bibliotekar;
    private static final int valueS;
    private final static int valueB;

    private static HashMap<String, ArrayList<String>> Hstaff = new HashMap<>();

    static {//Статичный инициализатор конструктора
        staff = "Отдел охраны: ";
        bibliotekar = "Обслуживающий персонал: ";
        valueS = 4;
        valueB = 2;
        Hstaff.put("Библиотекари", new ArrayList<>());
    }

    public int getValueB() {
        return valueB;
    }

    public int getValueS() {
        return valueS;
    }

    public String getStaff(){
        return staff;
    }

    public String getBibliotekar() {
        return bibliotekar;
    }

    public HashMap<String, ArrayList<String>> getHash(){
        return Hstaff;
    }

    @Override
    public void show() {
        System.out.println("Количество людей: 6.");
    }
}

class Client implements Info{
    private String fio;
    private Books b = new Books();

    HashMap<String, ArrayList<String>> dolg = new HashMap<>();

    @Override
    public void show() {
        if(!dolg.containsKey(fio)) System.out.println("Вы не зарегистрированы в системе или проверьте правильность ввода ФИО.");
        else if(dolg.get(fio).isEmpty()) System.out.println("Поздравляем. У вас нет задолжностей!");
        else if(!dolg.get(fio).isEmpty()) System.out.println(fio + ". " + "У вас есть наша книга: " + String.join(", ", dolg.get(fio)));
        //================ИЛИ НИЖНИЙ СПОСОБ======================
        /*if(!dolg.get(fio).isEmpty()) {
            System.out.print(fio + ". " + "У вас есть наша книга: ");
            for (String s : dolg.get(fio)){
                System.out.print(s + " ");
            }
        }*/
    }

    {//Блок инициализации обычный для конструктора
        dolg.put("Зябр Анна Александровна", new ArrayList<>());
        dolg.put("Док Зоя Алексеевна", new ArrayList<>());
        dolg.get("Зябр Анна Александровна").add(b.books.get("Лев Толстой").get(1));
    }

    public Client(String fio){//Конструктор с параметром
        this.fio = fio;
    }
}

class Information implements Info{
    private int building;
    private String streate;
    private String house;

    Information(int building, String streate, String house){
        this.building = building;
        this.streate = streate;
        this.house = house;
    }

    @Override
    public void show() {
        System.out.printf("Надеемся вам понравилось у нас. \nНемного информации о нас: Наша библиотека была постоена в %s " +
                "извесным архитектором Unanimous. Так же у нас есть ещё одно отделение которое находится на улице %s, дом %s" +
                ". \nБудем рады видеть вас ещё! \nНаши контактные данные: +375 17 296 55 74", building, streate, house);
    }
}


class WorkTime extends Personal{

    @Override
    public void show() {
        for (DAY d : getDays()) {
            if(d.equals(DAY.valueOf("СУББОТА")) || d.equals(DAY.ВОСКРЕСЕНЬЕ)) System.out.println(d + ": с 8:00 до 19:00.");
            else System.out.println(d + ": с 8:00 до 21:00.");
        }
    }
}
