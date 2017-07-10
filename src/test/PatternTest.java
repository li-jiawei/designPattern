package test;

import org.junit.Test;
import pattern.builder.User;

/**
 * Created by Jiawei on 7/10/17.
 */
public class PatternTest {

    @Test
    public void builderPattern () {
        User user = new User
                .Builder ("li.jiawei", "li.jiawei@gmail.com")
                .firstName("jiawei")
                .lastName("li")
                .address("Boston")
                .phoneNumber(911)
                .build();
        System.out.println(user);
    }

}
