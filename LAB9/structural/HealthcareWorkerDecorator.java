public abstract class HealthcareWorkerDecorator extends HealthcareWorker{
    private HealthcareWorker worker = null;

    public HealthcareWorkerDecorator(HealthcareWorker wrapWorker){
        super(wrapWorker);
        worker = wrapWorker;

     @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }
}

