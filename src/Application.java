import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.movie.Movie;
import org.json.JSONObject;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        List<Movie> movies = readMovieDetails();
    }

    private static List<Movie> readMovieDetails() throws FileNotFoundException {
        List<Movie> movies = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream("resource/tmdb_5000_movies.csv");
             Scanner sc = new Scanner(inputStream, StandardCharsets.UTF_8)) {
//            sc.useDelimiter(",");   //sets the delimiter pattern
            sc.nextLine();
            while (sc.hasNext())  //returns a boolean value
            {

                System.out.println(sc.next());
                System.out.println(sc.next());

                break;//find and returns the next complete token from this scanner
            }
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        Map<String, Map<String, String>> CSVData = new TreeMap<String, Map<String, String>>();
//        Map<String, String> keyVals = null;
//        Reader reader = new FileReader("resource/tmdb_5000_movies.csv");
//        try {
//            Iterator<Map<String, String>> iterator = new CsvMapper().readerFor(Map.class)
//                    .with(CsvSchema.emptySchema().withHeader()
//                            .withColumnSeparator(',').withoutQuoteChar()).readValues(reader);
//            while(iterator.hasNext()){
//                keyVals = iterator.next();
//                Object[] keys = keyVals.keySet().toArray();
//                CSVData.put(keyVals.get(keys[]), keyVals);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    private static <T> List<T> getObjectList(JSONObject genres, Class<T> cls) {
        System.out.println(genres);
        Gson gson = new Gson();
        Type type = new TypeToken<List<T>>() {
        }.getType();
        return gson.fromJson(String.valueOf(genres), type);
    }

    private static JSONObject getJsonArray(String genres) {
        return new JSONObject(genres);
    }
}
