/*

package al.edu.uamd.zonaestudnetit.service;
import al.edu.uamd.zonaestudnetit.repository.libratRepo;
        import al.edu.uamd.zonaestudnetit.model.librat;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;


@Service
public class libratService {
    @Autowired
    private libratRepo libratRepo;
 public  librat saveFile(MultipartFile file){

        String emer= file.getOriginalFilename();

try{
            librat librat= new librat(emer,file.getContentType(),file.getBytes());
            return libratRepo.save(librat);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

 public Optional<librat> getFile(Integer fieldId){
        return libratRepo.findById(fieldId);
    }
    public static List<librat> getFiles(){
        final List<librat> all = al.edu.uamd.zonaestudnetit.repository.libratRepo.findAll();
        return all;
    }

}
*/
