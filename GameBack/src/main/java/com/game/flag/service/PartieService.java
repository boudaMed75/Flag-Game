package com.game.flag.service;



import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.flag.DTO.PartieResDTO;
import com.game.flag.DTO.PartiesDTO;
import com.game.flag.dao.JeuDao;
import com.game.flag.dao.JoueurDao;
import com.game.flag.dao.PartieDao;
import com.game.flag.models.Jeu;
import com.game.flag.models.Joueur;
import com.game.flag.models.Partie;

@Service
public class PartieService {

    @Autowired
    private PartieDao partieDao;
    @Autowired
    private JeuDao jeuDao;
    @Autowired 
    private JoueurDao joueurDao;
    @Autowired
    private ModelMapper modelMapper;

    public List<Partie> findAll() {
        return partieDao.findAll();
    }

    public Partie findById(Long id) {
        return partieDao.findById(id).orElse(null);
    }

    public Partie save(PartiesDTO partie) {

        Jeu jeu = jeuDao.findById(partie.getId_jeu()).orElse(null);
        Joueur joueur = joueurDao.findById(partie.getId_joueur()).orElse(null);

        Partie partie2 = new Partie();

        partie2.setJeu(jeu);
        partie2.setJoueur(joueur);
        partie2.setScoreObtenu(partie.getScoreObtenu());
        partie2.setStatut(partie.getStatut());

        

        return partieDao.save(partie2);
    }

    public void delete(Long id) {
        partieDao.deleteById(id);
    }

    public List<PartieResDTO> findPartiesByJoueur(Long idJoueur) {
        Joueur joueur = joueurDao.findById(idJoueur).orElse(null);
        
        List<Partie> parties = partieDao.findByJoueur(joueur);

        return parties.stream()
                        .map(partie -> modelMapper.map(partie, PartieResDTO.class))
                        .collect(Collectors.toList());

        
    }

}

