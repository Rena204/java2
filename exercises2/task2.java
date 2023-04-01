package exercises2;

import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

/**
 * task2
 */
public class task2 {

    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
        FileReader read = new FileReader("C:\\GeekBrains\\java\\lesson2\\exercises2\\TaskTwoData.json");
        JSONParser jsonP = new JSONParser();
        JSONArray stud = (JSONArray) jsonP.parse(read);

        for (Object obj : stud) {
            JSONObject per = (JSONObject) obj;

            StringBuilder res = new StringBuilder();

            res.append("Студент ").append(per.get("фамилия")).append(" получил ").append((String) per.get("оценка"))
                    .append(" по предмету ").append((String) per.get("предмет")).append(".");
            System.out.println(res.toString());
        }
    }
}