package com.cpt202a19.reservation.service;

import com.cpt202a19.reservation.entity.Dmg;

import java.util.List;

/** Business layer interface for processing province/city/district data */
public interface IDmgService {
<<<<<<< HEAD

    //Get all D / all M of a certain D / all G of a certain M
    List<Dmg> getByParent(String parent);

    //Get the name of D/M/G according to the administrative code of D/M/G
    String getNameByCode(String code);
    String getCodeByName(String name);

=======
    //Get all D / all M of a certain D / all G of a certain M
    List<Dmg> getByParent(String parent);
    //Get the name of D/M/G according to the administrative code of D/M/G
    String getNameByCode(String code);
    String getCodeByName(String name);
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
