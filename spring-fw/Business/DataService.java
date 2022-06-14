package Business;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {

    public List<Integer> retrieveData(){
        return Arrays.asList(12,34,56,90);
    }
}
