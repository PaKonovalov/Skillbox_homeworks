import org.junit.Test;

public class NetworkUtilsTest {

    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThenJneSec(){
        NetworkUtils.getConnection();
    }
}
