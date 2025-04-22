package com.microservicio.asignaturas;

import com.microservicio.asignaturas.servicios.AsignaturaServiciosImpl;
import com.microservicio.asignaturas.entidades.Asignatura;
import com.microservicio.asignaturas.repository.AsignaturaRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AsignaturaServiciosImplTest {

    @Mock
    private AsignaturaRepository asignaturaRepository;

    @InjectMocks
    private AsignaturaServiciosImpl asignaturaServicios;

    @Test
    void testGuardarAsignatura() {
       
        Asignatura asignatura = new Asignatura();
        asignatura.setNombre("Matemáticas");
        asignatura.setProfesor("Profe Andrea");

        when(asignaturaRepository.save(any(Asignatura.class))).thenReturn(asignatura);

        
        Asignatura resultado = asignaturaServicios.save(asignatura);

        
        assertNotNull(resultado);
        assertEquals("Matemáticas", resultado.getNombre());
        assertEquals("Profe Andrea", resultado.getProfesor());
        verify(asignaturaRepository, times(1)).save(asignatura);
    }
}