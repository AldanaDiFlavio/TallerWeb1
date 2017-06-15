package ar.edu.unlam.tallerweb1.servicios;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Eventos;

@Service("EventosService")
@Transactional
public class EventosServiceImpl  implements EventosService {
	
	@Override
	public List<Eventos> eventosRecomendados(List<Eventos> todosLosEventos){
		
		List<Eventos> eventoRecomendado = new LinkedList<Eventos>();
		for (Eventos evento: todosLosEventos){
			/*if(evento.getCantidadAsistencias() >= 200){
				eventoRecomendado.add(evento);
			}*/
		}
		
		return eventoRecomendado;
	}
}
