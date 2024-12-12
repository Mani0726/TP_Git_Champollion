package champollion;

import java.util.HashMap;
import java.util.Map;

/**
 * Un enseignant est caractérisé par les informations suivantes : son nom, son adresse email, et son service prévu,
 * et son emploi du temps.
 */
public class Enseignant extends Personne {

    // TODO : rajouter les autres méthodes présentes dans le diagramme UML

    Map<UE, ServicePrevu> coursEnseignant;

    public Enseignant(String nom, String email) {
        super(nom, email);
        this.coursEnseignant = new HashMap<UE, ServicePrevu>();
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        double total =0;
        for (ServicePrevu service : coursEnseignant.values()) {
            double coursCM = service.getVolumeCM() * 1.5;
            double coursTD = service.getVolumeTD();
            double coursTP = service.getVolumeTP() * 0.75;
            total = total+ coursCM + coursTD + coursTP;

        }
        return (int) Math.round(total);
    }


    public int heuresPrevuesPourUE(UE ue) {
        ServicePrevu service = coursEnseignant.get(ue);
        double coursCM = service.getVolumeCM()*1.5;
        double coursTD = service.getVolumeTD();
        double coursTP = service.getVolumeTP()*0.75;
        double nbHeuresCours = coursCM + coursTD + coursTP;

        return (int) Math.round(nbHeuresCours);
    }

    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        if (!coursEnseignant.containsKey(ue)) {
            coursEnseignant.put(ue, new ServicePrevu(volumeCM, volumeTD, volumeTP));
        } else {
             ServicePrevu service = coursEnseignant.get(ue);
             service.setVolumeCM(service.getVolumeCM() + volumeCM);
             service.setVolumeTD(service.getVolumeTD() +volumeTD);
             service.setVolumeTP(service.getVolumeTP() + volumeTP);

        }


    }

}
