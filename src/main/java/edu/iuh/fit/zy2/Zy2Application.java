package edu.iuh.fit.zy2;

import edu.iuh.fit.zy2.entities.Post;
import edu.iuh.fit.zy2.entities.User;
import edu.iuh.fit.zy2.repositories.UserRepository;
import edu.iuh.fit.zy2.services.PostService;
import edu.iuh.fit.zy2.services.UserService;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class Zy2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Zy2Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
//        Faker faker = new Faker(new Locale("vi"));
//        for(int i = 0; i < 200; i++){
//            User user = new User();
//            user.setUsername(new Faker().internet().username());
//            user.setPassword(faker.internet().password());
//            user.setName(faker.name().fullName());
//            user.setEmail(faker.internet().emailAddress());
//            user.setPhone(faker.phoneNumber().cellPhone());
//            userService.createUser(user);
//        }
//        User user1 = userService.findUserByUsername("kirby.weissnat");
//        User user2 = userService.findUserByUsername("lance.bruen");
//        User user3 = userService.findUserByUsername("lester.krajcik");
//        User user4 = userService.findUserByUsername("michel.sporer");
//        User user5 = userService.findUserByUsername("mose.block");
//        User user6 = userService.findUserByUsername("reggie.gibson");
//        User user7 = userService.findUserByUsername("rheba.lubowitz");
//        User user8 = userService.findUserByUsername("sadie.gulgowski");
//        User user9 = userService.findUserByUsername("shanice.beahan");
//        User user10 = userService.findUserByUsername("sofia.hoeger");
//
//        List<User> users = List.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);
//        for(int i = 0; i < 400; i++){
//            Post post = new Post();
//            post.setTitle(faker.book().title());
//            post.setContent(faker.lorem().paragraph());
//            post.setId("P"+i);
//            post.setViews(faker.number().numberBetween(0, 10000));
//            post.setLikes(faker.number().numberBetween(0, 1000));
//            post.setShares(faker.number().numberBetween(0, 1000));
//
//            post.setUser(users.get(i % 10));
//            postService.createPost(post);
//        }

    }
}
