package ma.formations.rest1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication scanne le classpath, détecte les
 * déppendance  puis effectue automatiquement
 * toutes les configurations nécessaires.
 */
@SpringBootApplication
public class Rest1Application {
    public static void main(String[] args) {
        SpringApplication.run(Rest1Application.class, args);
    }
}
