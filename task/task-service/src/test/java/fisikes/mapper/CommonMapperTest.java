package fisikes.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommonMapperTest {

    @Autowired
    CommonMapper commonMapper;

    @Test
    void queryList() {

        final List<String> strings = commonMapper.queryList();
        System.out.println(strings);
    }
}