import com.dawnop.client.util.QiniuUtils;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {

    @Test
    public void test() {

        RestTemplate restTemplate = new RestTemplate();
        byte[] file = restTemplate.getForObject(String.format("%s/%s", QiniuUtils.baseUrl, "Fpg0_v2BVJyftUBz7lix5P061vdK"), byte[].class);
        System.out.println(file.length);

    }
}
