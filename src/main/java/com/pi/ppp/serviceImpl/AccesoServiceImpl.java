package com.pi.ppp.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.AccesoDao;
import com.pi.ppp.dto.AccesoDto;
import com.pi.ppp.entity.Acceso;
import com.pi.ppp.repository.AccesoRepository;
import com.pi.ppp.service.AccesoService;

@Service
public class AccesoServiceImpl implements AccesoService{
	@Autowired
	private AccesoDao dao;
	@Autowired 
	private AccesoRepository repository;
	
	
	@Override
	public Acceso create(Acceso ac) {
		// TODO Auto-generated method stub
		return dao.create(ac);
	}

	@Override
	public Acceso update(Acceso ac) {
		// TODO Auto-generated method stub
		return dao.update(ac);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	@Override
	public List<AccesoDto> obtenerAccesosJerarquicosPorRol(Long idRol) {
		// TODO Auto-generated method stub
		List<Acceso> accesos = repository.findByAccesorol_RolIdAndEstado(idRol, 'A');
		return construirJerarquia(accesos);
	}

	@Override
	public List<AccesoDto> construirJerarquia(List<Acceso> accesos) {
		// TODO Auto-generated method stub
		Map<Long, AccesoDto> mapAccesos = new HashMap<>();
		for (Acceso acceso : accesos) {
			AccesoDto dto = new AccesoDto(acceso);
			mapAccesos.put(acceso.getId(), dto);
		}
		
		List<AccesoDto> jerarquia = new ArrayList<>();
		for (AccesoDto dto : mapAccesos.values()) {
			if (dto.getSubaccesos() == null) {
				jerarquia.add(dto);
			} else {
				AccesoDto paadre = mapAccesos.get(dto.getPadre());
				if (paadre != null) {
					paadre.getSubaccesos().add(dto);
				}
			}
		}
		return jerarquia;
	}
}
