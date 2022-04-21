package com.cpt202a19.reservation.controller;

import com.cpt202a19.reservation.entity.Dmg;
import com.cpt202a19.reservation.service.IDmgService;
import com.cpt202a19.reservation.until.JsonResult;
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("dmg")
@RestController
public class DmgController extends BaseController {
<<<<<<< HEAD

    @Autowired // automatic assembly
    private IDmgService dmgService;

=======
    @Autowired
    private IDmgService dmgService;
    
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    /**
     * Get the JsonResult of dmgService's data
     * @param parent a string of parent code
     * @return a new JsonResult of dmgService'data
     */
    @GetMapping({"", "/"})
    public JsonResult<List<Dmg>> getByParent(String parent) {
        List<Dmg> data = dmgService.getByParent(parent);
        return new JsonResult<>(OK, data);
    }

}
