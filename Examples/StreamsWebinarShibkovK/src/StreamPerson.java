import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPerson {
    private final String phone;

    public StreamPerson(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "StreamPerson{" +
                "phone='" + phone + '\'' +
                '}';
    }
}

class Actions{
    public static void main(String[] args) {
        Map<String, StreamPerson> map = Stream.of(new StreamPerson("1"), new StreamPerson("22"), new StreamPerson("3"))
                .collect(Collectors.toMap(StreamPerson::getPhone, Function.identity()));
    }
}
