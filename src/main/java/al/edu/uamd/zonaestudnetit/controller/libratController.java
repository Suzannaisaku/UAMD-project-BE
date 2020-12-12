/*

package al.edu.uamd.zonaestudnetit.controller;

        import al.edu.uamd.zonaestudnetit.model.librat;
        import al.edu.uamd.zonaestudnetit.repository.libratRepo;
        import al.edu.uamd.zonaestudnetit.service.libratService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.core.io.ByteArrayResource;
        import org.springframework.data.domain.Sort;
        import org.springframework.http.HttpHeaders;
        import org.springframework.http.MediaType;
        import org.springframework.http.ResponseEntity;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@RestController
@RequestMapping
public class libratController {
    @Autowired
    private libratRepo libratRepo;
    @GetMapping("/librat")
    public List<librat> getLibrat(){
        return this.libratRepo.findAll();

    }
    @GetMapping("/")
    public String get(Model model){
        List<librat> docs= libratService.getFiles();
        model.addAllAttributes("docs",docs);
        return  "docs";
    }
   */
/* @GetMapping("/shkarko/{fileId}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId){

        librat doc= libratService.getFile(fileId).get();
        final ResponseEntity.BodyBuilder bodyBuilder;
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(librat.getKategori())
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment:filename=/" + librat.getKategori()+ "/")
                        .body = new ByteArrayResource(librat.getDataFile());

    }*//*

}
*/
