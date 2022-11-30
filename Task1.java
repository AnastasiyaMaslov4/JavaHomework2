import org.json.simple.JSONObject;

public class Task1 {
    // Дана строка sql-запроса "select * from students where ". 
    // Сформируйте часть WHERE этого запроса, используя StringBuilder. 
    // Данные для фильтрации приведены ниже в виде json строки. 
    // Если значение null, то параметр не должен попадать в запрос. 
    // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    // Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …
    public static void main(String[] args) {
        StringBuilder resultStr = new StringBuilder("select * from students where ");
        JSONObject json = new JSONObject();
        json.put("name","Ivanov");
        json.put("country","Russia");
        json.put("city","Moscow");
        json.put("age","null");
        System.out.println(json.toString());
        StringBuilder filters = new StringBuilder(json.toString());
        System.out.println(filters.length());
        filters.replace(0, 1, "");
        filters.replace(63, 64, "");
        System.out.println(filters.toString());
        String name = (String) json.get("name");
        String country = (String) json.get("country");
        String city = (String) json.get("city");
        resultStr = resultStr.append("\"name\" = " + name + " and \"country\" = " + country + " and \"city\" = " + city);
        System.out.println(resultStr);

    }
    
}