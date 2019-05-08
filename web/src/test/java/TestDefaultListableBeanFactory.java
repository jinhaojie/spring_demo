import com.spring.demo.service.TestFactoryBean;
import com.spring.demo.service.TestService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class TestDefaultListableBeanFactory {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("spring_service.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
        // 获取factoryBean
        TestFactoryBean testFactoryBean = beanFactory.getBean("&testFactoryBean", TestFactoryBean.class);
        // 获取factoryBean生产的bean
        String beanOfFactoryBEan = beanFactory.getBean("testFactoryBean", String.class);

        System.out.println(1);

    }
}
