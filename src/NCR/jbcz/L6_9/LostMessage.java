package NCR.jbcz.L6_9;

/**
 * Created by zb on 2018/2/28.
 * finally
 */
public class LostMessage {
    void w() throws ImportantException {
        throw new ImportantException();
    }

    void dispose() throws NormalException {
        throw new NormalException();
    }

    public static void main(String[] args) throws Exception {
        LostMessage lostMessage = new LostMessage();
        try {
            lostMessage.w();
        } finally {
            lostMessage.dispose();
        }
    }
}