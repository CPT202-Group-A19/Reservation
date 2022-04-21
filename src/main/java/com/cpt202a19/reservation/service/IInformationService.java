package com.cpt202a19.reservation.service;

import com.cpt202a19.reservation.entity.Information;

import java.util.List;

<<<<<<< HEAD
/** Business layer interface for processing shipping address data */
public interface IInformationService {

    /** Create a new shipping address */
    void addNewInformation(Integer uid, String username, Information inforamtion);
    
    /** Query a user's information by uid */
    List<Information> getByUid(Integer uid);

    /** Set default information */
    void setDefault(Integer rid, Integer uid, String username);

    /** Delete information */
=======
/** Business layer interface for processing inforamtion data */
public interface IInformationService {

/** Create a new reservation inforamtion */
    void addNewInformation(Integer uid, String username, Information inforamtion);

    /** Query a user's information by uid */
    List<Information> getByUid(Integer uid);

      /** Set default information */
    void setDefault(Integer rid, Integer uid, String username);

   /** Delete information */
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    void delete(Integer rid, Integer uid, String username);

    /** Query information according to the id of the information */
    Information getByRid(Integer rid, Integer uid);

<<<<<<< HEAD
=======
    //modifyInformation
    void modifyInformation(Integer uid, String username, Information information);
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
