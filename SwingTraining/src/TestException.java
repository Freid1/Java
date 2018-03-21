import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class TestException {
    private static Logger logger=Logger.getLogger("Logger Exception");
    static void log(Exception e){
        StringWriter trace= new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
try{
    throw new NullPointerException();
}catch(NullPointerException e){
    log(e);

        }
    }
}
