package com.pi.ppp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;  
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

@Service
public class DocumentoServiceImpl {

	//@Autowired
    //private JdbcTemplate jdbcTemplate;

	//@Value("${documentos.ruta-directorio}")
	//private String rutaDirectorio;
    
	//public Long crearPPP(Long id_ppp) {
		// TODO Auto-generated method stub
		//return jdbcTemplate.queryForObject(
                //"{call sp_agregarPPP(?)}",
                //new Object[]{id_ppp}, Long.class);
	//}

	//public Long crearDetallePPP(Long id_detalleppp) {
		// TODO Auto-generated method stub
		//return jdbcTemplate.queryForObject(
                //"{call sp_agregardetalleppppro(?)}",
                //new Object[]{id_detalleppp}, Long.class);
	//}
	//public void guardarArchivo(MultipartFile file, Long idDetallePPP) throws IOException {
        // Generar el nombre del archivo
        //String nombreArchivo = idDetallePPP + "_" + file.getOriginalFilename();
        //Path rutaArchivo = Paths.get(rutaDirectorio).resolve(nombreArchivo);

        // Guardar el archivo físicamente
        //Files.copy(file.getInputStream(), rutaArchivo, StandardCopyOption.REPLACE_EXISTING);

        // Insertar registro en detalle_documento
        //jdbcTemplate.update(
             //   "INSERT INTO DETALLEDOCUMENTO (ID_DETALLEPPP, ARCHIVO, DIRECCION_ARCHIVO, FECHA, ESTADO) VALUES (?, ?, ?, SYSDATE, 'A')",
               // idDetallePPP, nombreArchivo, rutaArchivo.toString());
    //}
}
