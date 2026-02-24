# Turno

Aplicación en Java para practicar Programación Orientada a Objetos mediante la creación y validación de turnos.

## Descripción

La clase `Turno` representa un turno de trabajo definido por:

- Día
- Hora de inicio
- Hora de fin

El constructor valida que la hora de fin sea posterior a la de inicio.

Si no se cumple la regla, se lanza una `IllegalArgumentException`.

## Validación implementada

Regla de negocio:

horaInicio < horaFin

Si no se cumple:

throw new IllegalArgumentException("Turno inválido");

Esto garantiza que no se creen objetos en estado inválido.

## Conceptos aplicados

- Programación Orientada a Objetos
- Constructores
- Atributos de instancia
- Encapsulación
- Excepciones
- Validación defensiva
