import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(HealthcareWorker worker){
        super(worker);
        System.out.printf("Decorate "+worker.getName()+" with TimeLogging\n");
    }
    @Override
    public void service(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM HH:mm:ss  yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.printf(formatter.format(now) + " : ");
        super.service();
    }


}
