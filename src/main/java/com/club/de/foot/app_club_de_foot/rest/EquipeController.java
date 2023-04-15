package com.club.de.foot.app_club_de_foot.rest;

import com.club.de.foot.app_club_de_foot.models.Equipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @GetMapping("/listeteam")
    public List<Equipe> getListOfEquipe() {
        List<Equipe> result = new ArrayList<Equipe>();


        Equipe equipe = new Equipe();
        equipe.setId("1");
        equipe.setName("Olympique de Marseille");
        equipe.setCaptainName("Valentin Rongier");
        equipe.setButeurName("Alexis Sanchez");
        result.add(equipe);

        Equipe equipe1 = new Equipe();
        equipe1.setId("2");
        equipe1.setName("Olympique Lyonnais ");
        equipe1.setCaptainName("Juniho");
        equipe1.setButeurName("Fred");
        result.add(equipe1);

        Equipe equipe2 = new Equipe();
        equipe2.setId("3");
        equipe2.setName("PSG");
        equipe2.setCaptainName("Kylian Mbappé");
        equipe2.setButeurName("Kylian Mbappé, the GOAT");
        result.add(equipe2);

        return result;
    }
}
