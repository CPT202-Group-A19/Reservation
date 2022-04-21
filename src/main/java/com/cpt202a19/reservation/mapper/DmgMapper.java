package com.cpt202a19.reservation.mapper;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Mapper;
import com.cpt202a19.reservation.entity.Dmg;

=======
import com.cpt202a19.reservation.entity.Dmg;

import org.apache.ibatis.annotations.Mapper;

>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
import java.util.List;

@Mapper
public interface DmgMapper {
<<<<<<< HEAD

    List<Dmg> findByParent(String parent);
    String findNameByCode(String code);
    String findCodeByName(String name);

}
=======
    List<Dmg> findByParent(String parent);
    String findNameByCode(String code);
    String findCodeByName(String name);
}
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
