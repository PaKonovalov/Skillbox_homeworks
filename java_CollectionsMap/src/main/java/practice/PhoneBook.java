package practice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class PhoneBook {
    TreeMap<String, String> listPhone = new TreeMap<>();

    boolean regexName(String name) {
        return Pattern.matches("[а-яёА-ЯЁ]+", name);
    }

    boolean regexPhone(String phone) {
        return Pattern.matches("7[0-9]{10}", phone);
    }

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (regexName(name) & regexPhone(phone)) {
            listPhone.put(phone, name);
        }
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        for (Map.Entry<String, String> entry : listPhone.entrySet()) {
            if (entry.getKey().equals(phone)) {
                return entry.getValue() + " - " + entry.getKey();
            }
        }
        return "";
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        TreeSet<String> line = new TreeSet<>();
        for (Map.Entry<String, String> entry : listPhone.entrySet()) {
            if (entry.getValue().equals(name)) {
                line.add(entry.getValue() + " - " + entry.getKey());
            }
        }
        return new TreeSet<>(line);
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeMap<String, String> relist = new TreeMap<>();

        for (Map.Entry<String, String> entry : listPhone.entrySet()) {
            if (relist.containsKey(entry.getValue())) {
                relist.put(entry.getValue(), relist.get(entry.getValue()) + ", " + entry.getKey());
            } else {
                relist.put(entry.getValue(), entry.getKey());
            }
        }

        Set<String> list = new TreeSet<>();

        for (Map.Entry<String, String> entry : relist.entrySet()) {
            String contact = entry.getKey() + " - " + entry.getValue();
            list.add(contact);
        }
        return list;
    }

//        TreeMap<String, String> doubleName = new TreeMap<>();
//        TreeSet<String> allContacts = new TreeSet<>();
//        String result = "";
//        for (Map.Entry<String, String> entry : addContact.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            if (addContact.containsValue(value) && addContact.containsKey(key)) {
//                doubleName.put(key, value);
//                result = doubleName.get(key) + " - " + doubleName.get(value);
//            }
//
//            allContacts.add(result);
//
//        }
//        return allContacts;
//    }
}


//        for (Map.Entry<String, String> name : addContact.entrySet()) {
//            String lineOne = "";
//            lineOne = name.getValue() + " - " + name.getKey();
//            contactsList.add(lineOne);
//        }
//        return new TreeSet<>(contactsList);

//        TreeSet<String> allContacts = new TreeSet<>();
//        TreeMap<String, String> mapAllContacts = new TreeMap<>();
//        String result = "";
//        for (Map.Entry<String, String> entry : addContact.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            if (addContact.containsValue(value) & addContact.containsKey(key)) {
//                mapAllContacts.put(key, value);
//                result = mapAllContacts.get(key) + " - " + mapAllContacts.keySet();
//            }
//            allContacts.add(result);
//        }
//        return allContacts;


// для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
// это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
