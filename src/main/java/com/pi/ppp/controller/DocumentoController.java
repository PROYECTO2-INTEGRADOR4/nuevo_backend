package com.pi.ppp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pi.ppp.repository.UsuarioRepository;
import com.pi.ppp.serviceImpl.DocumentoServiceImpl;

@RestController
@RequestMapping("/documentos")
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentoController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private DocumentoServiceImpl service;
	
	@PostMapping("/upload/{username}")
    public ResponseEntity<String> subirDocumento(		
            @PathVariable String username,
            @RequestParam("file") MultipartFile file) {
        try {
            if (file.isEmpty()) {
                return ResponseEntity.badRequest().body("El archivo no puede estar vacío");
            }

            // Obtener el id_matricula asociado al usuario
            Long idMatricula = repository.obtenerIdMatriculaPorUsername(username);
            if (idMatricula == null) {
                return ResponseEntity.badRequest().body("No se encontró la matrícula del estudiante");
            }

            // Llamar al procedimiento para llenar PPP
            //Long idPPP = service.crearPPP(idMatricula);

            // Llamar al procedimiento para llenar detalle_PPP
            //Long idDetallePPP = service.crearDetallePPP(idPPP);

            // Guardar el archivo físicamente y en la tabla detalle_documento
            //service.guardarArchivo(file, idDetallePPP);

            return ResponseEntity.ok("Documento subido y procesado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al procesar el documento: " + e.getMessage());
        }
    }

}
