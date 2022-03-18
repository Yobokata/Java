package cigma.pfe;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner{

    public static void main(MysqlxDatatypes.Scalar.String[] args) {
        SpringApplication.run(ApplicationRunner.class,args);
    }
}
