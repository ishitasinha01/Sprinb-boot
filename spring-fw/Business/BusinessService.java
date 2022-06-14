package Business;

import com.springboot.springfw.DataService;

import java.util.List;

@Component
public class BusinessService {
    @Autowired
    private DataService dataService;

    public long calculateSum(){
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();

    }

}