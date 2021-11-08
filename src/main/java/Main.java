import com.web.club3.config.JavaConfig;

import com.web.club3.service.impl.AuthorServiceImpl;
import com.web.club3.service.impl.BookOrderServiceImpl;
import com.web.club3.service.impl.BookServiceImpl;
import com.web.club3.service.impl.UserServiceImpl;
import com.web.club3.util.DateUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        BookServiceImpl bookServiceImpl = context.getBean(BookServiceImpl.class);
        BookOrderServiceImpl bookOrderServiceImpl = context.getBean(BookOrderServiceImpl.class);
        AuthorServiceImpl authorService = context.getBean(AuthorServiceImpl.class);

       // System.out.println(bookOrderServiceImpl.theMostPopular(LocalDate.of(2021,06,03),LocalDate.of(2021,10,21)));
       // System.out.println(bookOrderServiceImpl.test2(4));
     System.out.println(bookOrderServiceImpl.test(LocalDate.of(2021,06,03),LocalDate.of(2021,10,21)));
        context.close();
    }
}
