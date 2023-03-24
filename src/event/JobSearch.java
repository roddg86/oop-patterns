package event;

import event.observer.impl.Subscriber;
import event.publisher.impl.JobSite;

public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        Subscriber Ivan = new Subscriber("Иван");
        Subscriber Olga = new Subscriber("Ольга");

        String vacansy1 = "vacansy1";
        String vacansy2 = "vacansy2";

        jobSite.addVacansy(vacansy1);
        jobSite.addVacansy(vacansy2);

        jobSite.add(Ivan);
        jobSite.add(Olga);

        String vacansy3 = "senior C#";
        jobSite.addVacansy(vacansy3);

        jobSite.removeVacansy(vacansy1);




    }
}
