package newestaccount.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import newestaccount.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/preApplicationAS")
@Transactional
public class PreApplicationAController {

    @Autowired
    PreApplicationARepository preApplicationARepository;
    // keep

    // koj 20220621 PreApplicationAController 추가 
    public PreApplicationAController () {
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("----PreApplicationAController.java PreApplicationAController   호출 ");
        System.out.println("------------------------------------------------------------------------") ;
 
    }
}
