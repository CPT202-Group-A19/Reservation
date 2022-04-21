package com.cpt202a19.reservation.service.impl;

import com.cpt202a19.reservation.entity.Dmg;
import com.cpt202a19.reservation.mapper.DmgMapper;
import com.cpt202a19.reservation.service.IDmgService;
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

<<<<<<< HEAD
/** Business layer implementation class for processing Dmg data */
@Service
public class DmgServiceImpl implements IDmgService {
    @Autowired // automatic assembly
=======

/** Business layer implementation class for processing D/M/G data */
@Service
public class DmgServiceImpl implements IDmgService {
    @Autowired
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    private DmgMapper dmgMapper;

    @Override
    public List<Dmg> getByParent(String parent) {
        List<Dmg> list = dmgMapper.findByParent(parent);
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
        for (Dmg dmg : list) {
            dmg.setId(null);
            dmg.setParent(null);
        }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
        return list;
    }

    @Override
<<<<<<< HEAD
    public String getNameByCode(String code) { return dmgMapper.findNameByCode(code); }

    @Override
    public String getCodeByName(String name) { return dmgMapper.findCodeByName(name); }

=======
    public String getNameByCode(String code) {
        return dmgMapper.findNameByCode(code);
    }
    @Override
    public String getCodeByName(String name) {
        return dmgMapper.findCodeByName(name);
    }
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}